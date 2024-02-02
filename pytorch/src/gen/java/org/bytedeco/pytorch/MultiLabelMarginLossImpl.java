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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ MultiLabelMarginLoss
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Creates a criterion that optimizes a multi-class multi-classification
 *  hinge loss (margin-based loss) between input :math:{@code x} (a 2D mini-batch
 *  {@code Tensor}) and output :math:{@code y} (which is a 2D {@code Tensor} of target class
 *  indices). See
 *  https://pytorch.org/docs/master/nn.html#torch.nn.MultiLabelMarginLoss to
 *  learn about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::MultiLabelMarginLossOptions} class to
 *  learn what constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  MultiLabelMarginLoss model(MultiLabelMarginLossOptions(torch::kNone));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class MultiLabelMarginLossImpl extends MultiLabelMarginLossImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MultiLabelMarginLossImpl(Pointer p) { super(p); }
    /** Downcast constructor. */
    public MultiLabelMarginLossImpl(Module pointer) { super((Pointer)null); allocate(pointer); }
    @Namespace private native @SharedPtr @Name("SHARED_PTR_NAMESPACE::dynamic_pointer_cast<torch::nn::MultiLabelMarginLossImpl, torch::nn::Module>") void allocate(@SharedPtr Module pointer);

  public MultiLabelMarginLossImpl(@ByVal(nullValue = "torch::nn::MultiLabelMarginLossOptions{}") MultiLabelMarginLossOptions options_) { super((Pointer)null); allocate(options_); }
  @SharedPtr @Name("std::make_shared<torch::nn::MultiLabelMarginLossImpl>") private native void allocate(@ByVal(nullValue = "torch::nn::MultiLabelMarginLossOptions{}") MultiLabelMarginLossOptions options_);
  public MultiLabelMarginLossImpl() { super((Pointer)null); allocate(); }
  @SharedPtr @Name("std::make_shared<torch::nn::MultiLabelMarginLossImpl>") private native void allocate();

  public native void reset();

  /** Pretty prints the {@code L1Loss} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  public native @ByVal Tensor forward(@Const @ByRef Tensor input, @Const @ByRef Tensor target);

  /** The options with which this {@code Module} was constructed. */
  public native @ByRef MultiLabelMarginLossOptions options(); public native MultiLabelMarginLossImpl options(MultiLabelMarginLossOptions setter);
}
