// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.systems.macosx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.macosx.*;
 /* data includes security that replaces the TFO-cookie */

/* sockaddr endpoints */
@Properties(inherit = org.bytedeco.systems.presets.macosx.class)
public class sa_endpoints_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public sa_endpoints_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public sa_endpoints_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public sa_endpoints_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public sa_endpoints_t position(long position) {
        return (sa_endpoints_t)super.position(position);
    }
    @Override public sa_endpoints_t getPointer(long i) {
        return new sa_endpoints_t((Pointer)this).offsetAddress(i);
    }

	public native @Cast("unsigned int") int sae_srcif(); public native sa_endpoints_t sae_srcif(int setter);      /* optional source interface */
	public native @Const sockaddr sae_srcaddr(); public native sa_endpoints_t sae_srcaddr(sockaddr setter);   /* optional source address */
	public native @Cast("socklen_t") int sae_srcaddrlen(); public native sa_endpoints_t sae_srcaddrlen(int setter); /* size of source address */
	public native @Const sockaddr sae_dstaddr(); public native sa_endpoints_t sae_dstaddr(sockaddr setter);   /* destination address */
	public native @Cast("socklen_t") int sae_dstaddrlen(); public native sa_endpoints_t sae_dstaddrlen(int setter); /* size of destination address */
}
