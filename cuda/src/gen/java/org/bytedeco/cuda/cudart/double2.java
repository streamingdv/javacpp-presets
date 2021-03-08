// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class double2 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public double2() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public double2(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public double2(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public double2 position(long position) {
        return (double2)super.position(position);
    }
    @Override public double2 getPointer(long i) {
        return new double2((Pointer)this).position(position + i);
    }

    public native double x(); public native double2 x(double setter);
    public native double y(); public native double2 y(double setter);
}
