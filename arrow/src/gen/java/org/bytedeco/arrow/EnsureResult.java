// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow") @Opaque @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class EnsureResult extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public EnsureResult() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EnsureResult(Pointer p) { super(p); }
}
