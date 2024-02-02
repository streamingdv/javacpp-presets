// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.tritonserver.tritondevelopertoolsserver;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tritonserver.global.tritondevelopertoolsserver.*;


//==============================================================================
/** Structure to hold information of a tensor. This object is used for adding
 *  input/requested output to an inference request, and retrieving the output
 *  result from inference result.
 *  */
@Namespace("triton::developer_tools::server") @NoOffset @Properties(inherit = org.bytedeco.tritonserver.presets.tritondevelopertoolsserver.class)
public class Tensor extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Tensor(Pointer p) { super(p); }

  public Tensor(
        @Cast("char*") BytePointer buffer, @Cast("const size_t") long byte_size, @Cast("const triton::developer_tools::server::DataType") int data_type,
        @Cast("int64_t*") @StdVector LongPointer shape, @Cast("const triton::developer_tools::server::MemoryType") int memory_type,
        @Cast("const int64_t") long memory_type_id) { super((Pointer)null); allocate(buffer, byte_size, data_type, shape, memory_type, memory_type_id); }
  private native void allocate(
        @Cast("char*") BytePointer buffer, @Cast("const size_t") long byte_size, @Cast("const triton::developer_tools::server::DataType") int data_type,
        @Cast("int64_t*") @StdVector LongPointer shape, @Cast("const triton::developer_tools::server::MemoryType") int memory_type,
        @Cast("const int64_t") long memory_type_id);
  public Tensor(
        @Cast("char*") ByteBuffer buffer, @Cast("const size_t") long byte_size, @Cast("const triton::developer_tools::server::DataType") int data_type,
        @Cast("int64_t*") @StdVector LongBuffer shape, @Cast("const triton::developer_tools::server::MemoryType") int memory_type,
        @Cast("const int64_t") long memory_type_id) { super((Pointer)null); allocate(buffer, byte_size, data_type, shape, memory_type, memory_type_id); }
  private native void allocate(
        @Cast("char*") ByteBuffer buffer, @Cast("const size_t") long byte_size, @Cast("const triton::developer_tools::server::DataType") int data_type,
        @Cast("int64_t*") @StdVector LongBuffer shape, @Cast("const triton::developer_tools::server::MemoryType") int memory_type,
        @Cast("const int64_t") long memory_type_id);
  public Tensor(
        @Cast("char*") byte[] buffer, @Cast("const size_t") long byte_size, @Cast("const triton::developer_tools::server::DataType") int data_type,
        @Cast("int64_t*") @StdVector long[] shape, @Cast("const triton::developer_tools::server::MemoryType") int memory_type,
        @Cast("const int64_t") long memory_type_id) { super((Pointer)null); allocate(buffer, byte_size, data_type, shape, memory_type, memory_type_id); }
  private native void allocate(
        @Cast("char*") byte[] buffer, @Cast("const size_t") long byte_size, @Cast("const triton::developer_tools::server::DataType") int data_type,
        @Cast("int64_t*") @StdVector long[] shape, @Cast("const triton::developer_tools::server::MemoryType") int memory_type,
        @Cast("const int64_t") long memory_type_id);

  public Tensor(
        @Cast("char*") BytePointer buffer, @Cast("const size_t") long byte_size, @Cast("const triton::developer_tools::server::MemoryType") int memory_type,
        @Cast("const int64_t") long memory_type_id) { super((Pointer)null); allocate(buffer, byte_size, memory_type, memory_type_id); }
  private native void allocate(
        @Cast("char*") BytePointer buffer, @Cast("const size_t") long byte_size, @Cast("const triton::developer_tools::server::MemoryType") int memory_type,
        @Cast("const int64_t") long memory_type_id);
  public Tensor(
        @Cast("char*") ByteBuffer buffer, @Cast("const size_t") long byte_size, @Cast("const triton::developer_tools::server::MemoryType") int memory_type,
        @Cast("const int64_t") long memory_type_id) { super((Pointer)null); allocate(buffer, byte_size, memory_type, memory_type_id); }
  private native void allocate(
        @Cast("char*") ByteBuffer buffer, @Cast("const size_t") long byte_size, @Cast("const triton::developer_tools::server::MemoryType") int memory_type,
        @Cast("const int64_t") long memory_type_id);
  public Tensor(
        @Cast("char*") byte[] buffer, @Cast("const size_t") long byte_size, @Cast("const triton::developer_tools::server::MemoryType") int memory_type,
        @Cast("const int64_t") long memory_type_id) { super((Pointer)null); allocate(buffer, byte_size, memory_type, memory_type_id); }
  private native void allocate(
        @Cast("char*") byte[] buffer, @Cast("const size_t") long byte_size, @Cast("const triton::developer_tools::server::MemoryType") int memory_type,
        @Cast("const int64_t") long memory_type_id);

  // The pointer to the start of the buffer.
  public native @Cast("char*") BytePointer buffer_(); public native Tensor buffer_(BytePointer setter);
  // The size of buffer in bytes.
  public native @Cast("size_t") long byte_size_(); public native Tensor byte_size_(long setter);
  // The data type of the tensor.
  public native @Cast("triton::developer_tools::server::DataType") int data_type_(); public native Tensor data_type_(int setter);
  // The shape of the tensor.
  public native @Cast("int64_t*") @StdVector LongPointer shape_(); public native Tensor shape_(LongPointer setter);
  // The memory type of the tensor. Valid memory types are "CPU", "CPU_PINNED"
  // and "GPU".
  public native @Cast("triton::developer_tools::server::MemoryType") int memory_type_(); public native Tensor memory_type_(int setter);
  // The ID of the memory for the tensor. (e.g. '0' is the memory type id of
  // 'GPU-0')
  public native @Cast("int64_t") long memory_type_id_(); public native Tensor memory_type_id_(long setter);
}
