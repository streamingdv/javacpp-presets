// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Returns the diagonal part of the tensor.
 * 
 *  This operation returns a tensor with the {@code diagonal} part
 *  of the {@code input}. The {@code diagonal} part is computed as follows:
 * 
 *  Assume {@code input} has dimensions {@code [D1,..., Dk, D1,..., Dk]}, then the output is a
 *  tensor of rank {@code k} with dimensions {@code [D1,..., Dk]} where:
 * 
 *  {@code diagonal[i1,..., ik] = input[i1, ..., ik, i1,..., ik]}.
 * 
 *  For example:
 * 
 *  <pre>{@code
 *  # 'input' is [[1, 0, 0, 0]
 *                [0, 2, 0, 0]
 *                [0, 0, 3, 0]
 *                [0, 0, 0, 4]]
 * 
 *  tf.diag_part(input) ==> [1, 2, 3, 4]
 *  }</pre>
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input: Rank k tensor where k is even and not zero.
 * 
 *  Returns:
 *  * {@code Output}: The extracted diagonal. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class DiagPart extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DiagPart(Pointer p) { super(p); }

  public DiagPart(@Const @ByRef Scope scope, @ByVal Input input) { super((Pointer)null); allocate(scope, input); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native DiagPart operation(Operation setter);
  public native @ByRef Output diagonal(); public native DiagPart diagonal(Output setter);
}
