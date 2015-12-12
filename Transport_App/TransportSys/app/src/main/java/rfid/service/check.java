/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package rfid.service;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2015-12-11")
public class check implements org.apache.thrift.TBase<check, check._Fields>, java.io.Serializable, Cloneable, Comparable<check> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("check");

  private static final org.apache.thrift.protocol.TField LOCATION_FIELD_DESC = new org.apache.thrift.protocol.TField("Location", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField MATERIAL_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("MaterialCode", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField REAL_NUM_FIELD_DESC = new org.apache.thrift.protocol.TField("RealNum", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("Time", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new checkStandardSchemeFactory());
    schemes.put(TupleScheme.class, new checkTupleSchemeFactory());
  }

  public String Location; // required
  public String MaterialCode; // required
  public int RealNum; // required
  public String Time; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LOCATION((short)1, "Location"),
    MATERIAL_CODE((short)2, "MaterialCode"),
    REAL_NUM((short)3, "RealNum"),
    TIME((short)4, "Time");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // LOCATION
          return LOCATION;
        case 2: // MATERIAL_CODE
          return MATERIAL_CODE;
        case 3: // REAL_NUM
          return REAL_NUM;
        case 4: // TIME
          return TIME;
        default:
          return null;
      }
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
  private static final int __REALNUM_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LOCATION, new org.apache.thrift.meta_data.FieldMetaData("Location", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MATERIAL_CODE, new org.apache.thrift.meta_data.FieldMetaData("MaterialCode", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.REAL_NUM, new org.apache.thrift.meta_data.FieldMetaData("RealNum", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TIME, new org.apache.thrift.meta_data.FieldMetaData("Time", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(check.class, metaDataMap);
  }

  public check() {
  }

  public check(
    String Location,
    String MaterialCode,
    int RealNum,
    String Time)
  {
    this();
    this.Location = Location;
    this.MaterialCode = MaterialCode;
    this.RealNum = RealNum;
    setRealNumIsSet(true);
    this.Time = Time;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public check(check other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetLocation()) {
      this.Location = other.Location;
    }
    if (other.isSetMaterialCode()) {
      this.MaterialCode = other.MaterialCode;
    }
    this.RealNum = other.RealNum;
    if (other.isSetTime()) {
      this.Time = other.Time;
    }
  }

  public check deepCopy() {
    return new check(this);
  }

  @Override
  public void clear() {
    this.Location = null;
    this.MaterialCode = null;
    setRealNumIsSet(false);
    this.RealNum = 0;
    this.Time = null;
  }

  public String getLocation() {
    return this.Location;
  }

  public check setLocation(String Location) {
    this.Location = Location;
    return this;
  }

  public void unsetLocation() {
    this.Location = null;
  }

  /** Returns true if field Location is set (has been assigned a value) and false otherwise */
  public boolean isSetLocation() {
    return this.Location != null;
  }

  public void setLocationIsSet(boolean value) {
    if (!value) {
      this.Location = null;
    }
  }

  public String getMaterialCode() {
    return this.MaterialCode;
  }

  public check setMaterialCode(String MaterialCode) {
    this.MaterialCode = MaterialCode;
    return this;
  }

  public void unsetMaterialCode() {
    this.MaterialCode = null;
  }

  /** Returns true if field MaterialCode is set (has been assigned a value) and false otherwise */
  public boolean isSetMaterialCode() {
    return this.MaterialCode != null;
  }

  public void setMaterialCodeIsSet(boolean value) {
    if (!value) {
      this.MaterialCode = null;
    }
  }

  public int getRealNum() {
    return this.RealNum;
  }

  public check setRealNum(int RealNum) {
    this.RealNum = RealNum;
    setRealNumIsSet(true);
    return this;
  }

  public void unsetRealNum() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __REALNUM_ISSET_ID);
  }

  /** Returns true if field RealNum is set (has been assigned a value) and false otherwise */
  public boolean isSetRealNum() {
    return EncodingUtils.testBit(__isset_bitfield, __REALNUM_ISSET_ID);
  }

  public void setRealNumIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __REALNUM_ISSET_ID, value);
  }

  public String getTime() {
    return this.Time;
  }

  public check setTime(String Time) {
    this.Time = Time;
    return this;
  }

  public void unsetTime() {
    this.Time = null;
  }

  /** Returns true if field Time is set (has been assigned a value) and false otherwise */
  public boolean isSetTime() {
    return this.Time != null;
  }

  public void setTimeIsSet(boolean value) {
    if (!value) {
      this.Time = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case LOCATION:
      if (value == null) {
        unsetLocation();
      } else {
        setLocation((String)value);
      }
      break;

    case MATERIAL_CODE:
      if (value == null) {
        unsetMaterialCode();
      } else {
        setMaterialCode((String)value);
      }
      break;

    case REAL_NUM:
      if (value == null) {
        unsetRealNum();
      } else {
        setRealNum((Integer)value);
      }
      break;

    case TIME:
      if (value == null) {
        unsetTime();
      } else {
        setTime((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case LOCATION:
      return getLocation();

    case MATERIAL_CODE:
      return getMaterialCode();

    case REAL_NUM:
      return getRealNum();

    case TIME:
      return getTime();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case LOCATION:
      return isSetLocation();
    case MATERIAL_CODE:
      return isSetMaterialCode();
    case REAL_NUM:
      return isSetRealNum();
    case TIME:
      return isSetTime();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof check)
      return this.equals((check)that);
    return false;
  }

  public boolean equals(check that) {
    if (that == null)
      return false;

    boolean this_present_Location = true && this.isSetLocation();
    boolean that_present_Location = true && that.isSetLocation();
    if (this_present_Location || that_present_Location) {
      if (!(this_present_Location && that_present_Location))
        return false;
      if (!this.Location.equals(that.Location))
        return false;
    }

    boolean this_present_MaterialCode = true && this.isSetMaterialCode();
    boolean that_present_MaterialCode = true && that.isSetMaterialCode();
    if (this_present_MaterialCode || that_present_MaterialCode) {
      if (!(this_present_MaterialCode && that_present_MaterialCode))
        return false;
      if (!this.MaterialCode.equals(that.MaterialCode))
        return false;
    }

    boolean this_present_RealNum = true;
    boolean that_present_RealNum = true;
    if (this_present_RealNum || that_present_RealNum) {
      if (!(this_present_RealNum && that_present_RealNum))
        return false;
      if (this.RealNum != that.RealNum)
        return false;
    }

    boolean this_present_Time = true && this.isSetTime();
    boolean that_present_Time = true && that.isSetTime();
    if (this_present_Time || that_present_Time) {
      if (!(this_present_Time && that_present_Time))
        return false;
      if (!this.Time.equals(that.Time))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_Location = true && (isSetLocation());
    list.add(present_Location);
    if (present_Location)
      list.add(Location);

    boolean present_MaterialCode = true && (isSetMaterialCode());
    list.add(present_MaterialCode);
    if (present_MaterialCode)
      list.add(MaterialCode);

    boolean present_RealNum = true;
    list.add(present_RealNum);
    if (present_RealNum)
      list.add(RealNum);

    boolean present_Time = true && (isSetTime());
    list.add(present_Time);
    if (present_Time)
      list.add(Time);

    return list.hashCode();
  }

  @Override
  public int compareTo(check other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetLocation()).compareTo(other.isSetLocation());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLocation()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Location, other.Location);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMaterialCode()).compareTo(other.isSetMaterialCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMaterialCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.MaterialCode, other.MaterialCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRealNum()).compareTo(other.isSetRealNum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRealNum()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.RealNum, other.RealNum);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTime()).compareTo(other.isSetTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Time, other.Time);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("check(");
    boolean first = true;

    sb.append("Location:");
    if (this.Location == null) {
      sb.append("null");
    } else {
      sb.append(this.Location);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("MaterialCode:");
    if (this.MaterialCode == null) {
      sb.append("null");
    } else {
      sb.append(this.MaterialCode);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("RealNum:");
    sb.append(this.RealNum);
    first = false;
    if (!first) sb.append(", ");
    sb.append("Time:");
    if (this.Time == null) {
      sb.append("null");
    } else {
      sb.append(this.Time);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    if (Location == null) {
      throw new TProtocolException("Required field 'Location' was not present! Struct: " + toString());
    }
    if (MaterialCode == null) {
      throw new TProtocolException("Required field 'MaterialCode' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'RealNum' because it's a primitive and you chose the non-beans generator.
    if (Time == null) {
      throw new TProtocolException("Required field 'Time' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class checkStandardSchemeFactory implements SchemeFactory {
    public checkStandardScheme getScheme() {
      return new checkStandardScheme();
    }
  }

  private static class checkStandardScheme extends StandardScheme<check> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, check struct) throws TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LOCATION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.Location = iprot.readString();
              struct.setLocationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MATERIAL_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.MaterialCode = iprot.readString();
              struct.setMaterialCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // REAL_NUM
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.RealNum = iprot.readI32();
              struct.setRealNumIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.Time = iprot.readString();
              struct.setTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetRealNum()) {
        throw new TProtocolException("Required field 'RealNum' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, check struct) throws TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.Location != null) {
        oprot.writeFieldBegin(LOCATION_FIELD_DESC);
        oprot.writeString(struct.Location);
        oprot.writeFieldEnd();
      }
      if (struct.MaterialCode != null) {
        oprot.writeFieldBegin(MATERIAL_CODE_FIELD_DESC);
        oprot.writeString(struct.MaterialCode);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(REAL_NUM_FIELD_DESC);
      oprot.writeI32(struct.RealNum);
      oprot.writeFieldEnd();
      if (struct.Time != null) {
        oprot.writeFieldBegin(TIME_FIELD_DESC);
        oprot.writeString(struct.Time);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class checkTupleSchemeFactory implements SchemeFactory {
    public checkTupleScheme getScheme() {
      return new checkTupleScheme();
    }
  }

  private static class checkTupleScheme extends TupleScheme<check> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, check struct) throws TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.Location);
      oprot.writeString(struct.MaterialCode);
      oprot.writeI32(struct.RealNum);
      oprot.writeString(struct.Time);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, check struct) throws TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.Location = iprot.readString();
      struct.setLocationIsSet(true);
      struct.MaterialCode = iprot.readString();
      struct.setMaterialCodeIsSet(true);
      struct.RealNum = iprot.readI32();
      struct.setRealNumIsSet(true);
      struct.Time = iprot.readString();
      struct.setTimeIsSet(true);
    }
  }

}
