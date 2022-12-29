// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_shape;

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

import static org.bytedeco.opencv.global.opencv_shape.*;


/** \brief A norm based cost extraction. :
 */
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_shape.class)
public class NormHistogramCostExtractor extends HistogramCostExtractor {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NormHistogramCostExtractor(Pointer p) { super(p); }

    public native void setNormFlag(int flag);
    public native int getNormFlag();
}
