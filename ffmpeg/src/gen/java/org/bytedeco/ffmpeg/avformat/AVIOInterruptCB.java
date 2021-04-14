// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avformat;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.ffmpeg.avutil.*;
import static org.bytedeco.ffmpeg.global.avutil.*;
import org.bytedeco.ffmpeg.swresample.*;
import static org.bytedeco.ffmpeg.global.swresample.*;
import org.bytedeco.ffmpeg.avcodec.*;
import static org.bytedeco.ffmpeg.global.avcodec.*;

import static org.bytedeco.ffmpeg.global.avformat.*;


/**
 * Callback for checking whether to abort blocking functions.
 * AVERROR_EXIT is returned in this case by the interrupted
 * function. During blocking operations, callback is called with
 * opaque as parameter. If the callback returns 1, the
 * blocking operation will be aborted.
 *
 * No members can be added to this struct without a major bump, if
 * new elements have been added after this struct in AVFormatContext
 * or AVIOContext.
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avformat.class)
public class AVIOInterruptCB extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVIOInterruptCB() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVIOInterruptCB(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVIOInterruptCB(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVIOInterruptCB position(long position) {
        return (AVIOInterruptCB)super.position(position);
    }
    @Override public AVIOInterruptCB getPointer(long i) {
        return new AVIOInterruptCB((Pointer)this).position(position + i);
    }

    public static class Callback_Pointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Callback_Pointer(Pointer p) { super(p); }
        protected Callback_Pointer() { allocate(); }
        private native void allocate();
        public native int call(Pointer arg0);
    }
    public native Callback_Pointer callback(); public native AVIOInterruptCB callback(Callback_Pointer setter);
    public native Pointer opaque(); public native AVIOInterruptCB opaque(Pointer setter);
}
