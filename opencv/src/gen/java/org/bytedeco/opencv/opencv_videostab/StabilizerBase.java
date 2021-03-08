// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_videostab;

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
import org.bytedeco.opencv.opencv_objdetect.*;
import static org.bytedeco.opencv.global.opencv_objdetect.*;
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;
import org.bytedeco.opencv.opencv_ximgproc.*;
import static org.bytedeco.opencv.global.opencv_ximgproc.*;
import org.bytedeco.opencv.opencv_optflow.*;
import static org.bytedeco.opencv.global.opencv_optflow.*;
import org.bytedeco.opencv.opencv_photo.*;
import static org.bytedeco.opencv.global.opencv_photo.*;

import static org.bytedeco.opencv.global.opencv_videostab.*;


/** \addtogroup videostab
 *  \{ */

@Namespace("cv::videostab") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_videostab.class)
public class StabilizerBase extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StabilizerBase(Pointer p) { super(p); }


    public native void setLog(@Ptr ILog ilog);
    public native @Ptr ILog log();

    public native void setRadius(int val);
    public native int radius();

    public native void setFrameSource(@Ptr IFrameSource val);
    public native @Ptr IFrameSource frameSource();

    public native void setMaskSource(@Ptr IFrameSource val);
    public native @Ptr IFrameSource maskSource();

    public native void setMotionEstimator(@Ptr ImageMotionEstimatorBase val);
    public native @Ptr ImageMotionEstimatorBase motionEstimator();

    public native void setDeblurer(@Ptr DeblurerBase val);
    public native @Ptr DeblurerBase deblurrer();

    public native void setTrimRatio(float val);
    public native float trimRatio();

    public native void setCorrectionForInclusion(@Cast("bool") boolean val);
    public native @Cast("bool") boolean doCorrectionForInclusion();

    public native void setBorderMode(int val);
    public native int borderMode();

    public native void setInpainter(@Ptr InpainterBase val);
    public native @Ptr InpainterBase inpainter();
}
