// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.systems.macosx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.macosx.*;
               /* shut down both sides */

// #if !defined(_POSIX_C_SOURCE) || defined(_DARWIN_C_SOURCE)
/*
 * sendfile(2) header/trailer struct
 */
@Properties(inherit = org.bytedeco.systems.presets.macosx.class)
public class sf_hdtr extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public sf_hdtr() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public sf_hdtr(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public sf_hdtr(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public sf_hdtr position(long position) {
        return (sf_hdtr)super.position(position);
    }
    @Override public sf_hdtr getPointer(long i) {
        return new sf_hdtr((Pointer)this).offsetAddress(i);
    }

	public native iovec headers(); public native sf_hdtr headers(iovec setter);  /* pointer to an array of header struct iovec's */
	public native int hdr_cnt(); public native sf_hdtr hdr_cnt(int setter);            /* number of header iovec's */
	public native iovec trailers(); public native sf_hdtr trailers(iovec setter); /* pointer to an array of trailer struct iovec's */
	public native int trl_cnt(); public native sf_hdtr trl_cnt(int setter);            /* number of trailer iovec's */
}
