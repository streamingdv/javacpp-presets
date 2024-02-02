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
 // namespace functional

// ============================================================================

/** Options for the {@code CrossMapLRN2d} module.
 * 
 *  Example:
 *  <pre>{@code
 *  CrossMapLRN2d model(CrossMapLRN2dOptions(3).alpha(1e-5).beta(0.1).k(10));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class CrossMapLRN2dOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CrossMapLRN2dOptions(Pointer p) { super(p); }

  public CrossMapLRN2dOptions(@Cast("int64_t") long size) { super((Pointer)null); allocate(size); }
  private native void allocate(@Cast("int64_t") long size);
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer size();
  public native @ByRef @NoException(true) DoublePointer alpha();
  public native @ByRef @NoException(true) DoublePointer beta();
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer k();
}
