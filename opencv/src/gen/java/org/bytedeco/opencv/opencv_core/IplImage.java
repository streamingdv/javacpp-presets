// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;

// #endif

/** The IplImage is taken from the Intel Image Processing Library, in which the format is native. OpenCV
only supports a subset of possible IplImage formats, as outlined in the parameter list above.
<p>
In addition to the above restrictions, OpenCV handles ROIs differently. OpenCV functions require
that the image size or ROI size of all source and destination images match exactly. On the other
hand, the Intel Image Processing Library processes the area of intersection between the source and
destination images (or ROIs), allowing them to vary independently.
*/
@NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class IplImage extends AbstractIplImage {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IplImage(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IplImage(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public IplImage position(long position) {
        return (IplImage)super.position(position);
    }

    /** sizeof(IplImage) */
    public native int nSize(); public native IplImage nSize(int setter);
    /** version (=0)*/
    public native int ID(); public native IplImage ID(int setter);
    /** Most of OpenCV functions support 1,2,3 or 4 channels */
    public native int nChannels(); public native IplImage nChannels(int setter);
    /** Ignored by OpenCV */
    public native int alphaChannel(); public native IplImage alphaChannel(int setter);
    /** Pixel depth in bits: IPL_DEPTH_8U, IPL_DEPTH_8S, IPL_DEPTH_16S,
                                   IPL_DEPTH_32S, IPL_DEPTH_32F and IPL_DEPTH_64F are supported.  */
    public native int depth(); public native IplImage depth(int setter);
    /** Ignored by OpenCV */
    public native @Cast("char") byte colorModel(int i); public native IplImage colorModel(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer colorModel();
    /** ditto */
    public native @Cast("char") byte channelSeq(int i); public native IplImage channelSeq(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer channelSeq();
    /** 0 - interleaved color channels, 1 - separate color channels.
                                   cvCreateImage can only create interleaved images */
    public native int dataOrder(); public native IplImage dataOrder(int setter);
    /** 0 - top-left origin,
                                   1 - bottom-left origin (Windows bitmaps style).  */
    public native int origin(); public native IplImage origin(int setter);
    /** Alignment of image rows (4 or 8).
                                   OpenCV ignores it and uses widthStep instead.    */
    public native int align(); public native IplImage align(int setter);
    /** Image width in pixels.                           */
    public native int width(); public native IplImage width(int setter);
    /** Image height in pixels.                          */
    public native int height(); public native IplImage height(int setter);
    /** Image ROI. If NULL, the whole image is selected. */
    public native IplROI roi(); public native IplImage roi(IplROI setter);
    /** Must be NULL. */
    public native IplImage maskROI(); public native IplImage maskROI(IplImage setter);
    /** "           " */
    public native Pointer imageId(); public native IplImage imageId(Pointer setter);
    /** "           " */
    public native IplTileInfo tileInfo(); public native IplImage tileInfo(IplTileInfo setter);
    /** Image data size in bytes
                                   (==image->height*image->widthStep
                                   in case of interleaved data)*/
    public native int imageSize(); public native IplImage imageSize(int setter);
    /** Pointer to aligned image data.         */
    public native @Cast("char*") BytePointer imageData(); public native IplImage imageData(BytePointer setter);
    /** Size of aligned image row in bytes.    */
    public native int widthStep(); public native IplImage widthStep(int setter);
    /** Ignored by OpenCV.                     */
    public native int BorderMode(int i); public native IplImage BorderMode(int i, int setter);
    @MemberGetter public native IntPointer BorderMode();
    /** Ditto.                                 */
    public native int BorderConst(int i); public native IplImage BorderConst(int i, int setter);
    @MemberGetter public native IntPointer BorderConst();
    /** Pointer to very origin of image data
                                   (not necessarily aligned) -
                                   needed for correct deallocation */
    public native @Cast("char*") BytePointer imageDataOrigin(); public native IplImage imageDataOrigin(BytePointer setter);

// #if defined(CV__ENABLE_C_API_CTORS) && defined(__cplusplus)
    public IplImage() { super((Pointer)null); allocate(); }
    private native void allocate();
    public IplImage(@Const @ByRef Mat m) { super((Pointer)null); allocate(m); }
    private native void allocate(@Const @ByRef Mat m);
// #endif
}
