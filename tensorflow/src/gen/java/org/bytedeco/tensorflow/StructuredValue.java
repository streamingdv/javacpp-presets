// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// ===================================================================

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class StructuredValue extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StructuredValue(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public StructuredValue(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public StructuredValue position(long position) {
        return (StructuredValue)super.position(position);
    }
    @Override public StructuredValue getPointer(long i) {
        return new StructuredValue((Pointer)this).position(position + i);
    }

  public StructuredValue() { super((Pointer)null); allocate(); }
  private native void allocate();

  public StructuredValue(@Const @ByRef StructuredValue from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef StructuredValue from);

  public native @ByRef @Name("operator =") StructuredValue put(@Const @ByRef StructuredValue from);

  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef StructuredValue default_instance();

  /** enum tensorflow::StructuredValue::KindCase */
  public static final int
    kNoneValue = 1,
    kFloat64Value = 11,
    kInt64Value = 12,
    kStringValue = 13,
    kBoolValue = 14,
    kTensorShapeValue = 31,
    kTensorDtypeValue = 32,
    kTensorSpecValue = 33,
    kTypeSpecValue = 34,
    kListValue = 51,
    kTupleValue = 52,
    kDictValue = 53,
    kNamedTupleValue = 54,
    KIND_NOT_SET = 0;

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const StructuredValue internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(StructuredValue other);
  

  // implements Message ----------------------------------------------

  public native StructuredValue New();

  public native StructuredValue New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef StructuredValue from);
  public native void MergeFrom(@Const @ByRef StructuredValue from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
//   #if GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
//   #else
  public native @Cast("bool") boolean MergePartialFromCodedStream(
        CodedInputStream input);
//   #endif  // GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
  public native void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") byte[] target);
  public native int GetCachedSize();

  public native @ByVal @Cast("google::protobuf::Metadata*") Pointer GetMetadata();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // .tensorflow.NoneValue none_value = 1;
  public native @Cast("bool") boolean has_none_value();
  public native void clear_none_value();
  @MemberGetter public static native int kNoneValueFieldNumber();
  public static final int kNoneValueFieldNumber = kNoneValueFieldNumber();
  public native @Const @ByRef NoneValue none_value();
  public native NoneValue release_none_value();
  public native NoneValue mutable_none_value();
  public native void set_allocated_none_value(NoneValue none_value);
  public native void clear_float64_value();
  @MemberGetter public static native int kFloat64ValueFieldNumber();
  public static final int kFloat64ValueFieldNumber = kFloat64ValueFieldNumber();
  public native double float64_value();
  public native void set_float64_value(double value);
  public native void clear_int64_value();
  @MemberGetter public static native int kInt64ValueFieldNumber();
  public static final int kInt64ValueFieldNumber = kInt64ValueFieldNumber();
  public native @Cast("google::protobuf::int64") long int64_value();
  public native void set_int64_value(@Cast("google::protobuf::int64") long value);
  public native void clear_string_value();
  @MemberGetter public static native int kStringValueFieldNumber();
  public static final int kStringValueFieldNumber = kStringValueFieldNumber();
  public native @StdString BytePointer string_value();
  public native void set_string_value(@StdString BytePointer value);
  public native void set_string_value(@StdString String value);
  public native void set_string_value(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_string_value(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_string_value();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_string_value();
  public native void set_allocated_string_value(@StdString @Cast({"char*", "std::string*"}) BytePointer string_value);
  public native void clear_bool_value();
  @MemberGetter public static native int kBoolValueFieldNumber();
  public static final int kBoolValueFieldNumber = kBoolValueFieldNumber();
  public native @Cast("bool") boolean bool_value();
  public native void set_bool_value(@Cast("bool") boolean value);

  // .tensorflow.TensorShapeProto tensor_shape_value = 31;
  public native @Cast("bool") boolean has_tensor_shape_value();
  public native void clear_tensor_shape_value();
  @MemberGetter public static native int kTensorShapeValueFieldNumber();
  public static final int kTensorShapeValueFieldNumber = kTensorShapeValueFieldNumber();
  public native @Const @ByRef TensorShapeProto tensor_shape_value();
  public native TensorShapeProto release_tensor_shape_value();
  public native TensorShapeProto mutable_tensor_shape_value();
  public native void set_allocated_tensor_shape_value(TensorShapeProto tensor_shape_value);
  public native void clear_tensor_dtype_value();
  @MemberGetter public static native int kTensorDtypeValueFieldNumber();
  public static final int kTensorDtypeValueFieldNumber = kTensorDtypeValueFieldNumber();
  public native @Cast("tensorflow::DataType") int tensor_dtype_value();
  public native void set_tensor_dtype_value(@Cast("tensorflow::DataType") int value);

  // .tensorflow.TensorSpecProto tensor_spec_value = 33;
  public native @Cast("bool") boolean has_tensor_spec_value();
  public native void clear_tensor_spec_value();
  @MemberGetter public static native int kTensorSpecValueFieldNumber();
  public static final int kTensorSpecValueFieldNumber = kTensorSpecValueFieldNumber();
  public native @Const @ByRef TensorSpecProto tensor_spec_value();
  public native TensorSpecProto release_tensor_spec_value();
  public native TensorSpecProto mutable_tensor_spec_value();
  public native void set_allocated_tensor_spec_value(TensorSpecProto tensor_spec_value);

  // .tensorflow.TypeSpecProto type_spec_value = 34;
  public native @Cast("bool") boolean has_type_spec_value();
  public native void clear_type_spec_value();
  @MemberGetter public static native int kTypeSpecValueFieldNumber();
  public static final int kTypeSpecValueFieldNumber = kTypeSpecValueFieldNumber();
  public native @Const @ByRef TypeSpecProto type_spec_value();
  public native TypeSpecProto release_type_spec_value();
  public native TypeSpecProto mutable_type_spec_value();
  public native void set_allocated_type_spec_value(TypeSpecProto type_spec_value);

  // .tensorflow.ListValue list_value = 51;
  public native @Cast("bool") boolean has_list_value();
  public native void clear_list_value();
  @MemberGetter public static native int kListValueFieldNumber();
  public static final int kListValueFieldNumber = kListValueFieldNumber();
  public native @Const @ByRef ListValue list_value();
  public native ListValue release_list_value();
  public native ListValue mutable_list_value();
  public native void set_allocated_list_value(ListValue list_value);

  // .tensorflow.TupleValue tuple_value = 52;
  public native @Cast("bool") boolean has_tuple_value();
  public native void clear_tuple_value();
  @MemberGetter public static native int kTupleValueFieldNumber();
  public static final int kTupleValueFieldNumber = kTupleValueFieldNumber();
  public native @Const @ByRef TupleValue tuple_value();
  public native TupleValue release_tuple_value();
  public native TupleValue mutable_tuple_value();
  public native void set_allocated_tuple_value(TupleValue tuple_value);

  // .tensorflow.DictValue dict_value = 53;
  public native @Cast("bool") boolean has_dict_value();
  public native void clear_dict_value();
  @MemberGetter public static native int kDictValueFieldNumber();
  public static final int kDictValueFieldNumber = kDictValueFieldNumber();
  public native @Const @ByRef DictValue dict_value();
  public native DictValue release_dict_value();
  public native DictValue mutable_dict_value();
  public native void set_allocated_dict_value(DictValue dict_value);

  // .tensorflow.NamedTupleValue named_tuple_value = 54;
  public native @Cast("bool") boolean has_named_tuple_value();
  public native void clear_named_tuple_value();
  @MemberGetter public static native int kNamedTupleValueFieldNumber();
  public static final int kNamedTupleValueFieldNumber = kNamedTupleValueFieldNumber();
  public native @Const @ByRef NamedTupleValue named_tuple_value();
  public native NamedTupleValue release_named_tuple_value();
  public native NamedTupleValue mutable_named_tuple_value();
  public native void set_allocated_named_tuple_value(NamedTupleValue named_tuple_value);

  public native void clear_kind();
  public native @Cast("tensorflow::StructuredValue::KindCase") int kind_case();
}
