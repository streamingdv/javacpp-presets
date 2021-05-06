// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.nvcodec.nvcuvid;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.nvcodec.global.nvcuvid.*;



/*******************************************************/
/** \struct CUVIDHEVCPICPARAMS
/** HEVC picture parameters
/** This structure is used in CUVIDPICPARAMS structure
/*******************************************************/
@Properties(inherit = org.bytedeco.nvcodec.presets.nvcuvid.class)
public class CUVIDHEVCPICPARAMS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUVIDHEVCPICPARAMS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUVIDHEVCPICPARAMS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUVIDHEVCPICPARAMS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUVIDHEVCPICPARAMS position(long position) {
        return (CUVIDHEVCPICPARAMS)super.position(position);
    }
    @Override public CUVIDHEVCPICPARAMS getPointer(long i) {
        return new CUVIDHEVCPICPARAMS((Pointer)this).offsetAddress(i);
    }

    // sps
    public native int pic_width_in_luma_samples(); public native CUVIDHEVCPICPARAMS pic_width_in_luma_samples(int setter);
    public native int pic_height_in_luma_samples(); public native CUVIDHEVCPICPARAMS pic_height_in_luma_samples(int setter);
    public native @Cast("unsigned char") byte log2_min_luma_coding_block_size_minus3(); public native CUVIDHEVCPICPARAMS log2_min_luma_coding_block_size_minus3(byte setter);
    public native @Cast("unsigned char") byte log2_diff_max_min_luma_coding_block_size(); public native CUVIDHEVCPICPARAMS log2_diff_max_min_luma_coding_block_size(byte setter);
    public native @Cast("unsigned char") byte log2_min_transform_block_size_minus2(); public native CUVIDHEVCPICPARAMS log2_min_transform_block_size_minus2(byte setter);
    public native @Cast("unsigned char") byte log2_diff_max_min_transform_block_size(); public native CUVIDHEVCPICPARAMS log2_diff_max_min_transform_block_size(byte setter);
    public native @Cast("unsigned char") byte pcm_enabled_flag(); public native CUVIDHEVCPICPARAMS pcm_enabled_flag(byte setter);
    public native @Cast("unsigned char") byte log2_min_pcm_luma_coding_block_size_minus3(); public native CUVIDHEVCPICPARAMS log2_min_pcm_luma_coding_block_size_minus3(byte setter);
    public native @Cast("unsigned char") byte log2_diff_max_min_pcm_luma_coding_block_size(); public native CUVIDHEVCPICPARAMS log2_diff_max_min_pcm_luma_coding_block_size(byte setter);
    public native @Cast("unsigned char") byte pcm_sample_bit_depth_luma_minus1(); public native CUVIDHEVCPICPARAMS pcm_sample_bit_depth_luma_minus1(byte setter);

    public native @Cast("unsigned char") byte pcm_sample_bit_depth_chroma_minus1(); public native CUVIDHEVCPICPARAMS pcm_sample_bit_depth_chroma_minus1(byte setter);
    public native @Cast("unsigned char") byte pcm_loop_filter_disabled_flag(); public native CUVIDHEVCPICPARAMS pcm_loop_filter_disabled_flag(byte setter);
    public native @Cast("unsigned char") byte strong_intra_smoothing_enabled_flag(); public native CUVIDHEVCPICPARAMS strong_intra_smoothing_enabled_flag(byte setter);
    public native @Cast("unsigned char") byte max_transform_hierarchy_depth_intra(); public native CUVIDHEVCPICPARAMS max_transform_hierarchy_depth_intra(byte setter);
    public native @Cast("unsigned char") byte max_transform_hierarchy_depth_inter(); public native CUVIDHEVCPICPARAMS max_transform_hierarchy_depth_inter(byte setter);
    public native @Cast("unsigned char") byte amp_enabled_flag(); public native CUVIDHEVCPICPARAMS amp_enabled_flag(byte setter);
    public native @Cast("unsigned char") byte separate_colour_plane_flag(); public native CUVIDHEVCPICPARAMS separate_colour_plane_flag(byte setter);
    public native @Cast("unsigned char") byte log2_max_pic_order_cnt_lsb_minus4(); public native CUVIDHEVCPICPARAMS log2_max_pic_order_cnt_lsb_minus4(byte setter);

    public native @Cast("unsigned char") byte num_short_term_ref_pic_sets(); public native CUVIDHEVCPICPARAMS num_short_term_ref_pic_sets(byte setter);
    public native @Cast("unsigned char") byte long_term_ref_pics_present_flag(); public native CUVIDHEVCPICPARAMS long_term_ref_pics_present_flag(byte setter);
    public native @Cast("unsigned char") byte num_long_term_ref_pics_sps(); public native CUVIDHEVCPICPARAMS num_long_term_ref_pics_sps(byte setter);
    public native @Cast("unsigned char") byte sps_temporal_mvp_enabled_flag(); public native CUVIDHEVCPICPARAMS sps_temporal_mvp_enabled_flag(byte setter);
    public native @Cast("unsigned char") byte sample_adaptive_offset_enabled_flag(); public native CUVIDHEVCPICPARAMS sample_adaptive_offset_enabled_flag(byte setter);
    public native @Cast("unsigned char") byte scaling_list_enable_flag(); public native CUVIDHEVCPICPARAMS scaling_list_enable_flag(byte setter);
    public native @Cast("unsigned char") byte IrapPicFlag(); public native CUVIDHEVCPICPARAMS IrapPicFlag(byte setter);
    public native @Cast("unsigned char") byte IdrPicFlag(); public native CUVIDHEVCPICPARAMS IdrPicFlag(byte setter);

    public native @Cast("unsigned char") byte bit_depth_luma_minus8(); public native CUVIDHEVCPICPARAMS bit_depth_luma_minus8(byte setter);
    public native @Cast("unsigned char") byte bit_depth_chroma_minus8(); public native CUVIDHEVCPICPARAMS bit_depth_chroma_minus8(byte setter);
    //sps/pps extension fields
    public native @Cast("unsigned char") byte log2_max_transform_skip_block_size_minus2(); public native CUVIDHEVCPICPARAMS log2_max_transform_skip_block_size_minus2(byte setter);
    public native @Cast("unsigned char") byte log2_sao_offset_scale_luma(); public native CUVIDHEVCPICPARAMS log2_sao_offset_scale_luma(byte setter);
    public native @Cast("unsigned char") byte log2_sao_offset_scale_chroma(); public native CUVIDHEVCPICPARAMS log2_sao_offset_scale_chroma(byte setter);
    public native @Cast("unsigned char") byte high_precision_offsets_enabled_flag(); public native CUVIDHEVCPICPARAMS high_precision_offsets_enabled_flag(byte setter);
    public native @Cast("unsigned char") byte reserved1(int i); public native CUVIDHEVCPICPARAMS reserved1(int i, byte setter);
    @MemberGetter public native @Cast("unsigned char*") BytePointer reserved1();

    // pps
    public native @Cast("unsigned char") byte dependent_slice_segments_enabled_flag(); public native CUVIDHEVCPICPARAMS dependent_slice_segments_enabled_flag(byte setter);
    public native @Cast("unsigned char") byte slice_segment_header_extension_present_flag(); public native CUVIDHEVCPICPARAMS slice_segment_header_extension_present_flag(byte setter);
    public native @Cast("unsigned char") byte sign_data_hiding_enabled_flag(); public native CUVIDHEVCPICPARAMS sign_data_hiding_enabled_flag(byte setter);
    public native @Cast("unsigned char") byte cu_qp_delta_enabled_flag(); public native CUVIDHEVCPICPARAMS cu_qp_delta_enabled_flag(byte setter);
    public native @Cast("unsigned char") byte diff_cu_qp_delta_depth(); public native CUVIDHEVCPICPARAMS diff_cu_qp_delta_depth(byte setter);
    public native byte init_qp_minus26(); public native CUVIDHEVCPICPARAMS init_qp_minus26(byte setter);
    public native byte pps_cb_qp_offset(); public native CUVIDHEVCPICPARAMS pps_cb_qp_offset(byte setter);
    public native byte pps_cr_qp_offset(); public native CUVIDHEVCPICPARAMS pps_cr_qp_offset(byte setter);

    public native @Cast("unsigned char") byte constrained_intra_pred_flag(); public native CUVIDHEVCPICPARAMS constrained_intra_pred_flag(byte setter);
    public native @Cast("unsigned char") byte weighted_pred_flag(); public native CUVIDHEVCPICPARAMS weighted_pred_flag(byte setter);
    public native @Cast("unsigned char") byte weighted_bipred_flag(); public native CUVIDHEVCPICPARAMS weighted_bipred_flag(byte setter);
    public native @Cast("unsigned char") byte transform_skip_enabled_flag(); public native CUVIDHEVCPICPARAMS transform_skip_enabled_flag(byte setter);
    public native @Cast("unsigned char") byte transquant_bypass_enabled_flag(); public native CUVIDHEVCPICPARAMS transquant_bypass_enabled_flag(byte setter);
    public native @Cast("unsigned char") byte entropy_coding_sync_enabled_flag(); public native CUVIDHEVCPICPARAMS entropy_coding_sync_enabled_flag(byte setter);
    public native @Cast("unsigned char") byte log2_parallel_merge_level_minus2(); public native CUVIDHEVCPICPARAMS log2_parallel_merge_level_minus2(byte setter);
    public native @Cast("unsigned char") byte num_extra_slice_header_bits(); public native CUVIDHEVCPICPARAMS num_extra_slice_header_bits(byte setter);

    public native @Cast("unsigned char") byte loop_filter_across_tiles_enabled_flag(); public native CUVIDHEVCPICPARAMS loop_filter_across_tiles_enabled_flag(byte setter);
    public native @Cast("unsigned char") byte loop_filter_across_slices_enabled_flag(); public native CUVIDHEVCPICPARAMS loop_filter_across_slices_enabled_flag(byte setter);
    public native @Cast("unsigned char") byte output_flag_present_flag(); public native CUVIDHEVCPICPARAMS output_flag_present_flag(byte setter);
    public native @Cast("unsigned char") byte num_ref_idx_l0_default_active_minus1(); public native CUVIDHEVCPICPARAMS num_ref_idx_l0_default_active_minus1(byte setter);
    public native @Cast("unsigned char") byte num_ref_idx_l1_default_active_minus1(); public native CUVIDHEVCPICPARAMS num_ref_idx_l1_default_active_minus1(byte setter);
    public native @Cast("unsigned char") byte lists_modification_present_flag(); public native CUVIDHEVCPICPARAMS lists_modification_present_flag(byte setter);
    public native @Cast("unsigned char") byte cabac_init_present_flag(); public native CUVIDHEVCPICPARAMS cabac_init_present_flag(byte setter);
    public native @Cast("unsigned char") byte pps_slice_chroma_qp_offsets_present_flag(); public native CUVIDHEVCPICPARAMS pps_slice_chroma_qp_offsets_present_flag(byte setter);

    public native @Cast("unsigned char") byte deblocking_filter_override_enabled_flag(); public native CUVIDHEVCPICPARAMS deblocking_filter_override_enabled_flag(byte setter);
    public native @Cast("unsigned char") byte pps_deblocking_filter_disabled_flag(); public native CUVIDHEVCPICPARAMS pps_deblocking_filter_disabled_flag(byte setter);
    public native byte pps_beta_offset_div2(); public native CUVIDHEVCPICPARAMS pps_beta_offset_div2(byte setter);
    public native byte pps_tc_offset_div2(); public native CUVIDHEVCPICPARAMS pps_tc_offset_div2(byte setter);
    public native @Cast("unsigned char") byte tiles_enabled_flag(); public native CUVIDHEVCPICPARAMS tiles_enabled_flag(byte setter);
    public native @Cast("unsigned char") byte uniform_spacing_flag(); public native CUVIDHEVCPICPARAMS uniform_spacing_flag(byte setter);
    public native @Cast("unsigned char") byte num_tile_columns_minus1(); public native CUVIDHEVCPICPARAMS num_tile_columns_minus1(byte setter);
    public native @Cast("unsigned char") byte num_tile_rows_minus1(); public native CUVIDHEVCPICPARAMS num_tile_rows_minus1(byte setter);

    public native @Cast("unsigned short") short column_width_minus1(int i); public native CUVIDHEVCPICPARAMS column_width_minus1(int i, short setter);
    @MemberGetter public native @Cast("unsigned short*") ShortPointer column_width_minus1();
    public native @Cast("unsigned short") short row_height_minus1(int i); public native CUVIDHEVCPICPARAMS row_height_minus1(int i, short setter);
    @MemberGetter public native @Cast("unsigned short*") ShortPointer row_height_minus1();

    // sps and pps extension HEVC-main 444
    public native @Cast("unsigned char") byte sps_range_extension_flag(); public native CUVIDHEVCPICPARAMS sps_range_extension_flag(byte setter);
    public native @Cast("unsigned char") byte transform_skip_rotation_enabled_flag(); public native CUVIDHEVCPICPARAMS transform_skip_rotation_enabled_flag(byte setter);
    public native @Cast("unsigned char") byte transform_skip_context_enabled_flag(); public native CUVIDHEVCPICPARAMS transform_skip_context_enabled_flag(byte setter);
    public native @Cast("unsigned char") byte implicit_rdpcm_enabled_flag(); public native CUVIDHEVCPICPARAMS implicit_rdpcm_enabled_flag(byte setter);

    public native @Cast("unsigned char") byte explicit_rdpcm_enabled_flag(); public native CUVIDHEVCPICPARAMS explicit_rdpcm_enabled_flag(byte setter);
    public native @Cast("unsigned char") byte extended_precision_processing_flag(); public native CUVIDHEVCPICPARAMS extended_precision_processing_flag(byte setter);
    public native @Cast("unsigned char") byte intra_smoothing_disabled_flag(); public native CUVIDHEVCPICPARAMS intra_smoothing_disabled_flag(byte setter);
    public native @Cast("unsigned char") byte persistent_rice_adaptation_enabled_flag(); public native CUVIDHEVCPICPARAMS persistent_rice_adaptation_enabled_flag(byte setter);

    public native @Cast("unsigned char") byte cabac_bypass_alignment_enabled_flag(); public native CUVIDHEVCPICPARAMS cabac_bypass_alignment_enabled_flag(byte setter);
    public native @Cast("unsigned char") byte pps_range_extension_flag(); public native CUVIDHEVCPICPARAMS pps_range_extension_flag(byte setter);
    public native @Cast("unsigned char") byte cross_component_prediction_enabled_flag(); public native CUVIDHEVCPICPARAMS cross_component_prediction_enabled_flag(byte setter);
    public native @Cast("unsigned char") byte chroma_qp_offset_list_enabled_flag(); public native CUVIDHEVCPICPARAMS chroma_qp_offset_list_enabled_flag(byte setter);

    public native @Cast("unsigned char") byte diff_cu_chroma_qp_offset_depth(); public native CUVIDHEVCPICPARAMS diff_cu_chroma_qp_offset_depth(byte setter);
    public native @Cast("unsigned char") byte chroma_qp_offset_list_len_minus1(); public native CUVIDHEVCPICPARAMS chroma_qp_offset_list_len_minus1(byte setter);
    public native byte cb_qp_offset_list(int i); public native CUVIDHEVCPICPARAMS cb_qp_offset_list(int i, byte setter);
    @MemberGetter public native BytePointer cb_qp_offset_list();

    public native byte cr_qp_offset_list(int i); public native CUVIDHEVCPICPARAMS cr_qp_offset_list(int i, byte setter);
    @MemberGetter public native BytePointer cr_qp_offset_list();
    public native @Cast("unsigned char") byte reserved2(int i); public native CUVIDHEVCPICPARAMS reserved2(int i, byte setter);
    @MemberGetter public native @Cast("unsigned char*") BytePointer reserved2();

    public native @Cast("unsigned int") int reserved3(int i); public native CUVIDHEVCPICPARAMS reserved3(int i, int setter);
    @MemberGetter public native @Cast("unsigned int*") IntPointer reserved3();

    // RefPicSets
    public native int NumBitsForShortTermRPSInSlice(); public native CUVIDHEVCPICPARAMS NumBitsForShortTermRPSInSlice(int setter);
    public native int NumDeltaPocsOfRefRpsIdx(); public native CUVIDHEVCPICPARAMS NumDeltaPocsOfRefRpsIdx(int setter);
    public native int NumPocTotalCurr(); public native CUVIDHEVCPICPARAMS NumPocTotalCurr(int setter);
    public native int NumPocStCurrBefore(); public native CUVIDHEVCPICPARAMS NumPocStCurrBefore(int setter);
    public native int NumPocStCurrAfter(); public native CUVIDHEVCPICPARAMS NumPocStCurrAfter(int setter);
    public native int NumPocLtCurr(); public native CUVIDHEVCPICPARAMS NumPocLtCurr(int setter);
    public native int CurrPicOrderCntVal(); public native CUVIDHEVCPICPARAMS CurrPicOrderCntVal(int setter);
    public native int RefPicIdx(int i); public native CUVIDHEVCPICPARAMS RefPicIdx(int i, int setter);
    @MemberGetter public native IntPointer RefPicIdx();                      // [refpic] Indices of valid reference pictures (-1 if unused for reference)
    public native int PicOrderCntVal(int i); public native CUVIDHEVCPICPARAMS PicOrderCntVal(int i, int setter);
    @MemberGetter public native IntPointer PicOrderCntVal();                 // [refpic]
    public native @Cast("unsigned char") byte IsLongTerm(int i); public native CUVIDHEVCPICPARAMS IsLongTerm(int i, byte setter);
    @MemberGetter public native @Cast("unsigned char*") BytePointer IsLongTerm();           // [refpic] 0=not a long-term reference, 1=long-term reference
    public native @Cast("unsigned char") byte RefPicSetStCurrBefore(int i); public native CUVIDHEVCPICPARAMS RefPicSetStCurrBefore(int i, byte setter);
    @MemberGetter public native @Cast("unsigned char*") BytePointer RefPicSetStCurrBefore(); // [0..NumPocStCurrBefore-1] -> refpic (0..15)
    public native @Cast("unsigned char") byte RefPicSetStCurrAfter(int i); public native CUVIDHEVCPICPARAMS RefPicSetStCurrAfter(int i, byte setter);
    @MemberGetter public native @Cast("unsigned char*") BytePointer RefPicSetStCurrAfter();  // [0..NumPocStCurrAfter-1] -> refpic (0..15)
    public native @Cast("unsigned char") byte RefPicSetLtCurr(int i); public native CUVIDHEVCPICPARAMS RefPicSetLtCurr(int i, byte setter);
    @MemberGetter public native @Cast("unsigned char*") BytePointer RefPicSetLtCurr();       // [0..NumPocLtCurr-1] -> refpic (0..15)
    public native @Cast("unsigned char") byte RefPicSetInterLayer0(int i); public native CUVIDHEVCPICPARAMS RefPicSetInterLayer0(int i, byte setter);
    @MemberGetter public native @Cast("unsigned char*") BytePointer RefPicSetInterLayer0();
    public native @Cast("unsigned char") byte RefPicSetInterLayer1(int i); public native CUVIDHEVCPICPARAMS RefPicSetInterLayer1(int i, byte setter);
    @MemberGetter public native @Cast("unsigned char*") BytePointer RefPicSetInterLayer1();
    public native @Cast("unsigned int") int reserved4(int i); public native CUVIDHEVCPICPARAMS reserved4(int i, int setter);
    @MemberGetter public native @Cast("unsigned int*") IntPointer reserved4();

    // scaling lists (diag order)
    public native @Cast("unsigned char") byte ScalingList4x4(int i, int j); public native CUVIDHEVCPICPARAMS ScalingList4x4(int i, int j, byte setter);
    @MemberGetter public native @Cast("unsigned char(* /*[6]*/ )[16]") BytePointer ScalingList4x4();       // [matrixId][i]
    public native @Cast("unsigned char") byte ScalingList8x8(int i, int j); public native CUVIDHEVCPICPARAMS ScalingList8x8(int i, int j, byte setter);
    @MemberGetter public native @Cast("unsigned char(* /*[6]*/ )[64]") BytePointer ScalingList8x8();       // [matrixId][i]
    public native @Cast("unsigned char") byte ScalingList16x16(int i, int j); public native CUVIDHEVCPICPARAMS ScalingList16x16(int i, int j, byte setter);
    @MemberGetter public native @Cast("unsigned char(* /*[6]*/ )[64]") BytePointer ScalingList16x16();     // [matrixId][i]
    public native @Cast("unsigned char") byte ScalingList32x32(int i, int j); public native CUVIDHEVCPICPARAMS ScalingList32x32(int i, int j, byte setter);
    @MemberGetter public native @Cast("unsigned char(* /*[2]*/ )[64]") BytePointer ScalingList32x32();     // [matrixId][i]
    public native @Cast("unsigned char") byte ScalingListDCCoeff16x16(int i); public native CUVIDHEVCPICPARAMS ScalingListDCCoeff16x16(int i, byte setter);
    @MemberGetter public native @Cast("unsigned char*") BytePointer ScalingListDCCoeff16x16();  // [matrixId]
    public native @Cast("unsigned char") byte ScalingListDCCoeff32x32(int i); public native CUVIDHEVCPICPARAMS ScalingListDCCoeff32x32(int i, byte setter);
    @MemberGetter public native @Cast("unsigned char*") BytePointer ScalingListDCCoeff32x32();  // [matrixId]
}
