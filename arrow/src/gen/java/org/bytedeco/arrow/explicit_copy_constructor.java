// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow::util::detail") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class explicit_copy_constructor extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public explicit_copy_constructor() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public explicit_copy_constructor(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public explicit_copy_constructor(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public explicit_copy_constructor position(long position) {
        return (explicit_copy_constructor)super.position(position);
    }
    @Override public explicit_copy_constructor getPointer(long i) {
        return new explicit_copy_constructor((Pointer)this).position(position + i);
    }

}
