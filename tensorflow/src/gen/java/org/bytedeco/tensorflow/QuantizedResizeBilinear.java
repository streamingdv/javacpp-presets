// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Resize quantized {@code images} to {@code size} using quantized bilinear interpolation.
 * 
 *  Input images and output images must be quantized types.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * images: 4-D with shape {@code [batch, height, width, channels]}.
 *  * size: = A 1-D int32 Tensor of 2 elements: {@code new_height, new_width}.  The
 *  new size for the images.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * align_corners: If true, the centers of the 4 corner pixels of the input and output tensors are
 *  aligned, preserving the values at the corner pixels. Defaults to false.
 * 
 *  Returns:
 *  * {@code Output} resized_images: 4-D with shape
 *  {@code [batch, new_height, new_width, channels]}.
 *  * {@code Output} out_min
 *  * {@code Output} out_max */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class QuantizedResizeBilinear extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QuantizedResizeBilinear(Pointer p) { super(p); }

  /** Optional attribute setters for QuantizedResizeBilinear */
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
  
    /** If true, the centers of the 4 corner pixels of the input and output tensors are
     *  aligned, preserving the values at the corner pixels. Defaults to false.
     * 
     *  Defaults to false */
    public native @ByVal Attrs AlignCorners(@Cast("bool") boolean x);

    /** Defaults to false */
    public native @ByVal Attrs HalfPixelCenters(@Cast("bool") boolean x);

    public native @Cast("bool") boolean align_corners_(); public native Attrs align_corners_(boolean setter);
    public native @Cast("bool") boolean half_pixel_centers_(); public native Attrs half_pixel_centers_(boolean setter);
  }
  public QuantizedResizeBilinear(@Const @ByRef Scope scope, @ByVal Input images, @ByVal Input size, @ByVal Input min, @ByVal Input max) { super((Pointer)null); allocate(scope, images, size, min, max); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input images, @ByVal Input size, @ByVal Input min, @ByVal Input max);
  public QuantizedResizeBilinear(@Const @ByRef Scope scope, @ByVal Input images, @ByVal Input size, @ByVal Input min, @ByVal Input max, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, images, size, min, max, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input images, @ByVal Input size, @ByVal Input min, @ByVal Input max, @Const @ByRef Attrs attrs);

  public static native @ByVal Attrs AlignCorners(@Cast("bool") boolean x);
  public static native @ByVal Attrs HalfPixelCenters(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native QuantizedResizeBilinear operation(Operation setter);
  public native @ByRef Output resized_images(); public native QuantizedResizeBilinear resized_images(Output setter);
  public native @ByRef Output out_min(); public native QuantizedResizeBilinear out_min(Output setter);
  public native @ByRef Output out_max(); public native QuantizedResizeBilinear out_max(Output setter);
}
