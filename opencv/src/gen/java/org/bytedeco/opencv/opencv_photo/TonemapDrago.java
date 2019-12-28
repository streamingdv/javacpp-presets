// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_photo;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.opencv.global.opencv_photo.*;


/** \brief Adaptive logarithmic mapping is a fast global tonemapping algorithm that scales the image in
logarithmic domain.
<p>
Since it's a global operator the same function is applied to all the pixels, it is controlled by the
bias parameter.
<p>
Optional saturation enhancement is possible as described in \cite FL02 .
<p>
For more information see \cite DM03 .
 */
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_photo.class)
public class TonemapDrago extends Tonemap {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TonemapDrago(Pointer p) { super(p); }


    public native float getSaturation();
    public native void setSaturation(float saturation);

    public native float getBias();
    public native void setBias(float bias);
}
