// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;


@Namespace("onnx") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class FunctionBuilder extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FunctionBuilder(Pointer p) { super(p); }

  public FunctionBuilder(@ByRef FunctionProto funProto_) { super((Pointer)null); allocate(funProto_); }
  private native void allocate(@ByRef FunctionProto funProto_);

  public native @ByRef FunctionBuilder Add(@Cast("const char*") BytePointer nodes_txt);
  public native @ByRef FunctionBuilder Add(String nodes_txt);

  public native @ByRef FunctionBuilder Add(@Cast("const char*") BytePointer node_txt, @Const @ByRef AttributeProto attr);
  public native @ByRef FunctionBuilder Add(String node_txt, @Const @ByRef AttributeProto attr);

  public native @ByRef FunctionBuilder Const(@StdString BytePointer name, @Const @ByRef TensorProto tensor);
  public native @ByRef FunctionBuilder Const(@StdString String name, @Const @ByRef TensorProto tensor);

  // Creates a scalar constant (a tensor of rank zero).

  // Creates a 1D tensor constant consisting of a single value.

  // Creates a 1D tensor constant consisting of zero or more values.

  public native @ByRef FunctionBuilder AddOpset(@Cast("const char*") BytePointer domain, int version);
  public native @ByRef FunctionBuilder AddOpset(String domain, int version);
}
