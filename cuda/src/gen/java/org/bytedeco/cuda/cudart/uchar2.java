// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class uchar2 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public uchar2() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public uchar2(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public uchar2(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public uchar2 position(long position) {
        return (uchar2)super.position(position);
    }
    @Override public uchar2 getPointer(long i) {
        return new uchar2((Pointer)this).position(position + i);
    }

    public native @Cast("unsigned char") byte x(); public native uchar2 x(byte setter);
    public native @Cast("unsigned char") byte y(); public native uchar2 y(byte setter);
}
