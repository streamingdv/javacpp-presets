// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_imgproc;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;

import static org.bytedeco.opencv.global.opencv_imgproc.*;


/** \} imgproc_shape
 <p>
 *  \addtogroup imgproc_hist
 *  \{
<p>
/** \brief Base class for Contrast Limited Adaptive Histogram Equalization.
*/
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_imgproc.class)
public class CLAHE extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CLAHE(Pointer p) { super(p); }

    /** \brief Equalizes the histogram of a grayscale image using Contrast Limited Adaptive Histogram Equalization.
    <p>
    @param src Source image of type CV_8UC1 or CV_16UC1.
    @param dst Destination image.
     */
    public native void apply(@ByVal Mat src, @ByVal Mat dst);
    public native void apply(@ByVal UMat src, @ByVal UMat dst);
    public native void apply(@ByVal GpuMat src, @ByVal GpuMat dst);

    /** \brief Sets threshold for contrast limiting.
    <p>
    @param clipLimit threshold value.
    */
    public native void setClipLimit(double clipLimit);

    /** Returns threshold value for contrast limiting. */
    public native double getClipLimit();

    /** \brief Sets size of grid for histogram equalization. Input image will be divided into
    equally sized rectangular tiles.
    <p>
    @param tileGridSize defines the number of tiles in row and column.
    */
    public native void setTilesGridSize(@ByVal Size tileGridSize);

    /**\brief Returns Size defines the number of tiles in row and column. */
    public native @ByVal Size getTilesGridSize();

    public native void collectGarbage();
}
