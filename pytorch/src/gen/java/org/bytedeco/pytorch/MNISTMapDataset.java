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
 // namespace detail

/** A {@code MapDataset} is a dataset that applies a transform to a source dataset. */
@Name("torch::data::datasets::MapDataset<torch::data::datasets::MNIST,torch::data::transforms::Stack<torch::data::Example<torch::Tensor,torch::Tensor> > >") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class MNISTMapDataset extends MNISTMapBatchDataset {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MNISTMapDataset(Pointer p) { super(p); }


  public MNISTMapDataset(@ByVal MNIST dataset, @ByVal @Cast("torch::data::datasets::MapDataset<torch::data::datasets::MNIST,torch::data::transforms::Stack<torch::data::Example<torch::Tensor,torch::Tensor> > >::TransformType*") ExampleStack transform) { super((Pointer)null); allocate(dataset, transform); }
  private native void allocate(@ByVal MNIST dataset, @ByVal @Cast("torch::data::datasets::MapDataset<torch::data::datasets::MNIST,torch::data::transforms::Stack<torch::data::Example<torch::Tensor,torch::Tensor> > >::TransformType*") ExampleStack transform);

  /** Gets a batch from the source dataset and applies the transform to it,
   *  returning the result. */
  public native @Name("get_batch") @ByVal Example get_batch_example(@ByVal SizeTArrayRef indices);
  public native @Name("get_batch") @ByVal Example get_batch_example(@ByVal @Cast({"size_t*", "c10::ArrayRef<size_t>", "std::vector<size_t>&"}) @StdVector long... indices);

  /** Returns the size of the source dataset. */
  // NOLINTNEXTLINE(bugprone-exception-escape)
  public native @ByVal @NoException(true) SizeTOptional size();

  /** Calls {@code reset()} on the underlying dataset.
   *  NOTE: Stateless datasets do not have a reset() method, so a call to this
   *  method will only compile for stateful datasets (which have a reset()
   *  method). */
  

  /** Returns the underlying dataset. */
  public native @Const @ByRef @NoException(true) MNIST dataset();

  /** Returns the transform being applied. */
  public native @Const @ByRef @NoException(true) ExampleStack transform();
}
