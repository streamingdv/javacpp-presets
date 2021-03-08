// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * CUDA pointer attributes
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class cudaPointerAttributes extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaPointerAttributes() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudaPointerAttributes(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaPointerAttributes(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudaPointerAttributes position(long position) {
        return (cudaPointerAttributes)super.position(position);
    }
    @Override public cudaPointerAttributes getPointer(long i) {
        return new cudaPointerAttributes((Pointer)this).position(position + i);
    }

    /**
     * The type of memory - ::cudaMemoryTypeUnregistered, ::cudaMemoryTypeHost,
     * ::cudaMemoryTypeDevice or ::cudaMemoryTypeManaged.
     */
    public native @Cast("cudaMemoryType") int type(); public native cudaPointerAttributes type(int setter);

    /** 
     * The device against which the memory was allocated or registered.
     * If the memory type is ::cudaMemoryTypeDevice then this identifies 
     * the device on which the memory referred physically resides.  If
     * the memory type is ::cudaMemoryTypeHost or::cudaMemoryTypeManaged then
     * this identifies the device which was current when the memory was allocated
     * or registered (and if that device is deinitialized then this allocation
     * will vanish with that device's state).
     */
    public native int device(); public native cudaPointerAttributes device(int setter);

    /**
     * The address which may be dereferenced on the current device to access 
     * the memory or NULL if no such address exists.
     */
    public native Pointer devicePointer(); public native cudaPointerAttributes devicePointer(Pointer setter);

    /**
     * The address which may be dereferenced on the host to access the
     * memory or NULL if no such address exists.
     *
     * \note CUDA doesn't check if unregistered memory is allocated so this field
     * may contain invalid pointer if an invalid pointer has been passed to CUDA.
     */
    public native Pointer hostPointer(); public native cudaPointerAttributes hostPointer(Pointer setter);
}
