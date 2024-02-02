// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

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


/** \brief This is a tagging template type. Use it with Base<T> to indicate that the C++ interface object
 *   has no ownership of the underlying C object.
 */
@Name("Ort::detail::Unowned<OrtAllocator>") @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class UnownedAllocator extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public UnownedAllocator(Pointer p) { super(p); }

}
