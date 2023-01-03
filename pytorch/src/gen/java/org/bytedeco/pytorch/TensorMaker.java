// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;
 // namespace detail

/** Provides a fluent API to construct tensors from external data.
 * 
 *  The fluent API can be used instead of {@code from_blob} functions in case the
 *  required set of parameters does not align with the existing overloads.
 * 
 *      at::Tensor tensor = at::for_blob(data, sizes)
 *              .strides(strides)
 *              .context(context, [](void *ctx) { delete static_cast<Ctx*>(ctx); })
 *              .options(...)
 *              .make_tensor();
 *  */
@Namespace("at") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TensorMaker extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorMaker(Pointer p) { super(p); }


  public native @ByRef @NoException(true) TensorMaker strides(@ByVal LongArrayRefOptional value);

  public native @ByRef @NoException(true) TensorMaker storage_offset(@ByVal LongOptional value);

  public native @ByRef @NoException(true) TensorMaker deleter(@ByVal Deleter value);
  public native @ByRef @NoException(true) TensorMaker deleter(@ByVal @Cast("void(*)(void*)") Pointer value);
  public native @ByRef @NoException(true) TensorMaker deleter(@ByVal @Cast("void(*)(void*)") long value);

  public native @ByRef @NoException(true) TensorMaker context(Pointer value, @Cast("at::TensorMaker::ContextDeleter") Deleter deleter/*=nullptr*/);
  public native @ByRef @NoException(true) TensorMaker context(Pointer value);
  public native @ByRef @NoException(true) TensorMaker context(Pointer value, @Cast("at::TensorMaker::ContextDeleter") Pointer deleter/*=nullptr*/);
  public native @ByRef @NoException(true) TensorMaker context(Pointer value, @Cast("at::TensorMaker::ContextDeleter") long deleter/*=nullptr*/);

  public native @ByRef @NoException(true) TensorMaker target_device(@ByVal DeviceOptional value);

  public native @ByRef @NoException(true) TensorMaker options(@ByVal TensorOptions value);

  public native @ByVal Tensor make_tensor();
}
