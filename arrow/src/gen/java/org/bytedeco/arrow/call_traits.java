// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** Helper struct for examining lambdas and other callables.
 *  TODO(bkietz) support function pointers */
@Namespace("arrow::internal") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class call_traits extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public call_traits() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public call_traits(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public call_traits(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public call_traits position(long position) {
        return (call_traits)super.position(position);
    }
    @Override public call_traits getPointer(long i) {
        return new call_traits((Pointer)this).position(position + i);
    }


  /** bool constant indicating whether F is a callable with more than one possible
   *  signature. Will be true_type for objects which define multiple operator() or which
   *  define a template operator() */

  /** If F is not overloaded, the argument types of its call operator can be
   *  extracted via call_traits::argument_type<Index, F> */
}
