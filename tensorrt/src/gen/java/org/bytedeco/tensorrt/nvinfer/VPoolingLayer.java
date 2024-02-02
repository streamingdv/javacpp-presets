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


@Namespace("nvinfer1::apiv") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class VPoolingLayer extends VRoot {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public VPoolingLayer(Pointer p) { super(p); }

    public native @NoException(true) void setPoolingType(PoolingType type);
    public native @NoException(true) void setPoolingType(@Cast("nvinfer1::PoolingType") int type);
    public native @NoException(true) PoolingType getPoolingType();
    public native @NoException(true) void setWindowSize(@ByVal DimsHW windowSize);
    public native @ByVal @NoException(true) DimsHW getWindowSize();
    public native @NoException(true) void setStride(@ByVal DimsHW stride);
    public native @ByVal @NoException(true) DimsHW getStride();
    public native @NoException(true) void setPadding(@ByVal DimsHW padding);
    public native @ByVal @NoException(true) DimsHW getPadding();
    public native @NoException(true) void setBlendFactor(float blendFactor);
    public native @NoException(true) float getBlendFactor();
    public native @NoException(true) void setAverageCountExcludesPadding(@Cast("bool") boolean exclusive);
    public native @Cast("bool") @NoException(true) boolean getAverageCountExcludesPadding();
    public native @NoException(true) void setPrePadding(@ByVal @Cast("nvinfer1::Dims*") Dims32 padding);
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims32 getPrePadding();
    public native @NoException(true) void setPostPadding(@ByVal @Cast("nvinfer1::Dims*") Dims32 padding);
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims32 getPostPadding();
    public native @NoException(true) void setPaddingMode(PaddingMode paddingMode);
    public native @NoException(true) void setPaddingMode(@Cast("nvinfer1::PaddingMode") int paddingMode);
    public native @NoException(true) PaddingMode getPaddingMode();
    public native @NoException(true) void setWindowSizeNd(@ByVal @Cast("nvinfer1::Dims*") Dims32 windowSize);
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims32 getWindowSizeNd();
    public native @NoException(true) void setStrideNd(@ByVal @Cast("nvinfer1::Dims*") Dims32 stride);
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims32 getStrideNd();
    public native @NoException(true) void setPaddingNd(@ByVal @Cast("nvinfer1::Dims*") Dims32 padding);
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims32 getPaddingNd();
}
