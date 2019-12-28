// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_flann;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;

import static org.bytedeco.opencv.global.opencv_flann.*;


@Namespace("cv::flann") @Properties(inherit = org.bytedeco.opencv.presets.opencv_flann.class)
public class AutotunedIndexParams extends IndexParams {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AutotunedIndexParams(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AutotunedIndexParams(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public AutotunedIndexParams position(long position) {
        return (AutotunedIndexParams)super.position(position);
    }

    public AutotunedIndexParams(float target_precision/*=0.8f*/, float build_weight/*=0.01f*/,
                             float memory_weight/*=0*/, float sample_fraction/*=0.1f*/) { super((Pointer)null); allocate(target_precision, build_weight, memory_weight, sample_fraction); }
    private native void allocate(float target_precision/*=0.8f*/, float build_weight/*=0.01f*/,
                             float memory_weight/*=0*/, float sample_fraction/*=0.1f*/);
    public AutotunedIndexParams() { super((Pointer)null); allocate(); }
    private native void allocate();
}
