// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.systems.macosx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.macosx.*;


// #ifndef __APPLE__
// #endif

// #if !defined(_POSIX_C_SOURCE) || defined(_DARWIN_C_SOURCE)
// #ifdef __APPLE__

/*
 * Structure to control non-portable Sockets extension to POSIX
 */
@Properties(inherit = org.bytedeco.systems.presets.macosx.class)
public class so_np_extensions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public so_np_extensions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public so_np_extensions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public so_np_extensions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public so_np_extensions position(long position) {
        return (so_np_extensions)super.position(position);
    }
    @Override public so_np_extensions getPointer(long i) {
        return new so_np_extensions((Pointer)this).position(position + i);
    }

	public native @Cast("u_int32_t") int npx_flags(); public native so_np_extensions npx_flags(int setter);
	public native @Cast("u_int32_t") int npx_mask(); public native so_np_extensions npx_mask(int setter);
}
