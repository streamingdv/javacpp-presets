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
*                                   Support Vector Machines                              *
\****************************************************************************************/

/** \brief Support Vector Machines.
<p>
@see \ref ml_intro_svm
 */
@Namespace("cv::ml") @Properties(inherit = org.bytedeco.opencv.presets.opencv_ml.class)
public class SVM extends StatModel {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SVM(Pointer p) { super(p); }


    public static class Kernel extends Algorithm {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Kernel(Pointer p) { super(p); }
    
        public native int getType();
        public native void calc( int vcount, int n, @Const FloatPointer vecs, @Const FloatPointer another, FloatPointer results );
        public native void calc( int vcount, int n, @Const FloatBuffer vecs, @Const FloatBuffer another, FloatBuffer results );
        public native void calc( int vcount, int n, @Const float[] vecs, @Const float[] another, float[] results );
    }

    /** Type of a %SVM formulation.
    See SVM::Types. Default value is SVM::C_SVC. */
    /** @see setType */
    public native int getType();
    /** \copybrief getType @see getType */
    public native void setType(int val);

    /** Parameter {@code \gamma} of a kernel function.
    For SVM::POLY, SVM::RBF, SVM::SIGMOID or SVM::CHI2. Default value is 1. */
    /** @see setGamma */
    public native double getGamma();
    /** \copybrief getGamma @see getGamma */
    public native void setGamma(double val);

    /** Parameter _coef0_ of a kernel function.
    For SVM::POLY or SVM::SIGMOID. Default value is 0.*/
    /** @see setCoef0 */
    public native double getCoef0();
    /** \copybrief getCoef0 @see getCoef0 */
    public native void setCoef0(double val);

    /** Parameter _degree_ of a kernel function.
    For SVM::POLY. Default value is 0. */
    /** @see setDegree */
    public native double getDegree();
    /** \copybrief getDegree @see getDegree */
    public native void setDegree(double val);

    /** Parameter _C_ of a %SVM optimization problem.
    For SVM::C_SVC, SVM::EPS_SVR or SVM::NU_SVR. Default value is 0. */
    /** @see setC */
    public native double getC();
    /** \copybrief getC @see getC */
    public native void setC(double val);

    /** Parameter {@code \nu} of a %SVM optimization problem.
    For SVM::NU_SVC, SVM::ONE_CLASS or SVM::NU_SVR. Default value is 0. */
    /** @see setNu */
    public native double getNu();
    /** \copybrief getNu @see getNu */
    public native void setNu(double val);

    /** Parameter {@code \epsilon} of a %SVM optimization problem.
    For SVM::EPS_SVR. Default value is 0. */
    /** @see setP */
    public native double getP();
    /** \copybrief getP @see getP */
    public native void setP(double val);

    /** Optional weights in the SVM::C_SVC problem, assigned to particular classes.
    They are multiplied by _C_ so the parameter _C_ of class _i_ becomes {@code classWeights(i) * C}. Thus
    these weights affect the misclassification penalty for different classes. The larger weight,
    the larger penalty on misclassification of data from the corresponding class. Default value is
    empty Mat. */
    /** @see setClassWeights */
    public native @ByVal Mat getClassWeights();
    /** \copybrief getClassWeights @see getClassWeights */
    public native void setClassWeights(@Const @ByRef Mat val);

    /** Termination criteria of the iterative %SVM training procedure which solves a partial
    case of constrained quadratic optimization problem.
    You can specify tolerance and/or the maximum number of iterations. Default value is
    {@code TermCriteria( TermCriteria::MAX_ITER + TermCriteria::EPS, 1000, FLT_EPSILON )}; */
    /** @see setTermCriteria */
    public native @ByVal TermCriteria getTermCriteria();
    /** \copybrief getTermCriteria @see getTermCriteria */
    public native void setTermCriteria(@Const @ByRef TermCriteria val);

    /** Type of a %SVM kernel.
    See SVM::KernelTypes. Default value is SVM::RBF. */
    public native int getKernelType();

    /** Initialize with one of predefined kernels.
    See SVM::KernelTypes. */
    public native void setKernel(int kernelType);

    /** Initialize with custom kernel.
    See SVM::Kernel class for implementation details */
    public native void setCustomKernel(@Ptr Kernel _kernel);

