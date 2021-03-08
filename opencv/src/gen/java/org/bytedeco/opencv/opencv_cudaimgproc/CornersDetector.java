// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_cudaimgproc;

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
import org.bytedeco.opencv.opencv_cudaarithm.*;
import static org.bytedeco.opencv.global.opencv_cudaarithm.*;
import org.bytedeco.opencv.opencv_cudafilters.*;
import static org.bytedeco.opencv.global.opencv_cudafilters.*;

import static org.bytedeco.opencv.global.opencv_cudaimgproc.*;


////////////////////////// Corners Detection ///////////////////////////

/** \brief Base class for Corners Detector. :
 */
@Namespace("cv::cuda") @Properties(inherit = org.bytedeco.opencv.presets.opencv_cudaimgproc.class)
public class CornersDetector extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CornersDetector(Pointer p) { super(p); }

    /** \brief Determines strong corners on an image.
    <p>
    @param image Input 8-bit or floating-point 32-bit, single-channel image.
    @param corners Output vector of detected corners (1-row matrix with CV_32FC2 type with corners
    positions).
    @param mask Optional region of interest. If the image is not empty (it needs to have the type
    CV_8UC1 and the same size as image ), it specifies the region in which the corners are detected.
    @param stream Stream for the asynchronous version.
     */
    public native void detect(@ByVal Mat image, @ByVal Mat corners, @ByVal(nullValue = "cv::InputArray(cv::noArray())") Mat mask, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void detect(@ByVal Mat image, @ByVal Mat corners);
    public native void detect(@ByVal UMat image, @ByVal UMat corners, @ByVal(nullValue = "cv::InputArray(cv::noArray())") UMat mask, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void detect(@ByVal UMat image, @ByVal UMat corners);
    public native void detect(@ByVal GpuMat image, @ByVal GpuMat corners, @ByVal(nullValue = "cv::InputArray(cv::noArray())") GpuMat mask, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void detect(@ByVal GpuMat image, @ByVal GpuMat corners);
}
