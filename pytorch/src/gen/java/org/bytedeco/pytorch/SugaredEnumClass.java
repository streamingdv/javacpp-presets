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


@Namespace("torch::jit") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SugaredEnumClass extends SugaredValue {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SugaredEnumClass(Pointer p) { super(p); }

  public SugaredEnumClass(@SharedPtr EnumType enum_type) { super((Pointer)null); allocate(enum_type); }
  private native void allocate(@SharedPtr EnumType enum_type);

  public native @StdString BytePointer kind();

  public native @SharedPtr("torch::jit::SugaredValue") @ByVal SugaredValue attr(
        @Const @ByRef SourceRange loc,
        @ByRef GraphFunction m,
        @StdString BytePointer field);
  public native @SharedPtr("torch::jit::SugaredValue") @ByVal SugaredValue attr(
        @Const @ByRef SourceRange loc,
        @ByRef GraphFunction m,
        @StdString String field);

  public native @SharedPtr("torch::jit::SugaredValue") @ByVal SugaredValue iter(@Const @ByRef SourceRange loc, @ByRef GraphFunction m);
}
