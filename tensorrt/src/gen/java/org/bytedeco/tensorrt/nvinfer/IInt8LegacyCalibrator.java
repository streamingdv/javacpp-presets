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
 *  Legacy calibrator left for backward compatibility with TensorRT 2.0. This calibrator requires user parameterization,
 *  and is provided as a fallback option if the other calibrators yield poor results.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IInt8LegacyCalibrator extends IInt8Calibrator {
    static { Loader.load(); }
    /** Default native constructor. */
    public IInt8LegacyCalibrator() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IInt8LegacyCalibrator(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IInt8LegacyCalibrator(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IInt8LegacyCalibrator position(long position) {
        return (IInt8LegacyCalibrator)super.position(position);
    }
    @Override public IInt8LegacyCalibrator getPointer(long i) {
        return new IInt8LegacyCalibrator((Pointer)this).offsetAddress(i);
    }

    /**
     *  Signal that this is the legacy calibrator.
     *  */
    
    
    //!
    //!
    //!
    @Virtual public native @NoException(true) CalibrationAlgoType getAlgorithm();

    /**
     *  \brief The quantile (between 0 and 1) that will be used to select the region maximum when the quantile method
     *  is in use.
     * 
     *  See the user guide for more details on how the quantile is used.
     *  */
    
    
    //!
    //!
    //!
    @Virtual(true) public native @NoException(true) @Const({false, false, true}) double getQuantile();

    /**
     *  \brief The fraction (between 0 and 1) of the maximum used to define the regression cutoff when using regression
     *  to determine the region maximum.
     * 
     *  See the user guide for more details on how the regression cutoff is used
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    @Virtual(true) public native @NoException(true) @Const({false, false, true}) double getRegressionCutoff();

    /**
     *  \brief Load a histogram.
     * 
     *  Histogram generation is potentially expensive, so it can be useful to generate the histograms once, then use
     *  them when exploring the space of calibrations. The histograms should be regenerated if the network structure
     *  changes, or the input data set changes, and it is the responsibility of the application to ensure this.
     * 
     *  @param length The length of the cached data, that should be set by the called function. If there is no data,
     *  this should be zero.
     * 
     *  @return A pointer to the cache, or nullptr if there is no data.
     *  */
    
    
    //!
    //!
    //!
    //!
    @Virtual(true) public native @Const @NoException(true) Pointer readHistogramCache(@Cast("std::size_t*") @ByRef LongPointer length);

    /**
     *  \brief Save a histogram cache.
     * 
     *  @param ptr A pointer to the data to cache.
     *  @param length The length in bytes of the data to cache.
     * 
     *  @see readHistogramCache()
     *  */
    @Virtual(true) public native @NoException(true) void writeHistogramCache(@Const Pointer ptr, @Cast("std::size_t") long length);
}
