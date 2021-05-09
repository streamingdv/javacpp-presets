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


/** \struct PluginTensorDesc
 * 
 *  \brief Fields that a plugin might see for an input or output.
 * 
 *  Scale is only valid when data type is DataType::kINT8. TensorRT will set
 *  the value to -1.0f if it is invalid.
 * 
 *  @see IPluginV2IOExt::supportsFormat
 *  @see IPluginV2IOExt::configurePlugin
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class PluginTensorDesc extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PluginTensorDesc() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PluginTensorDesc(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PluginTensorDesc(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PluginTensorDesc position(long position) {
        return (PluginTensorDesc)super.position(position);
    }
    @Override public PluginTensorDesc getPointer(long i) {
        return new PluginTensorDesc((Pointer)this).offsetAddress(i);
    }

    public native @ByRef Dims dims(); public native PluginTensorDesc dims(Dims setter);
    /** \warning DataType:kBOOL not supported. */
    public native DataType type(); public native PluginTensorDesc type(DataType setter);
    public native TensorFormat format(); public native PluginTensorDesc format(TensorFormat setter);
    public native float scale(); public native PluginTensorDesc scale(float setter);
}
