// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.skia;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.skia.global.Skia.*;


//////////////////////////////////////////////////////////////////////////////////////////

@Properties(inherit = org.bytedeco.skia.presets.Skia.class)
public class sk_point3_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public sk_point3_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public sk_point3_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public sk_point3_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public sk_point3_t position(long position) {
        return (sk_point3_t)super.position(position);
    }
    @Override public sk_point3_t getPointer(long i) {
        return new sk_point3_t((Pointer)this).offsetAddress(i);
    }

    public native float x(); public native sk_point3_t x(float setter);
    public native float y(); public native sk_point3_t y(float setter);
    public native float z(); public native sk_point3_t z(float setter);
}
