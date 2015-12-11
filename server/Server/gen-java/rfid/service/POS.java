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
public class POS implements org.apache.thrift.TBase<POS, POS._Fields>, java.io.Serializable, Cloneable, Comparable<POS> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("POS");

  private static final org.apache.thrift.protocol.TField APPLY__DOC__CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("Apply_Doc_Code", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField APPLY__PERSON_FIELD_DESC = new org.apache.thrift.protocol.TField("Apply_Person", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField APPLY__UNIT_FIELD_DESC = new org.apache.thrift.protocol.TField("Apply_Unit", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField PROJECT__CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("Project_Code", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField APPLY__DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("Apply_Date", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField RECEIVER_FIELD_DESC = new org.apache.thrift.protocol.TField("Receiver", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new POSStandardSchemeFactory());
    schemes.put(TupleScheme.class, new POSTupleSchemeFactory());
  }

  public String Apply_Doc_Code; // required
  public String Apply_Person; // required
  public String Apply_Unit; // required
  public String Project_Code; // required
  public String Apply_Date; // required
  public String Receiver; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    APPLY__DOC__CODE((short)1, "Apply_Doc_Code"),
    APPLY__PERSON((short)2, "Apply_Person"),
    APPLY__UNIT((short)3, "Apply_Unit"),
    PROJECT__CODE((short)4, "Project_Code"),
    APPLY__DATE((short)5, "Apply_Date"),
    RECEIVER((short)6, "Receiver");

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
        case 1: // APPLY__DOC__CODE
          return APPLY__DOC__CODE;
        case 2: // APPLY__PERSON
          return APPLY__PERSON;
        case 3: // APPLY__UNIT
          return APPLY__UNIT;
        case 4: // PROJECT__CODE
          return PROJECT__CODE;
        case 5: // APPLY__DATE
          return APPLY__DATE;
        case 6: // RECEIVER
          return RECEIVER;
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
    tmpMap.put(_Fields.APPLY__DOC__CODE, new org.apache.thrift.meta_data.FieldMetaData("Apply_Doc_Code", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.APPLY__PERSON, new org.apache.thrift.meta_data.FieldMetaData("Apply_Person", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.APPLY__UNIT, new org.apache.thrift.meta_data.FieldMetaData("Apply_Unit", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PROJECT__CODE, new org.apache.thrift.meta_data.FieldMetaData("Project_Code", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.APPLY__DATE, new org.apache.thrift.meta_data.FieldMetaData("Apply_Date", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RECEIVER, new org.apache.thrift.meta_data.FieldMetaData("Receiver", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(POS.class, metaDataMap);
  }

  public POS() {
  }

  public POS(
    String Apply_Doc_Code,
    String Apply_Person,
    String Apply_Unit,
    String Project_Code,
    String Apply_Date,
    String Receiver)
  {
    this();
    this.Apply_Doc_Code = Apply_Doc_Code;
    this.Apply_Person = Apply_Person;
    this.Apply_Unit = Apply_Unit;
    this.Project_Code = Project_Code;
    this.Apply_Date = Apply_Date;
    this.Receiver = Receiver;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public POS(POS other) {
    if (other.isSetApply_Doc_Code()) {
      this.Apply_Doc_Code = other.Apply_Doc_Code;
    }
    if (other.isSetApply_Person()) {
      this.Apply_Person = other.Apply_Person;
    }
    if (other.isSetApply_Unit()) {
      this.Apply_Unit = other.Apply_Unit;
    }
    if (other.isSetProject_Code()) {
      this.Project_Code = other.Project_Code;
    }
    if (other.isSetApply_Date()) {
      this.Apply_Date = other.Apply_Date;
    }
    if (other.isSetReceiver()) {
      this.Receiver = other.Receiver;
    }
  }

  public POS deepCopy() {
    return new POS(this);
  }

  @Override
  public void clear() {
    this.Apply_Doc_Code = null;
    this.Apply_Person = null;
    this.Apply_Unit = null;
    this.Project_Code = null;
    this.Apply_Date = null;
    this.Receiver = null;
  }

  public String getApply_Doc_Code() {
    return this.Apply_Doc_Code;
  }

  public POS setApply_Doc_Code(String Apply_Doc_Code) {
    this.Apply_Doc_Code = Apply_Doc_Code;
    return this;
  }

  public void unsetApply_Doc_Code() {
    this.Apply_Doc_Code = null;
  }

  /** Returns true if field Apply_Doc_Code is set (has been assigned a value) and false otherwise */
  public boolean isSetApply_Doc_Code() {
    return this.Apply_Doc_Code != null;
  }

  public void setApply_Doc_CodeIsSet(boolean value) {
    if (!value) {
      this.Apply_Doc_Code = null;
    }
  }

  public String getApply_Person() {
    return this.Apply_Person;
  }

  public POS setApply_Person(String Apply_Person) {
    this.Apply_Person = Apply_Person;
    return this;
  }

  public void unsetApply_Person() {
    this.Apply_Person = null;
  }

  /** Returns true if field Apply_Person is set (has been assigned a value) and false otherwise */
  public boolean isSetApply_Person() {
    return this.Apply_Person != null;
  }

  public void setApply_PersonIsSet(boolean value) {
    if (!value) {
      this.Apply_Person = null;
    }
  }

  public String getApply_Unit() {
    return this.Apply_Unit;
  }

  public POS setApply_Unit(String Apply_Unit) {
    this.Apply_Unit = Apply_Unit;
    return this;
  }

  public void unsetApply_Unit() {
    this.Apply_Unit = null;
  }

  /** Returns true if field Apply_Unit is set (has been assigned a value) and false otherwise */
  public boolean isSetApply_Unit() {
    return this.Apply_Unit != null;
  }

  public void setApply_UnitIsSet(boolean value) {
    if (!value) {
      this.Apply_Unit = null;
    }
  }

  public String getProject_Code() {
    return this.Project_Code;
  }

  public POS setProject_Code(String Project_Code) {
    this.Project_Code = Project_Code;
    return this;
  }

  public void unsetProject_Code() {
    this.Project_Code = null;
  }

  /** Returns true if field Project_Code is set (has been assigned a value) and false otherwise */
  public boolean isSetProject_Code() {
    return this.Project_Code != null;
  }

  public void setProject_CodeIsSet(boolean value) {
    if (!value) {
      this.Project_Code = null;
    }
  }

  public String getApply_Date() {
    return this.Apply_Date;
  }

  public POS setApply_Date(String Apply_Date) {
    this.Apply_Date = Apply_Date;
    return this;
  }

  public void unsetApply_Date() {
    this.Apply_Date = null;
  }

  /** Returns true if field Apply_Date is set (has been assigned a value) and false otherwise */
  public boolean isSetApply_Date() {
    return this.Apply_Date != null;
  }

  public void setApply_DateIsSet(boolean value) {
    if (!value) {
      this.Apply_Date = null;
    }
  }

  public String getReceiver() {
    return this.Receiver;
  }

  public POS setReceiver(String Receiver) {
    this.Receiver = Receiver;
    return this;
  }

  public void unsetReceiver() {
    this.Receiver = null;
  }

  /** Returns true if field Receiver is set (has been assigned a value) and false otherwise */
  public boolean isSetReceiver() {
    return this.Receiver != null;
  }

  public void setReceiverIsSet(boolean value) {
    if (!value) {
      this.Receiver = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case APPLY__DOC__CODE:
      if (value == null) {
        unsetApply_Doc_Code();
      } else {
        setApply_Doc_Code((String)value);
      }
      break;

    case APPLY__PERSON:
      if (value == null) {
        unsetApply_Person();
      } else {
        setApply_Person((String)value);
      }
      break;

    case APPLY__UNIT:
      if (value == null) {
        unsetApply_Unit();
      } else {
        setApply_Unit((String)value);
      }
      break;

    case PROJECT__CODE:
      if (value == null) {
        unsetProject_Code();
      } else {
        setProject_Code((String)value);
      }
      break;

    case APPLY__DATE:
      if (value == null) {
        unsetApply_Date();
      } else {
        setApply_Date((String)value);
      }
      break;

    case RECEIVER:
      if (value == null) {
        unsetReceiver();
      } else {
        setReceiver((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case APPLY__DOC__CODE:
      return getApply_Doc_Code();

    case APPLY__PERSON:
      return getApply_Person();

    case APPLY__UNIT:
      return getApply_Unit();

    case PROJECT__CODE:
      return getProject_Code();

    case APPLY__DATE:
      return getApply_Date();

    case RECEIVER:
      return getReceiver();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case APPLY__DOC__CODE:
      return isSetApply_Doc_Code();
    case APPLY__PERSON:
      return isSetApply_Person();
    case APPLY__UNIT:
      return isSetApply_Unit();
    case PROJECT__CODE:
      return isSetProject_Code();
    case APPLY__DATE:
      return isSetApply_Date();
    case RECEIVER:
      return isSetReceiver();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof POS)
      return this.equals((POS)that);
    return false;
  }

  public boolean equals(POS that) {
    if (that == null)
      return false;

    boolean this_present_Apply_Doc_Code = true && this.isSetApply_Doc_Code();
    boolean that_present_Apply_Doc_Code = true && that.isSetApply_Doc_Code();
    if (this_present_Apply_Doc_Code || that_present_Apply_Doc_Code) {
      if (!(this_present_Apply_Doc_Code && that_present_Apply_Doc_Code))
        return false;
      if (!this.Apply_Doc_Code.equals(that.Apply_Doc_Code))
        return false;
    }

    boolean this_present_Apply_Person = true && this.isSetApply_Person();
    boolean that_present_Apply_Person = true && that.isSetApply_Person();
    if (this_present_Apply_Person || that_present_Apply_Person) {
      if (!(this_present_Apply_Person && that_present_Apply_Person))
        return false;
      if (!this.Apply_Person.equals(that.Apply_Person))
        return false;
    }

    boolean this_present_Apply_Unit = true && this.isSetApply_Unit();
    boolean that_present_Apply_Unit = true && that.isSetApply_Unit();
    if (this_present_Apply_Unit || that_present_Apply_Unit) {
      if (!(this_present_Apply_Unit && that_present_Apply_Unit))
        return false;
      if (!this.Apply_Unit.equals(that.Apply_Unit))
        return false;
    }

    boolean this_present_Project_Code = true && this.isSetProject_Code();
    boolean that_present_Project_Code = true && that.isSetProject_Code();
    if (this_present_Project_Code || that_present_Project_Code) {
      if (!(this_present_Project_Code && that_present_Project_Code))
        return false;
      if (!this.Project_Code.equals(that.Project_Code))
        return false;
    }

    boolean this_present_Apply_Date = true && this.isSetApply_Date();
    boolean that_present_Apply_Date = true && that.isSetApply_Date();
    if (this_present_Apply_Date || that_present_Apply_Date) {
      if (!(this_present_Apply_Date && that_present_Apply_Date))
        return false;
      if (!this.Apply_Date.equals(that.Apply_Date))
        return false;
    }

    boolean this_present_Receiver = true && this.isSetReceiver();
    boolean that_present_Receiver = true && that.isSetReceiver();
    if (this_present_Receiver || that_present_Receiver) {
      if (!(this_present_Receiver && that_present_Receiver))
        return false;
      if (!this.Receiver.equals(that.Receiver))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_Apply_Doc_Code = true && (isSetApply_Doc_Code());
    list.add(present_Apply_Doc_Code);
    if (present_Apply_Doc_Code)
      list.add(Apply_Doc_Code);

    boolean present_Apply_Person = true && (isSetApply_Person());
    list.add(present_Apply_Person);
    if (present_Apply_Person)
      list.add(Apply_Person);

    boolean present_Apply_Unit = true && (isSetApply_Unit());
    list.add(present_Apply_Unit);
    if (present_Apply_Unit)
      list.add(Apply_Unit);

    boolean present_Project_Code = true && (isSetProject_Code());
    list.add(present_Project_Code);
    if (present_Project_Code)
      list.add(Project_Code);

    boolean present_Apply_Date = true && (isSetApply_Date());
    list.add(present_Apply_Date);
    if (present_Apply_Date)
      list.add(Apply_Date);

    boolean present_Receiver = true && (isSetReceiver());
    list.add(present_Receiver);
    if (present_Receiver)
      list.add(Receiver);

    return list.hashCode();
  }

  @Override
  public int compareTo(POS other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetApply_Doc_Code()).compareTo(other.isSetApply_Doc_Code());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetApply_Doc_Code()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Apply_Doc_Code, other.Apply_Doc_Code);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetApply_Person()).compareTo(other.isSetApply_Person());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetApply_Person()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Apply_Person, other.Apply_Person);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetApply_Unit()).compareTo(other.isSetApply_Unit());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetApply_Unit()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Apply_Unit, other.Apply_Unit);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetProject_Code()).compareTo(other.isSetProject_Code());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProject_Code()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Project_Code, other.Project_Code);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetApply_Date()).compareTo(other.isSetApply_Date());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetApply_Date()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Apply_Date, other.Apply_Date);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetReceiver()).compareTo(other.isSetReceiver());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReceiver()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Receiver, other.Receiver);
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
    StringBuilder sb = new StringBuilder("POS(");
    boolean first = true;

    sb.append("Apply_Doc_Code:");
    if (this.Apply_Doc_Code == null) {
      sb.append("null");
    } else {
      sb.append(this.Apply_Doc_Code);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("Apply_Person:");
    if (this.Apply_Person == null) {
      sb.append("null");
    } else {
      sb.append(this.Apply_Person);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("Apply_Unit:");
    if (this.Apply_Unit == null) {
      sb.append("null");
    } else {
      sb.append(this.Apply_Unit);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("Project_Code:");
    if (this.Project_Code == null) {
      sb.append("null");
    } else {
      sb.append(this.Project_Code);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("Apply_Date:");
    if (this.Apply_Date == null) {
      sb.append("null");
    } else {
      sb.append(this.Apply_Date);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("Receiver:");
    if (this.Receiver == null) {
      sb.append("null");
    } else {
      sb.append(this.Receiver);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (Apply_Doc_Code == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'Apply_Doc_Code' was not present! Struct: " + toString());
    }
    if (Apply_Person == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'Apply_Person' was not present! Struct: " + toString());
    }
    if (Apply_Unit == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'Apply_Unit' was not present! Struct: " + toString());
    }
    if (Project_Code == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'Project_Code' was not present! Struct: " + toString());
    }
    if (Apply_Date == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'Apply_Date' was not present! Struct: " + toString());
    }
    if (Receiver == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'Receiver' was not present! Struct: " + toString());
    }
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

  private static class POSStandardSchemeFactory implements SchemeFactory {
    public POSStandardScheme getScheme() {
      return new POSStandardScheme();
    }
  }

  private static class POSStandardScheme extends StandardScheme<POS> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, POS struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // APPLY__DOC__CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.Apply_Doc_Code = iprot.readString();
              struct.setApply_Doc_CodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // APPLY__PERSON
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.Apply_Person = iprot.readString();
              struct.setApply_PersonIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // APPLY__UNIT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.Apply_Unit = iprot.readString();
              struct.setApply_UnitIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PROJECT__CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.Project_Code = iprot.readString();
              struct.setProject_CodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // APPLY__DATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.Apply_Date = iprot.readString();
              struct.setApply_DateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // RECEIVER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.Receiver = iprot.readString();
              struct.setReceiverIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, POS struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.Apply_Doc_Code != null) {
        oprot.writeFieldBegin(APPLY__DOC__CODE_FIELD_DESC);
        oprot.writeString(struct.Apply_Doc_Code);
        oprot.writeFieldEnd();
      }
      if (struct.Apply_Person != null) {
        oprot.writeFieldBegin(APPLY__PERSON_FIELD_DESC);
        oprot.writeString(struct.Apply_Person);
        oprot.writeFieldEnd();
      }
      if (struct.Apply_Unit != null) {
        oprot.writeFieldBegin(APPLY__UNIT_FIELD_DESC);
        oprot.writeString(struct.Apply_Unit);
        oprot.writeFieldEnd();
      }
      if (struct.Project_Code != null) {
        oprot.writeFieldBegin(PROJECT__CODE_FIELD_DESC);
        oprot.writeString(struct.Project_Code);
        oprot.writeFieldEnd();
      }
      if (struct.Apply_Date != null) {
        oprot.writeFieldBegin(APPLY__DATE_FIELD_DESC);
        oprot.writeString(struct.Apply_Date);
        oprot.writeFieldEnd();
      }
      if (struct.Receiver != null) {
        oprot.writeFieldBegin(RECEIVER_FIELD_DESC);
        oprot.writeString(struct.Receiver);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class POSTupleSchemeFactory implements SchemeFactory {
    public POSTupleScheme getScheme() {
      return new POSTupleScheme();
    }
  }

  private static class POSTupleScheme extends TupleScheme<POS> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, POS struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.Apply_Doc_Code);
      oprot.writeString(struct.Apply_Person);
      oprot.writeString(struct.Apply_Unit);
      oprot.writeString(struct.Project_Code);
      oprot.writeString(struct.Apply_Date);
      oprot.writeString(struct.Receiver);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, POS struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.Apply_Doc_Code = iprot.readString();
      struct.setApply_Doc_CodeIsSet(true);
      struct.Apply_Person = iprot.readString();
      struct.setApply_PersonIsSet(true);
      struct.Apply_Unit = iprot.readString();
      struct.setApply_UnitIsSet(true);
      struct.Project_Code = iprot.readString();
      struct.setProject_CodeIsSet(true);
      struct.Apply_Date = iprot.readString();
      struct.setApply_DateIsSet(true);
      struct.Receiver = iprot.readString();
      struct.setReceiverIsSet(true);
    }
  }

}

