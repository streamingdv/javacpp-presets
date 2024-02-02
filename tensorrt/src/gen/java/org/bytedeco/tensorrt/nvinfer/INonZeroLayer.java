// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

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


/** \class INonZero
 * 
 *  \brief A NonZero layer in a network.
 * 
 *  This layer gets the positions of elements that are non-zero in the input.
 *  For boolean input, "non-zero" means "true". Semantics are similar to ONNX NonZero.
 * 
 *  The input may have type kFLOAT, kHALF, kINT32, or kBOOL.
 * 
 *  The output is a matrix of type kINT32.
 *  For an input with dimensions [L1, L2, ..., Lm], the output has dimensions [m,n],
 *  where n is the number of non-zero elements. I.e., each column denotes a m-D position.
 * 
 *  The columns are lexically ordered.
 *  E.g., a column with [3,2,4,7] precedes a column with [3,2,5,6].
 * 
 *  Tip: "compress" can be implemented with INonZero+IShuffle+Gather.
 *  For example, to compress a tensor x over axis k using mask vector v,
 *  use nonzero(v) to compute the subscripts, shuffle with reshape dimensions = [-1]
 *  to make the subscripts 1D, and then gather with the subscripts.
 *  */
@Namespace("nvinfer1") @NoOffset @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class INonZeroLayer extends ILayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public INonZeroLayer(Pointer p) { super(p); }

}
