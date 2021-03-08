// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;

//
// Use CloseHandle to destroy the snapshot
//

/****** heap walking ***************************************************/

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class HEAPLIST32 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public HEAPLIST32() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public HEAPLIST32(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public HEAPLIST32(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public HEAPLIST32 position(long position) {
        return (HEAPLIST32)super.position(position);
    }
    @Override public HEAPLIST32 getPointer(long i) {
        return new HEAPLIST32((Pointer)this).position(position + i);
    }

    public native @Cast("SIZE_T") long dwSize(); public native HEAPLIST32 dwSize(long setter);
    public native @Cast("DWORD") int th32ProcessID(); public native HEAPLIST32 th32ProcessID(int setter);   // owning process
    public native @Cast("ULONG_PTR") long th32HeapID(); public native HEAPLIST32 th32HeapID(long setter);      // heap (in owning process's context!)
    public native @Cast("DWORD") int dwFlags(); public native HEAPLIST32 dwFlags(int setter);
}
