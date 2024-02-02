// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class UndefinedTensorImpl extends TensorImpl {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public UndefinedTensorImpl(Pointer p) { super(p); }

  // Without this, we get:
  //  error: identifier "at::UndefinedTensorImpl::_singleton" is undefined in
  //  device code
  // (ostensibly because the constexpr tricks MSVC into trying to compile this
  // function for device as well).
// #ifdef _WIN32
// #else
  public static native @Const TensorImpl singleton();
// #ifdef DEBUG
  public native @Cast("bool") boolean has_storage();
// #endif
  public native void set_storage_offset(@Cast("int64_t") long offset);
}
