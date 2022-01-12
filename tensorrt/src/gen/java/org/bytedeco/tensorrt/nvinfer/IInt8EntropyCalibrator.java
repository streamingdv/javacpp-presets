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
 *  Entropy calibrator. This is the Legacy Entropy calibrator. It is less complicated than the legacy calibrator and
 *  produces better results.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IInt8EntropyCalibrator extends IInt8Calibrator {
    static { Loader.load(); }
    /** Default native constructor. */
    public IInt8EntropyCalibrator() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IInt8EntropyCalibrator(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IInt8EntropyCalibrator(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IInt8EntropyCalibrator position(long position) {
        return (IInt8EntropyCalibrator)super.position(position);
    }
    @Override public IInt8EntropyCalibrator getPointer(long i) {
        return new IInt8EntropyCalibrator((Pointer)this).offsetAddress(i);
    }

    /**
     *  Signal that this is the entropy calibrator.
     *  */
    @Virtual public native @NoException(true) CalibrationAlgoType getAlgorithm();
}
