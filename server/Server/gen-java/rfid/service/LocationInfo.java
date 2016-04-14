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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-04-14")
public class LocationInfo implements org.apache.thrift.TBase<LocationInfo, LocationInfo._Fields>, java.io.Serializable, Cloneable, Comparable<LocationInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("LocationInfo");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("ID", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField NUM_FIELD_DESC = new org.apache.thrift.protocol.TField("Num", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField AREA_FIELD_DESC = new org.apache.thrift.protocol.TField("Area", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField LOCATION_FIELD_DESC = new org.apache.thrift.protocol.TField("Location", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField CARTON_NUMS_FIELD_DESC = new org.apache.thrift.protocol.TField("CartonNums", org.apache.thrift.protocol.TType.LIST, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new LocationInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new LocationInfoTupleSchemeFactory());
  }

  public int ID; // required
  public int Num; // required
  public String Area; // required
  public int Location; // required
  public List<String> CartonNums; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "ID"),
    NUM((short)2, "Num"),
    AREA((short)3, "Area"),
    LOCATION((short)4, "Location"),
    CARTON_NUMS((short)5, "CartonNums");

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
        case 1: // ID
          return ID;
        case 2: // NUM
          return NUM;
        case 3: // AREA
          return AREA;
        case 4: // LOCATION
          return LOCATION;
        case 5: // CARTON_NUMS
          return CARTON_NUMS;
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
  private static final int __ID_ISSET_ID = 0;
  private static final int __NUM_ISSET_ID = 1;
  private static final int __LOCATION_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.CARTON_NUMS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("ID", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.NUM, new org.apache.thrift.meta_data.FieldMetaData("Num", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.AREA, new org.apache.thrift.meta_data.FieldMetaData("Area", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LOCATION, new org.apache.thrift.meta_data.FieldMetaData("Location", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.CARTON_NUMS, new org.apache.thrift.meta_data.FieldMetaData("CartonNums", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(LocationInfo.class, metaDataMap);
  }

  public LocationInfo() {
  }

  public LocationInfo(
    int ID,
    int Num,
    String Area,
    int Location)
  {
    this();
    this.ID = ID;
    setIDIsSet(true);
    this.Num = Num;
    setNumIsSet(true);
    this.Area = Area;
    this.Location = Location;
    setLocationIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LocationInfo(LocationInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.ID = other.ID;
    this.Num = other.Num;
    if (other.isSetArea()) {
      this.Area = other.Area;
    }
    this.Location = other.Location;
    if (other.isSetCartonNums()) {
      List<String> __this__CartonNums = new ArrayList<String>(other.CartonNums);
      this.CartonNums = __this__CartonNums;
    }
  }

  public LocationInfo deepCopy() {
    return new LocationInfo(this);
  }

  @Override
  public void clear() {
    setIDIsSet(false);
    this.ID = 0;
    setNumIsSet(false);
    this.Num = 0;
    this.Area = null;
    setLocationIsSet(false);
    this.Location = 0;
    this.CartonNums = null;
  }

  public int getID() {
    return this.ID;
  }

  public LocationInfo setID(int ID) {
    this.ID = ID;
    setIDIsSet(true);
    return this;
  }

  public void unsetID() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field ID is set (has been assigned a value) and false otherwise */
  public boolean isSetID() {
    return EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIDIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  public int getNum() {
    return this.Num;
  }

  public LocationInfo setNum(int Num) {
    this.Num = Num;
    setNumIsSet(true);
    return this;
  }

  public void unsetNum() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NUM_ISSET_ID);
  }

  /** Returns true if field Num is set (has been assigned a value) and false otherwise */
  public boolean isSetNum() {
    return EncodingUtils.testBit(__isset_bitfield, __NUM_ISSET_ID);
  }

  public void setNumIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NUM_ISSET_ID, value);
  }

  public String getArea() {
    return this.Area;
  }

  public LocationInfo setArea(String Area) {
    this.Area = Area;
    return this;
  }

  public void unsetArea() {
    this.Area = null;
  }

  /** Returns true if field Area is set (has been assigned a value) and false otherwise */
  public boolean isSetArea() {
    return this.Area != null;
  }

  public void setAreaIsSet(boolean value) {
    if (!value) {
      this.Area = null;
    }
  }

  public int getLocation() {
    return this.Location;
  }

  public LocationInfo setLocation(int Location) {
    this.Location = Location;
    setLocationIsSet(true);
    return this;
  }

  public void unsetLocation() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LOCATION_ISSET_ID);
  }

  /** Returns true if field Location is set (has been assigned a value) and false otherwise */
  public boolean isSetLocation() {
    return EncodingUtils.testBit(__isset_bitfield, __LOCATION_ISSET_ID);
  }

  public void setLocationIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LOCATION_ISSET_ID, value);
  }

  public int getCartonNumsSize() {
    return (this.CartonNums == null) ? 0 : this.CartonNums.size();
  }

  public java.util.Iterator<String> getCartonNumsIterator() {
    return (this.CartonNums == null) ? null : this.CartonNums.iterator();
  }

  public void addToCartonNums(String elem) {
    if (this.CartonNums == null) {
      this.CartonNums = new ArrayList<String>();
    }
    this.CartonNums.add(elem);
  }

  public List<String> getCartonNums() {
    return this.CartonNums;
  }

  public LocationInfo setCartonNums(List<String> CartonNums) {
    this.CartonNums = CartonNums;
    return this;
  }

  public void unsetCartonNums() {
    this.CartonNums = null;
  }

  /** Returns true if field CartonNums is set (has been assigned a value) and false otherwise */
  public boolean isSetCartonNums() {
    return this.CartonNums != null;
  }

  public void setCartonNumsIsSet(boolean value) {
    if (!value) {
      this.CartonNums = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetID();
      } else {
        setID((Integer)value);
      }
      break;

    case NUM:
      if (value == null) {
        unsetNum();
      } else {
        setNum((Integer)value);
      }
      break;

    case AREA:
      if (value == null) {
        unsetArea();
      } else {
        setArea((String)value);
      }
      break;

    case LOCATION:
      if (value == null) {
        unsetLocation();
      } else {
        setLocation((Integer)value);
      }
      break;

    case CARTON_NUMS:
      if (value == null) {
        unsetCartonNums();
      } else {
        setCartonNums((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getID();

    case NUM:
      return getNum();

    case AREA:
      return getArea();

    case LOCATION:
      return getLocation();

    case CARTON_NUMS:
      return getCartonNums();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetID();
    case NUM:
      return isSetNum();
    case AREA:
      return isSetArea();
    case LOCATION:
      return isSetLocation();
    case CARTON_NUMS:
      return isSetCartonNums();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof LocationInfo)
      return this.equals((LocationInfo)that);
    return false;
  }

  public boolean equals(LocationInfo that) {
    if (that == null)
      return false;

    boolean this_present_ID = true;
    boolean that_present_ID = true;
    if (this_present_ID || that_present_ID) {
      if (!(this_present_ID && that_present_ID))
        return false;
      if (this.ID != that.ID)
        return false;
    }

    boolean this_present_Num = true;
    boolean that_present_Num = true;
    if (this_present_Num || that_present_Num) {
      if (!(this_present_Num && that_present_Num))
        return false;
      if (this.Num != that.Num)
        return false;
    }

    boolean this_present_Area = true && this.isSetArea();
    boolean that_present_Area = true && that.isSetArea();
    if (this_present_Area || that_present_Area) {
      if (!(this_present_Area && that_present_Area))
        return false;
      if (!this.Area.equals(that.Area))
        return false;
    }

    boolean this_present_Location = true;
    boolean that_present_Location = true;
    if (this_present_Location || that_present_Location) {
      if (!(this_present_Location && that_present_Location))
        return false;
      if (this.Location != that.Location)
        return false;
    }

    boolean this_present_CartonNums = true && this.isSetCartonNums();
    boolean that_present_CartonNums = true && that.isSetCartonNums();
    if (this_present_CartonNums || that_present_CartonNums) {
      if (!(this_present_CartonNums && that_present_CartonNums))
        return false;
      if (!this.CartonNums.equals(that.CartonNums))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_ID = true;
    list.add(present_ID);
    if (present_ID)
      list.add(ID);

    boolean present_Num = true;
    list.add(present_Num);
    if (present_Num)
      list.add(Num);

    boolean present_Area = true && (isSetArea());
    list.add(present_Area);
    if (present_Area)
      list.add(Area);

    boolean present_Location = true;
    list.add(present_Location);
    if (present_Location)
      list.add(Location);

    boolean present_CartonNums = true && (isSetCartonNums());
    list.add(present_CartonNums);
    if (present_CartonNums)
      list.add(CartonNums);

    return list.hashCode();
  }

  @Override
  public int compareTo(LocationInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetID()).compareTo(other.isSetID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ID, other.ID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNum()).compareTo(other.isSetNum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNum()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Num, other.Num);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetArea()).compareTo(other.isSetArea());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetArea()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Area, other.Area);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    lastComparison = Boolean.valueOf(isSetCartonNums()).compareTo(other.isSetCartonNums());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCartonNums()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.CartonNums, other.CartonNums);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("LocationInfo(");
    boolean first = true;

    sb.append("ID:");
    sb.append(this.ID);
    first = false;
    if (!first) sb.append(", ");
    sb.append("Num:");
    sb.append(this.Num);
    first = false;
    if (!first) sb.append(", ");
    sb.append("Area:");
    if (this.Area == null) {
      sb.append("null");
    } else {
      sb.append(this.Area);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("Location:");
    sb.append(this.Location);
    first = false;
    if (isSetCartonNums()) {
      if (!first) sb.append(", ");
      sb.append("CartonNums:");
      if (this.CartonNums == null) {
        sb.append("null");
      } else {
        sb.append(this.CartonNums);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'ID' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'Num' because it's a primitive and you chose the non-beans generator.
    if (Area == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'Area' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'Location' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class LocationInfoStandardSchemeFactory implements SchemeFactory {
    public LocationInfoStandardScheme getScheme() {
      return new LocationInfoStandardScheme();
    }
  }

  private static class LocationInfoStandardScheme extends StandardScheme<LocationInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, LocationInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.ID = iprot.readI32();
              struct.setIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NUM
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.Num = iprot.readI32();
              struct.setNumIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // AREA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.Area = iprot.readString();
              struct.setAreaIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // LOCATION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.Location = iprot.readI32();
              struct.setLocationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CARTON_NUMS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.CartonNums = new ArrayList<String>(_list8.size);
                String _elem9;
                for (int _i10 = 0; _i10 < _list8.size; ++_i10)
                {
                  _elem9 = iprot.readString();
                  struct.CartonNums.add(_elem9);
                }
                iprot.readListEnd();
              }
              struct.setCartonNumsIsSet(true);
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
      if (!struct.isSetID()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'ID' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetNum()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'Num' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetLocation()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'Location' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, LocationInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeI32(struct.ID);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(NUM_FIELD_DESC);
      oprot.writeI32(struct.Num);
      oprot.writeFieldEnd();
      if (struct.Area != null) {
        oprot.writeFieldBegin(AREA_FIELD_DESC);
        oprot.writeString(struct.Area);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(LOCATION_FIELD_DESC);
      oprot.writeI32(struct.Location);
      oprot.writeFieldEnd();
      if (struct.CartonNums != null) {
        if (struct.isSetCartonNums()) {
          oprot.writeFieldBegin(CARTON_NUMS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.CartonNums.size()));
            for (String _iter11 : struct.CartonNums)
            {
              oprot.writeString(_iter11);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class LocationInfoTupleSchemeFactory implements SchemeFactory {
    public LocationInfoTupleScheme getScheme() {
      return new LocationInfoTupleScheme();
    }
  }

  private static class LocationInfoTupleScheme extends TupleScheme<LocationInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, LocationInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.ID);
      oprot.writeI32(struct.Num);
      oprot.writeString(struct.Area);
      oprot.writeI32(struct.Location);
      BitSet optionals = new BitSet();
      if (struct.isSetCartonNums()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetCartonNums()) {
        {
          oprot.writeI32(struct.CartonNums.size());
          for (String _iter12 : struct.CartonNums)
          {
            oprot.writeString(_iter12);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, LocationInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.ID = iprot.readI32();
      struct.setIDIsSet(true);
      struct.Num = iprot.readI32();
      struct.setNumIsSet(true);
      struct.Area = iprot.readString();
      struct.setAreaIsSet(true);
      struct.Location = iprot.readI32();
      struct.setLocationIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list13 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.CartonNums = new ArrayList<String>(_list13.size);
          String _elem14;
          for (int _i15 = 0; _i15 < _list13.size; ++_i15)
          {
            _elem14 = iprot.readString();
            struct.CartonNums.add(_elem14);
          }
        }
        struct.setCartonNumsIsSet(true);
      }
    }
  }

}

