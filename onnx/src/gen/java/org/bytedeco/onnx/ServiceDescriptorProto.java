// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;

@Namespace("google::protobuf") @Opaque @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class ServiceDescriptorProto extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public ServiceDescriptorProto() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ServiceDescriptorProto(Pointer p) { super(p); }
}
