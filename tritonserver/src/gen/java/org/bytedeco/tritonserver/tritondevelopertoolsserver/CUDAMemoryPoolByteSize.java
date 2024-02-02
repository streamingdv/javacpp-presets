// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.tritonserver.tritondevelopertoolsserver;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tritonserver.global.tritondevelopertoolsserver.*;


//==============================================================================
/** Structure to hold CUDA memory pool byte size for setting 'ServerOptions'.
 *  If GPU support is enabled, the server will allocate CUDA memory to minimize
 *  data transfer between host and devices until it exceeds the specified byte
 *  size. This will not affect the allocation conducted by the backend
 *  frameworks. */
@Namespace("triton::developer_tools::server") @NoOffset @Properties(inherit = org.bytedeco.tritonserver.presets.tritondevelopertoolsserver.class)
public class CUDAMemoryPoolByteSize extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUDAMemoryPoolByteSize(Pointer p) { super(p); }

  public CUDAMemoryPoolByteSize(int gpu_device, @Cast("const uint64_t") long size) { super((Pointer)null); allocate(gpu_device, size); }
  private native void allocate(int gpu_device, @Cast("const uint64_t") long size);

  // The GPU device ID to allocate the memory pool.
  public native int gpu_device_(); public native CUDAMemoryPoolByteSize gpu_device_(int setter);
  // The CUDA memory pool byte size that the server can allocate on given GPU
  // device. Default is 64 MB.
  public native @Cast("uint64_t") long size_(); public native CUDAMemoryPoolByteSize size_(long setter);
}
