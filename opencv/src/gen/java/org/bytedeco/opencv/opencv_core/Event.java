// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


@Namespace("cv::cuda") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class Event extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Event(Pointer p) { super(p); }

    /** enum cv::cuda::Event::CreateFlags */
    public static final int
        /** Default event flag */
        DEFAULT        = 0x00,
        /** Event uses blocking synchronization */
        BLOCKING_SYNC  = 0x01,
        /** Event will not record timing data */
        DISABLE_TIMING = 0x02,
        /** Event is suitable for interprocess use. DisableTiming must be set */
        INTERPROCESS   = 0x04;

    public Event(@Cast("const cv::cuda::Event::CreateFlags") int flags/*=cv::cuda::Event::CreateFlags::DEFAULT*/) { super((Pointer)null); allocate(flags); }
    private native void allocate(@Cast("const cv::cuda::Event::CreateFlags") int flags/*=cv::cuda::Event::CreateFlags::DEFAULT*/);
    public Event() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** records an event */
    public native void record(@ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void record();

    /** queries an event's status */
    public native @Cast("bool") boolean queryIfComplete();

    /** waits for an event to complete */
    public native void waitForCompletion();

    /** computes the elapsed time between events */
    public static native float elapsedTime(@Const @ByRef Event start, @Const @ByRef Event end);

    @Opaque public static class Impl extends Pointer {
        /** Empty constructor. Calls {@code super((Pointer)null)}. */
        public Impl() { super((Pointer)null); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Impl(Pointer p) { super(p); }
    }
}
