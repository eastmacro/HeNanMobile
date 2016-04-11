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
public class RfidPrinterService {

  public interface Iface {

    public boolean callPrinter(Data data) throws TException;

  }

  public interface AsyncIface {

    public void callPrinter(Data data, AsyncMethodCallback resultHandler) throws TException;

  }

  public static class Client extends org.apache.thrift.TServiceClient implements Iface {
    public static class Factory implements org.apache.thrift.TServiceClientFactory<Client> {
      public Factory() {}
      public Client getClient(org.apache.thrift.protocol.TProtocol prot) {
        return new Client(prot);
      }
      public Client getClient(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
        return new Client(iprot, oprot);
      }
    }

    public Client(org.apache.thrift.protocol.TProtocol prot)
    {
      super(prot, prot);
    }

    public Client(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
      super(iprot, oprot);
    }

    public boolean callPrinter(Data data) throws TException
    {
      send_callPrinter(data);
      return recv_callPrinter();
    }

    public void send_callPrinter(Data data) throws TException
    {
      callPrinter_args args = new callPrinter_args();
      args.setData(data);
      sendBase("callPrinter", args);
    }

    public boolean recv_callPrinter() throws TException
    {
      callPrinter_result result = new callPrinter_result();
      receiveBase(result, "callPrinter");
      if (result.isSetSuccess()) {
        return result.success;
      }
      throw new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.MISSING_RESULT, "callPrinter failed: unknown result");
    }

  }
  public static class AsyncClient extends org.apache.thrift.async.TAsyncClient implements AsyncIface {
    public static class Factory implements org.apache.thrift.async.TAsyncClientFactory<AsyncClient> {
      private org.apache.thrift.async.TAsyncClientManager clientManager;
      private org.apache.thrift.protocol.TProtocolFactory protocolFactory;
      public Factory(org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.protocol.TProtocolFactory protocolFactory) {
        this.clientManager = clientManager;
        this.protocolFactory = protocolFactory;
      }
      public AsyncClient getAsyncClient(org.apache.thrift.transport.TNonblockingTransport transport) {
        return new AsyncClient(protocolFactory, clientManager, transport);
      }
    }

    public AsyncClient(org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.transport.TNonblockingTransport transport) {
      super(protocolFactory, clientManager, transport);
    }

    public void callPrinter(Data data, AsyncMethodCallback resultHandler) throws TException {
      checkReady();
      callPrinter_call method_call = new callPrinter_call(data, resultHandler, this, ___protocolFactory, ___transport);
      this.___currentMethod = method_call;
      ___manager.call(method_call);
    }

    public static class callPrinter_call extends org.apache.thrift.async.TAsyncMethodCall {
      private Data data;
      public callPrinter_call(Data data, AsyncMethodCallback resultHandler, org.apache.thrift.async.TAsyncClient client, org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.transport.TNonblockingTransport transport) throws TException {
        super(client, protocolFactory, transport, resultHandler, false);
        this.data = data;
      }

      public void write_args(org.apache.thrift.protocol.TProtocol prot) throws TException {
        prot.writeMessageBegin(new org.apache.thrift.protocol.TMessage("callPrinter", org.apache.thrift.protocol.TMessageType.CALL, 0));
        callPrinter_args args = new callPrinter_args();
        args.setData(data);
        args.write(prot);
        prot.writeMessageEnd();
      }

      public boolean getResult() throws TException {
        if (getState() != State.RESPONSE_READ) {
          throw new IllegalStateException("Method call not finished!");
        }
        org.apache.thrift.transport.TMemoryInputTransport memoryTransport = new org.apache.thrift.transport.TMemoryInputTransport(getFrameBuffer().array());
        org.apache.thrift.protocol.TProtocol prot = client.getProtocolFactory().getProtocol(memoryTransport);
        return (new Client(prot)).recv_callPrinter();
      }
    }

  }

  public static class Processor<I extends Iface> extends org.apache.thrift.TBaseProcessor<I> implements org.apache.thrift.TProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(Processor.class.getName());
    public Processor(I iface) {
      super(iface, getProcessMap(new HashMap<String, org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>>()));
    }

    protected Processor(I iface, Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends Iface> Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> getProcessMap(Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      processMap.put("callPrinter", new callPrinter());
      return processMap;
    }

    public static class callPrinter<I extends Iface> extends org.apache.thrift.ProcessFunction<I, callPrinter_args> {
      public callPrinter() {
        super("callPrinter");
      }

      public callPrinter_args getEmptyArgsInstance() {
        return new callPrinter_args();
      }

      protected boolean isOneway() {
        return false;
      }

      public callPrinter_result getResult(I iface, callPrinter_args args) throws TException {
        callPrinter_result result = new callPrinter_result();
        result.success = iface.callPrinter(args.data);
        result.setSuccessIsSet(true);
        return result;
      }
    }

  }

  public static class AsyncProcessor<I extends AsyncIface> extends org.apache.thrift.TBaseAsyncProcessor<I> {
    private static final Logger LOGGER = LoggerFactory.getLogger(AsyncProcessor.class.getName());
    public AsyncProcessor(I iface) {
      super(iface, getProcessMap(new HashMap<String, org.apache.thrift.AsyncProcessFunction<I, ? extends org.apache.thrift.TBase, ?>>()));
    }

    protected AsyncProcessor(I iface, Map<String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase, ?>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends AsyncIface> Map<String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase,?>> getProcessMap(Map<String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase, ?>> processMap) {
      processMap.put("callPrinter", new callPrinter());
      return processMap;
    }

    public static class callPrinter<I extends AsyncIface> extends org.apache.thrift.AsyncProcessFunction<I, callPrinter_args, Boolean> {
      public callPrinter() {
        super("callPrinter");
      }

      public callPrinter_args getEmptyArgsInstance() {
        return new callPrinter_args();
      }

      public AsyncMethodCallback<Boolean> getResultHandler(final AsyncFrameBuffer fb, final int seqid) {
        final org.apache.thrift.AsyncProcessFunction fcall = this;
        return new AsyncMethodCallback<Boolean>() { 
          public void onComplete(Boolean o) {
            callPrinter_result result = new callPrinter_result();
            result.success = o;
            result.setSuccessIsSet(true);
            try {
              fcall.sendResponse(fb,result, org.apache.thrift.protocol.TMessageType.REPLY,seqid);
              return;
            } catch (Exception e) {
              LOGGER.error("Exception writing to internal frame buffer", e);
            }
            fb.close();
          }
          public void onError(Exception e) {
            byte msgType = org.apache.thrift.protocol.TMessageType.REPLY;
            org.apache.thrift.TBase msg;
            callPrinter_result result = new callPrinter_result();
            {
              msgType = org.apache.thrift.protocol.TMessageType.EXCEPTION;
              msg = (org.apache.thrift.TBase)new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.INTERNAL_ERROR, e.getMessage());
            }
            try {
              fcall.sendResponse(fb,msg,msgType,seqid);
              return;
            } catch (Exception ex) {
              LOGGER.error("Exception writing to internal frame buffer", ex);
            }
            fb.close();
          }
        };
      }

      protected boolean isOneway() {
        return false;
      }

      public void start(I iface, callPrinter_args args, AsyncMethodCallback<Boolean> resultHandler) throws TException {
        iface.callPrinter(args.data,resultHandler);
      }
    }

  }

  public static class callPrinter_args implements org.apache.thrift.TBase<callPrinter_args, callPrinter_args._Fields>, java.io.Serializable, Cloneable, Comparable<callPrinter_args>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("callPrinter_args");

    private static final org.apache.thrift.protocol.TField DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("data", org.apache.thrift.protocol.TType.STRUCT, (short)1);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new callPrinter_argsStandardSchemeFactory());
      schemes.put(TupleScheme.class, new callPrinter_argsTupleSchemeFactory());
    }

    public Data data; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      DATA((short)1, "data");

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
          case 1: // DATA
            return DATA;
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
      tmpMap.put(_Fields.DATA, new org.apache.thrift.meta_data.FieldMetaData("data", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Data.class)));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(callPrinter_args.class, metaDataMap);
    }

    public callPrinter_args() {
    }

    public callPrinter_args(
      Data data)
    {
      this();
      this.data = data;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public callPrinter_args(callPrinter_args other) {
      if (other.isSetData()) {
        this.data = new Data(other.data);
      }
    }

    public callPrinter_args deepCopy() {
      return new callPrinter_args(this);
    }

    @Override
    public void clear() {
      this.data = null;
    }

    public Data getData() {
      return this.data;
    }

    public callPrinter_args setData(Data data) {
      this.data = data;
      return this;
    }

    public void unsetData() {
      this.data = null;
    }

    /** Returns true if field data is set (has been assigned a value) and false otherwise */
    public boolean isSetData() {
      return this.data != null;
    }

    public void setDataIsSet(boolean value) {
      if (!value) {
        this.data = null;
      }
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case DATA:
        if (value == null) {
          unsetData();
        } else {
          setData((Data)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case DATA:
        return getData();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case DATA:
        return isSetData();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof callPrinter_args)
        return this.equals((callPrinter_args)that);
      return false;
    }

    public boolean equals(callPrinter_args that) {
      if (that == null)
        return false;

      boolean this_present_data = true && this.isSetData();
      boolean that_present_data = true && that.isSetData();
      if (this_present_data || that_present_data) {
        if (!(this_present_data && that_present_data))
          return false;
        if (!this.data.equals(that.data))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      List<Object> list = new ArrayList<Object>();

      boolean present_data = true && (isSetData());
      list.add(present_data);
      if (present_data)
        list.add(data);

      return list.hashCode();
    }

    @Override
    public int compareTo(callPrinter_args other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

      lastComparison = Boolean.valueOf(isSetData()).compareTo(other.isSetData());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetData()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.data, other.data);
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
      StringBuilder sb = new StringBuilder("callPrinter_args(");
      boolean first = true;

      sb.append("data:");
      if (this.data == null) {
        sb.append("null");
      } else {
        sb.append(this.data);
      }
      first = false;
      sb.append(")");
      return sb.toString();
    }

    public void validate() throws TException {
      // check for required fields
      // check for sub-struct validity
      if (data != null) {
        data.validate();
      }
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

    private static class callPrinter_argsStandardSchemeFactory implements SchemeFactory {
      public callPrinter_argsStandardScheme getScheme() {
        return new callPrinter_argsStandardScheme();
      }
    }

    private static class callPrinter_argsStandardScheme extends StandardScheme<callPrinter_args> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, callPrinter_args struct) throws TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 1: // DATA
              if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                struct.data = new Data();
                struct.data.read(iprot);
                struct.setDataIsSet(true);
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

      public void write(org.apache.thrift.protocol.TProtocol oprot, callPrinter_args struct) throws TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.data != null) {
          oprot.writeFieldBegin(DATA_FIELD_DESC);
          struct.data.write(oprot);
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class callPrinter_argsTupleSchemeFactory implements SchemeFactory {
      public callPrinter_argsTupleScheme getScheme() {
        return new callPrinter_argsTupleScheme();
      }
    }

    private static class callPrinter_argsTupleScheme extends TupleScheme<callPrinter_args> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, callPrinter_args struct) throws TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
        BitSet optionals = new BitSet();
        if (struct.isSetData()) {
          optionals.set(0);
        }
        oprot.writeBitSet(optionals, 1);
        if (struct.isSetData()) {
          struct.data.write(oprot);
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, callPrinter_args struct) throws TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
        BitSet incoming = iprot.readBitSet(1);
        if (incoming.get(0)) {
          struct.data = new Data();
          struct.data.read(iprot);
          struct.setDataIsSet(true);
        }
      }
    }

  }

  public static class callPrinter_result implements org.apache.thrift.TBase<callPrinter_result, callPrinter_result._Fields>, java.io.Serializable, Cloneable, Comparable<callPrinter_result>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("callPrinter_result");

    private static final org.apache.thrift.protocol.TField SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.BOOL, (short)0);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new callPrinter_resultStandardSchemeFactory());
      schemes.put(TupleScheme.class, new callPrinter_resultTupleSchemeFactory());
    }

    public boolean success; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      SUCCESS((short)0, "success");

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
          case 0: // SUCCESS
            return SUCCESS;
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
    private static final int __SUCCESS_ISSET_ID = 0;
    private byte __isset_bitfield = 0;
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.SUCCESS, new org.apache.thrift.meta_data.FieldMetaData("success", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(callPrinter_result.class, metaDataMap);
    }

    public callPrinter_result() {
    }

    public callPrinter_result(
      boolean success)
    {
      this();
      this.success = success;
      setSuccessIsSet(true);
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public callPrinter_result(callPrinter_result other) {
      __isset_bitfield = other.__isset_bitfield;
      this.success = other.success;
    }

    public callPrinter_result deepCopy() {
      return new callPrinter_result(this);
    }

    @Override
    public void clear() {
      setSuccessIsSet(false);
      this.success = false;
    }

    public boolean isSuccess() {
      return this.success;
    }

    public callPrinter_result setSuccess(boolean success) {
      this.success = success;
      setSuccessIsSet(true);
      return this;
    }

    public void unsetSuccess() {
      __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SUCCESS_ISSET_ID);
    }

    /** Returns true if field success is set (has been assigned a value) and false otherwise */
    public boolean isSetSuccess() {
      return EncodingUtils.testBit(__isset_bitfield, __SUCCESS_ISSET_ID);
    }

    public void setSuccessIsSet(boolean value) {
      __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SUCCESS_ISSET_ID, value);
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case SUCCESS:
        if (value == null) {
          unsetSuccess();
        } else {
          setSuccess((Boolean)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case SUCCESS:
        return isSuccess();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case SUCCESS:
        return isSetSuccess();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof callPrinter_result)
        return this.equals((callPrinter_result)that);
      return false;
    }

    public boolean equals(callPrinter_result that) {
      if (that == null)
        return false;

      boolean this_present_success = true;
      boolean that_present_success = true;
      if (this_present_success || that_present_success) {
        if (!(this_present_success && that_present_success))
          return false;
        if (this.success != that.success)
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      List<Object> list = new ArrayList<Object>();

      boolean present_success = true;
      list.add(present_success);
      if (present_success)
        list.add(success);

      return list.hashCode();
    }

    @Override
    public int compareTo(callPrinter_result other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

      lastComparison = Boolean.valueOf(isSetSuccess()).compareTo(other.isSetSuccess());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetSuccess()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.success, other.success);
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
      StringBuilder sb = new StringBuilder("callPrinter_result(");
      boolean first = true;

      sb.append("success:");
      sb.append(this.success);
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
        // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
        __isset_bitfield = 0;
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class callPrinter_resultStandardSchemeFactory implements SchemeFactory {
      public callPrinter_resultStandardScheme getScheme() {
        return new callPrinter_resultStandardScheme();
      }
    }

    private static class callPrinter_resultStandardScheme extends StandardScheme<callPrinter_result> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, callPrinter_result struct) throws TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 0: // SUCCESS
              if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
                struct.success = iprot.readBool();
                struct.setSuccessIsSet(true);
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

      public void write(org.apache.thrift.protocol.TProtocol oprot, callPrinter_result struct) throws TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.isSetSuccess()) {
          oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
          oprot.writeBool(struct.success);
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class callPrinter_resultTupleSchemeFactory implements SchemeFactory {
      public callPrinter_resultTupleScheme getScheme() {
        return new callPrinter_resultTupleScheme();
      }
    }

    private static class callPrinter_resultTupleScheme extends TupleScheme<callPrinter_result> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, callPrinter_result struct) throws TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
        BitSet optionals = new BitSet();
        if (struct.isSetSuccess()) {
          optionals.set(0);
        }
        oprot.writeBitSet(optionals, 1);
        if (struct.isSetSuccess()) {
          oprot.writeBool(struct.success);
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, callPrinter_result struct) throws TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
        BitSet incoming = iprot.readBitSet(1);
        if (incoming.get(0)) {
          struct.success = iprot.readBool();
          struct.setSuccessIsSet(true);
        }
      }
    }

  }

}
