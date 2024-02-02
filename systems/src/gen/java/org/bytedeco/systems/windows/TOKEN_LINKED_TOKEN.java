// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class TOKEN_LINKED_TOKEN extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TOKEN_LINKED_TOKEN() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TOKEN_LINKED_TOKEN(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TOKEN_LINKED_TOKEN(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TOKEN_LINKED_TOKEN position(long position) {
        return (TOKEN_LINKED_TOKEN)super.position(position);
    }
    @Override public TOKEN_LINKED_TOKEN getPointer(long i) {
        return new TOKEN_LINKED_TOKEN((Pointer)this).offsetAddress(i);
    }

    public native @Cast("HANDLE") Pointer LinkedToken(); public native TOKEN_LINKED_TOKEN LinkedToken(Pointer setter);
}
