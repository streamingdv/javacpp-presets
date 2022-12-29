// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_xfeatures2d;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_ml.*;
import static org.bytedeco.opencv.global.opencv_ml.*;
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
import org.bytedeco.opencv.opencv_shape.*;
import static org.bytedeco.opencv.global.opencv_shape.*;

import static org.bytedeco.opencv.global.opencv_xfeatures2d.*;


/** \brief Class implementing BEBLID (Boosted Efficient Binary Local Image Descriptor),
 * described in \cite Suarez2020BEBLID .
<p>
BEBLID \cite Suarez2020BEBLID is a efficient binary descriptor learned with boosting.
It is able to describe keypoints from any detector just by changing the scale_factor parameter.
In several benchmarks it has proved to largely improve other binary descriptors like ORB or
BRISK with the same efficiency. BEBLID describes using the difference of mean gray values in
different regions of the image around the KeyPoint, the descriptor is specifically optimized for
image matching and patch retrieval addressing the asymmetries of these problems.
<p>
If you find this code useful, please add a reference to the following paper:
<BLOCKQUOTE> Iago Suárez, Ghesn Sfeir, José M. Buenaposada, and Luis Baumela.
BEBLID: Boosted efficient binary local image descriptor.
Pattern Recognition Letters, 133:366–372, 2020. </BLOCKQUOTE>
<p>
The descriptor was trained using 1 million of randomly sampled pairs of patches
(20% positives and 80% negatives) from the Liberty split of the UBC datasets
\cite winder2007learning as described in the paper \cite Suarez2020BEBLID.
You can check in the [AKAZE example](https://raw.githubusercontent.com/opencv/opencv/master/samples/cpp/tutorial_code/features2D/AKAZE_match.cpp)
how well BEBLID works. Detecting 10000 keypoints with ORB and describing with BEBLID obtains
561 inliers (75%) whereas describing with ORB obtains only 493 inliers (63%).
*/
@Namespace("cv::xfeatures2d") @Properties(inherit = org.bytedeco.opencv.presets.opencv_xfeatures2d.class)
public class BEBLID extends Feature2D {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BEBLID(Pointer p) { super(p); }

    /**
     * \brief  Descriptor number of bits, each bit is a boosting weak-learner.
     * The user can choose between 512 or 256 bits.
     */
    /** enum cv::xfeatures2d::BEBLID::BeblidSize */
    public static final int
        SIZE_512_BITS = 100, SIZE_256_BITS = 101;
    /** \brief Creates the BEBLID descriptor.
    @param scale_factor Adjust the sampling window around detected keypoints:
    - <b> 1.00f </b> should be the scale for ORB keypoints
    - <b> 6.75f </b> should be the scale for SIFT detected keypoints
    - <b> 6.25f </b> is default and fits for KAZE, SURF detected keypoints
    - <b> 5.00f </b> should be the scale for AKAZE, MSD, AGAST, FAST, BRISK keypoints
    @param n_bits Determine the number of bits in the descriptor. Should be either
     BEBLID::SIZE_512_BITS or BEBLID::SIZE_256_BITS.
    */
    public static native @Ptr BEBLID create(float scale_factor, int n_bits/*=cv::xfeatures2d::BEBLID::SIZE_512_BITS*/);
    public static native @Ptr BEBLID create(float scale_factor);

    public native void setScaleFactor(float scale_factor);
    public native float getScaleFactor();

    public native @Str @Override BytePointer getDefaultName();
}
