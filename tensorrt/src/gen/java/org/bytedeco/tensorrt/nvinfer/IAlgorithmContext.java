// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

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
 *  \class IAlgorithmContext
 * 
 *  \brief Describes the context and requirements, that could be fulfilled by one or more instances of IAlgorithm.
 *  @see IAlgorithm
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IAlgorithmContext extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IAlgorithmContext(Pointer p) { super(p); }

    /**
     *  \brief Return name of the algorithm node.
     *  This is a unique identifier for the IAlgorithmContext.
     *  */
    
    
    //!
    //!
    public native String getName();

    /**
     *  \brief Get the minimum / optimum / maximum dimensions for input or output tensor.
     *  @param index Index of the input or output of the algorithm. Incremental numbers assigned to indices of inputs
     *               and the outputs.
     *  @param select Which of the minimum, optimum, or maximum dimensions to be queried.
     *  */
    
    
    //!
    //!
    public native @ByVal Dims getDimensions(int index, OptProfileSelector select);
    public native @ByVal Dims getDimensions(int index, @Cast("nvinfer1::OptProfileSelector") int select);

    /**
     *  \brief Return number of inputs of the algorithm.
     *  */
    
    
    //!
    //!
    public native int getNbInputs();

    /**
     *  \brief Return number of outputs of the algorithm.
     *  */
    public native int getNbOutputs();
}
