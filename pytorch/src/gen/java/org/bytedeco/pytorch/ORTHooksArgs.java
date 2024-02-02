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


// NB: dummy argument to suppress "ISO C++11 requires at least one argument
// for the "..." in a variadic macro"
@Namespace("at") @Opaque @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ORTHooksArgs extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public ORTHooksArgs() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ORTHooksArgs(Pointer p) { super(p); }
}
