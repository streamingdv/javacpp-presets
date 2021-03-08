// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.tvm;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;
import static org.bytedeco.mkl.global.mkl_rt.*;

import static org.bytedeco.tvm.global.tvm_runtime.*;


/** \brief interface of i/o stream that support seek */
@Namespace("dmlc") @Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class SeekStream extends Stream {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SeekStream(Pointer p) { super(p); }

  // virtual destructor
  /** \brief seek to certain position of the file */
  public native void Seek(@Cast("size_t") long pos);
  /** \brief tell the position of the stream */
  public native @Cast("size_t") long Tell();
  /**
   * \brief generic factory function
   *  create an SeekStream for read only,
   *  the stream will close the underlying files upon deletion
   *  error will be reported and the system will exit when create failed
   * @param uri the uri of the input currently we support
   *            hdfs://, s3://, and file:// by default file:// will be used
   * @param allow_null whether NULL can be returned, or directly report error
   * @return the created stream, can be NULL when allow_null == true and file do not exist
   */
  
}
