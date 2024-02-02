// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class OBJECTID extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public OBJECTID() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OBJECTID(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OBJECTID(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public OBJECTID position(long position) {
        return (OBJECTID)super.position(position);
    }
    @Override public OBJECTID getPointer(long i) {
        return new OBJECTID((Pointer)this).offsetAddress(i);
    }
     // size is 20
    public native @ByRef GUID Lineage(); public native OBJECTID Lineage(GUID setter);
    public native @Cast("DWORD") int Uniquifier(); public native OBJECTID Uniquifier(int setter);
}
