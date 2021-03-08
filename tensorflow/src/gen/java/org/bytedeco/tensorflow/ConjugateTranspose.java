// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Shuffle dimensions of x according to a permutation and conjugate the result.
 * 
 *  The output {@code y} has the same rank as {@code x}. The shapes of {@code x} and {@code y} satisfy:
 *    {@code y.shape[i] == x.shape[perm[i]] for i in [0, 1, ..., rank(x) - 1]}
 *    {@code y[i,j,k,...,s,t,u] == conj(x[perm[i], perm[j], perm[k],...,perm[s], perm[t], perm[u]])}
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output}: The y tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ConjugateTranspose extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ConjugateTranspose(Pointer p) { super(p); }

  public ConjugateTranspose(@Const @ByRef Scope scope, @ByVal Input x,
                     @ByVal Input perm) { super((Pointer)null); allocate(scope, x, perm); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input x,
                     @ByVal Input perm);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native ConjugateTranspose operation(Operation setter);
  public native @ByRef Output y(); public native ConjugateTranspose y(Output setter);
}
