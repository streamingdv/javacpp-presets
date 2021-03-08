// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow::eager") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class WaitQueueDoneRequest extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public WaitQueueDoneRequest(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public WaitQueueDoneRequest(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public WaitQueueDoneRequest position(long position) {
        return (WaitQueueDoneRequest)super.position(position);
    }
    @Override public WaitQueueDoneRequest getPointer(long i) {
        return new WaitQueueDoneRequest((Pointer)this).position(position + i);
    }

  public WaitQueueDoneRequest() { super((Pointer)null); allocate(); }
  private native void allocate();

  public WaitQueueDoneRequest(@Const @ByRef WaitQueueDoneRequest from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef WaitQueueDoneRequest from);

  public native @ByRef @Name("operator =") WaitQueueDoneRequest put(@Const @ByRef WaitQueueDoneRequest from);

  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef WaitQueueDoneRequest default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const WaitQueueDoneRequest internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(WaitQueueDoneRequest other);
  

  // implements Message ----------------------------------------------

  public native WaitQueueDoneRequest New();

  public native WaitQueueDoneRequest New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef WaitQueueDoneRequest from);
  public native void MergeFrom(@Const @ByRef WaitQueueDoneRequest from);
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

  // repeated int64 op_id = 2;
  public native int op_id_size();
  public native void clear_op_id();
  @MemberGetter public static native int kOpIdFieldNumber();
  public static final int kOpIdFieldNumber = kOpIdFieldNumber();
  public native @Cast("google::protobuf::int64") long op_id(int index);
  public native void set_op_id(int index, @Cast("google::protobuf::int64") long value);
  public native void add_op_id(@Cast("google::protobuf::int64") long value);

  // fixed64 context_id = 1;
  public native void clear_context_id();
  @MemberGetter public static native int kContextIdFieldNumber();
  public static final int kContextIdFieldNumber = kContextIdFieldNumber();
  public native @Cast("google::protobuf::uint64") long context_id();
  public native void set_context_id(@Cast("google::protobuf::uint64") long value);
}
