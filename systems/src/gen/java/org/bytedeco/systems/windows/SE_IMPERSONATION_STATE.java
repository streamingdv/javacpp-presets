// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;



//
// Used to represent information related to a thread impersonation
//

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class SE_IMPERSONATION_STATE extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SE_IMPERSONATION_STATE() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SE_IMPERSONATION_STATE(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SE_IMPERSONATION_STATE(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SE_IMPERSONATION_STATE position(long position) {
        return (SE_IMPERSONATION_STATE)super.position(position);
    }
    @Override public SE_IMPERSONATION_STATE getPointer(long i) {
        return new SE_IMPERSONATION_STATE((Pointer)this).position(position + i);
    }

    public native @Cast("PACCESS_TOKEN") Pointer Token(); public native SE_IMPERSONATION_STATE Token(Pointer setter);
    public native @Cast("BOOLEAN") boolean CopyOnOpen(); public native SE_IMPERSONATION_STATE CopyOnOpen(boolean setter);
    public native @Cast("BOOLEAN") boolean EffectiveOnly(); public native SE_IMPERSONATION_STATE EffectiveOnly(boolean setter);
    public native @Cast("SECURITY_IMPERSONATION_LEVEL") int Level(); public native SE_IMPERSONATION_STATE Level(int setter);
}
