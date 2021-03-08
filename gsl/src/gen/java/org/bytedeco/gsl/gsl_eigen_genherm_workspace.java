// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_eigen_genherm_workspace extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_eigen_genherm_workspace() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_eigen_genherm_workspace(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_eigen_genherm_workspace(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_eigen_genherm_workspace position(long position) {
        return (gsl_eigen_genherm_workspace)super.position(position);
    }
    @Override public gsl_eigen_genherm_workspace getPointer(long i) {
        return new gsl_eigen_genherm_workspace((Pointer)this).position(position + i);
    }

  public native @Cast("size_t") long size(); public native gsl_eigen_genherm_workspace size(long setter);            /* size of matrices */
  public native gsl_eigen_herm_workspace herm_workspace_p(); public native gsl_eigen_genherm_workspace herm_workspace_p(gsl_eigen_herm_workspace setter);
}
