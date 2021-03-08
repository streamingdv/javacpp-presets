// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

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
 *  MinMax Calibrator. This is the preferred calibrator for NLP tasks. It supports per
 *  activation tensor scaling.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IInt8MinMaxCalibrator extends IInt8Calibrator {
    static { Loader.load(); }
    /** Default native constructor. */
    public IInt8MinMaxCalibrator() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IInt8MinMaxCalibrator(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IInt8MinMaxCalibrator(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IInt8MinMaxCalibrator position(long position) {
        return (IInt8MinMaxCalibrator)super.position(position);
    }
    @Override public IInt8MinMaxCalibrator getPointer(long i) {
        return new IInt8MinMaxCalibrator((Pointer)this).position(position + i);
    }

    /**
     *  Signal that this is the MinMax Calibrator.
     *  */
    @Virtual public native CalibrationAlgoType getAlgorithm();
}
