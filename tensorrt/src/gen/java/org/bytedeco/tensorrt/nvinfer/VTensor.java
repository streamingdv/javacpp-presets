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


@Namespace("nvinfer1::apiv") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class VTensor extends VRoot {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public VTensor(Pointer p) { super(p); }

    public native @NoException(true) void setName(String name);
    public native @NoException(true) void setName(@Cast("const char*") BytePointer name);
    public native @NoException(true) String getName();
    public native @NoException(true) void setDimensions(@ByVal @Cast("nvinfer1::Dims*") Dims32 dimensions);
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims32 getDimensions();
    public native @NoException(true) void setType(DataType type);
    public native @NoException(true) void setType(@Cast("nvinfer1::DataType") int type);
    public native @NoException(true) DataType getType();
    public native @Cast("bool") @NoException(true) boolean setDynamicRange(float min, float max);
    public native @Cast("bool") @NoException(true) boolean isNetworkInput();
    public native @Cast("bool") @NoException(true) boolean isNetworkOutput();
    public native @NoException(true) void setBroadcastAcrossBatch(@Cast("bool") boolean broadcastAcrossBatch);
    public native @Cast("bool") @NoException(true) boolean getBroadcastAcrossBatch();
    public native @NoException(true) TensorLocation getLocation();
    public native @NoException(true) void setLocation(TensorLocation location);
    public native @NoException(true) void setLocation(@Cast("nvinfer1::TensorLocation") int location);
    public native @Cast("bool") @NoException(true) boolean dynamicRangeIsSet();
    public native @NoException(true) void resetDynamicRange();
    public native @NoException(true) float getDynamicRangeMin();
    public native @NoException(true) float getDynamicRangeMax();
    public native @NoException(true) void setAllowedFormats(@Cast("nvinfer1::TensorFormats") int formats);
    public native @Cast("nvinfer1::TensorFormats") @NoException(true) int getAllowedFormats();
    public native @Cast("bool") @NoException(true) boolean isShapeTensor();
    public native @Cast("bool") @NoException(true) boolean isExecutionTensor();
}
