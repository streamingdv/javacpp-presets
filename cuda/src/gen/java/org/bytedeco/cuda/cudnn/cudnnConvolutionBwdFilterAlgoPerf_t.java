// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.cudnn.*;

// #endif

/* helper function to provide the convolution backward filter algo that fit best the requirement */

@Properties(inherit = org.bytedeco.cuda.presets.cudnn.class)
public class cudnnConvolutionBwdFilterAlgoPerf_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudnnConvolutionBwdFilterAlgoPerf_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudnnConvolutionBwdFilterAlgoPerf_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudnnConvolutionBwdFilterAlgoPerf_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudnnConvolutionBwdFilterAlgoPerf_t position(long position) {
        return (cudnnConvolutionBwdFilterAlgoPerf_t)super.position(position);
    }
    @Override public cudnnConvolutionBwdFilterAlgoPerf_t getPointer(long i) {
        return new cudnnConvolutionBwdFilterAlgoPerf_t((Pointer)this).position(position + i);
    }

    public native @Cast("cudnnConvolutionBwdFilterAlgo_t") int algo(); public native cudnnConvolutionBwdFilterAlgoPerf_t algo(int setter);
    public native @Cast("cudnnStatus_t") int status(); public native cudnnConvolutionBwdFilterAlgoPerf_t status(int setter);
    public native float time(); public native cudnnConvolutionBwdFilterAlgoPerf_t time(float setter);
    public native @Cast("size_t") long memory(); public native cudnnConvolutionBwdFilterAlgoPerf_t memory(long setter);
    public native @Cast("cudnnDeterminism_t") int determinism(); public native cudnnConvolutionBwdFilterAlgoPerf_t determinism(int setter);
    public native @Cast("cudnnMathType_t") int mathType(); public native cudnnConvolutionBwdFilterAlgoPerf_t mathType(int setter);
    public native int reserved(int i); public native cudnnConvolutionBwdFilterAlgoPerf_t reserved(int i, int setter);
    @MemberGetter public native IntPointer reserved();
}
