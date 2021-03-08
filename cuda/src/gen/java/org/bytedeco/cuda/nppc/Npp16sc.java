// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nppc;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nppc.*;


/**
 * Complex Number
 * This struct represents a short complex number.
 */
@Properties(inherit = org.bytedeco.cuda.presets.nppc.class)
public class Npp16sc extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Npp16sc() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Npp16sc(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Npp16sc(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Npp16sc position(long position) {
        return (Npp16sc)super.position(position);
    }
    @Override public Npp16sc getPointer(long i) {
        return new Npp16sc((Pointer)this).position(position + i);
    }

    /**  Real part */
    public native @Cast("Npp16s") short re(); public native Npp16sc re(short setter);
    /**  Imaginary part */
    public native @Cast("Npp16s") short im(); public native Npp16sc im(short setter);
}
