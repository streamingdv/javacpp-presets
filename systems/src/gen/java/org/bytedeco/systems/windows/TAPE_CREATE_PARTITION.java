// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class TAPE_CREATE_PARTITION extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TAPE_CREATE_PARTITION() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TAPE_CREATE_PARTITION(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TAPE_CREATE_PARTITION(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TAPE_CREATE_PARTITION position(long position) {
        return (TAPE_CREATE_PARTITION)super.position(position);
    }
    @Override public TAPE_CREATE_PARTITION getPointer(long i) {
        return new TAPE_CREATE_PARTITION((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int Method(); public native TAPE_CREATE_PARTITION Method(int setter);
    public native @Cast("DWORD") int Count(); public native TAPE_CREATE_PARTITION Count(int setter);
    public native @Cast("DWORD") int Size(); public native TAPE_CREATE_PARTITION Size(int setter);
}
