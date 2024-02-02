// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.nvcodec.nvencodeapi;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.nvcodec.nvcuvid.*;
import static org.bytedeco.nvcodec.global.nvcuvid.*;

import static org.bytedeco.nvcodec.global.nvencodeapi.*;


/**
 * \struct _NV_ENC_STAT
 * Encode Stats structure.
 */
@Properties(inherit = org.bytedeco.nvcodec.presets.nvencodeapi.class)
public class NV_ENC_STAT extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NV_ENC_STAT() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NV_ENC_STAT(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NV_ENC_STAT(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NV_ENC_STAT position(long position) {
        return (NV_ENC_STAT)super.position(position);
    }
    @Override public NV_ENC_STAT getPointer(long i) {
        return new NV_ENC_STAT((Pointer)this).offsetAddress(i);
    }

    /** [in]:  Struct version. Must be set to ::NV_ENC_STAT_VER. */
    public native @Cast("uint32_t") int version(); public native NV_ENC_STAT version(int setter);
    /** [in]:  Reserved and must be set to 0 */
    public native @Cast("uint32_t") int reserved(); public native NV_ENC_STAT reserved(int setter);
    /** [out]: Specifies the pointer to output bitstream. */
    public native NV_ENC_OUTPUT_PTR outputBitStream(); public native NV_ENC_STAT outputBitStream(NV_ENC_OUTPUT_PTR setter);
    /** [out]: Size of generated bitstream in bytes. */
    public native @Cast("uint32_t") int bitStreamSize(); public native NV_ENC_STAT bitStreamSize(int setter);
    /** [out]: Picture type of encoded picture. See ::NV_ENC_PIC_TYPE. */
    public native @Cast("uint32_t") int picType(); public native NV_ENC_STAT picType(int setter);
    /** [out]: Offset of last valid bytes of completed bitstream */
    public native @Cast("uint32_t") int lastValidByteOffset(); public native NV_ENC_STAT lastValidByteOffset(int setter);
    /** [out]: Offsets of each slice */
    public native @Cast("uint32_t") int sliceOffsets(int i); public native NV_ENC_STAT sliceOffsets(int i, int setter);
    @MemberGetter public native @Cast("uint32_t*") IntPointer sliceOffsets();
    /** [out]: Picture number */
    public native @Cast("uint32_t") int picIdx(); public native NV_ENC_STAT picIdx(int setter);
    /** [out]: Average QP of the frame. */
    public native @Cast("uint32_t") int frameAvgQP(); public native NV_ENC_STAT frameAvgQP(int setter);
    /** [out]: Flag indicating this frame is marked as LTR frame */
    public native @Cast("uint32_t") @NoOffset int ltrFrame(); public native NV_ENC_STAT ltrFrame(int setter);
    /** [in]:  Reserved bit fields and must be set to 0 */
    public native @Cast("uint32_t") @NoOffset int reservedBitFields(); public native NV_ENC_STAT reservedBitFields(int setter);
    /** [out]: Frame index associated with this LTR frame. */
    public native @Cast("uint32_t") int ltrFrameIdx(); public native NV_ENC_STAT ltrFrameIdx(int setter);
    /** [out]: For H264, Number of Intra MBs in the encoded frame. For HEVC, Number of Intra CTBs in the encoded frame. */
    public native @Cast("uint32_t") int intraMBCount(); public native NV_ENC_STAT intraMBCount(int setter);
    /** [out]: For H264, Number of Inter MBs in the encoded frame, includes skip MBs. For HEVC, Number of Inter CTBs in the encoded frame. */
    public native @Cast("uint32_t") int interMBCount(); public native NV_ENC_STAT interMBCount(int setter);
    /** [out]: Average Motion Vector in X direction for the encoded frame. */
    public native @Cast("int32_t") int averageMVX(); public native NV_ENC_STAT averageMVX(int setter);
    /** [out]: Average Motion Vector in y direction for the encoded frame. */
    public native @Cast("int32_t") int averageMVY(); public native NV_ENC_STAT averageMVY(int setter);
    /** [in]:  Reserved and must be set to 0 */
    public native @Cast("uint32_t") int reserved1(int i); public native NV_ENC_STAT reserved1(int i, int setter);
    @MemberGetter public native @Cast("uint32_t*") IntPointer reserved1();
    /** [in]:  Reserved and must be set to NULL */
    public native Pointer reserved2(int i); public native NV_ENC_STAT reserved2(int i, Pointer setter);
    @MemberGetter public native @Cast("void**") PointerPointer reserved2();
}
