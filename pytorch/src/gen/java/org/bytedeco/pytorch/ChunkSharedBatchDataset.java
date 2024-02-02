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


/** A dataset that wraps another dataset in a shared pointer and implements the
 *  {@code BatchDataset} API, delegating all calls to the shared instance. This is
 *  useful when you want all worker threads in the dataloader to access the same
 *  dataset instance. The dataset must take care of synchronization and
 *  thread-safe access itself.
 * 
 *  Use {@code torch::data::datasets::make_shared_dataset()} to create a new
 *  {@code SharedBatchDataset} like you would a {@code std::shared_ptr}. */
@Name("torch::data::datasets::SharedBatchDataset<torch::data::datasets::ChunkDataset<JavaCPP_torch_0003a_0003adata_0003a_0003adatasets_0003a_0003aChunkDataReader_0003ctorch_0003a_0003adata_0003a_0003aExample_0003ctorch_0003a_0003aTensor_0002ctorch_0003a_0003aTensor_0003e_0002cstd_0003a_0003avector_0003ctorch_0003a_0003adata_0003a_0003aExample_0003ctorch_0003a_0003aTensor_0002ctorch_0003a_0003aTensor_0003e_00020_0003e_00020_0003e,torch::data::samplers::RandomSampler,torch::data::samplers::RandomSampler> >") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ChunkSharedBatchDataset extends ChunkBatchSharedBatchDataset {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ChunkSharedBatchDataset(Pointer p) { super(p); }


  /** Constructs a new {@code SharedBatchDataset} from a {@code shared_ptr} to the
   *  {@code UnderlyingDataset}. */
  /* implicit */ public ChunkSharedBatchDataset(
      @SharedPtr ChunkDataset shared_dataset) { super((Pointer)null); allocate(shared_dataset); }
private native void allocate(
      @SharedPtr ChunkDataset shared_dataset);

  /** Calls {@code get_batch} on the underlying dataset. */
  public native @ByVal @Cast("torch::data::datasets::SharedBatchDataset<torch::data::datasets::ChunkDataset<JavaCPP_torch_0003a_0003adata_0003a_0003adatasets_0003a_0003aChunkDataReader_0003ctorch_0003a_0003adata_0003a_0003aExample_0003ctorch_0003a_0003aTensor_0002ctorch_0003a_0003aTensor_0003e_0002cstd_0003a_0003avector_0003ctorch_0003a_0003adata_0003a_0003aExample_0003ctorch_0003a_0003aTensor_0002ctorch_0003a_0003aTensor_0003e_00020_0003e_00020_0003e,torch::data::samplers::RandomSampler,torch::data::samplers::RandomSampler> >::BatchType*") ExampleVectorOptional get_batch(@Cast("torch::data::datasets::SharedBatchDataset<torch::data::datasets::ChunkDataset<JavaCPP_torch_0003a_0003adata_0003a_0003adatasets_0003a_0003aChunkDataReader_0003ctorch_0003a_0003adata_0003a_0003aExample_0003ctorch_0003a_0003aTensor_0002ctorch_0003a_0003aTensor_0003e_0002cstd_0003a_0003avector_0003ctorch_0003a_0003adata_0003a_0003aExample_0003ctorch_0003a_0003aTensor_0002ctorch_0003a_0003aTensor_0003e_00020_0003e_00020_0003e,torch::data::samplers::RandomSampler,torch::data::samplers::RandomSampler> >::BatchRequestType") long request);

  /** Returns the {@code size} from the underlying dataset. */
  public native @ByVal SizeTOptional size();

  /** Accesses the underlying dataset. */
  public native @ByRef @Name("operator *") ChunkDataset multiply();

  /** Accesses the underlying dataset. */

  /** Accesses the underlying dataset. */
  public native @Name("operator ->") ChunkDataset access();

  /** Accesses the underlying dataset. */

  /** Calls {@code reset()} on the underlying dataset. */
  public native void reset();
}
