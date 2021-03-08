// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

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


/** \brief This algorithm converts images to median threshold bitmaps (1 for pixels brighter than median
luminance and 0 otherwise) and than aligns the resulting bitmaps using bit operations.
<p>
It is invariant to exposure, so exposure values and camera response are not necessary.
<p>
In this implementation new image regions are filled with zeros.
<p>
For more information see \cite GW03 .
 */
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_photo.class)
public class AlignMTB extends AlignExposures {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AlignMTB(Pointer p) { super(p); }

    public native @Override void process(@ByVal MatVector src, @ByRef MatVector dst,
                                     @ByVal Mat times, @ByVal Mat response);
    public native @Override void process(@ByVal UMatVector src, @ByRef MatVector dst,
                                     @ByVal Mat times, @ByVal Mat response);
    public native @Override void process(@ByVal GpuMatVector src, @ByRef MatVector dst,
                                     @ByVal Mat times, @ByVal Mat response);
    public native @Override void process(@ByVal MatVector src, @ByRef MatVector dst,
                                     @ByVal UMat times, @ByVal UMat response);
    public native @Override void process(@ByVal UMatVector src, @ByRef MatVector dst,
                                     @ByVal UMat times, @ByVal UMat response);
    public native @Override void process(@ByVal GpuMatVector src, @ByRef MatVector dst,
                                     @ByVal UMat times, @ByVal UMat response);
    public native @Override void process(@ByVal MatVector src, @ByRef MatVector dst,
                                     @ByVal GpuMat times, @ByVal GpuMat response);
    public native @Override void process(@ByVal UMatVector src, @ByRef MatVector dst,
                                     @ByVal GpuMat times, @ByVal GpuMat response);
    public native @Override void process(@ByVal GpuMatVector src, @ByRef MatVector dst,
                                     @ByVal GpuMat times, @ByVal GpuMat response);

    /** \brief Short version of process, that doesn't take extra arguments.
    <p>
    @param src vector of input images
    @param dst vector of aligned images
     */
    public native void process(@ByVal MatVector src, @ByRef MatVector dst);
    public native void process(@ByVal UMatVector src, @ByRef MatVector dst);
    public native void process(@ByVal GpuMatVector src, @ByRef MatVector dst);

    /** \brief Calculates shift between two images, i. e. how to shift the second image to correspond it with the
    first.
    <p>
    @param img0 first image
    @param img1 second image
     */
    public native @ByVal Point calculateShift(@ByVal Mat img0, @ByVal Mat img1);
    public native @ByVal Point calculateShift(@ByVal UMat img0, @ByVal UMat img1);
    public native @ByVal Point calculateShift(@ByVal GpuMat img0, @ByVal GpuMat img1);
    /** \brief Helper function, that shift Mat filling new regions with zeros.
    <p>
    @param src input image
    @param dst result image
    @param shift shift value
     */
    public native void shiftMat(@ByVal Mat src, @ByVal Mat dst, @Const @ByVal Point shift);
    public native void shiftMat(@ByVal UMat src, @ByVal UMat dst, @Const @ByVal Point shift);
    public native void shiftMat(@ByVal GpuMat src, @ByVal GpuMat dst, @Const @ByVal Point shift);
    /** \brief Computes median threshold and exclude bitmaps of given image.
    <p>
    @param img input image
    @param tb median threshold bitmap
    @param eb exclude bitmap
     */
    public native void computeBitmaps(@ByVal Mat img, @ByVal Mat tb, @ByVal Mat eb);
    public native void computeBitmaps(@ByVal UMat img, @ByVal UMat tb, @ByVal UMat eb);
    public native void computeBitmaps(@ByVal GpuMat img, @ByVal GpuMat tb, @ByVal GpuMat eb);

    public native int getMaxBits();
    public native void setMaxBits(int max_bits);

    public native int getExcludeRange();
    public native void setExcludeRange(int exclude_range);

    public native @Cast("bool") boolean getCut();
    public native void setCut(@Cast("bool") boolean value);
}
