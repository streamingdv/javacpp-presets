// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.systems.linux;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.linux.*;
	/* Private key.  */


/* Data structure used to pass permission information to IPC operations.  */
@Properties(inherit = org.bytedeco.systems.presets.linux.class)
public class ipc_perm extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ipc_perm() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ipc_perm(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ipc_perm(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ipc_perm position(long position) {
        return (ipc_perm)super.position(position);
    }
    @Override public ipc_perm getPointer(long i) {
        return new ipc_perm((Pointer)this).offsetAddress(i);
    }
			/* Key.  */
    public native @Cast("__uid_t") int uid(); public native ipc_perm uid(int setter);			/* Owner's user ID.  */
    public native @Cast("__gid_t") int gid(); public native ipc_perm gid(int setter);			/* Owner's group ID.  */
    public native @Cast("__uid_t") int cuid(); public native ipc_perm cuid(int setter);			/* Creator's user ID.  */
    public native @Cast("__gid_t") int cgid(); public native ipc_perm cgid(int setter);			/* Creator's group ID.  */
    public native @Cast("unsigned short int") short mode(); public native ipc_perm mode(short setter);		/* Read/write permission.  */
    public native @Cast("unsigned short int") short __pad1(); public native ipc_perm __pad1(short setter);
    public native @Cast("unsigned short int") short __seq(); public native ipc_perm __seq(short setter);		/* Sequence number.  */
    public native @Cast("unsigned short int") short __pad2(); public native ipc_perm __pad2(short setter);
    public native @Cast("__syscall_ulong_t") long __unused1(); public native ipc_perm __unused1(long setter);
    public native @Cast("__syscall_ulong_t") long __unused2(); public native ipc_perm __unused2(long setter);
  }