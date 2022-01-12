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
 *  \class DynamicPluginTensorDesc
 * 
 *  Summarizes tensors that a plugin might see for an input or output.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class DynamicPluginTensorDesc extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public DynamicPluginTensorDesc() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DynamicPluginTensorDesc(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DynamicPluginTensorDesc(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public DynamicPluginTensorDesc position(long position) {
        return (DynamicPluginTensorDesc)super.position(position);
    }
    @Override public DynamicPluginTensorDesc getPointer(long i) {
        return new DynamicPluginTensorDesc((Pointer)this).offsetAddress(i);
    }

    /** Information required to interpret a pointer to tensor data, except that desc.dims has -1 in place of any runtime dimension. */
    public native @ByRef PluginTensorDesc desc(); public native DynamicPluginTensorDesc desc(PluginTensorDesc setter);

    /** Lower bounds on tensor’s dimensions */
    public native @ByRef @Cast("nvinfer1::Dims*") Dims32 min(); public native DynamicPluginTensorDesc min(Dims32 setter);

    /** Upper bounds on tensor’s dimensions */
    public native @ByRef @Cast("nvinfer1::Dims*") Dims32 max(); public native DynamicPluginTensorDesc max(Dims32 setter);
}
