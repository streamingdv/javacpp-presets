// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.clang;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;

import static org.bytedeco.llvm.global.clang.*;


// #ifdef __has_feature
// #if __has_feature(blocks)

// #endif
// #endif

/**
 * The client's data object that is associated with a CXFile.
 */
@Namespace @Name("void") @Opaque @Properties(inherit = org.bytedeco.llvm.presets.clang.class)
public class CXIdxClientFile extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CXIdxClientFile() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXIdxClientFile(Pointer p) { super(p); }
}
