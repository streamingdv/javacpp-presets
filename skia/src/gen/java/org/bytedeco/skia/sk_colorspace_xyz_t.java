// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.skia;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.skia.global.Skia.*;


@Properties(inherit = org.bytedeco.skia.presets.Skia.class)
public class sk_colorspace_xyz_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public sk_colorspace_xyz_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public sk_colorspace_xyz_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public sk_colorspace_xyz_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public sk_colorspace_xyz_t position(long position) {
        return (sk_colorspace_xyz_t)super.position(position);
    }
    @Override public sk_colorspace_xyz_t getPointer(long i) {
        return new sk_colorspace_xyz_t((Pointer)this).offsetAddress(i);
    }

    public native float fM00(); public native sk_colorspace_xyz_t fM00(float setter);
    public native float fM01(); public native sk_colorspace_xyz_t fM01(float setter);
    public native float fM02(); public native sk_colorspace_xyz_t fM02(float setter);
    public native float fM10(); public native sk_colorspace_xyz_t fM10(float setter);
    public native float fM11(); public native sk_colorspace_xyz_t fM11(float setter);
    public native float fM12(); public native sk_colorspace_xyz_t fM12(float setter);
    public native float fM20(); public native sk_colorspace_xyz_t fM20(float setter);
    public native float fM21(); public native sk_colorspace_xyz_t fM21(float setter);
    public native float fM22(); public native sk_colorspace_xyz_t fM22(float setter);
}
