// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * Event wait node parameters
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUDA_EVENT_WAIT_NODE_PARAMS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUDA_EVENT_WAIT_NODE_PARAMS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUDA_EVENT_WAIT_NODE_PARAMS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUDA_EVENT_WAIT_NODE_PARAMS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUDA_EVENT_WAIT_NODE_PARAMS position(long position) {
        return (CUDA_EVENT_WAIT_NODE_PARAMS)super.position(position);
    }
    @Override public CUDA_EVENT_WAIT_NODE_PARAMS getPointer(long i) {
        return new CUDA_EVENT_WAIT_NODE_PARAMS((Pointer)this).offsetAddress(i);
    }

    /** The event to wait on from the node */
    public native CUevent_st event(); public native CUDA_EVENT_WAIT_NODE_PARAMS event(CUevent_st setter);
}
