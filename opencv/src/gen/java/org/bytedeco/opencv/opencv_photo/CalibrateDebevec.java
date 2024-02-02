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


/** \brief Inverse camera response function is extracted for each brightness value by minimizing an objective
function as linear system. Objective function is constructed using pixel values on the same position
in all images, extra term is added to make the result smoother.
<p>
For more information see \cite DM97 .
 */
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_photo.class)
public class CalibrateDebevec extends CalibrateCRF {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CalibrateDebevec(Pointer p) { super(p); }
    /** Downcast constructor. */
    public CalibrateDebevec(Algorithm pointer) { super((Pointer)null); allocate(pointer); }
    @Namespace private native @Name("static_cast<cv::CalibrateDebevec*>") void allocate(Algorithm pointer);

    public native float getLambda();
    public native void setLambda(float lambda);

    public native int getSamples();
    public native void setSamples(int samples);

    public native @Cast("bool") boolean getRandom();
    public native void setRandom(@Cast("bool") boolean random);
}
