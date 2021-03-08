// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.caffe;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.hdf5.*;
import static org.bytedeco.hdf5.global.hdf5.*;

import static org.bytedeco.caffe.global.caffe.*;

// -------------------------------------------------------------------

@Namespace("caffe") @NoOffset @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class PythonParameter extends Message {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PythonParameter(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PythonParameter(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public PythonParameter position(long position) {
        return (PythonParameter)super.position(position);
    }
    @Override public PythonParameter getPointer(long i) {
        return new PythonParameter((Pointer)this).position(position + i);
    }

  public PythonParameter() { super((Pointer)null); allocate(); }
  private native void allocate();

  public PythonParameter(@Const @ByRef PythonParameter from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef PythonParameter from);

  public native @ByRef @Name("operator =") PythonParameter put(@Const @ByRef PythonParameter from);
//   #if LANG_CXX11
//   #endif
  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Const Descriptor descriptor();
  public static native @Const @ByRef PythonParameter default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const PythonParameter internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(PythonParameter other);
  

  // implements Message ----------------------------------------------

  public native final PythonParameter New();

  public native final PythonParameter New(Arena arena);
  public native final void CopyFrom(@Const @ByRef Message from);
  public native final void MergeFrom(@Const @ByRef Message from);
  public native void CopyFrom(@Const @ByRef PythonParameter from);
  public native void MergeFrom(@Const @ByRef PythonParameter from);
  public native final void Clear();
  public native @Cast("bool") final boolean IsInitialized();

  public native @Cast("size_t") final long ByteSizeLong();
//   #if GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
//   #else
  public native @Cast("bool") final boolean MergePartialFromCodedStream(
        CodedInputStream input);
//   #endif  // GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
  public native final void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") final BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") final ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") final byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") byte[] target);
  public native final int GetCachedSize();

  public native @ByVal final Metadata GetMetadata();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // optional string module = 1;
  public native @Cast("bool") boolean has_module();
  public native void clear_module();
  @MemberGetter public static native int kModuleFieldNumber();
  public static final int kModuleFieldNumber = kModuleFieldNumber();
  public native @StdString BytePointer module();
  public native void set_module(@StdString BytePointer value);
  public native void set_module(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_module(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_module(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_module();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_module();
  public native void set_allocated_module(@StdString @Cast({"char*", "std::string*"}) BytePointer module);

  // optional string layer = 2;
  public native @Cast("bool") boolean has_layer();
  public native void clear_layer();
  @MemberGetter public static native int kLayerFieldNumber();
  public static final int kLayerFieldNumber = kLayerFieldNumber();
  public native @StdString BytePointer layer();
  public native void set_layer(@StdString BytePointer value);
  public native void set_layer(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_layer(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_layer(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_layer();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_layer();
  public native void set_allocated_layer(@StdString @Cast({"char*", "std::string*"}) BytePointer layer);

  // optional string param_str = 3 [default = ""];
  public native @Cast("bool") boolean has_param_str();
  public native void clear_param_str();
  @MemberGetter public static native int kParamStrFieldNumber();
  public static final int kParamStrFieldNumber = kParamStrFieldNumber();
  public native @StdString BytePointer param_str();
  public native void set_param_str(@StdString BytePointer value);
  public native void set_param_str(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_param_str(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_param_str(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_param_str();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_param_str();
  public native void set_allocated_param_str(@StdString @Cast({"char*", "std::string*"}) BytePointer param_str);

  // optional bool share_in_parallel = 4 [default = false];
  public native @Cast("bool") boolean has_share_in_parallel();
  public native void clear_share_in_parallel();
  @MemberGetter public static native int kShareInParallelFieldNumber();
  public static final int kShareInParallelFieldNumber = kShareInParallelFieldNumber();
  public native @Cast("bool") boolean share_in_parallel();
  public native void set_share_in_parallel(@Cast("bool") boolean value);
}
