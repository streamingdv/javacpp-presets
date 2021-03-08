// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Converts two real numbers to a complex number.
 * 
 *  Given a tensor {@code real} representing the real part of a complex number, and a
 *  tensor {@code imag} representing the imaginary part of a complex number, this
 *  operation returns complex numbers elementwise of the form \(a + bj\), where
 *  *a* represents the {@code real} part and *b* represents the {@code imag} part.
 * 
 *  The input tensors {@code real} and {@code imag} must have the same shape.
 * 
 *  For example:
 * 
 *  <pre>{@code
 *  # tensor 'real' is [2.25, 3.25]
 *  # tensor `imag` is [4.75, 5.75]
 *  tf.complex(real, imag) ==> [[2.25 + 4.75j], [3.25 + 5.75j]]
 *  }</pre>
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output}: The out tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Complex extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Complex(Pointer p) { super(p); }

  /** Optional attribute setters for Complex */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
      @Override public Attrs getPointer(long i) {
          return new Attrs((Pointer)this).position(position + i);
      }
  
    /** Defaults to DT_COMPLEX64 */
    public native @ByVal Attrs Tout(@Cast("tensorflow::DataType") int x);

    public native @Cast("tensorflow::DataType") int Tout_(); public native Attrs Tout_(int setter);
  }
  public Complex(@Const @ByRef Scope scope, @ByVal Input real,
          @ByVal Input imag) { super((Pointer)null); allocate(scope, real, imag); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input real,
          @ByVal Input imag);
  public Complex(@Const @ByRef Scope scope, @ByVal Input real,
          @ByVal Input imag, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, real, imag, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input real,
          @ByVal Input imag, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs Tout(@Cast("tensorflow::DataType") int x);

  public native @ByRef Operation operation(); public native Complex operation(Operation setter);
  public native @ByRef Output out(); public native Complex out(Output setter);
}
