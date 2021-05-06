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
/** \struct CUVIDMPEG4PICPARAMS
/** MPEG-4 picture parameters
/** This structure is used in CUVIDPICPARAMS structure
/*******************************************************/
@Properties(inherit = org.bytedeco.nvcodec.presets.nvcuvid.class)
public class CUVIDMPEG4PICPARAMS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUVIDMPEG4PICPARAMS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUVIDMPEG4PICPARAMS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUVIDMPEG4PICPARAMS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUVIDMPEG4PICPARAMS position(long position) {
        return (CUVIDMPEG4PICPARAMS)super.position(position);
    }
    @Override public CUVIDMPEG4PICPARAMS getPointer(long i) {
        return new CUVIDMPEG4PICPARAMS((Pointer)this).offsetAddress(i);
    }

    public native int ForwardRefIdx(); public native CUVIDMPEG4PICPARAMS ForwardRefIdx(int setter);          // Picture index of forward reference (P/B-frames)
    public native int BackwardRefIdx(); public native CUVIDMPEG4PICPARAMS BackwardRefIdx(int setter);         // Picture index of backward reference (B-frames)
    // VOL
    public native int video_object_layer_width(); public native CUVIDMPEG4PICPARAMS video_object_layer_width(int setter);
    public native int video_object_layer_height(); public native CUVIDMPEG4PICPARAMS video_object_layer_height(int setter);
    public native int vop_time_increment_bitcount(); public native CUVIDMPEG4PICPARAMS vop_time_increment_bitcount(int setter);
    public native int top_field_first(); public native CUVIDMPEG4PICPARAMS top_field_first(int setter);
    public native int resync_marker_disable(); public native CUVIDMPEG4PICPARAMS resync_marker_disable(int setter);
    public native int quant_type(); public native CUVIDMPEG4PICPARAMS quant_type(int setter);
    public native int quarter_sample(); public native CUVIDMPEG4PICPARAMS quarter_sample(int setter);
    public native int short_video_header(); public native CUVIDMPEG4PICPARAMS short_video_header(int setter);
    public native int divx_flags(); public native CUVIDMPEG4PICPARAMS divx_flags(int setter);
    // VOP
    public native int vop_coding_type(); public native CUVIDMPEG4PICPARAMS vop_coding_type(int setter);
    public native int vop_coded(); public native CUVIDMPEG4PICPARAMS vop_coded(int setter);
    public native int vop_rounding_type(); public native CUVIDMPEG4PICPARAMS vop_rounding_type(int setter);
    public native int alternate_vertical_scan_flag(); public native CUVIDMPEG4PICPARAMS alternate_vertical_scan_flag(int setter);
    public native int interlaced(); public native CUVIDMPEG4PICPARAMS interlaced(int setter);
    public native int vop_fcode_forward(); public native CUVIDMPEG4PICPARAMS vop_fcode_forward(int setter);
    public native int vop_fcode_backward(); public native CUVIDMPEG4PICPARAMS vop_fcode_backward(int setter);
    public native int trd(int i); public native CUVIDMPEG4PICPARAMS trd(int i, int setter);
    @MemberGetter public native IntPointer trd();
    public native int trb(int i); public native CUVIDMPEG4PICPARAMS trb(int i, int setter);
    @MemberGetter public native IntPointer trb();
    // Quantization matrices (raster order)
    public native @Cast("unsigned char") byte QuantMatrixIntra(int i); public native CUVIDMPEG4PICPARAMS QuantMatrixIntra(int i, byte setter);
    @MemberGetter public native @Cast("unsigned char*") BytePointer QuantMatrixIntra();
    public native @Cast("unsigned char") byte QuantMatrixInter(int i); public native CUVIDMPEG4PICPARAMS QuantMatrixInter(int i, byte setter);
    @MemberGetter public native @Cast("unsigned char*") BytePointer QuantMatrixInter();
    public native int gmc_enabled(); public native CUVIDMPEG4PICPARAMS gmc_enabled(int setter);
}
