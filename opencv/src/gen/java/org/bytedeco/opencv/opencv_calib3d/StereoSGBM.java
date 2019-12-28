// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_calib3d;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

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

import static org.bytedeco.opencv.global.opencv_calib3d.*;


/** \brief The class implements the modified H. Hirschmuller algorithm \cite HH08 that differs from the original
one as follows:
<p>
-   By default, the algorithm is single-pass, which means that you consider only 5 directions
instead of 8. Set mode=StereoSGBM::MODE_HH in createStereoSGBM to run the full variant of the
algorithm but beware that it may consume a lot of memory.
-   The algorithm matches blocks, not individual pixels. Though, setting blockSize=1 reduces the
blocks to single pixels.
-   Mutual information cost function is not implemented. Instead, a simpler Birchfield-Tomasi
sub-pixel metric from \cite BT98 is used. Though, the color images are supported as well.
-   Some pre- and post- processing steps from K. Konolige algorithm StereoBM are included, for
example: pre-filtering (StereoBM::PREFILTER_XSOBEL type) and post-filtering (uniqueness
check, quadratic interpolation and speckle filtering).
<p>
\note
   -   (Python) An example illustrating the use of the StereoSGBM matching algorithm can be found
        at opencv_source_code/samples/python/stereo_match.py
 */
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_calib3d.class)
public class StereoSGBM extends StereoMatcher {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StereoSGBM(Pointer p) { super(p); }

    /** enum cv::StereoSGBM:: */
    public static final int
        MODE_SGBM = 0,
        MODE_HH   = 1,
        MODE_SGBM_3WAY = 2,
        MODE_HH4  = 3;

    public native int getPreFilterCap();
    public native void setPreFilterCap(int preFilterCap);

    public native int getUniquenessRatio();
    public native void setUniquenessRatio(int uniquenessRatio);

    public native int getP1();
    public native void setP1(int P1);

    public native int getP2();
    public native void setP2(int P2);

    public native int getMode();
    public native void setMode(int mode);

    /** \brief Creates StereoSGBM object
    <p>
    @param minDisparity Minimum possible disparity value. Normally, it is zero but sometimes
    rectification algorithms can shift images, so this parameter needs to be adjusted accordingly.
    @param numDisparities Maximum disparity minus minimum disparity. The value is always greater than
    zero. In the current implementation, this parameter must be divisible by 16.
    @param blockSize Matched block size. It must be an odd number \>=1 . Normally, it should be
    somewhere in the 3..11 range.
    @param P1 The first parameter controlling the disparity smoothness. See below.
    @param P2 The second parameter controlling the disparity smoothness. The larger the values are,
    the smoother the disparity is. P1 is the penalty on the disparity change by plus or minus 1
    between neighbor pixels. P2 is the penalty on the disparity change by more than 1 between neighbor
    pixels. The algorithm requires P2 \> P1 . See stereo_match.cpp sample where some reasonably good
    P1 and P2 values are shown (like 8\*number_of_image_channels\*SADWindowSize\*SADWindowSize and
    32\*number_of_image_channels\*SADWindowSize\*SADWindowSize , respectively).
    @param disp12MaxDiff Maximum allowed difference (in integer pixel units) in the left-right
    disparity check. Set it to a non-positive value to disable the check.
    @param preFilterCap Truncation value for the prefiltered image pixels. The algorithm first
    computes x-derivative at each pixel and clips its value by [-preFilterCap, preFilterCap] interval.
    The result values are passed to the Birchfield-Tomasi pixel cost function.
    @param uniquenessRatio Margin in percentage by which the best (minimum) computed cost function
    value should "win" the second best value to consider the found match correct. Normally, a value
    within the 5-15 range is good enough.
    @param speckleWindowSize Maximum size of smooth disparity regions to consider their noise speckles
    and invalidate. Set it to 0 to disable speckle filtering. Otherwise, set it somewhere in the
    50-200 range.
    @param speckleRange Maximum disparity variation within each connected component. If you do speckle
    filtering, set the parameter to a positive value, it will be implicitly multiplied by 16.
    Normally, 1 or 2 is good enough.
    @param mode Set it to StereoSGBM::MODE_HH to run the full-scale two-pass dynamic programming
    algorithm. It will consume O(W\*H\*numDisparities) bytes, which is large for 640x480 stereo and
    huge for HD-size pictures. By default, it is set to false .
    <p>
    The first constructor initializes StereoSGBM with all the default parameters. So, you only have to
    set StereoSGBM::numDisparities at minimum. The second constructor enables you to set each parameter
    to a custom value.
     */
    public static native @Ptr StereoSGBM create(int minDisparity/*=0*/, int numDisparities/*=16*/, int blockSize/*=3*/,
                                              int P1/*=0*/, int P2/*=0*/, int disp12MaxDiff/*=0*/,
                                              int preFilterCap/*=0*/, int uniquenessRatio/*=0*/,
                                              int speckleWindowSize/*=0*/, int speckleRange/*=0*/,
                                              int mode/*=cv::StereoSGBM::MODE_SGBM*/);
    public static native @Ptr StereoSGBM create();
}
