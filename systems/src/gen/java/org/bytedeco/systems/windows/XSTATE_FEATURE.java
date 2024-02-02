// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


//
// Extended processor state configuration
//

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class XSTATE_FEATURE extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public XSTATE_FEATURE() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public XSTATE_FEATURE(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public XSTATE_FEATURE(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public XSTATE_FEATURE position(long position) {
        return (XSTATE_FEATURE)super.position(position);
    }
    @Override public XSTATE_FEATURE getPointer(long i) {
        return new XSTATE_FEATURE((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int Offset(); public native XSTATE_FEATURE Offset(int setter);
    public native @Cast("DWORD") int Size(); public native XSTATE_FEATURE Size(int setter);
}
