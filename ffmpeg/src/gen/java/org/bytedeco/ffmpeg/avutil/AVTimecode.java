// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avutil;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.ffmpeg.global.avutil.*;


@Properties(inherit = org.bytedeco.ffmpeg.presets.avutil.class)
public class AVTimecode extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVTimecode() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVTimecode(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVTimecode(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVTimecode position(long position) {
        return (AVTimecode)super.position(position);
    }
    @Override public AVTimecode getPointer(long i) {
        return new AVTimecode((Pointer)this).position(position + i);
    }

    /** timecode frame start (first base frame number) */
    public native int start(); public native AVTimecode start(int setter);
    /** flags such as drop frame, +24 hours support, ... */
    public native @Cast("uint32_t") int flags(); public native AVTimecode flags(int setter);
    /** frame rate in rational form */
    public native @ByRef AVRational rate(); public native AVTimecode rate(AVRational setter);
    /** frame per second; must be consistent with the rate field */
    public native @Cast("unsigned") int fps(); public native AVTimecode fps(int setter);
}
