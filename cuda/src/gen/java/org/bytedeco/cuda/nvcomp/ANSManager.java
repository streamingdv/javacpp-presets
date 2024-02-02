// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvcomp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvcomp.*;


/**
 * \brief High-level interface class for ANS compressor
 */
@Namespace("nvcomp") @Properties(inherit = org.bytedeco.cuda.presets.nvcomp.class)
public class ANSManager extends PimplManager {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ANSManager(Pointer p) { super(p); }


  public ANSManager(
      @Cast("size_t") long uncomp_chunk_size, @Const @ByRef nvcompBatchedANSOpts_t format_opts, 
      CUstream_st user_stream/*=0*/, int device_id/*=0*/, @Cast("ChecksumPolicy") int checksum_policy/*=NoComputeNoVerify*/) { super((Pointer)null); allocate(uncomp_chunk_size, format_opts, user_stream, device_id, checksum_policy); }
  private native void allocate(
      @Cast("size_t") long uncomp_chunk_size, @Const @ByRef nvcompBatchedANSOpts_t format_opts, 
      CUstream_st user_stream/*=0*/, int device_id/*=0*/, @Cast("ChecksumPolicy") int checksum_policy/*=NoComputeNoVerify*/);
  public ANSManager(
      @Cast("size_t") long uncomp_chunk_size, @Const @ByRef nvcompBatchedANSOpts_t format_opts) { super((Pointer)null); allocate(uncomp_chunk_size, format_opts); }
  private native void allocate(
      @Cast("size_t") long uncomp_chunk_size, @Const @ByRef nvcompBatchedANSOpts_t format_opts);
}
