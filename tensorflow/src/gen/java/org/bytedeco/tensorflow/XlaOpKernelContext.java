// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Convenience macros for asserting and handling exceptional conditions.
// Analogous to the CHECK* macros provided by logging.h.
//
// Example use:
// void Compute(OperationContext* context) {
//   OP_REQUIRES(context, context->num_inputs() == 2,
//               errors::InvalidArgument("FooOp requires 2 arguments"));
//   ...
//   Status status = SomeUncertainMethod();
//   OP_REQUIRES_OK(context, status);
//   ...
// }

// Generate a fatal error if OP_REQUIRES or OP_REQUIRES_OK are used in
// AsyncOpKernel implementations. If these macros are used and the condition
// does not hold, the `done` callback will never be called and the system will
// deadlock, so a crash failure is preferable. Since the OP_REQUIRES[_OK] macros
// are legal to use in AsyncOpKernel constructors, we use overload resolution
// to distinguish between OpKernelConstruction* and OpKernelContext* context
// types.
@Namespace("tensorflow") @Opaque @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class XlaOpKernelContext extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public XlaOpKernelContext() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public XlaOpKernelContext(Pointer p) { super(p); }
}
