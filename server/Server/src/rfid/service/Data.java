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
public class Data implements org.apache.thrift.TBase<Data, Data._Fields>, java.io.Serializable, Cloneable, Comparable<Data> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Data");

  private static final org.apache.thrift.protocol.TField PROJECT_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("projectCode", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("code", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField VENDOR_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("vendorName", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField BATCH_GOODS_FIELD_DESC = new org.apache.thrift.protocol.TField("batchGoods", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DataTupleSchemeFactory());
  }

  public String projectCode; // required
  public String code; // required
  public String vendorName; // required
  public List<List<Item>> batchGoods; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PROJECT_CODE((short)1, "projectCode"),
    CODE((short)2, "code"),
    VENDOR_NAME((short)3, "vendorName"),
    BATCH_GOODS((short)4, "batchGoods");

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
        case 1: // PROJECT_CODE
          return PROJECT_CODE;
        case 2: // CODE
          return CODE;
        case 3: // VENDOR_NAME
          return VENDOR_NAME;
        case 4: // BATCH_GOODS
          return BATCH_GOODS;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PROJECT_CODE, new org.apache.thrift.meta_data.FieldMetaData("projectCode", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CODE, new org.apache.thrift.meta_data.FieldMetaData("code", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VENDOR_NAME, new org.apache.thrift.meta_data.FieldMetaData("vendorName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.BATCH_GOODS, new org.apache.thrift.meta_data.FieldMetaData("batchGoods", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
                new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Item.class)))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Data.class, metaDataMap);
  }

  public Data() {
  }

  public Data(
    String projectCode,
    String code,
    String vendorName,
    List<List<Item>> batchGoods)
  {
    this();
    this.projectCode = projectCode;
    this.code = code;
    this.vendorName = vendorName;
    this.batchGoods = batchGoods;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Data(Data other) {
    if (other.isSetProjectCode()) {
      this.projectCode = other.projectCode;
    }
    if (other.isSetCode()) {
      this.code = other.code;
    }
    if (other.isSetVendorName()) {
      this.vendorName = other.vendorName;
    }
    if (other.isSetBatchGoods()) {
      List<List<Item>> __this__batchGoods = new ArrayList<List<Item>>(other.batchGoods.size());
      for (List<Item> other_element : other.batchGoods) {
        List<Item> __this__batchGoods_copy = new ArrayList<Item>(other_element.size());
        for (Item other_element_element : other_element) {
          __this__batchGoods_copy.add(new Item(other_element_element));
        }
        __this__batchGoods.add(__this__batchGoods_copy);
      }
      this.batchGoods = __this__batchGoods;
    }
  }

  public Data deepCopy() {
    return new Data(this);
  }

  @Override
  public void clear() {
    this.projectCode = null;
    this.code = null;
    this.vendorName = null;
    this.batchGoods = null;
  }

  public String getProjectCode() {
    return this.projectCode;
  }

  public Data setProjectCode(String projectCode) {
    this.projectCode = projectCode;
    return this;
  }

  public void unsetProjectCode() {
    this.projectCode = null;
  }

  /** Returns true if field projectCode is set (has been assigned a value) and false otherwise */
  public boolean isSetProjectCode() {
    return this.projectCode != null;
  }

  public void setProjectCodeIsSet(boolean value) {
    if (!value) {
      this.projectCode = null;
    }
  }

  public String getCode() {
    return this.code;
  }

  public Data setCode(String code) {
    this.code = code;
    return this;
  }

  public void unsetCode() {
    this.code = null;
  }

  /** Returns true if field code is set (has been assigned a value) and false otherwise */
  public boolean isSetCode() {
    return this.code != null;
  }

  public void setCodeIsSet(boolean value) {
    if (!value) {
      this.code = null;
    }
  }

  public String getVendorName() {
    return this.vendorName;
  }

  public Data setVendorName(String vendorName) {
    this.vendorName = vendorName;
    return this;
  }

  public void unsetVendorName() {
    this.vendorName = null;
  }

  /** Returns true if field vendorName is set (has been assigned a value) and false otherwise */
  public boolean isSetVendorName() {
    return this.vendorName != null;
  }

  public void setVendorNameIsSet(boolean value) {
    if (!value) {
      this.vendorName = null;
    }
  }

  public int getBatchGoodsSize() {
    return (this.batchGoods == null) ? 0 : this.batchGoods.size();
  }

  public java.util.Iterator<List<Item>> getBatchGoodsIterator() {
    return (this.batchGoods == null) ? null : this.batchGoods.iterator();
  }

  public void addToBatchGoods(List<Item> elem) {
    if (this.batchGoods == null) {
      this.batchGoods = new ArrayList<List<Item>>();
    }
    this.batchGoods.add(elem);
  }

  public List<List<Item>> getBatchGoods() {
    return this.batchGoods;
  }

  public Data setBatchGoods(List<List<Item>> batchGoods) {
    this.batchGoods = batchGoods;
    return this;
  }

  public void unsetBatchGoods() {
    this.batchGoods = null;
  }

  /** Returns true if field batchGoods is set (has been assigned a value) and false otherwise */
  public boolean isSetBatchGoods() {
    return this.batchGoods != null;
  }

  public void setBatchGoodsIsSet(boolean value) {
    if (!value) {
      this.batchGoods = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PROJECT_CODE:
      if (value == null) {
        unsetProjectCode();
      } else {
        setProjectCode((String)value);
      }
      break;

    case CODE:
      if (value == null) {
        unsetCode();
      } else {
        setCode((String)value);
      }
      break;

    case VENDOR_NAME:
      if (value == null) {
        unsetVendorName();
      } else {
        setVendorName((String)value);
      }
      break;

    case BATCH_GOODS:
      if (value == null) {
        unsetBatchGoods();
      } else {
        setBatchGoods((List<List<Item>>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PROJECT_CODE:
      return getProjectCode();

    case CODE:
      return getCode();

    case VENDOR_NAME:
      return getVendorName();

    case BATCH_GOODS:
      return getBatchGoods();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PROJECT_CODE:
      return isSetProjectCode();
    case CODE:
      return isSetCode();
    case VENDOR_NAME:
      return isSetVendorName();
    case BATCH_GOODS:
      return isSetBatchGoods();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Data)
      return this.equals((Data)that);
    return false;
  }

  public boolean equals(Data that) {
    if (that == null)
      return false;

    boolean this_present_projectCode = true && this.isSetProjectCode();
    boolean that_present_projectCode = true && that.isSetProjectCode();
    if (this_present_projectCode || that_present_projectCode) {
      if (!(this_present_projectCode && that_present_projectCode))
        return false;
      if (!this.projectCode.equals(that.projectCode))
        return false;
    }

    boolean this_present_code = true && this.isSetCode();
    boolean that_present_code = true && that.isSetCode();
    if (this_present_code || that_present_code) {
      if (!(this_present_code && that_present_code))
        return false;
      if (!this.code.equals(that.code))
        return false;
    }

    boolean this_present_vendorName = true && this.isSetVendorName();
    boolean that_present_vendorName = true && that.isSetVendorName();
    if (this_present_vendorName || that_present_vendorName) {
      if (!(this_present_vendorName && that_present_vendorName))
        return false;
      if (!this.vendorName.equals(that.vendorName))
        return false;
    }

    boolean this_present_batchGoods = true && this.isSetBatchGoods();
    boolean that_present_batchGoods = true && that.isSetBatchGoods();
    if (this_present_batchGoods || that_present_batchGoods) {
      if (!(this_present_batchGoods && that_present_batchGoods))
        return false;
      if (!this.batchGoods.equals(that.batchGoods))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_projectCode = true && (isSetProjectCode());
    list.add(present_projectCode);
    if (present_projectCode)
      list.add(projectCode);

    boolean present_code = true && (isSetCode());
    list.add(present_code);
    if (present_code)
      list.add(code);

    boolean present_vendorName = true && (isSetVendorName());
    list.add(present_vendorName);
    if (present_vendorName)
      list.add(vendorName);

    boolean present_batchGoods = true && (isSetBatchGoods());
    list.add(present_batchGoods);
    if (present_batchGoods)
      list.add(batchGoods);

    return list.hashCode();
  }

  @Override
  public int compareTo(Data other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetProjectCode()).compareTo(other.isSetProjectCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProjectCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.projectCode, other.projectCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCode()).compareTo(other.isSetCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.code, other.code);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetVendorName()).compareTo(other.isSetVendorName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVendorName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.vendorName, other.vendorName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBatchGoods()).compareTo(other.isSetBatchGoods());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBatchGoods()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.batchGoods, other.batchGoods);
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
    StringBuilder sb = new StringBuilder("Data(");
    boolean first = true;

    sb.append("projectCode:");
    if (this.projectCode == null) {
      sb.append("null");
    } else {
      sb.append(this.projectCode);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("code:");
    if (this.code == null) {
      sb.append("null");
    } else {
      sb.append(this.code);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("vendorName:");
    if (this.vendorName == null) {
      sb.append("null");
    } else {
      sb.append(this.vendorName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("batchGoods:");
    if (this.batchGoods == null) {
      sb.append("null");
    } else {
      sb.append(this.batchGoods);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DataStandardSchemeFactory implements SchemeFactory {
    public DataStandardScheme getScheme() {
      return new DataStandardScheme();
    }
  }

  private static class DataStandardScheme extends StandardScheme<Data> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Data struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PROJECT_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.projectCode = iprot.readString();
              struct.setProjectCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.code = iprot.readString();
              struct.setCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // VENDOR_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.vendorName = iprot.readString();
              struct.setVendorNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // BATCH_GOODS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list16 = iprot.readListBegin();
                struct.batchGoods = new ArrayList<List<Item>>(_list16.size);
                List<Item> _elem17;
                for (int _i18 = 0; _i18 < _list16.size; ++_i18)
                {
                  {
                    org.apache.thrift.protocol.TList _list19 = iprot.readListBegin();
                    _elem17 = new ArrayList<Item>(_list19.size);
                    Item _elem20;
                    for (int _i21 = 0; _i21 < _list19.size; ++_i21)
                    {
                      _elem20 = new Item();
                      _elem20.read(iprot);
                      _elem17.add(_elem20);
                    }
                    iprot.readListEnd();
                  }
                  struct.batchGoods.add(_elem17);
                }
                iprot.readListEnd();
              }
              struct.setBatchGoodsIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Data struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.projectCode != null) {
        oprot.writeFieldBegin(PROJECT_CODE_FIELD_DESC);
        oprot.writeString(struct.projectCode);
        oprot.writeFieldEnd();
      }
      if (struct.code != null) {
        oprot.writeFieldBegin(CODE_FIELD_DESC);
        oprot.writeString(struct.code);
        oprot.writeFieldEnd();
      }
      if (struct.vendorName != null) {
        oprot.writeFieldBegin(VENDOR_NAME_FIELD_DESC);
        oprot.writeString(struct.vendorName);
        oprot.writeFieldEnd();
      }
      if (struct.batchGoods != null) {
        oprot.writeFieldBegin(BATCH_GOODS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.LIST, struct.batchGoods.size()));
          for (List<Item> _iter22 : struct.batchGoods)
          {
            {
              oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, _iter22.size()));
              for (Item _iter23 : _iter22)
              {
                _iter23.write(oprot);
              }
              oprot.writeListEnd();
            }
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DataTupleSchemeFactory implements SchemeFactory {
    public DataTupleScheme getScheme() {
      return new DataTupleScheme();
    }
  }

  private static class DataTupleScheme extends TupleScheme<Data> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Data struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetProjectCode()) {
        optionals.set(0);
      }
      if (struct.isSetCode()) {
        optionals.set(1);
      }
      if (struct.isSetVendorName()) {
        optionals.set(2);
      }
      if (struct.isSetBatchGoods()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetProjectCode()) {
        oprot.writeString(struct.projectCode);
      }
      if (struct.isSetCode()) {
        oprot.writeString(struct.code);
      }
      if (struct.isSetVendorName()) {
        oprot.writeString(struct.vendorName);
      }
      if (struct.isSetBatchGoods()) {
        {
          oprot.writeI32(struct.batchGoods.size());
          for (List<Item> _iter24 : struct.batchGoods)
          {
            {
              oprot.writeI32(_iter24.size());
              for (Item _iter25 : _iter24)
              {
                _iter25.write(oprot);
              }
            }
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Data struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.projectCode = iprot.readString();
        struct.setProjectCodeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.code = iprot.readString();
        struct.setCodeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.vendorName = iprot.readString();
        struct.setVendorNameIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list26 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.LIST, iprot.readI32());
          struct.batchGoods = new ArrayList<List<Item>>(_list26.size);
          List<Item> _elem27;
          for (int _i28 = 0; _i28 < _list26.size; ++_i28)
          {
            {
              org.apache.thrift.protocol.TList _list29 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
              _elem27 = new ArrayList<Item>(_list29.size);
              Item _elem30;
              for (int _i31 = 0; _i31 < _list29.size; ++_i31)
              {
                _elem30 = new Item();
                _elem30.read(iprot);
                _elem27.add(_elem30);
              }
            }
            struct.batchGoods.add(_elem27);
          }
        }
        struct.setBatchGoodsIsSet(true);
      }
    }
  }

}

