// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.skia;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.skia.global.Skia.*;


@Properties(inherit = org.bytedeco.skia.presets.Skia.class)
public class sk_size_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public sk_size_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public sk_size_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public sk_size_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public sk_size_t position(long position) {
        return (sk_size_t)super.position(position);
    }
    @Override public sk_size_t getPointer(long i) {
        return new sk_size_t((Pointer)this).offsetAddress(i);
    }

    public native float w(); public native sk_size_t w(float setter);
    public native float h(); public native sk_size_t h(float setter);
}
