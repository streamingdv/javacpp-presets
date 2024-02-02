// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;

// -------------------------------------------------------------------

@Namespace("onnx") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class NodeProto extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NodeProto(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NodeProto(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public NodeProto position(long position) {
        return (NodeProto)super.position(position);
    }
    @Override public NodeProto getPointer(long i) {
        return new NodeProto((Pointer)this).offsetAddress(i);
    }

  public NodeProto() { super((Pointer)null); allocate(); }
  private native void allocate();

  public NodeProto(@Const @ByRef NodeProto from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef NodeProto from);

  public native @ByRef @Name("operator =") NodeProto put(@Const @ByRef NodeProto from);

  public native @StdString BytePointer unknown_fields();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_unknown_fields();

  public static native @Const @ByRef NodeProto default_instance();
  public static native @Const NodeProto internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  
  public native void Swap(NodeProto other);
  public native void UnsafeArenaSwap(NodeProto other);

  // implements Message ----------------------------------------------

  public native NodeProto New(Arena arena/*=nullptr*/);
  public native NodeProto New();
  public native void CheckTypeAndMergeFrom(@Const @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef NodeProto from);
  public native void MergeFrom(@Const @ByRef NodeProto from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
  public native @Cast("const char*") BytePointer _InternalParse(@Cast("const char*") BytePointer ptr, ParseContext ctx);
  public native String _InternalParse(String ptr, ParseContext ctx);
  public native int GetCachedSize();

  public native @StdString BytePointer GetTypeName();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  /** enum onnx::NodeProto:: */
  public static final int
    kInputFieldNumber = 1,
    kOutputFieldNumber = 2,
    kAttributeFieldNumber = 5,
    kNameFieldNumber = 3,
    kOpTypeFieldNumber = 4,
    kDocStringFieldNumber = 6,
    kDomainFieldNumber = 7;
  // repeated string input = 1;
  public native int input_size();
  public native void clear_input();
  public native @StdString BytePointer input(int index);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_input(int index);
  public native void set_input(int index, @StdString BytePointer value);
  public native void set_input(int index, @StdString String value);
  public native void set_input(int index, @Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_input(int index, String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer add_input();
  public native void add_input(@StdString BytePointer value);
  public native void add_input(@StdString String value);
  public native void add_input(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void add_input(String value, @Cast("size_t") long size);

  // repeated string output = 2;
  public native int output_size();
  public native void clear_output();
  public native @StdString BytePointer output(int index);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_output(int index);
  public native void set_output(int index, @StdString BytePointer value);
  public native void set_output(int index, @StdString String value);
  public native void set_output(int index, @Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_output(int index, String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer add_output();
  public native void add_output(@StdString BytePointer value);
  public native void add_output(@StdString String value);
  public native void add_output(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void add_output(String value, @Cast("size_t") long size);

  // repeated .onnx.AttributeProto attribute = 5;
  public native int attribute_size();
  public native void clear_attribute();
  public native AttributeProto mutable_attribute(int index);
  public native @Const @ByRef AttributeProto attribute(int index);
  public native AttributeProto add_attribute();

  // optional string name = 3;
  public native @Cast("bool") boolean has_name();
  public native void clear_name();
  public native @StdString BytePointer name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_name();
  public native void set_allocated_name(@StdString @Cast({"char*", "std::string*"}) BytePointer name);

  // optional string op_type = 4;
  public native @Cast("bool") boolean has_op_type();
  public native void clear_op_type();
  public native @StdString BytePointer op_type();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_op_type();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_op_type();
  public native void set_allocated_op_type(@StdString @Cast({"char*", "std::string*"}) BytePointer op_type);

  // optional string doc_string = 6;
  public native @Cast("bool") boolean has_doc_string();
  public native void clear_doc_string();
  public native @StdString BytePointer doc_string();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_doc_string();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_doc_string();
  public native void set_allocated_doc_string(@StdString @Cast({"char*", "std::string*"}) BytePointer doc_string);

  // optional string domain = 7;
  public native @Cast("bool") boolean has_domain();
  public native void clear_domain();
  public native @StdString BytePointer domain();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_domain();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_domain();
  public native void set_allocated_domain(@StdString @Cast({"char*", "std::string*"}) BytePointer domain);
}
