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


/**
 *  \class IBuilderConfig
 * 
 *  \brief Holds properties for configuring a builder to produce an engine. @see BuilderFlags
 *  */
@Namespace("nvinfer1") @NoOffset @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IBuilderConfig extends INoCopy {
    static { Loader.load(); }
    /** Default native constructor. */
    public IBuilderConfig() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IBuilderConfig(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IBuilderConfig(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IBuilderConfig position(long position) {
        return (IBuilderConfig)super.position(position);
    }
    @Override public IBuilderConfig getPointer(long i) {
        return new IBuilderConfig((Pointer)this).offsetAddress(i);
    }


    /**
     *  \brief Set the number of minimization iterations used when timing layers.
     * 
     *  When timing layers, the builder minimizes over a set of average times for layer execution. This parameter
     *  controls the number of iterations used in minimization. The builder may sometimes run layers for more
     *  iterations to improve timing accuracy if this parameter is set to a small value and the runtime of the
     *  layer is short.
     * 
     *  @see getMinTimingIterations()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) void setMinTimingIterations(int minTiming);

    /**
     *  \brief Query the number of minimization iterations.
     * 
     *  By default the minimum number of iterations is 2.
     * 
     *  @see setMinTimingIterations()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) int getMinTimingIterations();

    /**
     *  \brief Set the number of averaging iterations used when timing layers.
     * 
     *  When timing layers, the builder minimizes over a set of average times for layer execution. This parameter
     *  controls the number of iterations used in averaging.
     * 
     *  @see getAvgTimingIterations()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) void setAvgTimingIterations(int avgTiming);

    /**
     *  \brief Query the number of averaging iterations.
     * 
     *  By default the number of averaging iterations is 1.
     * 
     *  @see setAvgTimingIterations()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) int getAvgTimingIterations();

    /**
     *  \brief Configure the builder to target specified EngineCapability flow.
     * 
     *  The flow means a sequence of API calls that allow an application to set up a runtime, engine,
     *  and execution context in order to run inference.
     * 
     *  The supported flows are specified in the EngineCapability enum.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) void setEngineCapability(EngineCapability capability);
    public native @NoException(true) void setEngineCapability(@Cast("nvinfer1::EngineCapability") int capability);

    /**
     *  \brief Query EngineCapability flow configured for the builder.
     * 
     *  By default it returns EngineCapability::kSTANDARD.
     * 
     *  @see setEngineCapability()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) EngineCapability getEngineCapability();

    /**
     *  \brief Set Int8 Calibration interface.
     * 
     *  The calibrator is to minimize the information loss during the INT8 quantization process.
     *  */
    
    
    //!
    //!
    public native @NoException(true) void setInt8Calibrator(IInt8Calibrator calibrator);

    /**
     *  \brief Get Int8 Calibration interface.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) IInt8Calibrator getInt8Calibrator();

    /**
     *  \brief Set the maximum workspace size.
     * 
     *  @param workspaceSize The maximum GPU temporary memory which the engine can use at execution time.
     * 
     *  @see getMaxWorkspaceSize()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) void setMaxWorkspaceSize(@Cast("std::size_t") long workspaceSize);

    /**
     *  \brief Get the maximum workspace size.
     * 
     *  By default the workspace size is 0, which means there is no temporary memory.
     * 
     *  @return The maximum workspace size.
     * 
     *  @see setMaxWorkspaceSize()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @Cast("std::size_t") @NoException(true) long getMaxWorkspaceSize();

    /**
     *  \brief Set the build mode flags to turn on builder options for this network.
     * 
     *  The flags are listed in the BuilderFlags enum.
     *  The flags set configuration options to build the network.
     * 
     *  @param builderFlags The build option for an engine.
     * 
     *  \note This function will override the previous set flags, rather than bitwise ORing the new flag.
     * 
     *  @see getFlags()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) void setFlags(@Cast("nvinfer1::BuilderFlags") int builderFlags);

    /**
     *  \brief Get the build mode flags for this builder config. Defaults to 0.
     * 
     *  @return The build options as a bitmask.
     * 
     *  @see setFlags()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Cast("nvinfer1::BuilderFlags") @NoException(true) int getFlags();

    /**
     *  \brief clear a single build mode flag.
     * 
     *  clears the builder mode flag from the enabled flags.
     * 
     *  @see setFlags()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) void clearFlag(BuilderFlag builderFlag);
    public native @NoException(true) void clearFlag(@Cast("nvinfer1::BuilderFlag") int builderFlag);

    /**
     *  \brief Set a single build mode flag.
     * 
     *  Add the input builder mode flag to the already enabled flags.
     * 
     *  @see setFlags()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) void setFlag(BuilderFlag builderFlag);
    public native @NoException(true) void setFlag(@Cast("nvinfer1::BuilderFlag") int builderFlag);

    /**
     *  \brief Returns true if the build mode flag is set
     * 
     *  @see getFlags()
     * 
     *  @return True if flag is set, false if unset.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Cast("bool") @NoException(true) boolean getFlag(BuilderFlag builderFlag);
    public native @Cast("bool") @NoException(true) boolean getFlag(@Cast("nvinfer1::BuilderFlag") int builderFlag);

    /**
     *  \brief Set the device that this layer must execute on.
     *  @param deviceType that this layer must execute on.
     *  If DeviceType is not set or is reset, TensorRT will use the default DeviceType set in the builder.
     * 
     *  \note The device type for a layer must be compatible with the safety flow (if specified).
     *  For example a layer cannot be marked for DLA execution while the builder is configured for kSAFE_GPU.
     * 
     *  @see getDeviceType()
     *  */
    
    
    //!
    //!
    public native @NoException(true) void setDeviceType(@Const ILayer layer, DeviceType deviceType);
    public native @NoException(true) void setDeviceType(@Const ILayer layer, @Cast("nvinfer1::DeviceType") int deviceType);

    /**
     *  \brief Get the device that this layer executes on.
     *  @return Returns DeviceType of the layer.
     *  */
    
    
    //!
    //!
    public native @NoException(true) DeviceType getDeviceType(@Const ILayer layer);

    /**
     *  \brief whether the DeviceType has been explicitly set for this layer
     *  @return true if device type is not default
     *  @see setDeviceType() getDeviceType() resetDeviceType()
     *  */
    
    
    //!
    //!
    //!
    public native @Cast("bool") @NoException(true) boolean isDeviceTypeSet(@Const ILayer layer);

    /**
     *  \brief reset the DeviceType for this layer
     * 
     *  @see setDeviceType() getDeviceType() isDeviceTypeSet()
     *  */
    
    
    //!
    //!
    public native @NoException(true) void resetDeviceType(@Const ILayer layer);

    /**
     *  \brief Checks if a layer can run on DLA.
     *  @return status true if the layer can on DLA else returns false.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @Cast("bool") @NoException(true) boolean canRunOnDLA(@Const ILayer layer);

    /**
     *  \brief Sets the DLA core used by the network.
     *  @param dlaCore The DLA core to execute the engine on (0 to N-1). Default value is 0.
     * 
     *  It can be used to specify which DLA core to use via indexing, if multiple DLA cores are available.
     * 
     *  @see IRuntime::setDLACore() getDLACore()
     * 
     *  \warning Starting with TensorRT 8, the default value will be -1 if the DLA is not specified or unused.
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) void setDLACore(int dlaCore);

    /**
     *  \brief Get the DLA core that the engine executes on.
     *  @return If setDLACore is called, returns DLA core from 0 to N-1, else returns 0.
     * 
     *  \warning Starting with TensorRT 8, the default value will be -1 if the DLA is not specified or unused.
     *  */
    
    
    //!
    //!
    public native @NoException(true) int getDLACore();

    /**
     *  \brief Sets the default DeviceType to be used by the builder. It ensures that all the layers that can run on
     *  this device will run on it, unless setDeviceType is used to override the default DeviceType for a layer.
     *  @see getDefaultDeviceType()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) void setDefaultDeviceType(DeviceType deviceType);
    public native @NoException(true) void setDefaultDeviceType(@Cast("nvinfer1::DeviceType") int deviceType);

    /**
     *  \brief Get the default DeviceType which was set by setDefaultDeviceType.
     * 
     *  By default it returns DeviceType::kGPU.
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) DeviceType getDefaultDeviceType();

    /**
     *  \brief Resets the builder configuration to defaults.
     * 
     *  Useful for initializing a builder config object to its original state.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) void reset();

    /**
     *  \brief Delete this IBuilderConfig.
     * 
     *  De-allocates any internally allocated memory.
     * 
     *  @deprecated Deprecated interface will be removed in TensorRT 10.0. Use {@code delete} instead.
     * 
     *  \warning Calling destroy on a managed pointer will result in a double-free error.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Deprecated @NoException(true) void destroy();

    /**
     *  \brief Set the cuda stream that is used to profile this network.
     * 
     *  @param stream The cuda stream used for profiling by the builder.
     * 
     *  @see getProfileStream()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) void setProfileStream(CUstream_st stream);

    /**
     *  \brief Get the cuda stream that is used to profile this network.
     * 
     *  @return The cuda stream set by setProfileStream, nullptr if setProfileStream has not been called.
     * 
     *  @see setProfileStream()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) CUstream_st getProfileStream();

    /**
     *  \brief Add an optimization profile.
     * 
     *  This function must be called at least once if the network has dynamic or shape input tensors.
     *  This function may be called at most once when building a refittable engine, as more than
     *  a single optimization profile are not supported for refittable engines.
     * 
     *  @param profile The new optimization profile, which must satisfy profile->isValid() == true
     *  @return The index of the optimization profile (starting from 0) if the input is valid, or -1 if the input is
     *          not valid.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) int addOptimizationProfile(@Const IOptimizationProfile profile);

    /**
     *  \brief Get number of optimization profiles.
     * 
     *  This is one higher than the index of the last optimization profile that has be defined (or
     *  zero, if none has been defined yet).
     * 
     *  @return The number of the optimization profiles.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) int getNbOptimizationProfiles();

    /**
     *  \brief Set verbosity level of layer information exposed in NVTX annotations and IEngineInspector.
     * 
     *  Control how much layer information will be exposed in NVTX annotations and IEngineInspector.
     * 
     *  @see ProfilingVerbosity, getProfilingVerbosity(), IEngineInspector
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) void setProfilingVerbosity(ProfilingVerbosity verbosity);
    public native @NoException(true) void setProfilingVerbosity(@Cast("nvinfer1::ProfilingVerbosity") int verbosity);

    /**
     *  \brief Get verbosity level of layer information exposed in NVTX annotations and IEngineInspector.
     * 
     *  Get the current setting of verbosity level of layer information exposed in
     *  NVTX annotations and IEngineInspector. Default value is ProfilingVerbosity::kDEFAULT.
     * 
     *  @see ProfilingVerbosity, setProfilingVerbosity(), IEngineInspector
     *  */
    
    
    //!
    //!
    public native @NoException(true) ProfilingVerbosity getProfilingVerbosity();

    /**
     *  \brief Set Algorithm Selector.
     * 
     *  @param selector The algorithm selector to be set in the build config. */
    
    
    //!
    //!
    public native @NoException(true) void setAlgorithmSelector(IAlgorithmSelector selector);

    /**
     *  \brief Get Algorithm Selector.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) IAlgorithmSelector getAlgorithmSelector();

    /**
     *  \brief Add a calibration profile.
     * 
     *  Calibration optimization profile must be set if int8 calibration is used to set scales for a network with
     *  runtime dimensions.
     * 
     *  @param profile The new calibration profile, which must satisfy profile->isValid() == true or be nullptr.
     *  MIN and MAX values will be overwritten by kOPT.
     *  @return True if the calibration profile was set correctly.
     *  */
    
    
    //!
    //!
    //!
    public native @Cast("bool") @NoException(true) boolean setCalibrationProfile(@Const IOptimizationProfile profile);

    /**
     *  \brief Get the current calibration profile.
     * 
     *  @return A pointer to the current calibration profile or nullptr if calibration profile is unset.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @Const @NoException(true) IOptimizationProfile getCalibrationProfile();

    /**
     *  \brief Set the quantization flags.
     * 
     *  The flags are listed in the QuantizationFlag enum.
     *  The flags set configuration options to quantize the network in int8.
     * 
     *  @param flags The quantization flags.
     * 
     *  \note This function will override the previous set flags, rather than bitwise ORing the new flag.
     * 
     *  @see getQuantizationFlags()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) void setQuantizationFlags(@Cast("nvinfer1::QuantizationFlags") int flags);

    /**
     *  \brief Get the quantization flags.
     * 
     *  @return The quantization flags as a bitmask.
     * 
     *  @see setQuantizationFlag()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Cast("nvinfer1::QuantizationFlags") @NoException(true) int getQuantizationFlags();

    /**
     *  \brief clear a quantization flag.
     * 
     *  Clears the quantization flag from the enabled quantization flags.
     * 
     *  @see setQuantizationFlags()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) void clearQuantizationFlag(QuantizationFlag flag);
    public native @NoException(true) void clearQuantizationFlag(@Cast("nvinfer1::QuantizationFlag") int flag);

    /**
     *  \brief Set a single quantization flag.
     * 
     *  Add the input quantization flag to the already enabled quantization flags.
     * 
     *  @see setQuantizationFlags()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) void setQuantizationFlag(QuantizationFlag flag);
    public native @NoException(true) void setQuantizationFlag(@Cast("nvinfer1::QuantizationFlag") int flag);

    /**
     *  \brief Returns true if the quantization flag is set.
     * 
     *  @see getQuantizationFlags()
     * 
     *  @return True if quantization flag is set, false if unset.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    public native @Cast("bool") @NoException(true) boolean getQuantizationFlag(QuantizationFlag flag);
    public native @Cast("bool") @NoException(true) boolean getQuantizationFlag(@Cast("nvinfer1::QuantizationFlag") int flag);

    /**
     *  \brief Set tactic sources.
     * 
     *  This bitset controls which tactic sources TensorRT is allowed to use for tactic
     *  selection.
     * 
     *  By default, kCUBLAS and kCUDNN are always enabled. kCUBLAS_LT is enabled for x86
     *  platforms as well as non-x86 platforms when CUDA >= 11.0.
     * 
     *  Multiple tactic sources may be combined with a bitwise OR operation. For example,
     *  to enable cublas and cublasLt as tactic sources, use a value of:
     * 
     *  1U << static_cast<uint32_t>(TacticSource::kCUBLAS) | 1U <<
     *  static_cast<uint32_t>(TacticSource::kCUBLAS_LT)
     * 
     *  @see getTacticSources
     * 
     *  @return true if the tactic sources in the build configuration were updated.
     *          The tactic sources in the build configuration will not be updated if the provided value is invalid.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @Cast("bool") @NoException(true) boolean setTacticSources(@Cast("nvinfer1::TacticSources") int tacticSources);

    /**
     *  \brief Get tactic sources.
     * 
     *  Get the tactic sources currently set in the engine build
     *  configuration.
     * 
     *  @see setTacticSources
     * 
     *  @return tactic sources
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @Cast("nvinfer1::TacticSources") @NoException(true) int getTacticSources();

    /**
     *  \brief Create timing cache
     * 
     *  Create ITimingCache instance from serialized raw data. The created timing cache doesn’t belong to
     *  a specific IBuilderConfig. It can be shared by multiple builder instances. Call setTimingCache()
     *  before launching a builder to attach cache to builder instance.
     * 
     *  @param blob A pointer to the raw data that contains serialized timing cache
     *  @param size The size in bytes of the serialized timing cache. Size 0 means create a new cache from scratch
     * 
     *  @see setTimingCache
     * 
     *  @return the pointer to ITimingCache created
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) ITimingCache createTimingCache(@Const Pointer blob, @Cast("std::size_t") long size);

    /**
     *  \brief Attach a timing cache to IBuilderConfig
     * 
     *  The timing cache has verification header to make sure the provided cache can be used in current environment.
     *  A failure will be reported if the CUDA device property in the provided cache is different from current
     *  environment. ignoreMismatch = true skips strict verification and allows loading cache created from a different
     *  device.
     * 
     *  The cache must not be destroyed until after the engine is built.
     * 
     *  @param cache the timing cache to be used
     *  @param ignoreMismatch whether or not allow using a cache that contains different CUDA device property
     * 
     *  @return true if set successfully, false otherwise
     * 
     *  \warning Using cache generated from devices with different CUDA device properties may lead to
     *           functional/performance bugs.
     *  */
    
    
    //!
    //!
    //!
    public native @Cast("bool") @NoException(true) boolean setTimingCache(@Const @ByRef ITimingCache cache, @Cast("bool") boolean ignoreMismatch);

    /**
     *  \brief Get the pointer to the timing cache from current IBuilderConfig
     * 
     *  @return pointer to the timing cache used in current IBuilderConfig
     *  */
    public native @Const @NoException(true) ITimingCache getTimingCache();
}
