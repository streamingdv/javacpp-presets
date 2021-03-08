// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.caffe;

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
import org.bytedeco.hdf5.*;
import static org.bytedeco.hdf5.global.hdf5.*;

import static org.bytedeco.caffe.global.caffe.*;

// -------------------------------------------------------------------

@Namespace("caffe") @NoOffset @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class LayerParameter extends Message {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LayerParameter(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public LayerParameter(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public LayerParameter position(long position) {
        return (LayerParameter)super.position(position);
    }
    @Override public LayerParameter getPointer(long i) {
        return new LayerParameter((Pointer)this).position(position + i);
    }

  public LayerParameter() { super((Pointer)null); allocate(); }
  private native void allocate();

  public LayerParameter(@Const @ByRef LayerParameter from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef LayerParameter from);

  public native @ByRef @Name("operator =") LayerParameter put(@Const @ByRef LayerParameter from);
//   #if LANG_CXX11
//   #endif
  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Const Descriptor descriptor();
  public static native @Const @ByRef LayerParameter default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const LayerParameter internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(LayerParameter other);
  

  // implements Message ----------------------------------------------

  public native final LayerParameter New();

  public native final LayerParameter New(Arena arena);
  public native final void CopyFrom(@Const @ByRef Message from);
  public native final void MergeFrom(@Const @ByRef Message from);
  public native void CopyFrom(@Const @ByRef LayerParameter from);
  public native void MergeFrom(@Const @ByRef LayerParameter from);
  public native final void Clear();
  public native @Cast("bool") final boolean IsInitialized();

  public native @Cast("size_t") final long ByteSizeLong();
//   #if GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
//   #else
  public native @Cast("bool") final boolean MergePartialFromCodedStream(
        CodedInputStream input);
//   #endif  // GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
  public native final void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") final BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") final ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") final byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") byte[] target);
  public native final int GetCachedSize();

  public native @ByVal final Metadata GetMetadata();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // repeated string bottom = 3;
  public native int bottom_size();
  public native void clear_bottom();
  @MemberGetter public static native int kBottomFieldNumber();
  public static final int kBottomFieldNumber = kBottomFieldNumber();
  public native @StdString BytePointer bottom(int index);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_bottom(int index);
  public native void set_bottom(int index, @StdString BytePointer value);
  public native void set_bottom(int index, @StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_bottom(int index, @Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_bottom(int index, String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer add_bottom();
  public native void add_bottom(@StdString BytePointer value);
  public native void add_bottom(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void add_bottom(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void add_bottom(String value, @Cast("size_t") long size);

  // repeated string top = 4;
  public native int top_size();
  public native void clear_top();
  @MemberGetter public static native int kTopFieldNumber();
  public static final int kTopFieldNumber = kTopFieldNumber();
  public native @StdString BytePointer top(int index);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_top(int index);
  public native void set_top(int index, @StdString BytePointer value);
  public native void set_top(int index, @StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_top(int index, @Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_top(int index, String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer add_top();
  public native void add_top(@StdString BytePointer value);
  public native void add_top(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void add_top(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void add_top(String value, @Cast("size_t") long size);

  // repeated float loss_weight = 5;
  public native int loss_weight_size();
  public native void clear_loss_weight();
  @MemberGetter public static native int kLossWeightFieldNumber();
  public static final int kLossWeightFieldNumber = kLossWeightFieldNumber();
  public native float loss_weight(int index);
  public native void set_loss_weight(int index, float value);
  public native void add_loss_weight(float value);

  // repeated .caffe.ParamSpec param = 6;
  public native int param_size();
  public native void clear_param();
  @MemberGetter public static native int kParamFieldNumber();
  public static final int kParamFieldNumber = kParamFieldNumber();
  public native ParamSpec mutable_param(int index);
  public native @Const @ByRef ParamSpec param(int index);
  public native ParamSpec add_param();

  // repeated .caffe.BlobProto blobs = 7;
  public native int blobs_size();
  public native void clear_blobs();
  @MemberGetter public static native int kBlobsFieldNumber();
  public static final int kBlobsFieldNumber = kBlobsFieldNumber();
  public native BlobProto mutable_blobs(int index);
  public native @Const @ByRef BlobProto blobs(int index);
  public native BlobProto add_blobs();

  // repeated .caffe.NetStateRule include = 8;
  public native int include_size();
  public native void clear_include();
  @MemberGetter public static native int kIncludeFieldNumber();
  public static final int kIncludeFieldNumber = kIncludeFieldNumber();
  public native NetStateRule mutable_include(int index);
  public native @Const @ByRef NetStateRule include(int index);
  public native NetStateRule add_include();

  // repeated .caffe.NetStateRule exclude = 9;
  public native int exclude_size();
  public native void clear_exclude();
  @MemberGetter public static native int kExcludeFieldNumber();
  public static final int kExcludeFieldNumber = kExcludeFieldNumber();
  public native NetStateRule mutable_exclude(int index);
  public native @Const @ByRef NetStateRule exclude(int index);
  public native NetStateRule add_exclude();

  // repeated bool propagate_down = 11;
  public native int propagate_down_size();
  public native void clear_propagate_down();
  @MemberGetter public static native int kPropagateDownFieldNumber();
  public static final int kPropagateDownFieldNumber = kPropagateDownFieldNumber();
  public native @Cast("bool") boolean propagate_down(int index);
  public native void set_propagate_down(int index, @Cast("bool") boolean value);
  public native void add_propagate_down(@Cast("bool") boolean value);

  // optional string name = 1;
  public native @Cast("bool") boolean has_name();
  public native void clear_name();
  @MemberGetter public static native int kNameFieldNumber();
  public static final int kNameFieldNumber = kNameFieldNumber();
  public native @StdString BytePointer name();
  public native void set_name(@StdString BytePointer value);
  public native void set_name(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_name(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_name(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_name();
  public native void set_allocated_name(@StdString @Cast({"char*", "std::string*"}) BytePointer name);

  // optional string type = 2;
  public native @Cast("bool") boolean has_type();
  public native void clear_type();
  @MemberGetter public static native int kTypeFieldNumber();
  public static final int kTypeFieldNumber = kTypeFieldNumber();
  public native @StdString BytePointer type();
  public native void set_type(@StdString BytePointer value);
  public native void set_type(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_type(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_type(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_type();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_type();
  public native void set_allocated_type(@StdString @Cast({"char*", "std::string*"}) BytePointer type);

  // optional .caffe.TransformationParameter transform_param = 100;
  public native @Cast("bool") boolean has_transform_param();
  public native void clear_transform_param();
  @MemberGetter public static native int kTransformParamFieldNumber();
  public static final int kTransformParamFieldNumber = kTransformParamFieldNumber();
  public native @Const @ByRef TransformationParameter transform_param();
  public native TransformationParameter release_transform_param();
  public native TransformationParameter mutable_transform_param();
  public native void set_allocated_transform_param(TransformationParameter transform_param);

  // optional .caffe.LossParameter loss_param = 101;
  public native @Cast("bool") boolean has_loss_param();
  public native void clear_loss_param();
  @MemberGetter public static native int kLossParamFieldNumber();
  public static final int kLossParamFieldNumber = kLossParamFieldNumber();
  public native @Const @ByRef LossParameter loss_param();
  public native LossParameter release_loss_param();
  public native LossParameter mutable_loss_param();
  public native void set_allocated_loss_param(LossParameter loss_param);

  // optional .caffe.AccuracyParameter accuracy_param = 102;
  public native @Cast("bool") boolean has_accuracy_param();
  public native void clear_accuracy_param();
  @MemberGetter public static native int kAccuracyParamFieldNumber();
  public static final int kAccuracyParamFieldNumber = kAccuracyParamFieldNumber();
  public native @Const @ByRef AccuracyParameter accuracy_param();
  public native AccuracyParameter release_accuracy_param();
  public native AccuracyParameter mutable_accuracy_param();
  public native void set_allocated_accuracy_param(AccuracyParameter accuracy_param);

  // optional .caffe.ArgMaxParameter argmax_param = 103;
  public native @Cast("bool") boolean has_argmax_param();
  public native void clear_argmax_param();
  @MemberGetter public static native int kArgmaxParamFieldNumber();
  public static final int kArgmaxParamFieldNumber = kArgmaxParamFieldNumber();
  public native @Const @ByRef ArgMaxParameter argmax_param();
  public native ArgMaxParameter release_argmax_param();
  public native ArgMaxParameter mutable_argmax_param();
  public native void set_allocated_argmax_param(ArgMaxParameter argmax_param);

  // optional .caffe.ConcatParameter concat_param = 104;
  public native @Cast("bool") boolean has_concat_param();
  public native void clear_concat_param();
  @MemberGetter public static native int kConcatParamFieldNumber();
  public static final int kConcatParamFieldNumber = kConcatParamFieldNumber();
  public native @Const @ByRef ConcatParameter concat_param();
  public native ConcatParameter release_concat_param();
  public native ConcatParameter mutable_concat_param();
  public native void set_allocated_concat_param(ConcatParameter concat_param);

  // optional .caffe.ContrastiveLossParameter contrastive_loss_param = 105;
  public native @Cast("bool") boolean has_contrastive_loss_param();
  public native void clear_contrastive_loss_param();
  @MemberGetter public static native int kContrastiveLossParamFieldNumber();
  public static final int kContrastiveLossParamFieldNumber = kContrastiveLossParamFieldNumber();
  public native @Const @ByRef ContrastiveLossParameter contrastive_loss_param();
  public native ContrastiveLossParameter release_contrastive_loss_param();
  public native ContrastiveLossParameter mutable_contrastive_loss_param();
  public native void set_allocated_contrastive_loss_param(ContrastiveLossParameter contrastive_loss_param);

  // optional .caffe.ConvolutionParameter convolution_param = 106;
  public native @Cast("bool") boolean has_convolution_param();
  public native void clear_convolution_param();
  @MemberGetter public static native int kConvolutionParamFieldNumber();
  public static final int kConvolutionParamFieldNumber = kConvolutionParamFieldNumber();
  public native @Const @ByRef ConvolutionParameter convolution_param();
  public native ConvolutionParameter release_convolution_param();
  public native ConvolutionParameter mutable_convolution_param();
  public native void set_allocated_convolution_param(ConvolutionParameter convolution_param);

  // optional .caffe.DataParameter data_param = 107;
  public native @Cast("bool") boolean has_data_param();
  public native void clear_data_param();
  @MemberGetter public static native int kDataParamFieldNumber();
  public static final int kDataParamFieldNumber = kDataParamFieldNumber();
  public native @Const @ByRef DataParameter data_param();
  public native DataParameter release_data_param();
  public native DataParameter mutable_data_param();
  public native void set_allocated_data_param(DataParameter data_param);

  // optional .caffe.DropoutParameter dropout_param = 108;
  public native @Cast("bool") boolean has_dropout_param();
  public native void clear_dropout_param();
  @MemberGetter public static native int kDropoutParamFieldNumber();
  public static final int kDropoutParamFieldNumber = kDropoutParamFieldNumber();
  public native @Const @ByRef DropoutParameter dropout_param();
  public native DropoutParameter release_dropout_param();
  public native DropoutParameter mutable_dropout_param();
  public native void set_allocated_dropout_param(DropoutParameter dropout_param);

  // optional .caffe.DummyDataParameter dummy_data_param = 109;
  public native @Cast("bool") boolean has_dummy_data_param();
  public native void clear_dummy_data_param();
  @MemberGetter public static native int kDummyDataParamFieldNumber();
  public static final int kDummyDataParamFieldNumber = kDummyDataParamFieldNumber();
  public native @Const @ByRef DummyDataParameter dummy_data_param();
  public native DummyDataParameter release_dummy_data_param();
  public native DummyDataParameter mutable_dummy_data_param();
  public native void set_allocated_dummy_data_param(DummyDataParameter dummy_data_param);

  // optional .caffe.EltwiseParameter eltwise_param = 110;
  public native @Cast("bool") boolean has_eltwise_param();
  public native void clear_eltwise_param();
  @MemberGetter public static native int kEltwiseParamFieldNumber();
  public static final int kEltwiseParamFieldNumber = kEltwiseParamFieldNumber();
  public native @Const @ByRef EltwiseParameter eltwise_param();
  public native EltwiseParameter release_eltwise_param();
  public native EltwiseParameter mutable_eltwise_param();
  public native void set_allocated_eltwise_param(EltwiseParameter eltwise_param);

  // optional .caffe.ExpParameter exp_param = 111;
  public native @Cast("bool") boolean has_exp_param();
  public native void clear_exp_param();
  @MemberGetter public static native int kExpParamFieldNumber();
  public static final int kExpParamFieldNumber = kExpParamFieldNumber();
  public native @Const @ByRef ExpParameter exp_param();
  public native ExpParameter release_exp_param();
  public native ExpParameter mutable_exp_param();
  public native void set_allocated_exp_param(ExpParameter exp_param);

  // optional .caffe.HDF5DataParameter hdf5_data_param = 112;
  public native @Cast("bool") boolean has_hdf5_data_param();
  public native void clear_hdf5_data_param();
  @MemberGetter public static native int kHdf5DataParamFieldNumber();
  public static final int kHdf5DataParamFieldNumber = kHdf5DataParamFieldNumber();
  public native @Const @ByRef HDF5DataParameter hdf5_data_param();
  public native HDF5DataParameter release_hdf5_data_param();
  public native HDF5DataParameter mutable_hdf5_data_param();
  public native void set_allocated_hdf5_data_param(HDF5DataParameter hdf5_data_param);

  // optional .caffe.HDF5OutputParameter hdf5_output_param = 113;
  public native @Cast("bool") boolean has_hdf5_output_param();
  public native void clear_hdf5_output_param();
  @MemberGetter public static native int kHdf5OutputParamFieldNumber();
  public static final int kHdf5OutputParamFieldNumber = kHdf5OutputParamFieldNumber();
  public native @Const @ByRef HDF5OutputParameter hdf5_output_param();
  public native HDF5OutputParameter release_hdf5_output_param();
  public native HDF5OutputParameter mutable_hdf5_output_param();
  public native void set_allocated_hdf5_output_param(HDF5OutputParameter hdf5_output_param);

  // optional .caffe.HingeLossParameter hinge_loss_param = 114;
  public native @Cast("bool") boolean has_hinge_loss_param();
  public native void clear_hinge_loss_param();
  @MemberGetter public static native int kHingeLossParamFieldNumber();
  public static final int kHingeLossParamFieldNumber = kHingeLossParamFieldNumber();
  public native @Const @ByRef HingeLossParameter hinge_loss_param();
  public native HingeLossParameter release_hinge_loss_param();
  public native HingeLossParameter mutable_hinge_loss_param();
  public native void set_allocated_hinge_loss_param(HingeLossParameter hinge_loss_param);

  // optional .caffe.ImageDataParameter image_data_param = 115;
  public native @Cast("bool") boolean has_image_data_param();
  public native void clear_image_data_param();
  @MemberGetter public static native int kImageDataParamFieldNumber();
  public static final int kImageDataParamFieldNumber = kImageDataParamFieldNumber();
  public native @Const @ByRef ImageDataParameter image_data_param();
  public native ImageDataParameter release_image_data_param();
  public native ImageDataParameter mutable_image_data_param();
  public native void set_allocated_image_data_param(ImageDataParameter image_data_param);

  // optional .caffe.InfogainLossParameter infogain_loss_param = 116;
  public native @Cast("bool") boolean has_infogain_loss_param();
  public native void clear_infogain_loss_param();
  @MemberGetter public static native int kInfogainLossParamFieldNumber();
  public static final int kInfogainLossParamFieldNumber = kInfogainLossParamFieldNumber();
  public native @Const @ByRef InfogainLossParameter infogain_loss_param();
  public native InfogainLossParameter release_infogain_loss_param();
  public native InfogainLossParameter mutable_infogain_loss_param();
  public native void set_allocated_infogain_loss_param(InfogainLossParameter infogain_loss_param);

  // optional .caffe.InnerProductParameter inner_product_param = 117;
  public native @Cast("bool") boolean has_inner_product_param();
  public native void clear_inner_product_param();
  @MemberGetter public static native int kInnerProductParamFieldNumber();
  public static final int kInnerProductParamFieldNumber = kInnerProductParamFieldNumber();
  public native @Const @ByRef InnerProductParameter inner_product_param();
  public native InnerProductParameter release_inner_product_param();
  public native InnerProductParameter mutable_inner_product_param();
  public native void set_allocated_inner_product_param(InnerProductParameter inner_product_param);

  // optional .caffe.LRNParameter lrn_param = 118;
  public native @Cast("bool") boolean has_lrn_param();
  public native void clear_lrn_param();
  @MemberGetter public static native int kLrnParamFieldNumber();
  public static final int kLrnParamFieldNumber = kLrnParamFieldNumber();
  public native @Const @ByRef LRNParameter lrn_param();
  public native LRNParameter release_lrn_param();
  public native LRNParameter mutable_lrn_param();
  public native void set_allocated_lrn_param(LRNParameter lrn_param);

  // optional .caffe.MemoryDataParameter memory_data_param = 119;
  public native @Cast("bool") boolean has_memory_data_param();
  public native void clear_memory_data_param();
  @MemberGetter public static native int kMemoryDataParamFieldNumber();
  public static final int kMemoryDataParamFieldNumber = kMemoryDataParamFieldNumber();
  public native @Const @ByRef MemoryDataParameter memory_data_param();
  public native MemoryDataParameter release_memory_data_param();
  public native MemoryDataParameter mutable_memory_data_param();
  public native void set_allocated_memory_data_param(MemoryDataParameter memory_data_param);

  // optional .caffe.MVNParameter mvn_param = 120;
  public native @Cast("bool") boolean has_mvn_param();
  public native void clear_mvn_param();
  @MemberGetter public static native int kMvnParamFieldNumber();
  public static final int kMvnParamFieldNumber = kMvnParamFieldNumber();
  public native @Const @ByRef MVNParameter mvn_param();
  public native MVNParameter release_mvn_param();
  public native MVNParameter mutable_mvn_param();
  public native void set_allocated_mvn_param(MVNParameter mvn_param);

  // optional .caffe.PoolingParameter pooling_param = 121;
  public native @Cast("bool") boolean has_pooling_param();
  public native void clear_pooling_param();
  @MemberGetter public static native int kPoolingParamFieldNumber();
  public static final int kPoolingParamFieldNumber = kPoolingParamFieldNumber();
  public native @Const @ByRef PoolingParameter pooling_param();
  public native PoolingParameter release_pooling_param();
  public native PoolingParameter mutable_pooling_param();
  public native void set_allocated_pooling_param(PoolingParameter pooling_param);

  // optional .caffe.PowerParameter power_param = 122;
  public native @Cast("bool") boolean has_power_param();
  public native void clear_power_param();
  @MemberGetter public static native int kPowerParamFieldNumber();
  public static final int kPowerParamFieldNumber = kPowerParamFieldNumber();
  public native @Const @ByRef PowerParameter power_param();
  public native PowerParameter release_power_param();
  public native PowerParameter mutable_power_param();
  public native void set_allocated_power_param(PowerParameter power_param);

  // optional .caffe.ReLUParameter relu_param = 123;
  public native @Cast("bool") boolean has_relu_param();
  public native void clear_relu_param();
  @MemberGetter public static native int kReluParamFieldNumber();
  public static final int kReluParamFieldNumber = kReluParamFieldNumber();
  public native @Const @ByRef ReLUParameter relu_param();
  public native ReLUParameter release_relu_param();
  public native ReLUParameter mutable_relu_param();
  public native void set_allocated_relu_param(ReLUParameter relu_param);

  // optional .caffe.SigmoidParameter sigmoid_param = 124;
  public native @Cast("bool") boolean has_sigmoid_param();
  public native void clear_sigmoid_param();
  @MemberGetter public static native int kSigmoidParamFieldNumber();
  public static final int kSigmoidParamFieldNumber = kSigmoidParamFieldNumber();
  public native @Const @ByRef SigmoidParameter sigmoid_param();
  public native SigmoidParameter release_sigmoid_param();
  public native SigmoidParameter mutable_sigmoid_param();
  public native void set_allocated_sigmoid_param(SigmoidParameter sigmoid_param);

  // optional .caffe.SoftmaxParameter softmax_param = 125;
  public native @Cast("bool") boolean has_softmax_param();
  public native void clear_softmax_param();
  @MemberGetter public static native int kSoftmaxParamFieldNumber();
  public static final int kSoftmaxParamFieldNumber = kSoftmaxParamFieldNumber();
  public native @Const @ByRef SoftmaxParameter softmax_param();
  public native SoftmaxParameter release_softmax_param();
  public native SoftmaxParameter mutable_softmax_param();
  public native void set_allocated_softmax_param(SoftmaxParameter softmax_param);

  // optional .caffe.SliceParameter slice_param = 126;
  public native @Cast("bool") boolean has_slice_param();
  public native void clear_slice_param();
  @MemberGetter public static native int kSliceParamFieldNumber();
  public static final int kSliceParamFieldNumber = kSliceParamFieldNumber();
  public native @Const @ByRef SliceParameter slice_param();
  public native SliceParameter release_slice_param();
  public native SliceParameter mutable_slice_param();
  public native void set_allocated_slice_param(SliceParameter slice_param);

  // optional .caffe.TanHParameter tanh_param = 127;
  public native @Cast("bool") boolean has_tanh_param();
  public native void clear_tanh_param();
  @MemberGetter public static native int kTanhParamFieldNumber();
  public static final int kTanhParamFieldNumber = kTanhParamFieldNumber();
  public native @Const @ByRef TanHParameter tanh_param();
  public native TanHParameter release_tanh_param();
  public native TanHParameter mutable_tanh_param();
  public native void set_allocated_tanh_param(TanHParameter tanh_param);

  // optional .caffe.ThresholdParameter threshold_param = 128;
  public native @Cast("bool") boolean has_threshold_param();
  public native void clear_threshold_param();
  @MemberGetter public static native int kThresholdParamFieldNumber();
  public static final int kThresholdParamFieldNumber = kThresholdParamFieldNumber();
  public native @Const @ByRef ThresholdParameter threshold_param();
  public native ThresholdParameter release_threshold_param();
  public native ThresholdParameter mutable_threshold_param();
  public native void set_allocated_threshold_param(ThresholdParameter threshold_param);

  // optional .caffe.WindowDataParameter window_data_param = 129;
  public native @Cast("bool") boolean has_window_data_param();
  public native void clear_window_data_param();
  @MemberGetter public static native int kWindowDataParamFieldNumber();
  public static final int kWindowDataParamFieldNumber = kWindowDataParamFieldNumber();
  public native @Const @ByRef WindowDataParameter window_data_param();
  public native WindowDataParameter release_window_data_param();
  public native WindowDataParameter mutable_window_data_param();
  public native void set_allocated_window_data_param(WindowDataParameter window_data_param);

  // optional .caffe.PythonParameter python_param = 130;
  public native @Cast("bool") boolean has_python_param();
  public native void clear_python_param();
  @MemberGetter public static native int kPythonParamFieldNumber();
  public static final int kPythonParamFieldNumber = kPythonParamFieldNumber();
  public native @Const @ByRef PythonParameter python_param();
  public native PythonParameter release_python_param();
  public native PythonParameter mutable_python_param();
  public native void set_allocated_python_param(PythonParameter python_param);

  // optional .caffe.PReLUParameter prelu_param = 131;
  public native @Cast("bool") boolean has_prelu_param();
  public native void clear_prelu_param();
  @MemberGetter public static native int kPreluParamFieldNumber();
  public static final int kPreluParamFieldNumber = kPreluParamFieldNumber();
  public native @Const @ByRef PReLUParameter prelu_param();
  public native PReLUParameter release_prelu_param();
  public native PReLUParameter mutable_prelu_param();
  public native void set_allocated_prelu_param(PReLUParameter prelu_param);

  // optional .caffe.SPPParameter spp_param = 132;
  public native @Cast("bool") boolean has_spp_param();
  public native void clear_spp_param();
  @MemberGetter public static native int kSppParamFieldNumber();
  public static final int kSppParamFieldNumber = kSppParamFieldNumber();
  public native @Const @ByRef SPPParameter spp_param();
  public native SPPParameter release_spp_param();
  public native SPPParameter mutable_spp_param();
  public native void set_allocated_spp_param(SPPParameter spp_param);

  // optional .caffe.ReshapeParameter reshape_param = 133;
  public native @Cast("bool") boolean has_reshape_param();
  public native void clear_reshape_param();
  @MemberGetter public static native int kReshapeParamFieldNumber();
  public static final int kReshapeParamFieldNumber = kReshapeParamFieldNumber();
  public native @Const @ByRef ReshapeParameter reshape_param();
  public native ReshapeParameter release_reshape_param();
  public native ReshapeParameter mutable_reshape_param();
  public native void set_allocated_reshape_param(ReshapeParameter reshape_param);

  // optional .caffe.LogParameter log_param = 134;
  public native @Cast("bool") boolean has_log_param();
  public native void clear_log_param();
  @MemberGetter public static native int kLogParamFieldNumber();
  public static final int kLogParamFieldNumber = kLogParamFieldNumber();
  public native @Const @ByRef LogParameter log_param();
  public native LogParameter release_log_param();
  public native LogParameter mutable_log_param();
  public native void set_allocated_log_param(LogParameter log_param);

  // optional .caffe.FlattenParameter flatten_param = 135;
  public native @Cast("bool") boolean has_flatten_param();
  public native void clear_flatten_param();
  @MemberGetter public static native int kFlattenParamFieldNumber();
  public static final int kFlattenParamFieldNumber = kFlattenParamFieldNumber();
  public native @Const @ByRef FlattenParameter flatten_param();
  public native FlattenParameter release_flatten_param();
  public native FlattenParameter mutable_flatten_param();
  public native void set_allocated_flatten_param(FlattenParameter flatten_param);

  // optional .caffe.ReductionParameter reduction_param = 136;
  public native @Cast("bool") boolean has_reduction_param();
  public native void clear_reduction_param();
  @MemberGetter public static native int kReductionParamFieldNumber();
  public static final int kReductionParamFieldNumber = kReductionParamFieldNumber();
  public native @Const @ByRef ReductionParameter reduction_param();
  public native ReductionParameter release_reduction_param();
  public native ReductionParameter mutable_reduction_param();
  public native void set_allocated_reduction_param(ReductionParameter reduction_param);

  // optional .caffe.EmbedParameter embed_param = 137;
  public native @Cast("bool") boolean has_embed_param();
  public native void clear_embed_param();
  @MemberGetter public static native int kEmbedParamFieldNumber();
  public static final int kEmbedParamFieldNumber = kEmbedParamFieldNumber();
  public native @Const @ByRef EmbedParameter embed_param();
  public native EmbedParameter release_embed_param();
  public native EmbedParameter mutable_embed_param();
  public native void set_allocated_embed_param(EmbedParameter embed_param);

  // optional .caffe.TileParameter tile_param = 138;
  public native @Cast("bool") boolean has_tile_param();
  public native void clear_tile_param();
  @MemberGetter public static native int kTileParamFieldNumber();
  public static final int kTileParamFieldNumber = kTileParamFieldNumber();
  public native @Const @ByRef TileParameter tile_param();
  public native TileParameter release_tile_param();
  public native TileParameter mutable_tile_param();
  public native void set_allocated_tile_param(TileParameter tile_param);

  // optional .caffe.BatchNormParameter batch_norm_param = 139;
  public native @Cast("bool") boolean has_batch_norm_param();
  public native void clear_batch_norm_param();
  @MemberGetter public static native int kBatchNormParamFieldNumber();
  public static final int kBatchNormParamFieldNumber = kBatchNormParamFieldNumber();
  public native @Const @ByRef BatchNormParameter batch_norm_param();
  public native BatchNormParameter release_batch_norm_param();
  public native BatchNormParameter mutable_batch_norm_param();
  public native void set_allocated_batch_norm_param(BatchNormParameter batch_norm_param);

  // optional .caffe.ELUParameter elu_param = 140;
  public native @Cast("bool") boolean has_elu_param();
  public native void clear_elu_param();
  @MemberGetter public static native int kEluParamFieldNumber();
  public static final int kEluParamFieldNumber = kEluParamFieldNumber();
  public native @Const @ByRef ELUParameter elu_param();
  public native ELUParameter release_elu_param();
  public native ELUParameter mutable_elu_param();
  public native void set_allocated_elu_param(ELUParameter elu_param);

  // optional .caffe.BiasParameter bias_param = 141;
  public native @Cast("bool") boolean has_bias_param();
  public native void clear_bias_param();
  @MemberGetter public static native int kBiasParamFieldNumber();
  public static final int kBiasParamFieldNumber = kBiasParamFieldNumber();
  public native @Const @ByRef BiasParameter bias_param();
  public native BiasParameter release_bias_param();
  public native BiasParameter mutable_bias_param();
  public native void set_allocated_bias_param(BiasParameter bias_param);

  // optional .caffe.ScaleParameter scale_param = 142;
  public native @Cast("bool") boolean has_scale_param();
  public native void clear_scale_param();
  @MemberGetter public static native int kScaleParamFieldNumber();
  public static final int kScaleParamFieldNumber = kScaleParamFieldNumber();
  public native @Const @ByRef ScaleParameter scale_param();
  public native ScaleParameter release_scale_param();
  public native ScaleParameter mutable_scale_param();
  public native void set_allocated_scale_param(ScaleParameter scale_param);

  // optional .caffe.InputParameter input_param = 143;
  public native @Cast("bool") boolean has_input_param();
  public native void clear_input_param();
  @MemberGetter public static native int kInputParamFieldNumber();
  public static final int kInputParamFieldNumber = kInputParamFieldNumber();
  public native @Const @ByRef InputParameter input_param();
  public native InputParameter release_input_param();
  public native InputParameter mutable_input_param();
  public native void set_allocated_input_param(InputParameter input_param);

  // optional .caffe.CropParameter crop_param = 144;
  public native @Cast("bool") boolean has_crop_param();
  public native void clear_crop_param();
  @MemberGetter public static native int kCropParamFieldNumber();
  public static final int kCropParamFieldNumber = kCropParamFieldNumber();
  public native @Const @ByRef CropParameter crop_param();
  public native CropParameter release_crop_param();
  public native CropParameter mutable_crop_param();
  public native void set_allocated_crop_param(CropParameter crop_param);

  // optional .caffe.ParameterParameter parameter_param = 145;
  public native @Cast("bool") boolean has_parameter_param();
  public native void clear_parameter_param();
  @MemberGetter public static native int kParameterParamFieldNumber();
  public static final int kParameterParamFieldNumber = kParameterParamFieldNumber();
  public native @Const @ByRef ParameterParameter parameter_param();
  public native ParameterParameter release_parameter_param();
  public native ParameterParameter mutable_parameter_param();
  public native void set_allocated_parameter_param(ParameterParameter parameter_param);

  // optional .caffe.RecurrentParameter recurrent_param = 146;
  public native @Cast("bool") boolean has_recurrent_param();
  public native void clear_recurrent_param();
  @MemberGetter public static native int kRecurrentParamFieldNumber();
  public static final int kRecurrentParamFieldNumber = kRecurrentParamFieldNumber();
  public native @Const @ByRef RecurrentParameter recurrent_param();
  public native RecurrentParameter release_recurrent_param();
  public native RecurrentParameter mutable_recurrent_param();
  public native void set_allocated_recurrent_param(RecurrentParameter recurrent_param);

  // optional .caffe.Phase phase = 10;
  public native @Cast("bool") boolean has_phase();
  public native void clear_phase();
  @MemberGetter public static native int kPhaseFieldNumber();
  public static final int kPhaseFieldNumber = kPhaseFieldNumber();
  public native @Cast("caffe::Phase") int phase();
  public native void set_phase(@Cast("caffe::Phase") int value);
}
