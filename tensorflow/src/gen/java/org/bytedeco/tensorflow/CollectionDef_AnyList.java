// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class CollectionDef_AnyList extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CollectionDef_AnyList(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CollectionDef_AnyList(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public CollectionDef_AnyList position(long position) {
        return (CollectionDef_AnyList)super.position(position);
    }
    @Override public CollectionDef_AnyList getPointer(long i) {
        return new CollectionDef_AnyList((Pointer)this).position(position + i);
    }

  public CollectionDef_AnyList() { super((Pointer)null); allocate(); }
  private native void allocate();

  public CollectionDef_AnyList(@Const @ByRef CollectionDef_AnyList from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef CollectionDef_AnyList from);

  public native @ByRef @Name("operator =") CollectionDef_AnyList put(@Const @ByRef CollectionDef_AnyList from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef CollectionDef_AnyList default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const CollectionDef_AnyList internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(CollectionDef_AnyList other);
  public native void Swap(CollectionDef_AnyList other);
  

  // implements Message ----------------------------------------------

  public native CollectionDef_AnyList New();

  public native CollectionDef_AnyList New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef CollectionDef_AnyList from);
  public native void MergeFrom(@Const @ByRef CollectionDef_AnyList from);
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

  // repeated .google.protobuf.Any value = 1;
  public native int value_size();
  public native void clear_value();
  @MemberGetter public static native int kValueFieldNumber();
  public static final int kValueFieldNumber = kValueFieldNumber();
  public native @Cast("google::protobuf::Any*") Pointer mutable_value(int index);
  public native @Cast("const google::protobuf::Any*") @ByRef Pointer value(int index);
  public native @Cast("google::protobuf::Any*") Pointer add_value();
}
