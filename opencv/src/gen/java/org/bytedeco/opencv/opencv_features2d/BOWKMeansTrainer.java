// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_features2d;

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

import static org.bytedeco.opencv.global.opencv_features2d.*;


/** \brief kmeans -based class to train visual vocabulary using the *bag of visual words* approach. :
 */
@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_features2d.class)
public class BOWKMeansTrainer extends BOWTrainer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BOWKMeansTrainer(Pointer p) { super(p); }

    /** \brief The constructor.
    <p>
    @see cv::kmeans
    */
    public BOWKMeansTrainer( int clusterCount, @Const @ByRef(nullValue = "cv::TermCriteria()") TermCriteria termcrit,
                          int attempts/*=3*/, int flags/*=cv::KMEANS_PP_CENTERS*/ ) { super((Pointer)null); allocate(clusterCount, termcrit, attempts, flags); }
    private native void allocate( int clusterCount, @Const @ByRef(nullValue = "cv::TermCriteria()") TermCriteria termcrit,
                          int attempts/*=3*/, int flags/*=cv::KMEANS_PP_CENTERS*/ );
    public BOWKMeansTrainer( int clusterCount ) { super((Pointer)null); allocate(clusterCount); }
    private native void allocate( int clusterCount );

    // Returns trained vocabulary (i.e. cluster centers).
    public native @ByVal @Override Mat cluster();
    public native @ByVal @Override Mat cluster( @Const @ByRef Mat descriptors );
}