    /** %SVM type */
    /** enum cv::ml::SVM::Types */
    public static final int
        /** C-Support Vector Classification. n-class classification (n {@code \geq} 2), allows
        imperfect separation of classes with penalty multiplier C for outliers. */
        C_SVC = 100,
        /** {@code \nu}-Support Vector Classification. n-class classification with possible
        imperfect separation. Parameter {@code \nu} (in the range 0..1, the larger the value, the smoother
        the decision boundary) is used instead of C. */
        NU_SVC = 101,
        /** Distribution Estimation (One-class %SVM). All the training data are from
        the same class, %SVM builds a boundary that separates the class from the rest of the feature
        space. */
        ONE_CLASS = 102,
        /** {@code \epsilon}-Support Vector Regression. The distance between feature vectors
        from the training set and the fitting hyper-plane must be less than p. For outliers the
        penalty multiplier C is used. */
        EPS_SVR = 103,
        /** {@code \nu}-Support Vector Regression. {@code \nu} is used instead of p.
        See \cite LibSVM for details. */
        NU_SVR = 104;

    /** \brief %SVM kernel type
    <p>
    A comparison of different kernels on the following 2D test case with four classes. Four
    SVM::C_SVC SVMs have been trained (one against rest) with auto_train. Evaluation on three
    different kernels (SVM::CHI2, SVM::INTER, SVM::RBF). The color depicts the class with max score.
    Bright means max-score \> 0, dark means max-score \< 0.
    ![image](pics/SVM_Comparison.png)
    */
    /** enum cv::ml::SVM::KernelTypes */
    public static final int
        /** Returned by SVM::getKernelType in case when custom kernel has been set */
        CUSTOM = -1,
        /** Linear kernel. No mapping is done, linear discrimination (or regression) is
        done in the original feature space. It is the fastest option. {@code K(x_i, x_j) = x_i^T x_j}. */
        LINEAR = 0,
        /** Polynomial kernel:
        {@code K(x_i, x_j) = (\gamma x_i^T x_j + coef0)^{degree}, \gamma > 0}. */
        POLY = 1,
        /** Radial basis function (RBF), a good choice in most cases.
        {@code K(x_i, x_j) = e^{-\gamma ||x_i - x_j||^2}, \gamma > 0}. */
        RBF = 2,
        /** Sigmoid kernel: {@code K(x_i, x_j) = \tanh(\gamma x_i^T x_j + coef0)}. */
        SIGMOID = 3,
        /** Exponential Chi2 kernel, similar to the RBF kernel:
        {@code K(x_i, x_j) = e^{-\gamma \chi^2(x_i,x_j)}, \chi^2(x_i,x_j) = (x_i-x_j)^2/(x_i+x_j), \gamma > 0}. */
        CHI2 = 4,
        /** Histogram intersection kernel. A fast kernel. {@code K(x_i, x_j) = min(x_i,x_j)}. */
        INTER = 5;

    /** %SVM params type */
    /** enum cv::ml::SVM::ParamTypes */
    public static final int
        C = 0,
        GAMMA = 1,
        P = 2,
        NU = 3,
        COEF = 4,
        DEGREE = 5;

    /** \brief Trains an %SVM with optimal parameters.
    <p>
    @param data the training data that can be constructed using TrainData::create or
        TrainData::loadFromCSV.
    @param kFold Cross-validation parameter. The training set is divided into kFold subsets. One
        subset is used to test the model, the others form the train set. So, the %SVM algorithm is
        executed kFold times.
    @param Cgrid grid for C
    @param gammaGrid grid for gamma
    @param pGrid grid for p
    @param nuGrid grid for nu
    @param coeffGrid grid for coeff
    @param degreeGrid grid for degree
    @param balanced If true and the problem is 2-class classification then the method creates more
        balanced cross-validation subsets that is proportions between classes in subsets are close
        to such proportion in the whole train dataset.
    <p>
    The method trains the %SVM model automatically by choosing the optimal parameters C, gamma, p,
    nu, coef0, degree. Parameters are considered optimal when the cross-validation
    estimate of the test set error is minimal.
    <p>
    If there is no need to optimize a parameter, the corresponding grid step should be set to any
    value less than or equal to 1. For example, to avoid optimization in gamma, set {@code gammaGrid.step
    = 0}, {@code gammaGrid.minVal}, {@code gamma_grid.maxVal} as arbitrary numbers. In this case, the value
    {@code Gamma} is taken for gamma.
    <p>
    And, finally, if the optimization in a parameter is required but the corresponding grid is
    unknown, you may call the function SVM::getDefaultGrid. To generate a grid, for example, for
    gamma, call {@code SVM::getDefaultGrid(SVM::GAMMA)}.
    <p>
    This function works for the classification (SVM::C_SVC or SVM::NU_SVC) as well as for the
    regression (SVM::EPS_SVR or SVM::NU_SVR). If it is SVM::ONE_CLASS, no optimization is made and
    the usual %SVM with parameters specified in params is executed.
     */
    public native @Cast("bool") boolean trainAuto( @Ptr TrainData data, int kFold/*=10*/,
                        @ByVal(nullValue = "cv::ml::ParamGrid(cv::ml::SVM::getDefaultGrid(cv::ml::SVM::C))") ParamGrid Cgrid,
                        @ByVal(nullValue = "cv::ml::ParamGrid(cv::ml::SVM::getDefaultGrid(cv::ml::SVM::GAMMA))") ParamGrid gammaGrid,
                        @ByVal(nullValue = "cv::ml::ParamGrid(cv::ml::SVM::getDefaultGrid(cv::ml::SVM::P))") ParamGrid pGrid,
                        @ByVal(nullValue = "cv::ml::ParamGrid(cv::ml::SVM::getDefaultGrid(cv::ml::SVM::NU))") ParamGrid nuGrid,
                        @ByVal(nullValue = "cv::ml::ParamGrid(cv::ml::SVM::getDefaultGrid(cv::ml::SVM::COEF))") ParamGrid coeffGrid,
                        @ByVal(nullValue = "cv::ml::ParamGrid(cv::ml::SVM::getDefaultGrid(cv::ml::SVM::DEGREE))") ParamGrid degreeGrid,
                        @Cast("bool") boolean balanced/*=false*/);
    public native @Cast("bool") boolean trainAuto( @Ptr TrainData data);

