// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class ulong4 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ulong4() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ulong4(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ulong4(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ulong4 position(long position) {
        return (ulong4)super.position(position);
    }
    @Override public ulong4 getPointer(long i) {
        return new ulong4((Pointer)this).position(position + i);
    }

    public native @Cast("unsigned long int") long x(); public native ulong4 x(long setter);
    public native @Cast("unsigned long int") long y(); public native ulong4 y(long setter);
    public native @Cast("unsigned long int") long z(); public native ulong4 z(long setter);
    public native @Cast("unsigned long int") long w(); public native ulong4 w(long setter);
}
