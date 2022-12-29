// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_bioinspired;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
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

import static org.bytedeco.opencv.global.opencv_bioinspired.*;


/** \brief class which provides a transient/moving areas segmentation module
<p>
perform a locally adapted segmentation by using the retina magno input data Based on Alexandre
BENOIT thesis: "Le système visuel humain au secours de la vision par ordinateur"
<p>
3 spatio temporal filters are used:
- a first one which filters the noise and local variations of the input motion energy
- a second (more powerfull low pass spatial filter) which gives the neighborhood motion energy the
segmentation consists in the comparison of these both outputs, if the local motion energy is higher
to the neighborhood otion energy, then the area is considered as moving and is segmented
- a stronger third low pass filter helps decision by providing a smooth information about the
"motion context" in a wider area
 */

@Namespace("cv::bioinspired") @Properties(inherit = org.bytedeco.opencv.presets.opencv_bioinspired.class)
public class TransientAreasSegmentationModule extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TransientAreasSegmentationModule(Pointer p) { super(p); }



    /** \brief return the sze of the manage input and output images
    */
    public native @ByVal Size getSize();

    /** \brief try to open an XML segmentation parameters file to adjust current segmentation instance setup
    <p>
    - if the xml file does not exist, then default setup is applied
    - warning, Exceptions are thrown if read XML file is not valid
    @param segmentationParameterFile : the parameters filename
    @param applyDefaultSetupOnFailure : set to true if an error must be thrown on error
     */
    public native void setup(@Str BytePointer segmentationParameterFile/*=""*/, @Cast("const bool") boolean applyDefaultSetupOnFailure/*=true*/);
    public native void setup();
    public native void setup(@Str String segmentationParameterFile/*=""*/, @Cast("const bool") boolean applyDefaultSetupOnFailure/*=true*/);

    /** \brief try to open an XML segmentation parameters file to adjust current segmentation instance setup
    <p>
    - if the xml file does not exist, then default setup is applied
    - warning, Exceptions are thrown if read XML file is not valid
    @param fs : the open Filestorage which contains segmentation parameters
    @param applyDefaultSetupOnFailure : set to true if an error must be thrown on error
    */
    public native void setup(@ByRef FileStorage fs, @Cast("const bool") boolean applyDefaultSetupOnFailure/*=true*/);
    public native void setup(@ByRef FileStorage fs);

    /** \brief try to open an XML segmentation parameters file to adjust current segmentation instance setup
    <p>
    - if the xml file does not exist, then default setup is applied
    - warning, Exceptions are thrown if read XML file is not valid
    @param newParameters : a parameters structures updated with the new target configuration
     */
    public native void setup(@ByVal SegmentationParameters newParameters);

    /** \brief return the current parameters setup
    */
    public native @ByVal SegmentationParameters getParameters();

    /** \brief parameters setup display method
    @return a string which contains formatted parameters information
    */
    public native @Str BytePointer printSetup();

    /** \brief write xml/yml formated parameters information
    @param fs : the filename of the xml file that will be open and writen with formatted parameters information
    */
    public native void write( @Str BytePointer fs );
    public native void write( @Str String fs );

    /** \brief write xml/yml formated parameters information
    @param fs : a cv::Filestorage object ready to be filled
    */
    public native @Override void write( @ByRef FileStorage fs );

    /** \brief main processing method, get result using methods getSegmentationPicture()
    @param inputToSegment : the image to process, it must match the instance buffer size !
    @param channelIndex : the channel to process in case of multichannel images
    */
    public native void run(@ByVal Mat inputToSegment, int channelIndex/*=0*/);
    public native void run(@ByVal Mat inputToSegment);
    public native void run(@ByVal UMat inputToSegment, int channelIndex/*=0*/);
    public native void run(@ByVal UMat inputToSegment);
    public native void run(@ByVal GpuMat inputToSegment, int channelIndex/*=0*/);
    public native void run(@ByVal GpuMat inputToSegment);

    /** \brief access function
    return the last segmentation result: a boolean picture which is resampled between 0 and 255 for a display purpose
    */
    public native void getSegmentationPicture(@ByVal Mat transientAreas);
    public native void getSegmentationPicture(@ByVal UMat transientAreas);
    public native void getSegmentationPicture(@ByVal GpuMat transientAreas);

    /** \brief cleans all the buffers of the instance
    */
    public native void clearAllBuffers();

    /** \brief allocator
    @param inputSize : size of the images input to segment (output will be the same size)
     */
    public static native @Ptr TransientAreasSegmentationModule create(@ByVal Size inputSize);
}
