// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Interleave the values from the {@code data} tensors into a single tensor.
 * 
 *  Builds a merged tensor such that
 * 
 *  <pre>{@code python
 *      merged[indices[m][i, ..., j], ...] = data[m][i, ..., j, ...]
 *  }</pre>
 * 
 *  For example, if each {@code indices[m]} is scalar or vector, we have
 * 
 *  <pre>{@code python
 *      # Scalar indices:
 *      merged[indices[m], ...] = data[m][...]
 * 
 *      # Vector indices:
 *      merged[indices[m][i], ...] = data[m][i, ...]
 *  }</pre>
 * 
 *  Each {@code data[i].shape} must start with the corresponding {@code indices[i].shape},
 *  and the rest of {@code data[i].shape} must be constant w.r.t. {@code i}.  That is, we
 *  must have {@code data[i].shape = indices[i].shape + constant}.  In terms of this
 *  {@code constant}, the output shape is
 * 
 *      merged.shape = [max(indices)] + constant
 * 
 *  Values may be merged in parallel, so if an index appears in both {@code indices[m][i]}
 *  and {@code indices[n][j]}, the result may be invalid. This differs from the normal
 *  DynamicStitch operator that defines the behavior in that case.
 * 
 *  For example:
 * 
 *  <pre>{@code python
 *      indices[0] = 6
 *      indices[1] = [4, 1]
 *      indices[2] = [[5, 2], [0, 3]]
 *      data[0] = [61, 62]
 *      data[1] = [[41, 42], [11, 12]]
 *      data[2] = [[[51, 52], [21, 22]], [[1, 2], [31, 32]]]
 *      merged = [[1, 2], [11, 12], [21, 22], [31, 32], [41, 42],
 *                [51, 52], [61, 62]]
 *  }</pre>
 * 
 *  This method can be used to merge partitions created by {@code dynamic_partition}
 *  as illustrated on the following example:
 * 
 *  <pre>{@code python
 *      # Apply function (increments x_i) on elements for which a certain condition
 *      # apply (x_i != -1 in this example).
 *      x=tf.constant([0.1, -1., 5.2, 4.3, -1., 7.4])
 *      condition_mask=tf.not_equal(x,tf.constant(-1.))
 *      partitioned_data = tf.dynamic_partition(
 *          x, tf.cast(condition_mask, tf.int32) , 2)
 *      partitioned_data[1] = partitioned_data[1] + 1.0
 *      condition_indices = tf.dynamic_partition(
 *          tf.range(tf.shape(x)[0]), tf.cast(condition_mask, tf.int32) , 2)
 *      x = tf.dynamic_stitch(condition_indices, partitioned_data)
 *      # Here x=[1.1, -1., 6.2, 5.3, -1, 8.4], the -1. values remain
 *      # unchanged.
 *  }</pre>
 * 
 *  <div style="width:70%; margin:auto; margin-bottom:10px; margin-top:20px;">
 *  <img style="width:100%" src="https://www.tensorflow.org/images/DynamicStitch.png" alt>
 *  </div>
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output}: The merged tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ParallelDynamicStitch extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ParallelDynamicStitch(Pointer p) { super(p); }

  public ParallelDynamicStitch(@Const @ByRef Scope scope, @ByVal InputList indices, @ByVal InputList data) { super((Pointer)null); allocate(scope, indices, data); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal InputList indices, @ByVal InputList data);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native ParallelDynamicStitch operation(Operation setter);
  public native @ByRef Output merged(); public native ParallelDynamicStitch merged(Output setter);
}
