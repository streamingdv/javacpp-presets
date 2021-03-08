// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;

/**
 * Opaque ONNXIFI backend handle.
 * ONNXIFI backend is a combination of software layer and hardware device used
 * to run an ONNX graph.
 */
@Namespace @Name("void") @Opaque @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class onnxBackend extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public onnxBackend() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public onnxBackend(Pointer p) { super(p); }
}
