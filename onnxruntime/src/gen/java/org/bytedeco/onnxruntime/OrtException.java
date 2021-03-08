// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.onnxruntime;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;

import static org.bytedeco.onnxruntime.global.onnxruntime.*;


// All C++ methods that can fail will throw an exception of this type
@Name("Ort::Exception") @NoOffset @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class OrtException extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OrtException(Pointer p) { super(p); }

  public OrtException(@Cast({"char*", "std::string&&"}) @StdString BytePointer string, @Cast("OrtErrorCode") int code) { super((Pointer)null); allocate(string, code); }
  private native void allocate(@Cast({"char*", "std::string&&"}) @StdString BytePointer string, @Cast("OrtErrorCode") int code);
  public OrtException(@Cast({"char*", "std::string&&"}) @StdString String string, @Cast("OrtErrorCode") int code) { super((Pointer)null); allocate(string, code); }
  private native void allocate(@Cast({"char*", "std::string&&"}) @StdString String string, @Cast("OrtErrorCode") int code);

  public native @Cast("OrtErrorCode") int GetOrtErrorCode();
  public native @NoException @Cast("const char*") BytePointer what();
}
