// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.nvcodec.nvcuvid;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.nvcodec.global.nvcuvid.*;


/*********************************************************/
/** \struct CUVIDH264SVCEXT
/** H.264 SVC picture parameters ext
/** This structure is used in CUVIDH264PICPARAMS structure
/*********************************************************/
@Properties(inherit = org.bytedeco.nvcodec.presets.nvcuvid.class)
public class CUVIDH264SVCEXT extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUVIDH264SVCEXT() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUVIDH264SVCEXT(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUVIDH264SVCEXT(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUVIDH264SVCEXT position(long position) {
        return (CUVIDH264SVCEXT)super.position(position);
    }
    @Override public CUVIDH264SVCEXT getPointer(long i) {
        return new CUVIDH264SVCEXT((Pointer)this).offsetAddress(i);
    }

    public native @Cast("unsigned char") byte profile_idc(); public native CUVIDH264SVCEXT profile_idc(byte setter);
    public native @Cast("unsigned char") byte level_idc(); public native CUVIDH264SVCEXT level_idc(byte setter);
    public native @Cast("unsigned char") byte DQId(); public native CUVIDH264SVCEXT DQId(byte setter);
    public native @Cast("unsigned char") byte DQIdMax(); public native CUVIDH264SVCEXT DQIdMax(byte setter);
    public native @Cast("unsigned char") byte disable_inter_layer_deblocking_filter_idc(); public native CUVIDH264SVCEXT disable_inter_layer_deblocking_filter_idc(byte setter);
    public native @Cast("unsigned char") byte ref_layer_chroma_phase_y_plus1(); public native CUVIDH264SVCEXT ref_layer_chroma_phase_y_plus1(byte setter);
    public native byte inter_layer_slice_alpha_c0_offset_div2(); public native CUVIDH264SVCEXT inter_layer_slice_alpha_c0_offset_div2(byte setter);
    public native byte inter_layer_slice_beta_offset_div2(); public native CUVIDH264SVCEXT inter_layer_slice_beta_offset_div2(byte setter);

    public native @Cast("unsigned short") short DPBEntryValidFlag(); public native CUVIDH264SVCEXT DPBEntryValidFlag(short setter);
    public native @Cast("unsigned char") byte inter_layer_deblocking_filter_control_present_flag(); public native CUVIDH264SVCEXT inter_layer_deblocking_filter_control_present_flag(byte setter);
    public native @Cast("unsigned char") byte extended_spatial_scalability_idc(); public native CUVIDH264SVCEXT extended_spatial_scalability_idc(byte setter);
    public native @Cast("unsigned char") byte adaptive_tcoeff_level_prediction_flag(); public native CUVIDH264SVCEXT adaptive_tcoeff_level_prediction_flag(byte setter);
    public native @Cast("unsigned char") byte slice_header_restriction_flag(); public native CUVIDH264SVCEXT slice_header_restriction_flag(byte setter);
    public native @Cast("unsigned char") byte chroma_phase_x_plus1_flag(); public native CUVIDH264SVCEXT chroma_phase_x_plus1_flag(byte setter);
    public native @Cast("unsigned char") byte chroma_phase_y_plus1(); public native CUVIDH264SVCEXT chroma_phase_y_plus1(byte setter);

    public native @Cast("unsigned char") byte tcoeff_level_prediction_flag(); public native CUVIDH264SVCEXT tcoeff_level_prediction_flag(byte setter);
    public native @Cast("unsigned char") byte constrained_intra_resampling_flag(); public native CUVIDH264SVCEXT constrained_intra_resampling_flag(byte setter);
    public native @Cast("unsigned char") byte ref_layer_chroma_phase_x_plus1_flag(); public native CUVIDH264SVCEXT ref_layer_chroma_phase_x_plus1_flag(byte setter);
    public native @Cast("unsigned char") byte store_ref_base_pic_flag(); public native CUVIDH264SVCEXT store_ref_base_pic_flag(byte setter);
    public native @Cast("unsigned char") byte Reserved8BitsA(); public native CUVIDH264SVCEXT Reserved8BitsA(byte setter);
    public native @Cast("unsigned char") byte Reserved8BitsB(); public native CUVIDH264SVCEXT Reserved8BitsB(byte setter);

    public native short scaled_ref_layer_left_offset(); public native CUVIDH264SVCEXT scaled_ref_layer_left_offset(short setter);
    public native short scaled_ref_layer_top_offset(); public native CUVIDH264SVCEXT scaled_ref_layer_top_offset(short setter);
    public native short scaled_ref_layer_right_offset(); public native CUVIDH264SVCEXT scaled_ref_layer_right_offset(short setter);
    public native short scaled_ref_layer_bottom_offset(); public native CUVIDH264SVCEXT scaled_ref_layer_bottom_offset(short setter);
    public native @Cast("unsigned short") short Reserved16Bits(); public native CUVIDH264SVCEXT Reserved16Bits(short setter);
    /** Points to the picparams for the next layer to be decoded. 
                                                 Linked list ends at the target layer. */
    public native CUVIDPICPARAMS pNextLayer(); public native CUVIDH264SVCEXT pNextLayer(CUVIDPICPARAMS setter);
    /** whether to store ref base pic */
    public native int bRefBaseLayer(); public native CUVIDH264SVCEXT bRefBaseLayer(int setter);
}
