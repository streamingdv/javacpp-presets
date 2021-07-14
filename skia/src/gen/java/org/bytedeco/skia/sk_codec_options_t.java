// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.skia;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.skia.global.Skia.*;


@Properties(inherit = org.bytedeco.skia.presets.Skia.class)
public class sk_codec_options_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public sk_codec_options_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public sk_codec_options_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public sk_codec_options_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public sk_codec_options_t position(long position) {
        return (sk_codec_options_t)super.position(position);
    }
    @Override public sk_codec_options_t getPointer(long i) {
        return new sk_codec_options_t((Pointer)this).offsetAddress(i);
    }

    public native @Cast("sk_codec_zero_initialized_t") int fZeroInitialized(); public native sk_codec_options_t fZeroInitialized(int setter);
    public native sk_irect_t fSubset(); public native sk_codec_options_t fSubset(sk_irect_t setter);
    public native int fFrameIndex(); public native sk_codec_options_t fFrameIndex(int setter);
    public native int fPriorFrame(); public native sk_codec_options_t fPriorFrame(int setter);
}
