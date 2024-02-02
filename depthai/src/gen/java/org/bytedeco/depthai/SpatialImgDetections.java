// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.depthai.global.depthai.*;


/**
 * SpatialImgDetections message. Carries detection results together with spatial location data
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class SpatialImgDetections extends Buffer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SpatialImgDetections(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SpatialImgDetections(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SpatialImgDetections position(long position) {
        return (SpatialImgDetections)super.position(position);
    }
    @Override public SpatialImgDetections getPointer(long i) {
        return new SpatialImgDetections((Pointer)this).offsetAddress(i);
    }

    /**
     * Construct SpatialImgDetections message.
     */
    public SpatialImgDetections() { super((Pointer)null); allocate(); }
    private native void allocate();
    public SpatialImgDetections(@SharedPtr RawSpatialImgDetections ptr) { super((Pointer)null); allocate(ptr); }
    private native void allocate(@SharedPtr RawSpatialImgDetections ptr);

    /**
     * Detection results.
     */
    public native @StdVector SpatialImgDetection detections(); public native SpatialImgDetections detections(SpatialImgDetection setter);

    /**
     * Sets image timestamp related to dai::Clock::now()
     */
    public native @ByRef SpatialImgDetections setTimestamp(@ByVal @Cast("std::chrono::time_point<std::chrono::steady_clock,std::chrono::steady_clock::duration>*") Pointer timestamp);

    /**
     * Sets image timestamp related to dai::Clock::now()
     */
    public native @ByRef SpatialImgDetections setTimestampDevice(@ByVal @Cast("std::chrono::time_point<std::chrono::steady_clock,std::chrono::steady_clock::duration>*") Pointer timestamp);

    /**
     * Retrieves image sequence number
     */
    public native @ByRef SpatialImgDetections setSequenceNum(@Cast("int64_t") long sequenceNum);
}
