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
 * Description of a job queue
 */
public class ThriftJobQueueInfo implements TBase<ThriftJobQueueInfo._Fields>, java.io.Serializable, Cloneable, Comparable<ThriftJobQueueInfo> {
  private static final TStruct STRUCT_DESC = new TStruct("ThriftJobQueueInfo");

  private static final TField QUEUE_NAME_FIELD_DESC = new TField("queueName", TType.STRING, (short)1);
  private static final TField SCHEDULING_INFO_FIELD_DESC = new TField("schedulingInfo", TType.STRING, (short)2);

  public String queueName;
  public String schedulingInfo;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    QUEUE_NAME((short)1, "queueName"),
    SCHEDULING_INFO((short)2, "schedulingInfo");

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

  public static final Map<_Fields, FieldMetaData> metaDataMap = Collections.unmodifiableMap(new EnumMap<_Fields, FieldMetaData>(_Fields.class) {{
    put(_Fields.QUEUE_NAME, new FieldMetaData("queueName", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    put(_Fields.SCHEDULING_INFO, new FieldMetaData("schedulingInfo", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
  }});

  static {
    FieldMetaData.addStructMetaDataMap(ThriftJobQueueInfo.class, metaDataMap);
  }

  public ThriftJobQueueInfo() {
  }

  public ThriftJobQueueInfo(
    String queueName,
    String schedulingInfo)
  {
    this();
    this.queueName = queueName;
    this.schedulingInfo = schedulingInfo;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ThriftJobQueueInfo(ThriftJobQueueInfo other) {
    if (other.isSetQueueName()) {
      this.queueName = other.queueName;
    }
    if (other.isSetSchedulingInfo()) {
      this.schedulingInfo = other.schedulingInfo;
    }
  }

  public ThriftJobQueueInfo deepCopy() {
    return new ThriftJobQueueInfo(this);
  }

  @Deprecated
  public ThriftJobQueueInfo clone() {
    return new ThriftJobQueueInfo(this);
  }

  public String getQueueName() {
    return this.queueName;
  }

  public ThriftJobQueueInfo setQueueName(String queueName) {
    this.queueName = queueName;
    return this;
  }

  public void unsetQueueName() {
    this.queueName = null;
  }

  /** Returns true if field queueName is set (has been asigned a value) and false otherwise */
  public boolean isSetQueueName() {
    return this.queueName != null;
  }

  public void setQueueNameIsSet(boolean value) {
    if (!value) {
      this.queueName = null;
    }
  }

  public String getSchedulingInfo() {
    return this.schedulingInfo;
  }

  public ThriftJobQueueInfo setSchedulingInfo(String schedulingInfo) {
    this.schedulingInfo = schedulingInfo;
    return this;
  }

  public void unsetSchedulingInfo() {
    this.schedulingInfo = null;
  }

  /** Returns true if field schedulingInfo is set (has been asigned a value) and false otherwise */
  public boolean isSetSchedulingInfo() {
    return this.schedulingInfo != null;
  }

  public void setSchedulingInfoIsSet(boolean value) {
    if (!value) {
      this.schedulingInfo = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case QUEUE_NAME:
      if (value == null) {
        unsetQueueName();
      } else {
        setQueueName((String)value);
      }
      break;

    case SCHEDULING_INFO:
      if (value == null) {
        unsetSchedulingInfo();
      } else {
        setSchedulingInfo((String)value);
      }
      break;

    }
  }

  public void setFieldValue(int fieldID, Object value) {
    setFieldValue(_Fields.findByThriftIdOrThrow(fieldID), value);
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case QUEUE_NAME:
      return getQueueName();

    case SCHEDULING_INFO:
      return getSchedulingInfo();

    }
    throw new IllegalStateException();
  }

  public Object getFieldValue(int fieldId) {
    return getFieldValue(_Fields.findByThriftIdOrThrow(fieldId));
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    switch (field) {
    case QUEUE_NAME:
      return isSetQueueName();
    case SCHEDULING_INFO:
      return isSetSchedulingInfo();
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
    if (that instanceof ThriftJobQueueInfo)
      return this.equals((ThriftJobQueueInfo)that);
    return false;
  }

  public boolean equals(ThriftJobQueueInfo that) {
    if (that == null)
      return false;

    boolean this_present_queueName = true && this.isSetQueueName();
    boolean that_present_queueName = true && that.isSetQueueName();
    if (this_present_queueName || that_present_queueName) {
      if (!(this_present_queueName && that_present_queueName))
        return false;
      if (!this.queueName.equals(that.queueName))
        return false;
    }

    boolean this_present_schedulingInfo = true && this.isSetSchedulingInfo();
    boolean that_present_schedulingInfo = true && that.isSetSchedulingInfo();
    if (this_present_schedulingInfo || that_present_schedulingInfo) {
      if (!(this_present_schedulingInfo && that_present_schedulingInfo))
        return false;
      if (!this.schedulingInfo.equals(that.schedulingInfo))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(ThriftJobQueueInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ThriftJobQueueInfo typedOther = (ThriftJobQueueInfo)other;

    lastComparison = Boolean.valueOf(isSetQueueName()).compareTo(isSetQueueName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(queueName, typedOther.queueName);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetSchedulingInfo()).compareTo(isSetSchedulingInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(schedulingInfo, typedOther.schedulingInfo);
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
          case QUEUE_NAME:
            if (field.type == TType.STRING) {
              this.queueName = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
            break;
          case SCHEDULING_INFO:
            if (field.type == TType.STRING) {
              this.schedulingInfo = iprot.readString();
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
    if (this.queueName != null) {
      oprot.writeFieldBegin(QUEUE_NAME_FIELD_DESC);
      oprot.writeString(this.queueName);
      oprot.writeFieldEnd();
    }
    if (this.schedulingInfo != null) {
      oprot.writeFieldBegin(SCHEDULING_INFO_FIELD_DESC);
      oprot.writeString(this.schedulingInfo);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ThriftJobQueueInfo(");
    boolean first = true;

    sb.append("queueName:");
    if (this.queueName == null) {
      sb.append("null");
    } else {
      sb.append(this.queueName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("schedulingInfo:");
    if (this.schedulingInfo == null) {
      sb.append("null");
    } else {
      sb.append(this.schedulingInfo);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

