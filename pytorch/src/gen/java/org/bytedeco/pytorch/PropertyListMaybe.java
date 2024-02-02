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


@Name("torch::jit::Maybe<torch::jit::List<torch::jit::Property> >") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class PropertyListMaybe extends TreeView {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PropertyListMaybe(Pointer p) { super(p); }

  public PropertyListMaybe(@Const @ByRef TreeRef tree) { super((Pointer)null); allocate(tree); }
  private native void allocate(@Const @ByRef TreeRef tree);
  /* implicit */ public PropertyListMaybe(@Const @ByRef PropertyList tree) { super((Pointer)null); allocate(tree); }
private native void allocate(@Const @ByRef PropertyList tree);
  public native @Cast("bool") boolean present();
  public native @ByVal PropertyList get();
  
  public static native @ByVal PropertyListMaybe create(@Const @ByRef SourceRange range);
  public static native @ByVal PropertyListMaybe create(@Const @ByRef SourceRange range, @Const @ByRef PropertyList value);
}
