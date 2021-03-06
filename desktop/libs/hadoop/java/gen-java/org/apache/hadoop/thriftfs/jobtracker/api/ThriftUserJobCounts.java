/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.hadoop.thriftfs.jobtracker.api;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.protocol.*;

/**
 * Container structure for job counts for a given user
 */
public class ThriftUserJobCounts implements TBase<ThriftUserJobCounts._Fields>, java.io.Serializable, Cloneable, Comparable<ThriftUserJobCounts> {
  private static final TStruct STRUCT_DESC = new TStruct("ThriftUserJobCounts");

  private static final TField N_PREP_FIELD_DESC = new TField("nPrep", TType.I32, (short)1);
  private static final TField N_RUNNING_FIELD_DESC = new TField("nRunning", TType.I32, (short)2);
  private static final TField N_SUCCEEDED_FIELD_DESC = new TField("nSucceeded", TType.I32, (short)3);
  private static final TField N_FAILED_FIELD_DESC = new TField("nFailed", TType.I32, (short)4);
  private static final TField N_KILLED_FIELD_DESC = new TField("nKilled", TType.I32, (short)5);

  public int nPrep;
  public int nRunning;
  public int nSucceeded;
  public int nFailed;
  public int nKilled;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    N_PREP((short)1, "nPrep"),
    N_RUNNING((short)2, "nRunning"),
    N_SUCCEEDED((short)3, "nSucceeded"),
    N_FAILED((short)4, "nFailed"),
    N_KILLED((short)5, "nKilled");

    private static final Map<Integer, _Fields> byId = new HashMap<Integer, _Fields>();
    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byId.put((int)field._thriftId, field);
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      return byId.get(fieldId);
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __NPREP_ISSET_ID = 0;
  private static final int __NRUNNING_ISSET_ID = 1;
  private static final int __NSUCCEEDED_ISSET_ID = 2;
  private static final int __NFAILED_ISSET_ID = 3;
  private static final int __NKILLED_ISSET_ID = 4;
  private BitSet __isset_bit_vector = new BitSet(5);