    /** \brief Trains an %SVM with optimal parameters
    <p>
    @param samples training samples
    @param layout See ml::SampleTypes.
    @param responses vector of responses associated with the training samples.
    @param kFold Cross-validation parameter. The training set is divided into kFold subsets. One
        subset is used to test the model, the others form the train set. So, the %SVM algorithm is
    @param Cgrid grid for C
    @param gammaGrid grid for gamma
    @param pGrid grid for p
    @param nuGrid grid for nu
    @param coeffGrid grid for coeff
    @param degreeGrid grid for degree
    @param balanced If true and the problem is 2-class classification then the method creates more
        balanced cross-validation subsets that is proportions between classes in subsets are close
        to such proportion in the whole train dataset.
    <p>
    The method trains the %SVM model automatically by choosing the optimal parameters C, gamma, p,
    nu, coef0, degree. Parameters are considered optimal when the cross-validation
    estimate of the test set error is minimal.
    <p>
    This function only makes use of SVM::getDefaultGrid for parameter optimization and thus only
    offers rudimentary parameter options.
    <p>
    This function works for the classification (SVM::C_SVC or SVM::NU_SVC) as well as for the
    regression (SVM::EPS_SVR or SVM::NU_SVR). If it is SVM::ONE_CLASS, no optimization is made and
    the usual %SVM with parameters specified in params is executed.
    */
    public native @Cast("bool") boolean trainAuto(@ByVal Mat samples,
                int layout,
                @ByVal Mat responses,
                int kFold/*=10*/,
                @Ptr ParamGrid Cgrid/*=cv::ml::SVM::getDefaultGridPtr(cv::ml::SVM::C)*/,
                @Ptr ParamGrid gammaGrid/*=cv::ml::SVM::getDefaultGridPtr(cv::ml::SVM::GAMMA)*/,
                @Ptr ParamGrid pGrid/*=cv::ml::SVM::getDefaultGridPtr(cv::ml::SVM::P)*/,
                @Ptr ParamGrid nuGrid/*=cv::ml::SVM::getDefaultGridPtr(cv::ml::SVM::NU)*/,
                @Ptr ParamGrid coeffGrid/*=cv::ml::SVM::getDefaultGridPtr(cv::ml::SVM::COEF)*/,
                @Ptr ParamGrid degreeGrid/*=cv::ml::SVM::getDefaultGridPtr(cv::ml::SVM::DEGREE)*/,
                @Cast("bool") boolean balanced/*=false*/);
    public native @Cast("bool") boolean trainAuto(@ByVal Mat samples,
                int layout,
                @ByVal Mat responses);
    public native @Cast("bool") boolean trainAuto(@ByVal UMat samples,
                int layout,
                @ByVal UMat responses,
                int kFold/*=10*/,
                @Ptr ParamGrid Cgrid/*=cv::ml::SVM::getDefaultGridPtr(cv::ml::SVM::C)*/,
                @Ptr ParamGrid gammaGrid/*=cv::ml::SVM::getDefaultGridPtr(cv::ml::SVM::GAMMA)*/,
                @Ptr ParamGrid pGrid/*=cv::ml::SVM::getDefaultGridPtr(cv::ml::SVM::P)*/,
                @Ptr ParamGrid nuGrid/*=cv::ml::SVM::getDefaultGridPtr(cv::ml::SVM::NU)*/,
                @Ptr ParamGrid coeffGrid/*=cv::ml::SVM::getDefaultGridPtr(cv::ml::SVM::COEF)*/,
                @Ptr ParamGrid degreeGrid/*=cv::ml::SVM::getDefaultGridPtr(cv::ml::SVM::DEGREE)*/,
                @Cast("bool") boolean balanced/*=false*/);
    public native @Cast("bool") boolean trainAuto(@ByVal UMat samples,
                int layout,
                @ByVal UMat responses);
    public native @Cast("bool") boolean trainAuto(@ByVal GpuMat samples,
                int layout,
                @ByVal GpuMat responses,
                int kFold/*=10*/,
                @Ptr ParamGrid Cgrid/*=cv::ml::SVM::getDefaultGridPtr(cv::ml::SVM::C)*/,
                @Ptr ParamGrid gammaGrid/*=cv::ml::SVM::getDefaultGridPtr(cv::ml::SVM::GAMMA)*/,
                @Ptr ParamGrid pGrid/*=cv::ml::SVM::getDefaultGridPtr(cv::ml::SVM::P)*/,
                @Ptr ParamGrid nuGrid/*=cv::ml::SVM::getDefaultGridPtr(cv::ml::SVM::NU)*/,
                @Ptr ParamGrid coeffGrid/*=cv::ml::SVM::getDefaultGridPtr(cv::ml::SVM::COEF)*/,
                @Ptr ParamGrid degreeGrid/*=cv::ml::SVM::getDefaultGridPtr(cv::ml::SVM::DEGREE)*/,
                @Cast("bool") boolean balanced/*=false*/);
    public native @Cast("bool") boolean trainAuto(@ByVal GpuMat samples,
                int layout,
                @ByVal GpuMat responses);

