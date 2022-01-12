// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;
import org.bytedeco.cuda.cudnn.*;
import static org.bytedeco.cuda.global.cudnn.*;
import org.bytedeco.cuda.nvrtc.*;
import static org.bytedeco.cuda.global.nvrtc.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


/**
 *  \class IGpuAllocator
 * 
 *  \brief Application-implemented class for controlling allocation on the GPU.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IGpuAllocator extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IGpuAllocator(Pointer p) { super(p); }

    /**
     *  A thread-safe callback implemented by the application to handle acquisition of GPU memory.
     * 
     *  @param size The size of the memory required.
     *  @param alignment The required alignment of memory. Alignment will be zero
     *         or a power of 2 not exceeding the alignment guaranteed by cudaMalloc.
     *         Thus this allocator can be safely implemented with cudaMalloc/cudaFree.
     *         An alignment value of zero indicates any alignment is acceptable.
     *  @param flags Reserved for future use. In the current release, 0 will be passed.
     * 
     *  If an allocation request of size 0 is made, nullptr should be returned.
     * 
     *  If an allocation request cannot be satisfied, nullptr should be returned.
     * 
     *  \note The implementation must guarantee thread safety for concurrent allocate/free/reallocate/deallocate
     *  requests.
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: Yes, this method is required to be thread-safe and may be called from multiple threads.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    public native @Name("allocate") @NoException(true) Pointer _allocate(@Cast("const uint64_t") long size, @Cast("const uint64_t") long alignment, @Cast("const nvinfer1::AllocatorFlags") int flags);

    /**
     *  A thread-safe callback implemented by the application to handle release of GPU memory.
     * 
     *  TensorRT may pass a nullptr to this function if it was previously returned by allocate().
     * 
     *  @param memory The acquired memory.
     * 
     *  \note The implementation must guarantee thread safety for concurrent allocate/free/reallocate/deallocate
     *  requests.
     * 
     *  @see deallocate()
     * 
     *  @deprecated Superseded by deallocate and will be removed in TensorRT 10.0.
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: Yes, this method is required to be thread-safe and may be called from multiple threads.
     *  */
    
    
    //!
    //!
    public native @Deprecated @Name("free") @NoException(true) void _free(Pointer memory);

    /**
     *  Destructor declared virtual as general good practice for a class with virtual methods.
     *  TensorRT never calls the destructor for an IGpuAllocator defined by the application.
     *  */

    /**
     *  A thread-safe callback implemented by the application to resize an existing allocation.
     * 
     *  Only allocations which were allocated with AllocatorFlag::kRESIZABLE will be resized.
     * 
     *  Options are one of:
     *  * resize in place leaving min(oldSize, newSize) bytes unchanged and return the original address
     *  * move min(oldSize, newSize) bytes to a new location of sufficient size and return its address
     *  * return nullptr, to indicate that the request could not be fulfilled.
     * 
     *  If nullptr is returned, TensorRT will assume that resize() is not implemented, and that the
     *  allocation at baseAddr is still valid.
     * 
     *  This method is made available for use cases where delegating the resize
     *  strategy to the application provides an opportunity to improve memory management.
     *  One possible implementation is to allocate a large virtual device buffer and
     *  progressively commit physical memory with cuMemMap. CU_MEM_ALLOC_GRANULARITY_RECOMMENDED
     *  is suggested in this case.
     * 
     *  TensorRT may call realloc to increase the buffer by relatively small amounts.
     * 
     *  @param baseAddr the address of the original allocation.
     *  @param alignment The alignment used by the original allocation.
     *  @param newSize The new memory size required.
     *  @return the address of the reallocated memory
     * 
     *  \note The implementation must guarantee thread safety for concurrent allocate/free/reallocate/deallocate
     *  requests.
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: Yes, this method is required to be thread-safe and may be called from multiple threads.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) Pointer reallocate(Pointer arg0, @Cast("uint64_t") long arg1, @Cast("uint64_t") long arg2);

    /**
     *  A thread-safe callback implemented by the application to handle release of GPU memory.
     * 
     *  TensorRT may pass a nullptr to this function if it was previously returned by allocate().
     * 
     *  @param memory The acquired memory.
     *  @return True if the acquired memory is released successfully.
     * 
     *  \note The implementation must guarantee thread safety for concurrent allocate/free/reallocate/deallocate
     *  requests.
     * 
     *  \note If user-implemented free() might hit an error condition, the user should override deallocate() as the
     *  primary implementation and override free() to call deallocate() for backwards compatibility.
     * 
     *  @see free()
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: Yes, this method is required to be thread-safe and may be called from multiple threads.
     *  */
    public native @Cast("bool") @Name("deallocate") @NoException(true) boolean _deallocate(Pointer memory);
}
