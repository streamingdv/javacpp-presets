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
 *  \class IGatherLayer
 * 
 *  \brief A Gather layer in a network definition. Supports several kinds of gathering.
 * 
 *  The Gather layer has two input tensors, Data and Indices, and an output tensor Output.
 *  Additionally, there are three parameters: mode, nbElementwiseDims, and axis that control
 *  how the indices are interpreted.
 * 
 *  * Data is a tensor of rank r >= 1 that stores the values to be gathered in Output.
 *  * Indices is a tensor of rank q >= 1 that determines which locations in Data to gather.
 *      * GatherMode::kDEFAULT: q >= 1
 *      * GatherMode::kND:      q >= 1 and the last dimension of Indices must be a build time constant.
 *      * GatherMode::kELEMENT: q = r
 *  * Output stores the gathered results. Its rank s depends on the mode:
 *      * GatherMode::kDEFAULT: s = q + r - 1 - nbElementwiseDims
 *      * GatherMode::kND:      s = q + r - indices.d[q-1] - 1 - nbElementwiseDims
 *      * GatherMode::kELEMENT: s = q = r.
 *  The output can be a shape tensor only if the mode is GatherMode::kDEFAULT.
 * 
 *  The dimensions of the output likewise depends on the mode:
 * 
 *      GatherMode::kDEFAULT:
 * 
 *          First nbElementwiseDims of output are computed by applying broadcast rules to
 *          first nbElementwiseDims of indices and data. Note that nbElementwiseDims <= 1.
 *          Rest of dimensions are computed by copying dimensions of Data, and replacing
 *          the dimension for axis gatherAxis with the dimensions of indices.
 * 
 *      GatherMode::kND:
 *          If indices.d[q-1] = r - nbElementwiseDims
 *              output.d = [indices.d[0], ... , indices.d[q-2]]
 *          Else if indices.d[q-1] < r - nbElementWiseDims
 *              output.d = [indices.d[0], ... , indices.d[q-1], data.d[nbElementwiseDims + indices.d[q-1] + q],
 *              data.d[r-1]]
 *          Else
 *              This is build time error
 * 
 *      GatherMode::kELEMENT:
 *          The output dimensions match the dimensions of the indices tensor.
 * 
 *  The types of Data and Output must be the same, and Indices shall be DataType::kINT32.
 * 
 *  How the elements of Data are gathered depends on the mode:
 * 
 *      GatherMode::kDEFAULT:
 *          Each index in indices is used to index Data along axis gatherAxis.
 * 
 *      GatherMode::kND:
 *          Indices is a rank q integer tensor, best thought of as a rank (q-1) tensor of
 *          indices into data, where each element defines a slice of data
 *          The operation can be formulated as output[i_1, ..., i_{q-1}] = data[indices[i_1, ..., i_{q-1}]]
 * 
 *      GatherMode::kELEMENT:
 * 
 *          Here "axis" denotes the result of getGatherAxis().
 *          For each element X of indices:
 *              Let J denote a sequence for the subscripts of X
 *              Let K = sequence J with element [axis] replaced by X
 *              output[J] = data[K]
 * 
 *  The handling of nbElementWiseDims depends on the mode:
 *      * GatherMode::kDEFAULT: nbElementWiseDims <= 1. Broadcast is supported across the elementwise dimension if
 *      present.
 *      * GatherMode::kND:      0 <= nbElementWiseDims < rank(Data)-1. Broadcast is not supported across the elementwise
 *      dimensions.
 *      * GatherMode::kELEMENT: nbElementWiseDims = 0
 * 
 *  Notes:
 *  * For modes GatherMode::kND and GatherMode::kELEMENT, the first nbElementWiseDims dimensions of data and index must
 *  be equal. If not, an error will be reported at build time or run time.
 *  * Only mode GatherMode::kDEFAULT supports an implicit batch dimensions or broadcast on the elementwise dimensions.
 *  * If an axis of Data has dynamic length, using a negative index for it has undefined behavior.
 *  * No DLA support
 *  * Zero will be stored for OOB access
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvinfer1") @NoOffset @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IGatherLayer extends ILayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IGatherLayer(Pointer p) { super(p); }

    /**
     *  \brief Set the axis used by GatherMode::kELEMENTS and GatherMode::kDEFAULT
     *  The axis must be less than the number of dimensions in the data input.
     *  The axis defaults to 0.
     * 
     *  \warning Undefined behavior when used with GatherMode::kND.
     * 
     *  @see getGatherAxis()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) void setGatherAxis(int axis);

    /**
     *  \brief Get the axis to gather on.
     *  \warning Undefined behavior when used with GatherMode::kND.
     * 
     *  @see setGatherAxis()
     *  */
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) int getGatherAxis();

    /** \brief Set the number of leading dimensions of indices tensor to be handled elementwise.
     *  The gathering of indexing starts from the dimension of data[NbElementWiseDims:].
     *  The NbElementWiseDims must be less than the Rank of the data input.
     *  @param elementWiseDims number of dims to be handled as elementwise.
     * 
     *  Default: 0
     * 
     *  The value of nbElementWiseDims and GatherMode are checked during network validation:
     * 
     *  GatherMode::kDEFAULT: nbElementWiseDims must be 0 if there is an implicit batch dimension. It can be 0 or 1 if
     *  there is not an implicit batch dimension.
     *  GatherMode::kND: nbElementWiseDims can be between 0 and one less than rank(data).
     *  GatherMode::kELEMENT: nbElementWiseDims must be 0
     * 
     *  @see getNbElementWiseDims()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) void setNbElementWiseDims(int elementWiseDims);

    /**
     *  \brief Get the number of leading dimensions of indices tensor to be handled elementwise.
     * 
     *  @see setNbElementWiseDims()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) int getNbElementWiseDims();

    /**
     *  \brief Set the gather mode.
     * 
     *  @see getMode()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) void setMode(GatherMode mode);
    public native @NoException(true) void setMode(@Cast("nvinfer1::GatherMode") int mode);

    /**
     *  \brief Get the gather mode.
     * 
     *  @see setMode()
     *  */
    public native @NoException(true) GatherMode getMode();
}