    /** \brief Retrieves all the support vectors
    <p>
    The method returns all the support vectors as a floating-point matrix, where support vectors are
    stored as matrix rows.
     */
    public native @ByVal Mat getSupportVectors();

    /** \brief Retrieves all the uncompressed support vectors of a linear %SVM
    <p>
    The method returns all the uncompressed support vectors of a linear %SVM that the compressed
    support vector, used for prediction, was derived from. They are returned in a floating-point
    matrix, where the support vectors are stored as matrix rows.
     */
    public native @ByVal Mat getUncompressedSupportVectors();

    /** \brief Retrieves the decision function
    <p>
    @param i the index of the decision function. If the problem solved is regression, 1-class or
        2-class classification, then there will be just one decision function and the index should
        always be 0. Otherwise, in the case of N-class classification, there will be {@code N(N-1)/2}
        decision functions.
    @param alpha the optional output vector for weights, corresponding to different support vectors.
        In the case of linear %SVM all the alpha's will be 1's.
    @param svidx the optional output vector of indices of support vectors within the matrix of
        support vectors (which can be retrieved by SVM::getSupportVectors). In the case of linear
        %SVM each decision function consists of a single "compressed" support vector.
    <p>
    The method returns rho parameter of the decision function, a scalar subtracted from the weighted
    sum of kernel responses.
     */
    public native double getDecisionFunction(int i, @ByVal Mat alpha, @ByVal Mat svidx);
    public native double getDecisionFunction(int i, @ByVal UMat alpha, @ByVal UMat svidx);
    public native double getDecisionFunction(int i, @ByVal GpuMat alpha, @ByVal GpuMat svidx);

    /** \brief Generates a grid for %SVM parameters.
    <p>
    @param param_id %SVM parameters IDs that must be one of the SVM::ParamTypes. The grid is
    generated for the parameter with this ID.
    <p>
    The function generates a grid for the specified parameter of the %SVM algorithm. The grid may be
    passed to the function SVM::trainAuto.
     */
    public static native @ByVal ParamGrid getDefaultGrid( int param_id );

    /** \brief Generates a grid for %SVM parameters.
    <p>
    @param param_id %SVM parameters IDs that must be one of the SVM::ParamTypes. The grid is
    generated for the parameter with this ID.
    <p>
    The function generates a grid pointer for the specified parameter of the %SVM algorithm.
    The grid may be passed to the function SVM::trainAuto.
     */
    public static native @Ptr ParamGrid getDefaultGridPtr( int param_id );

    /** Creates empty model.
    Use StatModel::train to train the model. Since %SVM has several parameters, you may want to
    find the best parameters for your problem, it can be done with SVM::trainAuto. */
    public static native @Ptr SVM create();

    /** \brief Loads and creates a serialized svm from a file
     *
     * Use SVM::save to serialize and store an SVM to disk.
     * Load the SVM from this file again, by calling this function with the path to the file.
     *
     * @param filepath path to serialized svm
     */
    public static native @Ptr SVM load(@Str BytePointer filepath);
    public static native @Ptr SVM load(@Str String filepath);
}
