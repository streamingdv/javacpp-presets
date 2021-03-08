// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;



@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class IMAGE_RESOURCE_DIR_STRING_U extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IMAGE_RESOURCE_DIR_STRING_U() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IMAGE_RESOURCE_DIR_STRING_U(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMAGE_RESOURCE_DIR_STRING_U(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IMAGE_RESOURCE_DIR_STRING_U position(long position) {
        return (IMAGE_RESOURCE_DIR_STRING_U)super.position(position);
    }
    @Override public IMAGE_RESOURCE_DIR_STRING_U getPointer(long i) {
        return new IMAGE_RESOURCE_DIR_STRING_U((Pointer)this).position(position + i);
    }

    public native @Cast("WORD") short Length(); public native IMAGE_RESOURCE_DIR_STRING_U Length(short setter);
    public native @Cast("WCHAR") char NameString(int i); public native IMAGE_RESOURCE_DIR_STRING_U NameString(int i, char setter);
    @MemberGetter public native @Cast("WCHAR*") CharPointer NameString();
}
