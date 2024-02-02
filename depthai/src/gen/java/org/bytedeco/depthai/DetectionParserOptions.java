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
 * DetectionParserOptions
 *
 * Specifies how to parse output of detection networks
 */
@Namespace("dai") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class DetectionParserOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public DetectionParserOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DetectionParserOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DetectionParserOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public DetectionParserOptions position(long position) {
        return (DetectionParserOptions)super.position(position);
    }
    @Override public DetectionParserOptions getPointer(long i) {
        return new DetectionParserOptions((Pointer)this).offsetAddress(i);
    }

    /** Generic Neural Network properties */
    public native DetectionNetworkType nnFamily(); public native DetectionParserOptions nnFamily(DetectionNetworkType setter);
    public native float confidenceThreshold(); public native DetectionParserOptions confidenceThreshold(float setter);

    /** YOLO specific network properties */
    public native int classes(); public native DetectionParserOptions classes(int setter);
    public native int coordinates(); public native DetectionParserOptions coordinates(int setter);
    public native @StdVector FloatPointer anchors(); public native DetectionParserOptions anchors(FloatPointer setter);
    public native @ByRef StringIntVectorMap anchorMasks(); public native DetectionParserOptions anchorMasks(StringIntVectorMap setter);
    public native float iouThreshold(); public native DetectionParserOptions iouThreshold(float setter);
}
