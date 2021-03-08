// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Returns the permuted vector/tensor in the destination data format given the
 * 
 *  one in the source data format.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * x: Vector of size 4 or Tensor of shape (4, 2) in source data format.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * src_format: source data format.
 *  * dst_format: destination data format.
 * 
 *  Returns:
 *  * {@code Output}: Vector of size 4 or Tensor of shape (4, 2) in destination data format. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class DataFormatVecPermute extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DataFormatVecPermute(Pointer p) { super(p); }

  /** Optional attribute setters for DataFormatVecPermute */
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
  
    /** source data format.
     * 
     *  Defaults to "NHWC" */
    
    ///
    public native @ByVal Attrs SrcFormat(@StringPiece BytePointer x);
    public native @ByVal Attrs SrcFormat(@StringPiece String x);

    /** destination data format.
     * 
     *  Defaults to "NCHW" */
    public native @ByVal Attrs DstFormat(@StringPiece BytePointer x);
    public native @ByVal Attrs DstFormat(@StringPiece String x);

    public native @StringPiece BytePointer src_format_(); public native Attrs src_format_(BytePointer setter);
    public native @StringPiece BytePointer dst_format_(); public native Attrs dst_format_(BytePointer setter);
  }
  public DataFormatVecPermute(@Const @ByRef Scope scope, @ByVal Input x) { super((Pointer)null); allocate(scope, x); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input x);
  public DataFormatVecPermute(@Const @ByRef Scope scope, @ByVal Input x,
                       @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, x, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input x,
                       @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs SrcFormat(@StringPiece BytePointer x);
  public static native @ByVal Attrs SrcFormat(@StringPiece String x);
  public static native @ByVal Attrs DstFormat(@StringPiece BytePointer x);
  public static native @ByVal Attrs DstFormat(@StringPiece String x);

  public native @ByRef Operation operation(); public native DataFormatVecPermute operation(Operation setter);
  public native @ByRef Output y(); public native DataFormatVecPermute y(Output setter);
}
