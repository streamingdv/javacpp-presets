// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/*******************************************************************************
*                                                                              *
*                                                                              *
*                                                                              *
*******************************************************************************/

@NoOffset @Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class dim3 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dim3(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public dim3(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public dim3 position(long position) {
        return (dim3)super.position(position);
    }
    @Override public dim3 getPointer(long i) {
        return new dim3((Pointer)this).position(position + i);
    }

    public native @Cast("unsigned int") int x(); public native dim3 x(int setter);
    public native @Cast("unsigned int") int y(); public native dim3 y(int setter);
    public native @Cast("unsigned int") int z(); public native dim3 z(int setter);
// #if defined(__cplusplus)
// #if __cplusplus >= 201103L
    public dim3(@Cast("unsigned int") int vx/*=1*/, @Cast("unsigned int") int vy/*=1*/, @Cast("unsigned int") int vz/*=1*/) { super((Pointer)null); allocate(vx, vy, vz); }
    private native void allocate(@Cast("unsigned int") int vx/*=1*/, @Cast("unsigned int") int vy/*=1*/, @Cast("unsigned int") int vz/*=1*/);
    public dim3() { super((Pointer)null); allocate(); }
    private native void allocate();
    public dim3(@ByVal uint3 v) { super((Pointer)null); allocate(v); }
    private native void allocate(@ByVal uint3 v);
    public native @ByVal @Name("operator uint3") uint3 asUint3();
// #else
// #endif
// #endif /* __cplusplus */
}
