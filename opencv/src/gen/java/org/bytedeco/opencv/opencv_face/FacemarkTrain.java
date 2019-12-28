// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_face;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;
import org.bytedeco.opencv.opencv_objdetect.*;
import static org.bytedeco.opencv.global.opencv_objdetect.*;
import org.bytedeco.opencv.opencv_photo.*;
import static org.bytedeco.opencv.global.opencv_photo.*;

import static org.bytedeco.opencv.global.opencv_face.*;


/** \brief Abstract base class for trainable facemark models
<p>
To utilize this API in your program, please take a look at the \ref tutorial_table_of_content_facemark
### Description
<p>
The AAM and LBF facemark models in OpenCV are derived from the abstract base class FacemarkTrain, which
provides a unified access to those facemark algorithms in OpenCV.
<p>
Here is an example on how to declare facemark algorithm:
<pre>{@code
// Using Facemark in your code:
Ptr<Facemark> facemark = FacemarkLBF::create();
}</pre>
<p>
<p>
The typical pipeline for facemark detection is listed as follows:
- (Non-mandatory) Set a user defined face detection using FacemarkTrain::setFaceDetector.
  The facemark algorithms are desgined to fit the facial points into a face.
  Therefore, the face information should be provided to the facemark algorithm.
  Some algorithms might provides a default face recognition function.
  However, the users might prefer to use their own face detector to obtains the best possible detection result.
- (Non-mandatory) Training the model for a specific algorithm using FacemarkTrain::training.
  In this case, the model should be automatically saved by the algorithm.
  If the user already have a trained model, then this part can be omitted.
- Load the trained model using Facemark::loadModel.
- Perform the fitting via the Facemark::fit.
*/
@Namespace("cv::face") @Properties(inherit = org.bytedeco.opencv.presets.opencv_face.class)
public class FacemarkTrain extends Facemark {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FacemarkTrain(Pointer p) { super(p); }

    /** \brief Add one training sample to the trainer.
    <p>
    @param image Input image.
    @param landmarks The ground-truth of facial landmarks points corresponds to the image.
    <p>
    <B>Example of usage</B>
    <pre>{@code
    String imageFiles = "../data/images_train.txt";
    String ptsFiles = "../data/points_train.txt";
    std::vector<String> images_train;
    std::vector<String> landmarks_train;

    // load the list of dataset: image paths and landmark file paths
    loadDatasetList(imageFiles,ptsFiles,images_train,landmarks_train);

    Mat image;
    std::vector<Point2f> facial_points;
    for(size_t i=0;i<images_train.size();i++){
        image = imread(images_train[i].c_str());
        loadFacePoints(landmarks_train[i],facial_points);
        facemark->addTrainingSample(image, facial_points);
    }
    }</pre>
    <p>
    The contents in the training files should follows the standard format.
    Here are examples for the contents in these files.
    example of content in the images_train.txt
    <pre>{@code
    /home/user/ibug/image_003_1.jpg
    /home/user/ibug/image_004_1.jpg
    /home/user/ibug/image_005_1.jpg
    /home/user/ibug/image_006.jpg
    }</pre>
    <p>
    example of content in the points_train.txt
    <pre>{@code
    /home/user/ibug/image_003_1.pts
    /home/user/ibug/image_004_1.pts
    /home/user/ibug/image_005_1.pts
    /home/user/ibug/image_006.pts
    }</pre>
    <p>
    */
    public native @Cast("bool") boolean addTrainingSample(@ByVal Mat image, @ByRef Point2fVector landmarks);

    /** \brief Trains a Facemark algorithm using the given dataset.
    Before the training process, training samples should be added to the trainer
    using face::addTrainingSample function.
    <p>
    @param parameters Optional extra parameters (algorithm dependent).
    <p>
    <B>Example of usage</B>
    <pre>{@code
    FacemarkLBF::Params params;
    params.model_filename = "ibug68.model"; // filename to save the trained model
    Ptr<Facemark> facemark = FacemarkLBF::create(params);

    // add training samples (see Facemark::addTrainingSample)

    facemark->training();
    }</pre>
    */

    public native void training(Pointer parameters/*=0*/);
    public native void training();

    /** \brief Set a user defined face detector for the Facemark algorithm.
    @param detector The user defined face detector function
    @param userData Detector parameters
    <p>
    <B>Example of usage</B>
    <pre>{@code
    MyDetectorParameters detectorParameters(...);
    facemark->setFaceDetector(myDetector, &detectorParameters);
    }</pre>
    <p>
    Example of a user defined face detector
    <pre>{@code
    bool myDetector( InputArray image, OutputArray faces, void* userData)
    {
        MyDetectorParameters* params = (MyDetectorParameters*)userData;
        // -------- do something --------
    }
    }</pre>
    <p>
    TODO Lifetime of detector parameters is uncontrolled. Rework interface design to "Ptr<FaceDetector>".
    */
    public native @Cast("bool") boolean setFaceDetector(@Cast("cv::face::FN_FaceDetector") Pointer detector, Pointer userData/*=0*/);
    public native @Cast("bool") boolean setFaceDetector(@Cast("cv::face::FN_FaceDetector") Pointer detector);

    /** \brief Detect faces from a given image using default or user defined face detector.
    Some Algorithm might not provide a default face detector.
    <p>
    @param image Input image.
    @param faces Output of the function which represent region of interest of the detected faces. Each face is stored in cv::Rect container.
    <p>
    <B>Example of usage</B>
    <pre>{@code
    std::vector<cv::Rect> faces;
    facemark->getFaces(img, faces);
    for(int j=0;j<faces.size();j++){
        cv::rectangle(img, faces[j], cv::Scalar(255,0,255));
    }
    }</pre>
    */
    public native @Cast("bool") boolean getFaces(@ByVal Mat image, @ByRef RectVector faces);

    /** \brief Get data from an algorithm
    <p>
    @param items The obtained data, algorithm dependent.
    <p>
    <B>Example of usage</B>
    <pre>{@code
    Ptr<FacemarkAAM> facemark = FacemarkAAM::create();
    facemark->loadModel("AAM.yml");

    FacemarkAAM::Data data;
    facemark->getData(&data);
    std::vector<Point2f> s0 = data.s0;

    cout<<s0<<endl;
    }</pre>
    */
    public native @Cast("bool") boolean getData(Pointer items/*=0*/);
    public native @Cast("bool") boolean getData(); // FIXIT
}
