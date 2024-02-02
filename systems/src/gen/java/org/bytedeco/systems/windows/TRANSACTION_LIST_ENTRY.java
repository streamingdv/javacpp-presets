// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class TRANSACTION_LIST_ENTRY extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TRANSACTION_LIST_ENTRY() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TRANSACTION_LIST_ENTRY(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TRANSACTION_LIST_ENTRY(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TRANSACTION_LIST_ENTRY position(long position) {
        return (TRANSACTION_LIST_ENTRY)super.position(position);
    }
    @Override public TRANSACTION_LIST_ENTRY getPointer(long i) {
        return new TRANSACTION_LIST_ENTRY((Pointer)this).offsetAddress(i);
    }

    public native @ByRef GUID UOW(); public native TRANSACTION_LIST_ENTRY UOW(GUID setter);
}
