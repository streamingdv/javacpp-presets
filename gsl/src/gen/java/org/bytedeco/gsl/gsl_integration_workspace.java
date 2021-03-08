// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


/* Workspace for adaptive integrators */

@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_integration_workspace extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_integration_workspace() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_integration_workspace(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_integration_workspace(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_integration_workspace position(long position) {
        return (gsl_integration_workspace)super.position(position);
    }
    @Override public gsl_integration_workspace getPointer(long i) {
        return new gsl_integration_workspace((Pointer)this).position(position + i);
    }

    public native @Cast("size_t") @Name("limit") long _limit(); public native gsl_integration_workspace _limit(long setter);
    public native @Cast("size_t") long size(); public native gsl_integration_workspace size(long setter);
    public native @Cast("size_t") long nrmax(); public native gsl_integration_workspace nrmax(long setter);
    public native @Cast("size_t") long i(); public native gsl_integration_workspace i(long setter);
    public native @Cast("size_t") long maximum_level(); public native gsl_integration_workspace maximum_level(long setter);
    public native DoublePointer alist(); public native gsl_integration_workspace alist(DoublePointer setter);
    public native DoublePointer blist(); public native gsl_integration_workspace blist(DoublePointer setter);
    public native DoublePointer rlist(); public native gsl_integration_workspace rlist(DoublePointer setter);
    public native DoublePointer elist(); public native gsl_integration_workspace elist(DoublePointer setter);
    public native @Cast("size_t*") SizeTPointer order(); public native gsl_integration_workspace order(SizeTPointer setter);
    public native @Cast("size_t*") SizeTPointer level(); public native gsl_integration_workspace level(SizeTPointer setter);
  }
