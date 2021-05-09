// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

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
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IHostMemory extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IHostMemory(Pointer p) { super(p); }

    /** A pointer to the raw data that is owned by the library. */
    public native @NoException Pointer data();
    /** The size in bytes of the data that was allocated. */
    public native @Cast("std::size_t") @NoException long size();
    /** The type of the memory that was allocated. */
    public native @NoException DataType type();
    /** Destroy the allocated memory. */
    public native @NoException void destroy();
}
