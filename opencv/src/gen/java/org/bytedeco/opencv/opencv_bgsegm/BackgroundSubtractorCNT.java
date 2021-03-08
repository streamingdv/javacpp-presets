// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_bgsegm;

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
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;

import static org.bytedeco.opencv.global.opencv_bgsegm.*;


/** \brief Background subtraction based on counting.
  <p>
  About as fast as MOG2 on a high end system.
  More than twice faster than MOG2 on cheap hardware (benchmarked on Raspberry Pi3).
  <p>
  %Algorithm by Sagi Zeevi ( https://github.com/sagi-z/BackgroundSubtractorCNT )
*/
@Namespace("cv::bgsegm") @Properties(inherit = org.bytedeco.opencv.presets.opencv_bgsegm.class)
public class BackgroundSubtractorCNT extends BackgroundSubtractor {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BackgroundSubtractorCNT(Pointer p) { super(p); }

    // BackgroundSubtractor interface
    public native @Override void apply(@ByVal Mat image, @ByVal Mat fgmask, double learningRate/*=-1*/);
    public native void apply(@ByVal Mat image, @ByVal Mat fgmask);
    public native @Override void apply(@ByVal UMat image, @ByVal UMat fgmask, double learningRate/*=-1*/);
    public native void apply(@ByVal UMat image, @ByVal UMat fgmask);
    public native @Override void apply(@ByVal GpuMat image, @ByVal GpuMat fgmask, double learningRate/*=-1*/);
    public native void apply(@ByVal GpuMat image, @ByVal GpuMat fgmask);
    public native @Override void getBackgroundImage(@ByVal Mat backgroundImage);
    public native @Override void getBackgroundImage(@ByVal UMat backgroundImage);
    public native @Override void getBackgroundImage(@ByVal GpuMat backgroundImage);

    /** \brief Returns number of frames with same pixel color to consider stable.
    */
    public native int getMinPixelStability();
    /** \brief Sets the number of frames with same pixel color to consider stable.
    */
    public native void setMinPixelStability(int value);

    /** \brief Returns maximum allowed credit for a pixel in history.
    */
    public native int getMaxPixelStability();
    /** \brief Sets the maximum allowed credit for a pixel in history.
    */
    public native void setMaxPixelStability(int value);

    /** \brief Returns if we're giving a pixel credit for being stable for a long time.
    */
    public native @Cast("bool") boolean getUseHistory();
    /** \brief Sets if we're giving a pixel credit for being stable for a long time.
    */
    public native void setUseHistory(@Cast("bool") boolean value);

    /** \brief Returns if we're parallelizing the algorithm.
    */
    public native @Cast("bool") boolean getIsParallel();
    /** \brief Sets if we're parallelizing the algorithm.
    */
    public native void setIsParallel(@Cast("bool") boolean value);
}
