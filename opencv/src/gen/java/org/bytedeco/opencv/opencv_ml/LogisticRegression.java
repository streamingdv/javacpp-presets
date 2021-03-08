// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_ml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;

import static org.bytedeco.opencv.global.opencv_ml.*;

// #endif

/****************************************************************************************\
*                           Logistic Regression                                          *
\****************************************************************************************/

/** \brief Implements Logistic Regression classifier.
<p>
@see \ref ml_intro_lr
 */
@Namespace("cv::ml") @Properties(inherit = org.bytedeco.opencv.presets.opencv_ml.class)
public class LogisticRegression extends StatModel {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LogisticRegression(Pointer p) { super(p); }


    /** Learning rate. */
    /** @see setLearningRate */
    public native double getLearningRate();
    /** \copybrief getLearningRate @see getLearningRate */
    public native void setLearningRate(double val);

    /** Number of iterations. */
    /** @see setIterations */
    public native int getIterations();
    /** \copybrief getIterations @see getIterations */
    public native void setIterations(int val);

    /** Kind of regularization to be applied. See LogisticRegression::RegKinds. */
    /** @see setRegularization */
    public native int getRegularization();
    /** \copybrief getRegularization @see getRegularization */
    public native void setRegularization(int val);

    /** Kind of training method used. See LogisticRegression::Methods. */
    /** @see setTrainMethod */
    public native int getTrainMethod();
    /** \copybrief getTrainMethod @see getTrainMethod */
    public native void setTrainMethod(int val);

    /** Specifies the number of training samples taken in each step of Mini-Batch Gradient
    Descent. Will only be used if using LogisticRegression::MINI_BATCH training algorithm. It
    has to take values less than the total number of training samples. */
    /** @see setMiniBatchSize */
    public native int getMiniBatchSize();
    /** \copybrief getMiniBatchSize @see getMiniBatchSize */
    public native void setMiniBatchSize(int val);

    /** Termination criteria of the algorithm. */
    /** @see setTermCriteria */
    public native @ByVal TermCriteria getTermCriteria();
    /** \copybrief getTermCriteria @see getTermCriteria */
    public native void setTermCriteria(@ByVal TermCriteria val);

    /** Regularization kinds */
    /** enum cv::ml::LogisticRegression::RegKinds */
    public static final int
        /** Regularization disabled */
        REG_DISABLE = -1,
        /** %L1 norm */
        REG_L1 = 0,
        /** %L2 norm */
        REG_L2 = 1;

    /** Training methods */
    /** enum cv::ml::LogisticRegression::Methods */
    public static final int
        BATCH = 0,
        /** Set MiniBatchSize to a positive integer when using this method. */
        MINI_BATCH = 1;

    /** \brief Predicts responses for input samples and returns a float type.
    <p>
    @param samples The input data for the prediction algorithm. Matrix [m x n], where each row
        contains variables (features) of one object being classified. Should have data type CV_32F.
    @param results Predicted labels as a column matrix of type CV_32S.
    @param flags Not used.
     */
    public native @Override float predict( @ByVal Mat samples, @ByVal(nullValue = "cv::OutputArray(cv::noArray())") Mat results, int flags/*=0*/ );
    public native float predict( @ByVal Mat samples );
    public native @Override float predict( @ByVal UMat samples, @ByVal(nullValue = "cv::OutputArray(cv::noArray())") UMat results, int flags/*=0*/ );
    public native float predict( @ByVal UMat samples );
    public native @Override float predict( @ByVal GpuMat samples, @ByVal(nullValue = "cv::OutputArray(cv::noArray())") GpuMat results, int flags/*=0*/ );
    public native float predict( @ByVal GpuMat samples );

    /** \brief This function returns the trained parameters arranged across rows.
    <p>
    For a two class classification problem, it returns a row matrix. It returns learnt parameters of
    the Logistic Regression as a matrix of type CV_32F.
     */
    public native @ByVal Mat get_learnt_thetas();

    /** \brief Creates empty model.
    <p>
    Creates Logistic Regression model with parameters given.
     */
    public static native @Ptr LogisticRegression create();

    /** \brief Loads and creates a serialized LogisticRegression from a file
     *
     * Use LogisticRegression::save to serialize and store an LogisticRegression to disk.
     * Load the LogisticRegression from this file again, by calling this function with the path to the file.
     * Optionally specify the node for the file containing the classifier
     *
     * @param filepath path to serialized LogisticRegression
     * @param nodeName name of node containing the classifier
     */
    public static native @Ptr LogisticRegression load(@Str BytePointer filepath, @Str BytePointer nodeName/*=cv::String()*/);
    public static native @Ptr LogisticRegression load(@Str BytePointer filepath);
    public static native @Ptr LogisticRegression load(@Str String filepath, @Str String nodeName/*=cv::String()*/);
    public static native @Ptr LogisticRegression load(@Str String filepath);
}
