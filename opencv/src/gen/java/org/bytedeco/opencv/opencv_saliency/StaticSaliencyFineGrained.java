// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_saliency;

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

import static org.bytedeco.opencv.global.opencv_saliency.*;



/** \brief the Fine Grained Saliency approach from \cite FGS
<p>
This method calculates saliency based on center-surround differences.
High resolution saliency maps are generated in real time by using integral images.
 */
@Namespace("cv::saliency") @Properties(inherit = org.bytedeco.opencv.presets.opencv_saliency.class)
public class StaticSaliencyFineGrained extends StaticSaliency {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StaticSaliencyFineGrained(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public StaticSaliencyFineGrained(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public StaticSaliencyFineGrained position(long position) {
        return (StaticSaliencyFineGrained)super.position(position);
    }
    @Override public StaticSaliencyFineGrained getPointer(long i) {
        return new StaticSaliencyFineGrained((Pointer)this).offsetAddress(i);
    }


  public StaticSaliencyFineGrained() { super((Pointer)null); allocate(); }
  private native void allocate();

  public static native @Ptr StaticSaliencyFineGrained create();

  public native @Cast("bool") boolean computeSaliency( @ByVal Mat image, @ByVal Mat saliencyMap );
  public native @Cast("bool") boolean computeSaliency( @ByVal UMat image, @ByVal UMat saliencyMap );
  public native @Cast("bool") boolean computeSaliency( @ByVal GpuMat image, @ByVal GpuMat saliencyMap );
}