  public static final Map<_Fields, FieldMetaData> metaDataMap = Collections.unmodifiableMap(new EnumMap<_Fields, FieldMetaData>(_Fields.class) {{
    put(_Fields.N_PREP, new FieldMetaData("nPrep", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    put(_Fields.N_RUNNING, new FieldMetaData("nRunning", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    put(_Fields.N_SUCCEEDED, new FieldMetaData("nSucceeded", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    put(_Fields.N_FAILED, new FieldMetaData("nFailed", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    put(_Fields.N_KILLED, new FieldMetaData("nKilled", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
  }});

  static {
    FieldMetaData.addStructMetaDataMap(ThriftUserJobCounts.class, metaDataMap);
  }

  public ThriftUserJobCounts() {
  }

  public ThriftUserJobCounts(
    int nPrep,
    int nRunning,
    int nSucceeded,
    int nFailed,
    int nKilled)
  {
    this();
    this.nPrep = nPrep;
    setNPrepIsSet(true);
    this.nRunning = nRunning;
    setNRunningIsSet(true);
    this.nSucceeded = nSucceeded;
    setNSucceededIsSet(true);
    this.nFailed = nFailed;
    setNFailedIsSet(true);
    this.nKilled = nKilled;
    setNKilledIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ThriftUserJobCounts(ThriftUserJobCounts other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.nPrep = other.nPrep;
    this.nRunning = other.nRunning;
    this.nSucceeded = other.nSucceeded;
    this.nFailed = other.nFailed;
    this.nKilled = other.nKilled;
  }

  public ThriftUserJobCounts deepCopy() {
    return new ThriftUserJobCounts(this);
  }

  @Deprecated
  public ThriftUserJobCounts clone() {
    return new ThriftUserJobCounts(this);
  }

  public int getNPrep() {
    return this.nPrep;
  }

  public ThriftUserJobCounts setNPrep(int nPrep) {
    this.nPrep = nPrep;
    setNPrepIsSet(true);
    return this;
  }

  public void unsetNPrep() {
    __isset_bit_vector.clear(__NPREP_ISSET_ID);
  }

  /** Returns true if field nPrep is set (has been asigned a value) and false otherwise */
  public boolean isSetNPrep() {
    return __isset_bit_vector.get(__NPREP_ISSET_ID);
  }

  public void setNPrepIsSet(boolean value) {
    __isset_bit_vector.set(__NPREP_ISSET_ID, value);
  }

  public int getNRunning() {
    return this.nRunning;
  }

  public ThriftUserJobCounts setNRunning(int nRunning) {
    this.nRunning = nRunning;
    setNRunningIsSet(true);
    return this;
  }

  public void unsetNRunning() {
    __isset_bit_vector.clear(__NRUNNING_ISSET_ID);
  }

  /** Returns true if field nRunning is set (has been asigned a value) and false otherwise */
  public boolean isSetNRunning() {
    return __isset_bit_vector.get(__NRUNNING_ISSET_ID);
  }

  public void setNRunningIsSet(boolean value) {
    __isset_bit_vector.set(__NRUNNING_ISSET_ID, value);
  }

  public int getNSucceeded() {
    return this.nSucceeded;
  }

  public ThriftUserJobCounts setNSucceeded(int nSucceeded) {
    this.nSucceeded = nSucceeded;
    setNSucceededIsSet(true);
    return this;
  }

  public void unsetNSucceeded() {
    __isset_bit_vector.clear(__NSUCCEEDED_ISSET_ID);
  }

  /** Returns true if field nSucceeded is set (has been asigned a value) and false otherwise */
  public boolean isSetNSucceeded() {
    return __isset_bit_vector.get(__NSUCCEEDED_ISSET_ID);
  }

  public void setNSucceededIsSet(boolean value) {
    __isset_bit_vector.set(__NSUCCEEDED_ISSET_ID, value);
  }

  public int getNFailed() {
    return this.nFailed;
  }

  public ThriftUserJobCounts setNFailed(int nFailed) {
    this.nFailed = nFailed;
    setNFailedIsSet(true);
    return this;
  }

  public void unsetNFailed() {
    __isset_bit_vector.clear(__NFAILED_ISSET_ID);
  }

  /** Returns true if field nFailed is set (has been asigned a value) and false otherwise */
  public boolean isSetNFailed() {
    return __isset_bit_vector.get(__NFAILED_ISSET_ID);
  }

  public void setNFailedIsSet(boolean value) {
    __isset_bit_vector.set(__NFAILED_ISSET_ID, value);
  }

  public int getNKilled() {
    return this.nKilled;
  }

  public ThriftUserJobCounts setNKilled(int nKilled) {
    this.nKilled = nKilled;
    setNKilledIsSet(true);
    return this;
  }

  public void unsetNKilled() {
    __isset_bit_vector.clear(__NKILLED_ISSET_ID);
  }

  /** Returns true if field nKilled is set (has been asigned a value) and false otherwise */
  public boolean isSetNKilled() {
    return __isset_bit_vector.get(__NKILLED_ISSET_ID);
  }

  public void setNKilledIsSet(boolean value) {
    __isset_bit_vector.set(__NKILLED_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case N_PREP:
      if (value == null) {
        unsetNPrep();
      } else {
        setNPrep((Integer)value);
      }
      break;

    case N_RUNNING:
      if (value == null) {
        unsetNRunning();
      } else {
        setNRunning((Integer)value);
      }
      break;

    case N_SUCCEEDED:
      if (value == null) {
        unsetNSucceeded();
      } else {
        setNSucceeded((Integer)value);
      }
      break;

    case N_FAILED:
      if (value == null) {
        unsetNFailed();
      } else {
        setNFailed((Integer)value);
      }
      break;

    case N_KILLED:
      if (value == null) {
        unsetNKilled();
      } else {
        setNKilled((Integer)value);
      }
      break;

    }
  }

  public void setFieldValue(int fieldID, Object value) {
    setFieldValue(_Fields.findByThriftIdOrThrow(fieldID), value);
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case N_PREP:
      return new Integer(getNPrep());

    case N_RUNNING:
      return new Integer(getNRunning());

    case N_SUCCEEDED:
      return new Integer(getNSucceeded());

    case N_FAILED:
      return new Integer(getNFailed());

    case N_KILLED:
      return new Integer(getNKilled());

    }
    throw new IllegalStateException();
  }

  public Object getFieldValue(int fieldId) {
    return getFieldValue(_Fields.findByThriftIdOrThrow(fieldId));
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    switch (field) {
    case N_PREP:
      return isSetNPrep();
    case N_RUNNING:
      return isSetNRunning();
    case N_SUCCEEDED:
      return isSetNSucceeded();
    case N_FAILED:
      return isSetNFailed();
    case N_KILLED:
      return isSetNKilled();
    }
    throw new IllegalStateException();
  }

  public boolean isSet(int fieldID) {
    return isSet(_Fields.findByThriftIdOrThrow(fieldID));
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ThriftUserJobCounts)
      return this.equals((ThriftUserJobCounts)that);
    return false;
  }

  public boolean equals(ThriftUserJobCounts that) {
    if (that == null)
      return false;

    boolean this_present_nPrep = true;
    boolean that_present_nPrep = true;
    if (this_present_nPrep || that_present_nPrep) {
      if (!(this_present_nPrep && that_present_nPrep))
        return false;
      if (this.nPrep != that.nPrep)
        return false;
    }

    boolean this_present_nRunning = true;
    boolean that_present_nRunning = true;
    if (this_present_nRunning || that_present_nRunning) {
      if (!(this_present_nRunning && that_present_nRunning))
        return false;
      if (this.nRunning != that.nRunning)
        return false;
    }

    boolean this_present_nSucceeded = true;
    boolean that_present_nSucceeded = true;
    if (this_present_nSucceeded || that_present_nSucceeded) {
      if (!(this_present_nSucceeded && that_present_nSucceeded))
        return false;
      if (this.nSucceeded != that.nSucceeded)
        return false;
    }

    boolean this_present_nFailed = true;
    boolean that_present_nFailed = true;
    if (this_present_nFailed || that_present_nFailed) {
      if (!(this_present_nFailed && that_present_nFailed))
        return false;
      if (this.nFailed != that.nFailed)
        return false;
    }

    boolean this_present_nKilled = true;
    boolean that_present_nKilled = true;
    if (this_present_nKilled || that_present_nKilled) {
      if (!(this_present_nKilled && that_present_nKilled))
        return false;
      if (this.nKilled != that.nKilled)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(ThriftUserJobCounts other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ThriftUserJobCounts typedOther = (ThriftUserJobCounts)other;

    lastComparison = Boolean.valueOf(isSetNPrep()).compareTo(isSetNPrep());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(nPrep, typedOther.nPrep);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetNRunning()).compareTo(isSetNRunning());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(nRunning, typedOther.nRunning);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetNSucceeded()).compareTo(isSetNSucceeded());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(nSucceeded, typedOther.nSucceeded);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetNFailed()).compareTo(isSetNFailed());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(nFailed, typedOther.nFailed);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetNKilled()).compareTo(isSetNKilled());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(nKilled, typedOther.nKilled);
    if (lastComparison != 0) {
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      _Fields fieldId = _Fields.findByThriftId(field.id);
      if (fieldId == null) {
        TProtocolUtil.skip(iprot, field.type);
      } else {
        switch (fieldId) {
          case N_PREP:
            if (field.type == TType.I32) {
              this.nPrep = iprot.readI32();
              setNPrepIsSet(true);
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
            break;
          case N_RUNNING:
            if (field.type == TType.I32) {
              this.nRunning = iprot.readI32();
              setNRunningIsSet(true);
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
            break;
          case N_SUCCEEDED:
            if (field.type == TType.I32) {
              this.nSucceeded = iprot.readI32();
              setNSucceededIsSet(true);
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
            break;
          case N_FAILED:
            if (field.type == TType.I32) {
              this.nFailed = iprot.readI32();
              setNFailedIsSet(true);
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
            break;
          case N_KILLED:
            if (field.type == TType.I32) {
              this.nKilled = iprot.readI32();
              setNKilledIsSet(true);
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
            break;
        }
        iprot.readFieldEnd();
      }
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(N_PREP_FIELD_DESC);
    oprot.writeI32(this.nPrep);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(N_RUNNING_FIELD_DESC);
    oprot.writeI32(this.nRunning);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(N_SUCCEEDED_FIELD_DESC);
    oprot.writeI32(this.nSucceeded);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(N_FAILED_FIELD_DESC);
    oprot.writeI32(this.nFailed);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(N_KILLED_FIELD_DESC);
    oprot.writeI32(this.nKilled);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ThriftUserJobCounts(");
    boolean first = true;

    sb.append("nPrep:");
    sb.append(this.nPrep);
    first = false;
    if (!first) sb.append(", ");
    sb.append("nRunning:");
    sb.append(this.nRunning);
    first = false;
    if (!first) sb.append(", ");
    sb.append("nSucceeded:");
    sb.append(this.nSucceeded);
    first = false;
    if (!first) sb.append(", ");
    sb.append("nFailed:");
    sb.append(this.nFailed);
    first = false;
    if (!first) sb.append(", ");
    sb.append("nKilled:");
    sb.append(this.nKilled);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

