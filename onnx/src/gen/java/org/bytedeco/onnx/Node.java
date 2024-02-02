// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;


// Node is the base class of the IR graph. It represents one computation
// and dependencies on a list of Values. The "prim-ops", so to speak.
@Namespace("onnx") @Opaque @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class Node extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public Node() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Node(Pointer p) { super(p); }
}
