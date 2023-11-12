// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

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


// #if FF_API_AVIODIRCONTEXT
@Properties(inherit = org.bytedeco.ffmpeg.presets.avformat.class)
public class AVIODirContext extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVIODirContext() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVIODirContext(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVIODirContext(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVIODirContext position(long position) {
        return (AVIODirContext)super.position(position);
    }
    @Override public AVIODirContext getPointer(long i) {
        return new AVIODirContext((Pointer)this).offsetAddress(i);
    }

    public native @Cast("URLContext*") Pointer url_context(); public native AVIODirContext url_context(Pointer setter);
}
