// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_photo;

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

import static org.bytedeco.opencv.global.opencv_photo.*;


/** \brief The base class for camera response calibration algorithms.
 */
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_photo.class)
public class CalibrateCRF extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CalibrateCRF(Pointer p) { super(p); }
    /** Downcast constructor. */
    public CalibrateCRF(Algorithm pointer) { super((Pointer)null); allocate(pointer); }
    @Namespace private native @Name("static_cast<cv::CalibrateCRF*>") void allocate(Algorithm pointer);
    @Override public Algorithm asAlgorithm() { return asAlgorithm(this); }
    @Namespace public static native @Name("static_cast<cv::Algorithm*>") Algorithm asAlgorithm(CalibrateCRF pointer);

    /** \brief Recovers inverse camera response.
    <p>
    @param src vector of input images
    @param dst 256x1 matrix with inverse camera response function
    @param times vector of exposure time values for each image
     */
    public native void process(@ByVal MatVector src, @ByVal Mat dst, @ByVal Mat times);
    public native void process(@ByVal UMatVector src, @ByVal Mat dst, @ByVal Mat times);
    public native void process(@ByVal GpuMatVector src, @ByVal Mat dst, @ByVal Mat times);
    public native void process(@ByVal MatVector src, @ByVal UMat dst, @ByVal UMat times);
    public native void process(@ByVal UMatVector src, @ByVal UMat dst, @ByVal UMat times);
    public native void process(@ByVal GpuMatVector src, @ByVal UMat dst, @ByVal UMat times);
    public native void process(@ByVal MatVector src, @ByVal GpuMat dst, @ByVal GpuMat times);
    public native void process(@ByVal UMatVector src, @ByVal GpuMat dst, @ByVal GpuMat times);
    public native void process(@ByVal GpuMatVector src, @ByVal GpuMat dst, @ByVal GpuMat times);
}
