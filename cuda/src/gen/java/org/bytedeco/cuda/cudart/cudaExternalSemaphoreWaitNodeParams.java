// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * External semaphore wait node parameters
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class cudaExternalSemaphoreWaitNodeParams extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaExternalSemaphoreWaitNodeParams() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudaExternalSemaphoreWaitNodeParams(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaExternalSemaphoreWaitNodeParams(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudaExternalSemaphoreWaitNodeParams position(long position) {
        return (cudaExternalSemaphoreWaitNodeParams)super.position(position);
    }
    @Override public cudaExternalSemaphoreWaitNodeParams getPointer(long i) {
        return new cudaExternalSemaphoreWaitNodeParams((Pointer)this).position(position + i);
    }

    /** Array of external semaphore handles. */
    public native @ByPtrPtr CUexternalSemaphore_st extSemArray(); public native cudaExternalSemaphoreWaitNodeParams extSemArray(CUexternalSemaphore_st setter);
    /** Array of external semaphore wait parameters. */
    public native @Const cudaExternalSemaphoreWaitParams paramsArray(); public native cudaExternalSemaphoreWaitNodeParams paramsArray(cudaExternalSemaphoreWaitParams setter);
    /** Number of handles and parameters supplied in extSemArray and paramsArray. */
    public native @Cast("unsigned int") int numExtSems(); public native cudaExternalSemaphoreWaitNodeParams numExtSems(int setter);
}
