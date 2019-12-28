// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_ml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;

import static org.bytedeco.opencv.global.opencv_ml.*;


/****************************************************************************************\
*                                 Normal Bayes Classifier                                *
\****************************************************************************************/

/** \brief Bayes classifier for normally distributed data.
<p>
@see \ref ml_intro_bayes
 */
@Namespace("cv::ml") @Properties(inherit = org.bytedeco.opencv.presets.opencv_ml.class)
public class NormalBayesClassifier extends StatModel {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NormalBayesClassifier(Pointer p) { super(p); }

    /** \brief Predicts the response for sample(s).
    <p>
    The method estimates the most probable classes for input vectors. Input vectors (one or more)
    are stored as rows of the matrix inputs. In case of multiple input vectors, there should be one
    output vector outputs. The predicted class for a single input vector is returned by the method.
    The vector outputProbs contains the output probabilities corresponding to each element of
    result.
     */
    public native float predictProb( @ByVal Mat inputs, @ByVal Mat outputs,
                                   @ByVal Mat outputProbs, int flags/*=0*/ );
    public native float predictProb( @ByVal Mat inputs, @ByVal Mat outputs,
                                   @ByVal Mat outputProbs );
    public native float predictProb( @ByVal UMat inputs, @ByVal UMat outputs,
                                   @ByVal UMat outputProbs, int flags/*=0*/ );
    public native float predictProb( @ByVal UMat inputs, @ByVal UMat outputs,
                                   @ByVal UMat outputProbs );
    public native float predictProb( @ByVal GpuMat inputs, @ByVal GpuMat outputs,
                                   @ByVal GpuMat outputProbs, int flags/*=0*/ );
    public native float predictProb( @ByVal GpuMat inputs, @ByVal GpuMat outputs,
                                   @ByVal GpuMat outputProbs );

    /** Creates empty model
    Use StatModel::train to train the model after creation. */
    public static native @Ptr NormalBayesClassifier create();

    /** \brief Loads and creates a serialized NormalBayesClassifier from a file
     *
     * Use NormalBayesClassifier::save to serialize and store an NormalBayesClassifier to disk.
     * Load the NormalBayesClassifier from this file again, by calling this function with the path to the file.
     * Optionally specify the node for the file containing the classifier
     *
     * @param filepath path to serialized NormalBayesClassifier
     * @param nodeName name of node containing the classifier
     */
    public static native @Ptr NormalBayesClassifier load(@Str BytePointer filepath, @Str BytePointer nodeName/*=cv::String()*/);
    public static native @Ptr NormalBayesClassifier load(@Str BytePointer filepath);
    public static native @Ptr NormalBayesClassifier load(@Str String filepath, @Str String nodeName/*=cv::String()*/);
    public static native @Ptr NormalBayesClassifier load(@Str String filepath);
}
