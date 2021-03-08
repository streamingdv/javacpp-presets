// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Computes the sum along sparse segments of a tensor divided by the sqrt of N.
 * 
 *  N is the size of the segment being reduced.
 * 
 *  See {@code tf.sparse.segment_sum} for usage examples.
 * 
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * indices: A 1-D tensor. Has same rank as {@code segment_ids}.
 *  * segment_ids: A 1-D tensor. Values should be sorted and can be repeated.
 * 
 *  Returns:
 *  * {@code Output}: Has same shape as data, except for dimension 0 which
 *  has size {@code k}, the number of segments. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class SparseSegmentSqrtN extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SparseSegmentSqrtN(Pointer p) { super(p); }

  public SparseSegmentSqrtN(@Const @ByRef Scope scope, @ByVal Input data,
                     @ByVal Input indices, @ByVal Input segment_ids) { super((Pointer)null); allocate(scope, data, indices, segment_ids); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input data,
                     @ByVal Input indices, @ByVal Input segment_ids);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native SparseSegmentSqrtN operation(Operation setter);
  public native @ByRef Output output(); public native SparseSegmentSqrtN output(Output setter);
}
