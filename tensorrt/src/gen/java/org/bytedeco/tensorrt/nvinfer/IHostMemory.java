// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

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
 *  \class IHostMemory
 * 
 *  \brief Class to handle library allocated memory that is accessible to the user.
 * 
 *  The memory allocated via the host memory object is owned by the library and will
 *  be de-allocated when the destroy method is called.
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvinfer1") @NoOffset @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IHostMemory extends INoCopy {
    static { Loader.load(); }
    /** Default native constructor. */
    public IHostMemory() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IHostMemory(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IHostMemory(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IHostMemory position(long position) {
        return (IHostMemory)super.position(position);
    }
    @Override public IHostMemory getPointer(long i) {
        return new IHostMemory((Pointer)this).offsetAddress(i);
    }


    /** A pointer to the raw data that is owned by the library. */
    public native @NoException(true) Pointer data();

    /** The size in bytes of the data that was allocated. */
    public native @Cast("std::size_t") @NoException(true) long size();

    /** The type of the memory that was allocated. */
    
    //!
    //!
    //!
    //!
    public native @NoException(true) DataType type();
    /**
     *  Destroy the allocated memory.
     * 
     *  @deprecated Deprecated in TRT 8.0. Superseded by {@code delete}.
     * 
     *  \warning Calling destroy on a managed pointer will result in a double-free error.
     *  */
    public native @Deprecated @NoException(true) void destroy();
}
