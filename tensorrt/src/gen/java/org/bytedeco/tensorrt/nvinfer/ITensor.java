// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;
import org.bytedeco.cuda.cudnn.*;
import static org.bytedeco.cuda.global.cudnn.*;
import org.bytedeco.cuda.nvrtc.*;
import static org.bytedeco.cuda.global.nvrtc.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;
 // namespace impl

/**
 *  \class ITensor
 * 
 *  \brief A tensor in a network definition.
 * 
 *  To remove a tensor from a network definition, use INetworkDefinition::removeTensor().
 * 
 *  When using the DLA, the cumulative size of all Tensors that are not marked as Network Input or Output tensors,
 *  must be less than 1GB in size to fit into a single subgraph. If the build option kGPU_FALLBACK is specified, then
 *  multiple subgraphs can be created, with each subgraph limited to less than 1GB of internal tensors data.
 * 
 *  \warning The volume of the tensor must be less than 2^31 elements.
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and
 *  ABI.
 *  */
@Namespace("nvinfer1") @NoOffset @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class ITensor extends INoCopy {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ITensor(Pointer p) { super(p); }

    /**
     *  \brief Set the tensor name.
     * 
     *  For a network input, the name is assigned by the application. For tensors which are layer outputs,
     *  a default name is assigned consisting of the layer name followed by the index of the output in brackets.
     * 
     *  This method copies the name string.
     * 
     *  @param name The name.
     * 
     *  @see getName()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) void setName(String name);
    public native @NoException(true) void setName(@Cast("const char*") BytePointer name);

    /**
     *  \brief Get the tensor name.
     * 
     *  @return The name as a null-terminated C-style string.
     * 
     *  @see setName()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) String getName();

    /**
     *  \brief Set the dimensions of a tensor.
     * 
     *  For a network input, the dimensions are assigned by the application. For a network output, the dimensions are
     *  computed based on the layer parameters and the inputs to the layer. If a tensor size or a parameter is modified
     *  in the network, the dimensions of all dependent tensors will be recomputed.
     * 
     *  This call is only legal for network input tensors, since the dimensions of layer output tensors are inferred
     *  based on layer inputs and parameters. The volume must be less than 2^31 elements.
     * 
     *  @param dimensions The dimensions of the tensor.
     * 
     *  @see getDimensions()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) void setDimensions(@ByVal @Cast("nvinfer1::Dims*") Dims32 dimensions);

    /**
     *  \brief Get the dimensions of a tensor.
     * 
     *  @return The dimensions of the tensor.
     * 
     *  \warning getDimensions() returns a -1 for dimensions that are derived from a wildcard dimension.
     *  @see setDimensions()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims32 getDimensions();

    /**
     *  \brief Set the data type of a tensor.
     * 
     *  @param type The data type of the tensor.
     * 
     *  The type is unchanged if the tensor is not a network input tensor, or marked as an output tensor or shape
     *  output tensor.
     * 
     *  @see getType()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) void setType(DataType type);
    public native @NoException(true) void setType(@Cast("nvinfer1::DataType") int type);

    /**
     *  \brief Get the data type of a tensor.
     * 
     *  @return The data type of the tensor.
     * 
     *  @see setType()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) DataType getType();

    /**
     *  \brief Set dynamic range for the tensor
     * 
     *  Currently, only symmetric ranges are supported.
     *  Therefore, the larger of the absolute values of the provided bounds is used.
     * 
     *  @return Whether the dynamic range was set successfully.
     * 
     *  Requires that min and max be finite, and min <= max.
     *  */
    
    
    //!
    //!
    public native @Cast("bool") @NoException(true) boolean setDynamicRange(float min, float max);

    /**
     *  \brief Whether the tensor is a network input.
     *  */
    
    
    //!
    //!
    public native @Cast("bool") @NoException(true) boolean isNetworkInput();

    /**
     *  \brief Whether the tensor is a network output.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    public native @Cast("bool") @NoException(true) boolean isNetworkOutput();

    /**
     *  \brief Set whether to enable broadcast of tensor across the batch.
     * 
     *  When a tensor is broadcast across a batch, it has the same value for every member in the batch.
     *  Memory is only allocated once for the single member.
     * 
     *  This method is only valid for network input tensors, since the flags of layer output tensors are inferred based
     *  on layer inputs and parameters.
     *  If this state is modified for a tensor in the network, the states of all dependent tensors will be recomputed.
     *  If the tensor is for an explicit batch network, then this function does nothing.
     * 
     *  \warning The broadcast flag is ignored when using explicit batch network mode.
     * 
     *  @param broadcastAcrossBatch Whether to enable broadcast of tensor across the batch.
     * 
     *  @see getBroadcastAcrossBatch()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) void setBroadcastAcrossBatch(@Cast("bool") boolean broadcastAcrossBatch);

    /**
     *  \brief Check if tensor is broadcast across the batch.
     * 
     *  When a tensor is broadcast across a batch, it has the same value for every member in the batch.
     *  Memory is only allocated once for the single member. If the network is in explicit batch mode,
     *  this function returns true if the leading dimension is 1.
     * 
     *  @return True if tensor is broadcast across the batch, false otherwise.
     * 
     *  @see setBroadcastAcrossBatch()
     *  */
    
    
    //!
    //!
    public native @Cast("bool") @NoException(true) boolean getBroadcastAcrossBatch();

    /**
     *  \brief Get the storage location of a tensor.
     *  @return The location of tensor data.
     *  @see setLocation()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) TensorLocation getLocation();

    /**
     *  \brief Set the storage location of a tensor
     *  @param location the location of tensor data
     * 
     *  Only network input tensors for storing sequence lengths for RNNv2 are supported.
     *  Using host storage for layers that do not support it will generate
     *  errors at build time.
     * 
     *  @see getLocation()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) void setLocation(TensorLocation location);
    public native @NoException(true) void setLocation(@Cast("nvinfer1::TensorLocation") int location);

    /**
     *  \brief Query whether dynamic range is set.
     * 
     *  @return True if dynamic range is set, false otherwise.
     *  */
    
    
    //!
    //!
    public native @Cast("bool") @NoException(true) boolean dynamicRangeIsSet();

    /**
     *  \brief Undo effect of setDynamicRange.
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) void resetDynamicRange();

    /**
     *  \brief Get minimum of dynamic range.
     * 
     *  @return Minimum of dynamic range, or quiet NaN if range was not set.
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) float getDynamicRangeMin();

    /**
     *  \brief Get maximum of dynamic range.
     * 
     *  @return Maximum of dynamic range, or quiet NaN if range was not set.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) float getDynamicRangeMax();

    /**
     *  \brief Set allowed formats for this tensor. By default all formats are allowed.
     *         Shape tensors (for which isShapeTensor() returns true) may only have row major linear format.
     * 
     *  When running network on DLA and the build option kGPU_FALLBACK is not specified, if DLA format(kCHW4 with Int8,
     *  kCHW4 with FP16, kCHW16 with FP16, kCHW32 with Int8) is set, the input format is treated as native DLA format with
     *  line stride requirement. Input/output binding with these format should have correct layout during
     *  inference.
     * 
     *  @param formats A bitmask of TensorFormat values that are supported for this tensor.
     * 
     *  @see ITensor::getAllowedFormats()
     *  @see TensorFormats
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) void setAllowedFormats(@Cast("nvinfer1::TensorFormats") int formats);

    /**
     *  \brief Get a bitmask of TensorFormat values that the tensor supports.
     *         For a shape tensor, only row major linear format is allowed.
     * 
     *  @return The value specified by setAllowedFormats or all possible formats.
     * 
     *  @see ITensor::setAllowedFormats()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    public native @Cast("nvinfer1::TensorFormats") @NoException(true) int getAllowedFormats();

    /**
     *  \brief Whether the tensor is a shape tensor.
     * 
     *  A shape tensor is a tensor that is related to shape calculations.
     *  It must be 0D or 1D, have type Int32 or Bool, and its shape must be determinable at build time.
     *  Furthermore, it must be needed as a shape tensor, either marked as a network shape
     *  output via markOutputForShapes(), or as an input that is required to be a shape
     *  tensor, such as the second input to IShuffleLayer. Some layers are "polymorphic" in
     *  this respect. For example, the inputs to IElementWiseLayer must be shape tensors
     *  if the output is a shape tensor.
     * 
     *  The TensorRT Developer Guide give the formal rules for what tensors are shape tensors.
     * 
     *  The result of isShapeTensor() is reliable only when network construction is complete.
     *  For example, if a partially built network sums two tensors T1 and T2 to create
     *  tensor T3, and none are yet needed as shape tensors, isShapeTensor() returns false
     *  for all three tensors.  Setting the second input of IShuffleLayer to be T3 would
     *  cause all three tensors to be shape tensors, because IShuffleLayer requires that its
     *  second optional input be a shape tensor, and IElementWiseLayer is "polymorphic".
     * 
     *  If a tensor is a shape tensor and becomes an engine input or output,
     *  then ICudaEngine::isShapeBinding will be true for that tensor.
     * 
     *  It is possible for a tensor to be both a shape tensor and an execution tensor.
     * 
     *  @return True if tensor is a shape tensor, false otherwise.
     * 
     *  @see INetworkDefinition::markOutputForShapes(), ICudaEngine::isShapeBinding()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @Cast("bool") @NoException(true) boolean isShapeTensor();

    /**
     *  \brief Whether the tensor is an execution tensor.
     * 
     *  Tensors are usually execution tensors.  The exceptions are tensors used
     *  solely for shape calculations or whose contents not needed to compute the outputs.
     * 
     *  The result of isExecutionTensor() is reliable only when network construction is complete.
     *  For example, if a partially built network has no path from a tensor to a network output,
     *  isExecutionTensor() returns false. Completing the path would cause it to become true.
     * 
     *  If a tensor is an execution tensor and becomes an engine input or output,
     *  then ICudaEngine::isExecutionBinding will be true for that tensor.
     * 
     *  A tensor with isShapeTensor() == false and isExecutionTensor() == false
     *  can still show up as an input to the engine if its dimensions are required.
     *  In that case, only its dimensions need to be set at runtime and a nullptr
     *  can be passed instead of a pointer to its contents.
     *  */
    public native @Cast("bool") @NoException(true) boolean isExecutionTensor();
}
