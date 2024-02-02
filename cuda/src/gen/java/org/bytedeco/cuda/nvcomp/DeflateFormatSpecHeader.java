// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvcomp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvcomp.*;


@Namespace("nvcomp") @Properties(inherit = org.bytedeco.cuda.presets.nvcomp.class)
public class DeflateFormatSpecHeader extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public DeflateFormatSpecHeader() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DeflateFormatSpecHeader(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DeflateFormatSpecHeader(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public DeflateFormatSpecHeader position(long position) {
        return (DeflateFormatSpecHeader)super.position(position);
    }
    @Override public DeflateFormatSpecHeader getPointer(long i) {
        return new DeflateFormatSpecHeader((Pointer)this).offsetAddress(i);
    }

    public native int algo(); public native DeflateFormatSpecHeader algo(int setter);
}
