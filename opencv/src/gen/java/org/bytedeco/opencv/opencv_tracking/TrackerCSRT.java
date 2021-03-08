// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_tracking;

import org.bytedeco.javacpp.annotation.Index;
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
import org.bytedeco.opencv.opencv_plot.*;
import static org.bytedeco.opencv.global.opencv_plot.*;
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

import static org.bytedeco.opencv.global.opencv_tracking.*;

// #endif

/** \defgroup tracking Tracking API
\{
    \defgroup tracking_detail Tracking API implementation details
    \defgroup tracking_legacy Legacy Tracking API
\}
*/

/** \addtogroup tracking
\{
Tracking is an important issue for many computer vision applications in real world scenario.
The development in this area is very fragmented and this API is an interface useful for plug several algorithms and compare them.
*/


/** \brief the CSRT tracker
<p>
The implementation is based on \cite Lukezic_IJCV2018 Discriminative Correlation Filter with Channel and Spatial Reliability
*/
@Namespace("cv::tracking") @Properties(inherit = org.bytedeco.opencv.presets.opencv_tracking.class)
public class TrackerCSRT extends Tracker {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TrackerCSRT(Pointer p) { super(p); }


    @NoOffset public static class Params extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Params(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public Params(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public Params position(long position) {
            return (Params)super.position(position);
        }
        @Override public Params getPointer(long i) {
            return new Params((Pointer)this).position(position + i);
        }
    
        public Params() { super((Pointer)null); allocate(); }
        private native void allocate();

        public native @Cast("bool") boolean use_hog(); public native Params use_hog(boolean setter);
        public native @Cast("bool") boolean use_color_names(); public native Params use_color_names(boolean setter);
        public native @Cast("bool") boolean use_gray(); public native Params use_gray(boolean setter);
        public native @Cast("bool") boolean use_rgb(); public native Params use_rgb(boolean setter);
        public native @Cast("bool") boolean use_channel_weights(); public native Params use_channel_weights(boolean setter);
        public native @Cast("bool") boolean use_segmentation(); public native Params use_segmentation(boolean setter);

        /**  Window function: "hann", "cheb", "kaiser" */
        public native @StdString BytePointer window_function(); public native Params window_function(BytePointer setter);
        public native float kaiser_alpha(); public native Params kaiser_alpha(float setter);
        public native float cheb_attenuation(); public native Params cheb_attenuation(float setter);

        public native float template_size(); public native Params template_size(float setter);
        public native float gsl_sigma(); public native Params gsl_sigma(float setter);
        public native float hog_orientations(); public native Params hog_orientations(float setter);
        public native float hog_clip(); public native Params hog_clip(float setter);
        public native float padding(); public native Params padding(float setter);
        public native float filter_lr(); public native Params filter_lr(float setter);
        public native float weights_lr(); public native Params weights_lr(float setter);
        public native int num_hog_channels_used(); public native Params num_hog_channels_used(int setter);
        public native int admm_iterations(); public native Params admm_iterations(int setter);
        public native int histogram_bins(); public native Params histogram_bins(int setter);
        public native float histogram_lr(); public native Params histogram_lr(float setter);
        public native int background_ratio(); public native Params background_ratio(int setter);
        public native int number_of_scales(); public native Params number_of_scales(int setter);
        public native float scale_sigma_factor(); public native Params scale_sigma_factor(float setter);
        public native float scale_model_max_area(); public native Params scale_model_max_area(float setter);
        public native float scale_lr(); public native Params scale_lr(float setter);
        public native float scale_step(); public native Params scale_step(float setter);

        /** we lost the target, if the psr is lower than this. */
        public native float psr_threshold(); public native Params psr_threshold(float setter);
    }

    /** \brief Create CSRT tracker instance
    @param parameters CSRT parameters TrackerCSRT::Params
    */
    public static native @Ptr TrackerCSRT create(@Const @ByRef(nullValue = "cv::tracking::TrackerCSRT::Params()") Params parameters);
    public static native @Ptr TrackerCSRT create();

    //void init(InputArray image, const Rect& boundingBox) CV_OVERRIDE;
    //bool update(InputArray image, CV_OUT Rect& boundingBox) CV_OVERRIDE;

    public native void setInitialMask(@ByVal Mat mask);
    public native void setInitialMask(@ByVal UMat mask);
    public native void setInitialMask(@ByVal GpuMat mask);
}
