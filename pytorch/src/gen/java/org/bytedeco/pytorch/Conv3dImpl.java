// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Conv3d ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies convolution over a 3-D input.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.Conv3d to learn about
 *  the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::Conv3dOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  Conv3d model(Conv3dOptions(3, 2, 3).stride(1).bias(false));
 *  }</pre> */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Conv3dImpl extends Conv3dImplBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Conv3dImpl(Pointer p) { super(p); }
    /** Downcast constructor. */
    public Conv3dImpl(Module pointer) { super((Pointer)null); allocate(pointer); }
    @Namespace private native @SharedPtr @Name("SHARED_PTR_NAMESPACE::dynamic_pointer_cast<torch::nn::Conv3dImpl, torch::nn::Module>") void allocate(@SharedPtr Module pointer);

  public Conv3dImpl(
        @Cast("int64_t") long input_channels,
        @Cast("int64_t") long output_channels,
        @ByVal @Cast("torch::ExpandingArray<3>*") LongPointer kernel_size) { super((Pointer)null); allocate(input_channels, output_channels, kernel_size); }
  @SharedPtr @Name("std::make_shared<torch::nn::Conv3dImpl>") private native void allocate(
        @Cast("int64_t") long input_channels,
        @Cast("int64_t") long output_channels,
        @ByVal @Cast("torch::ExpandingArray<3>*") LongPointer kernel_size);
  public Conv3dImpl(@ByVal Conv3dOptions options_) { super((Pointer)null); allocate(options_); }
  @SharedPtr @Name("std::make_shared<torch::nn::Conv3dImpl>") private native void allocate(@ByVal Conv3dOptions options_);
  public native @ByVal Tensor forward(@Const @ByRef Tensor input);
}
