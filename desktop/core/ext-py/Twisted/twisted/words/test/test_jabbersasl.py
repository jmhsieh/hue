# Copyright (c) 2001-2007 Twisted Matrix Laboratories.
# See LICENSE for details.

from zope.interface import implements
from twisted.internet import defer
from twisted.trial import unittest
from twisted.words.protocols.jabber import sasl, sasl_mechanisms, xmlstream
from twisted.words.xish import domish

NS_XMPP_SASL = 'urn:ietf:params:xml:ns:xmpp-sasl'

class DummySASLMechanism(object):
    """
    Dummy SASL mechanism.

    This just returns the initialResponse passed on creation, stores any
    challenges and replies with an empty response.

    @ivar challenge: Last received challenge.
    @type challenge: C{unicode}.
    @ivar initialResponse: Initial response to be returned when requested
                           via C{getInitialResponse} or C{None}.
    @type initialResponse: C{unicode}
    """

    implements(sasl_mechanisms.ISASLMechanism)

    challenge = None
    name = "DUMMY"

    def __init__(self, initialResponse):
        self.initialResponse = initialResponse

    def getInitialResponse(self):
        return self.initialResponse

    def getResponse(self, challenge):
        self.challenge = challenge
        return ""

class DummySASLInitiatingInitializer(sasl.SASLInitiatingInitializer):
    """
    Dummy SASL Initializer for initiating entities.

    This hardwires the SASL mechanism to L{DummySASLMechanism}, that is
    instantiated with the value of C{initialResponse}.

    @ivar initialResponse: The initial response to be returned by the
                           dummy SASL mechanism or C{None}.
    @type initialResponse: C{unicode}.
    """

    initialResponse = None

    def setMechanism(self):
        self.mechanism = DummySASLMechanism(self.initialResponse)

class SASLInitiatingInitializerTest(unittest.TestCase):

    def setUp(self):
        self.output = []

        self.authenticator = xmlstream.Authenticator()
        self.xmlstream = xmlstream.XmlStream(self.authenticator)
        self.xmlstream.send = self.output.append
        self.xmlstream.connectionMade()
        self.xmlstream.dataReceived("<stream:stream xmlns='jabber:client' "
                        "xmlns:stream='http://etherx.jabber.org/streams' "
                        "from='example.com' id='12345' version='1.0'>")
        self.init = DummySASLInitiatingInitializer(self.xmlstream)

    def test_onFailure(self):
        """
        Test that the SASL error condition is correctly extracted.
        """
        failure = domish.Element(('urn:ietf:params:xml:ns:xmpp-sasl',
                                  'failure'))
        failure.addElement('not-authorized')
        self.init._deferred = defer.Deferred()
        self.init.onFailure(failure)
        self.assertFailure(self.init._deferred, sasl.SASLAuthError)
        self.init._deferred.addCallback(lambda e:
                                        self.assertEquals('not-authorized',
                                                          e.condition))
        return self.init._deferred

    def test_sendAuthInitialResponse(self):
        """
        Test starting authentication with an initial response.
        """
        self.init.initialResponse = "dummy"
        self.init.start()
        auth = self.output[0]
        self.assertEquals(NS_XMPP_SASL, auth.uri)
        self.assertEquals('auth', auth.name)
        self.assertEquals('DUMMY', auth['mechanism'])
        self.assertEquals('ZHVtbXk=', str(auth))

    def test_sendAuthNoInitialResponse(self):
        """
        Test starting authentication without an initial response.
        """
        self.init.initialResponse = None
        self.init.start()
        auth = self.output[0]
        self.assertEquals('', str(auth))

    def test_sendAuthEmptyInitialResponse(self):
        """
        Test starting authentication where the initial response is empty.
        """
        self.init.initialResponse = ""
        self.init.start()
        auth = self.output[0]
        self.assertEquals('=', str(auth))

    def test_onChallenge(self):
        """
        Test receiving a challenge message.
        """
        d = self.init.start()
        challenge = domish.Element((NS_XMPP_SASL, 'challenge'))
        challenge.addContent('bXkgY2hhbGxlbmdl')
        self.init.onChallenge(challenge)
        self.assertEqual('my challenge', self.init.mechanism.challenge)
        self.init.onSuccess(None)
        return d

    def test_onChallengeEmpty(self):
        """
        Test receiving an empty challenge message.
        """
        d = self.init.start()
        challenge = domish.Element((NS_XMPP_SASL, 'challenge'))
        self.init.onChallenge(challenge)
        self.assertEqual('', self.init.mechanism.challenge)
        self.init.onSuccess(None)
        return d

    def test_onChallengeIllegalPadding(self):
        """
        Test receiving a challenge message with illegal padding.
        """
        d = self.init.start()
        challenge = domish.Element((NS_XMPP_SASL, 'challenge'))
        challenge.addContent('bXkg=Y2hhbGxlbmdl')
        self.init.onChallenge(challenge)
        self.assertFailure(d, sasl.SASLIncorrectEncodingError)
        return d

    def test_onChallengeIllegalCharacters(self):
        """
        Test receiving a challenge message with illegal characters.
        """
        d = self.init.start()
        challenge = domish.Element((NS_XMPP_SASL, 'challenge'))
        challenge.addContent('bXkg*Y2hhbGxlbmdl')
        self.init.onChallenge(challenge)
        self.assertFailure(d, sasl.SASLIncorrectEncodingError)
        return d

    def test_onChallengeMalformed(self):
        """
        Test receiving a malformed challenge message.
        """
        d = self.init.start()
        challenge = domish.Element((NS_XMPP_SASL, 'challenge'))
        challenge.addContent('a')
        self.init.onChallenge(challenge)
        self.assertFailure(d, sasl.SASLIncorrectEncodingError)
        return d
