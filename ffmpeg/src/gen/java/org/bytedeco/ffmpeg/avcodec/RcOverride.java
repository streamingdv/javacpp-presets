// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avcodec;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.ffmpeg.avutil.*;
import static org.bytedeco.ffmpeg.global.avutil.*;
import org.bytedeco.ffmpeg.swresample.*;
import static org.bytedeco.ffmpeg.global.swresample.*;

import static org.bytedeco.ffmpeg.global.avcodec.*;


/**
 * \ingroup lavc_encoding
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avcodec.class)
public class RcOverride extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public RcOverride() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RcOverride(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RcOverride(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public RcOverride position(long position) {
        return (RcOverride)super.position(position);
    }
    @Override public RcOverride getPointer(long i) {
        return new RcOverride((Pointer)this).offsetAddress(i);
    }

    public native int start_frame(); public native RcOverride start_frame(int setter);
    public native int end_frame(); public native RcOverride end_frame(int setter);
    public native int qscale(); public native RcOverride qscale(int setter); // If this is 0 then quality_factor will be used instead.
    public native float quality_factor(); public native RcOverride quality_factor(float setter);
}
