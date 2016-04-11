package client; /**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-04-11")
public class Item implements org.apache.thrift.TBase<Item, Item._Fields>, java.io.Serializable, Cloneable, Comparable<Item> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Item");

  private static final org.apache.thrift.protocol.TField ITEM_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("itemName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField ITEM_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("itemCode", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField ITEM_NUM_FIELD_DESC = new org.apache.thrift.protocol.TField("itemNum", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField ITEM_UNIT_FIELD_DESC = new org.apache.thrift.protocol.TField("itemUnit", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField EPC_FIELD_DESC = new org.apache.thrift.protocol.TField("EPC", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ItemStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ItemTupleSchemeFactory());
  }

  public String itemName; // required
  public String itemCode; // required
  public String itemNum; // required
  public String itemUnit; // required
  public String EPC; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ITEM_NAME((short)1, "itemName"),
    ITEM_CODE((short)2, "itemCode"),
    ITEM_NUM((short)3, "itemNum"),
    ITEM_UNIT((short)4, "itemUnit"),
    EPC((short)5, "EPC");

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
        case 1: // ITEM_NAME
          return ITEM_NAME;
        case 2: // ITEM_CODE
          return ITEM_CODE;
        case 3: // ITEM_NUM
          return ITEM_NUM;
        case 4: // ITEM_UNIT
          return ITEM_UNIT;
        case 5: // EPC
          return EPC;
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
    tmpMap.put(_Fields.ITEM_NAME, new org.apache.thrift.meta_data.FieldMetaData("itemName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ITEM_CODE, new org.apache.thrift.meta_data.FieldMetaData("itemCode", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ITEM_NUM, new org.apache.thrift.meta_data.FieldMetaData("itemNum", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ITEM_UNIT, new org.apache.thrift.meta_data.FieldMetaData("itemUnit", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EPC, new org.apache.thrift.meta_data.FieldMetaData("EPC", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Item.class, metaDataMap);
  }

  public Item() {
  }

  public Item(
    String itemName,
    String itemCode,
    String itemNum,
    String itemUnit,
    String EPC)
  {
    this();
    this.itemName = itemName;
    this.itemCode = itemCode;
    this.itemNum = itemNum;
    this.itemUnit = itemUnit;
    this.EPC = EPC;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Item(Item other) {
    if (other.isSetItemName()) {
      this.itemName = other.itemName;
    }
    if (other.isSetItemCode()) {
      this.itemCode = other.itemCode;
    }
    if (other.isSetItemNum()) {
      this.itemNum = other.itemNum;
    }
    if (other.isSetItemUnit()) {
      this.itemUnit = other.itemUnit;
    }
    if (other.isSetEPC()) {
      this.EPC = other.EPC;
    }
  }

  public Item deepCopy() {
    return new Item(this);
  }

  @Override
  public void clear() {
    this.itemName = null;
    this.itemCode = null;
    this.itemNum = null;
    this.itemUnit = null;
    this.EPC = null;
  }

  public String getItemName() {
    return this.itemName;
  }

  public Item setItemName(String itemName) {
    this.itemName = itemName;
    return this;
  }

  public void unsetItemName() {
    this.itemName = null;
  }

  /** Returns true if field itemName is set (has been assigned a value) and false otherwise */
  public boolean isSetItemName() {
    return this.itemName != null;
  }

  public void setItemNameIsSet(boolean value) {
    if (!value) {
      this.itemName = null;
    }
  }

  public String getItemCode() {
    return this.itemCode;
  }

  public Item setItemCode(String itemCode) {
    this.itemCode = itemCode;
    return this;
  }

  public void unsetItemCode() {
    this.itemCode = null;
  }

  /** Returns true if field itemCode is set (has been assigned a value) and false otherwise */
  public boolean isSetItemCode() {
    return this.itemCode != null;
  }

  public void setItemCodeIsSet(boolean value) {
    if (!value) {
      this.itemCode = null;
    }
  }

  public String getItemNum() {
    return this.itemNum;
  }

  public Item setItemNum(String itemNum) {
    this.itemNum = itemNum;
    return this;
  }

  public void unsetItemNum() {
    this.itemNum = null;
  }

  /** Returns true if field itemNum is set (has been assigned a value) and false otherwise */
  public boolean isSetItemNum() {
    return this.itemNum != null;
  }

  public void setItemNumIsSet(boolean value) {
    if (!value) {
      this.itemNum = null;
    }
  }

  public String getItemUnit() {
    return this.itemUnit;
  }

  public Item setItemUnit(String itemUnit) {
    this.itemUnit = itemUnit;
    return this;
  }

  public void unsetItemUnit() {
    this.itemUnit = null;
  }

  /** Returns true if field itemUnit is set (has been assigned a value) and false otherwise */
  public boolean isSetItemUnit() {
    return this.itemUnit != null;
  }

  public void setItemUnitIsSet(boolean value) {
    if (!value) {
      this.itemUnit = null;
    }
  }

  public String getEPC() {
    return this.EPC;
  }

  public Item setEPC(String EPC) {
    this.EPC = EPC;
    return this;
  }

  public void unsetEPC() {
    this.EPC = null;
  }

  /** Returns true if field EPC is set (has been assigned a value) and false otherwise */
  public boolean isSetEPC() {
    return this.EPC != null;
  }

  public void setEPCIsSet(boolean value) {
    if (!value) {
      this.EPC = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ITEM_NAME:
      if (value == null) {
        unsetItemName();
      } else {
        setItemName((String)value);
      }
      break;

    case ITEM_CODE:
      if (value == null) {
        unsetItemCode();
      } else {
        setItemCode((String)value);
      }
      break;

    case ITEM_NUM:
      if (value == null) {
        unsetItemNum();
      } else {
        setItemNum((String)value);
      }
      break;

    case ITEM_UNIT:
      if (value == null) {
        unsetItemUnit();
      } else {
        setItemUnit((String)value);
      }
      break;

    case EPC:
      if (value == null) {
        unsetEPC();
      } else {
        setEPC((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ITEM_NAME:
      return getItemName();

    case ITEM_CODE:
      return getItemCode();

    case ITEM_NUM:
      return getItemNum();

    case ITEM_UNIT:
      return getItemUnit();

    case EPC:
      return getEPC();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ITEM_NAME:
      return isSetItemName();
    case ITEM_CODE:
      return isSetItemCode();
    case ITEM_NUM:
      return isSetItemNum();
    case ITEM_UNIT:
      return isSetItemUnit();
    case EPC:
      return isSetEPC();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Item)
      return this.equals((Item)that);
    return false;
  }

  public boolean equals(Item that) {
    if (that == null)
      return false;

    boolean this_present_itemName = true && this.isSetItemName();
    boolean that_present_itemName = true && that.isSetItemName();
    if (this_present_itemName || that_present_itemName) {
      if (!(this_present_itemName && that_present_itemName))
        return false;
      if (!this.itemName.equals(that.itemName))
        return false;
    }

    boolean this_present_itemCode = true && this.isSetItemCode();
    boolean that_present_itemCode = true && that.isSetItemCode();
    if (this_present_itemCode || that_present_itemCode) {
      if (!(this_present_itemCode && that_present_itemCode))
        return false;
      if (!this.itemCode.equals(that.itemCode))
        return false;
    }

    boolean this_present_itemNum = true && this.isSetItemNum();
    boolean that_present_itemNum = true && that.isSetItemNum();
    if (this_present_itemNum || that_present_itemNum) {
      if (!(this_present_itemNum && that_present_itemNum))
        return false;
      if (!this.itemNum.equals(that.itemNum))
        return false;
    }

    boolean this_present_itemUnit = true && this.isSetItemUnit();
    boolean that_present_itemUnit = true && that.isSetItemUnit();
    if (this_present_itemUnit || that_present_itemUnit) {
      if (!(this_present_itemUnit && that_present_itemUnit))
        return false;
      if (!this.itemUnit.equals(that.itemUnit))
        return false;
    }

    boolean this_present_EPC = true && this.isSetEPC();
    boolean that_present_EPC = true && that.isSetEPC();
    if (this_present_EPC || that_present_EPC) {
      if (!(this_present_EPC && that_present_EPC))
        return false;
      if (!this.EPC.equals(that.EPC))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_itemName = true && (isSetItemName());
    list.add(present_itemName);
    if (present_itemName)
      list.add(itemName);

    boolean present_itemCode = true && (isSetItemCode());
    list.add(present_itemCode);
    if (present_itemCode)
      list.add(itemCode);

    boolean present_itemNum = true && (isSetItemNum());
    list.add(present_itemNum);
    if (present_itemNum)
      list.add(itemNum);

    boolean present_itemUnit = true && (isSetItemUnit());
    list.add(present_itemUnit);
    if (present_itemUnit)
      list.add(itemUnit);

    boolean present_EPC = true && (isSetEPC());
    list.add(present_EPC);
    if (present_EPC)
      list.add(EPC);

    return list.hashCode();
  }

  @Override
  public int compareTo(Item other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetItemName()).compareTo(other.isSetItemName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetItemName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.itemName, other.itemName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetItemCode()).compareTo(other.isSetItemCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetItemCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.itemCode, other.itemCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetItemNum()).compareTo(other.isSetItemNum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetItemNum()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.itemNum, other.itemNum);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetItemUnit()).compareTo(other.isSetItemUnit());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetItemUnit()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.itemUnit, other.itemUnit);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEPC()).compareTo(other.isSetEPC());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEPC()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.EPC, other.EPC);
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
    StringBuilder sb = new StringBuilder("Item(");
    boolean first = true;

    sb.append("itemName:");
    if (this.itemName == null) {
      sb.append("null");
    } else {
      sb.append(this.itemName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("itemCode:");
    if (this.itemCode == null) {
      sb.append("null");
    } else {
      sb.append(this.itemCode);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("itemNum:");
    if (this.itemNum == null) {
      sb.append("null");
    } else {
      sb.append(this.itemNum);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("itemUnit:");
    if (this.itemUnit == null) {
      sb.append("null");
    } else {
      sb.append(this.itemUnit);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("EPC:");
    if (this.EPC == null) {
      sb.append("null");
    } else {
      sb.append(this.EPC);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ItemStandardSchemeFactory implements SchemeFactory {
    public ItemStandardScheme getScheme() {
      return new ItemStandardScheme();
    }
  }

  private static class ItemStandardScheme extends StandardScheme<Item> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Item struct) throws TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ITEM_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.itemName = iprot.readString();
              struct.setItemNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ITEM_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.itemCode = iprot.readString();
              struct.setItemCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ITEM_NUM
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.itemNum = iprot.readString();
              struct.setItemNumIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ITEM_UNIT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.itemUnit = iprot.readString();
              struct.setItemUnitIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // EPC
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.EPC = iprot.readString();
              struct.setEPCIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Item struct) throws TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.itemName != null) {
        oprot.writeFieldBegin(ITEM_NAME_FIELD_DESC);
        oprot.writeString(struct.itemName);
        oprot.writeFieldEnd();
      }
      if (struct.itemCode != null) {
        oprot.writeFieldBegin(ITEM_CODE_FIELD_DESC);
        oprot.writeString(struct.itemCode);
        oprot.writeFieldEnd();
      }
      if (struct.itemNum != null) {
        oprot.writeFieldBegin(ITEM_NUM_FIELD_DESC);
        oprot.writeString(struct.itemNum);
        oprot.writeFieldEnd();
      }
      if (struct.itemUnit != null) {
        oprot.writeFieldBegin(ITEM_UNIT_FIELD_DESC);
        oprot.writeString(struct.itemUnit);
        oprot.writeFieldEnd();
      }
      if (struct.EPC != null) {
        oprot.writeFieldBegin(EPC_FIELD_DESC);
        oprot.writeString(struct.EPC);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ItemTupleSchemeFactory implements SchemeFactory {
    public ItemTupleScheme getScheme() {
      return new ItemTupleScheme();
    }
  }

  private static class ItemTupleScheme extends TupleScheme<Item> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Item struct) throws TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetItemName()) {
        optionals.set(0);
      }
      if (struct.isSetItemCode()) {
        optionals.set(1);
      }
      if (struct.isSetItemNum()) {
        optionals.set(2);
      }
      if (struct.isSetItemUnit()) {
        optionals.set(3);
      }
      if (struct.isSetEPC()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetItemName()) {
        oprot.writeString(struct.itemName);
      }
      if (struct.isSetItemCode()) {
        oprot.writeString(struct.itemCode);
      }
      if (struct.isSetItemNum()) {
        oprot.writeString(struct.itemNum);
      }
      if (struct.isSetItemUnit()) {
        oprot.writeString(struct.itemUnit);
      }
      if (struct.isSetEPC()) {
        oprot.writeString(struct.EPC);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Item struct) throws TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.itemName = iprot.readString();
        struct.setItemNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.itemCode = iprot.readString();
        struct.setItemCodeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.itemNum = iprot.readString();
        struct.setItemNumIsSet(true);
      }
      if (incoming.get(3)) {
        struct.itemUnit = iprot.readString();
        struct.setItemUnitIsSet(true);
      }
      if (incoming.get(4)) {
        struct.EPC = iprot.readString();
        struct.setEPCIsSet(true);
      }
    }
  }

}

