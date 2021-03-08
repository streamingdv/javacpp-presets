// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;

// #endif

// begin_ntoshvp

//
// Void
//

@Namespace @Name("void") @Opaque @Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PVOID extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public PVOID() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PVOID(Pointer p) { super(p); }
}
