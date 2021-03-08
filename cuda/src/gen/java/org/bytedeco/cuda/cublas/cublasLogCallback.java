// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cublas;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.cublas.*;
         


/* Cublas logging */
@Properties(inherit = org.bytedeco.cuda.presets.cublas.class)
public class cublasLogCallback extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    cublasLogCallback(Pointer p) { super(p); }
    protected cublasLogCallback() { allocate(); }
    private native void allocate();
    public native void call(@Cast("const char*") BytePointer msg);
}
