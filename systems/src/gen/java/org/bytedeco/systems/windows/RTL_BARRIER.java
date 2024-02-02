// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;
     

// #endif // _RTL_RUN_ONCE_DEF

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class RTL_BARRIER extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public RTL_BARRIER() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RTL_BARRIER(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RTL_BARRIER(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public RTL_BARRIER position(long position) {
        return (RTL_BARRIER)super.position(position);
    }
    @Override public RTL_BARRIER getPointer(long i) {
        return new RTL_BARRIER((Pointer)this).offsetAddress(i);
    }
                       
            public native @Cast("DWORD") int Reserved1(); public native RTL_BARRIER Reserved1(int setter);                        
            public native @Cast("DWORD") int Reserved2(); public native RTL_BARRIER Reserved2(int setter);                        
            public native @Cast("ULONG_PTR") long Reserved3(int i); public native RTL_BARRIER Reserved3(int i, long setter);
            @MemberGetter public native @Cast("ULONG_PTR*") SizeTPointer Reserved3();                 
            public native @Cast("DWORD") int Reserved4(); public native RTL_BARRIER Reserved4(int setter);                        
            public native @Cast("DWORD") int Reserved5(); public native RTL_BARRIER Reserved5(int setter);                        
}
