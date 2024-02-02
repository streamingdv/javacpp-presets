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
 * AprilTagConfig message.
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class AprilTagConfig extends Buffer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AprilTagConfig(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AprilTagConfig(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public AprilTagConfig position(long position) {
        return (AprilTagConfig)super.position(position);
    }
    @Override public AprilTagConfig getPointer(long i) {
        return new AprilTagConfig((Pointer)this).offsetAddress(i);
    }


    /**
     * Construct AprilTagConfig message.
     */
    public AprilTagConfig() { super((Pointer)null); allocate(); }
    private native void allocate();
    public AprilTagConfig(@SharedPtr RawAprilTagConfig ptr) { super((Pointer)null); allocate(ptr); }
    private native void allocate(@SharedPtr RawAprilTagConfig ptr);

    /**
     * @param family AprilTag family
     */
    public native @ByRef AprilTagConfig setFamily(@ByVal RawAprilTagConfig.Family family);

    /**
     * Set explicit configuration.
     * @param config Explicit configuration
     */
    public native @ByRef AprilTagConfig set(@ByVal RawAprilTagConfig config);

    /**
     * Retrieve configuration data for AprilTag.
     * @return config for stereo depth algorithm
     */
    public native @ByVal RawAprilTagConfig get();
}
