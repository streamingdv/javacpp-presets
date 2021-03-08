// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;


// Base struct representing result of a pass.
@Namespace("onnx::optimization") @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class PostPassAnalysis extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PostPassAnalysis() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PostPassAnalysis(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PostPassAnalysis(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PostPassAnalysis position(long position) {
        return (PostPassAnalysis)super.position(position);
    }
    @Override public PostPassAnalysis getPointer(long i) {
        return new PostPassAnalysis((Pointer)this).position(position + i);
    }

}
