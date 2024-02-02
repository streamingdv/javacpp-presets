// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class RTL_RUN_ONCE extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public RTL_RUN_ONCE() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RTL_RUN_ONCE(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RTL_RUN_ONCE(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public RTL_RUN_ONCE position(long position) {
        return (RTL_RUN_ONCE)super.position(position);
    }
    @Override public RTL_RUN_ONCE getPointer(long i) {
        return new RTL_RUN_ONCE((Pointer)this).offsetAddress(i);
    }
       
    public native @Cast("PVOID") Pointer Ptr(); public native RTL_RUN_ONCE Ptr(Pointer setter);                      
}
