// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;



@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class TOKEN_DEFAULT_DACL extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TOKEN_DEFAULT_DACL() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TOKEN_DEFAULT_DACL(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TOKEN_DEFAULT_DACL(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TOKEN_DEFAULT_DACL position(long position) {
        return (TOKEN_DEFAULT_DACL)super.position(position);
    }
    @Override public TOKEN_DEFAULT_DACL getPointer(long i) {
        return new TOKEN_DEFAULT_DACL((Pointer)this).position(position + i);
    }

    public native @Cast("PACL") ACL DefaultDacl(); public native TOKEN_DEFAULT_DACL DefaultDacl(ACL setter);
}
