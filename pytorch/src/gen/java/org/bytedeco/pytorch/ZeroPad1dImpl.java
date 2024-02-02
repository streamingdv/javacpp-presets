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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ZeroPad1d ~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// Applies ZeroPad over a 1-D input.
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ZeroPad1dImpl extends ZeroPad1dImplBase {
    static { Loader.load(); }

  
    public ZeroPad1dImpl(@ByVal @Cast("torch::ExpandingArray<1*2>*") LongPointer padding) { super((Pointer)null); allocate(padding); }
    private native void allocate(@ByVal @Cast("torch::ExpandingArray<1*2>*") LongPointer padding);
    public ZeroPad1dImpl(@Const @ByRef ZeroPad1dOptions options_) { super((Pointer)null); allocate(options_); }
    private native void allocate(@Const @ByRef ZeroPad1dOptions options_);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ZeroPad1dImpl(Pointer p) { super(p); }
    /** Downcast constructor. */
    public ZeroPad1dImpl(Module pointer) { super((Pointer)null); allocate(pointer); }
    @Namespace private native @SharedPtr @Name("SHARED_PTR_NAMESPACE::dynamic_pointer_cast<torch::nn::ZeroPad1dImpl, torch::nn::Module>") void allocate(@SharedPtr Module pointer);

}
