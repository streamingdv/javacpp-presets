// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

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
 //Tracking-by-Matching
/**
 *  \brief The TrackedObject struct defines properties of detected object.
 *  */
@Namespace("cv::detail::tracking::tbm") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_tracking.class)
public class TrackedObject extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TrackedObject(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TrackedObject(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TrackedObject position(long position) {
        return (TrackedObject)super.position(position);
    }
    @Override public TrackedObject getPointer(long i) {
        return new TrackedObject((Pointer)this).offsetAddress(i);
    }

    /** Detected object ROI (zero area if N/A). */
    public native @ByRef Rect rect(); public native TrackedObject rect(Rect setter);
    /** Detection confidence level (-1 if N/A). */
    public native double confidence(); public native TrackedObject confidence(double setter);
    /** Frame index where object was detected (-1 if N/A). */
    public native int frame_idx(); public native TrackedObject frame_idx(int setter);
    /** Unique object identifier (-1 if N/A). */
    public native int object_id(); public native TrackedObject object_id(int setter);
    /** Timestamp in milliseconds.
    <p>
    ///
    /// */
    public native @Cast("cv::uint64_t") long timestamp(); public native TrackedObject timestamp(long setter);

    /**
     *  \brief Default constructor.
     *  */
    
    
    ///
    ///
    public TrackedObject() { super((Pointer)null); allocate(); }
    private native void allocate();

    /**
     *  \brief Constructor with parameters.
     *  @param rect Bounding box of detected object.
     *  @param confidence Confidence of detection.
     *  @param frame_idx Index of frame.
     *  @param object_id Object ID.
     *  */
    public TrackedObject(@Const @ByRef Rect rect, float confidence, int frame_idx,
                      int object_id) { super((Pointer)null); allocate(rect, confidence, frame_idx, object_id); }
    private native void allocate(@Const @ByRef Rect rect, float confidence, int frame_idx,
                      int object_id);
}
