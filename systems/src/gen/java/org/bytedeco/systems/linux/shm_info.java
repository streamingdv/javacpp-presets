// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.systems.linux;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.linux.*;


@Properties(inherit = org.bytedeco.systems.presets.linux.class)
public class shm_info extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public shm_info() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public shm_info(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public shm_info(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public shm_info position(long position) {
        return (shm_info)super.position(position);
    }
    @Override public shm_info getPointer(long i) {
        return new shm_info((Pointer)this).offsetAddress(i);
    }

    public native int used_ids(); public native shm_info used_ids(int setter);
    public native @Cast("__syscall_ulong_t") long shm_tot(); public native shm_info shm_tot(long setter);	/* total allocated shm */
    public native @Cast("__syscall_ulong_t") long shm_rss(); public native shm_info shm_rss(long setter);	/* total resident shm */
    public native @Cast("__syscall_ulong_t") long shm_swp(); public native shm_info shm_swp(long setter);	/* total swapped shm */
    public native @Cast("__syscall_ulong_t") long swap_attempts(); public native shm_info swap_attempts(long setter);
    public native @Cast("__syscall_ulong_t") long swap_successes(); public native shm_info swap_successes(long setter);
  }
