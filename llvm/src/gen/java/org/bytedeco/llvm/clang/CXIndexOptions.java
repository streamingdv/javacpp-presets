// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.clang;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;

import static org.bytedeco.llvm.global.clang.*;


/**
 * Index initialization options.
 *
 * 0 is the default value of each member of this struct except for Size.
 * Initialize the struct in one of the following three ways to avoid adapting
 * code each time a new member is added to it:
 * <pre>{@code
 * CXIndexOptions Opts;
 * memset(&Opts, 0, sizeof(Opts));
 * Opts.Size = sizeof(CXIndexOptions);
 * }</pre>
 * or explicitly initialize the first data member and zero-initialize the rest:
 * <pre>{@code
 * CXIndexOptions Opts = { sizeof(CXIndexOptions) };
 * }</pre>
 * or to prevent the -Wmissing-field-initializers warning for the above version:
 * <pre>{@code
 * CXIndexOptions Opts{};
 * Opts.Size = sizeof(CXIndexOptions);
 * }</pre>
 */
@Properties(inherit = org.bytedeco.llvm.presets.clang.class)
public class CXIndexOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXIndexOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CXIndexOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXIndexOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CXIndexOptions position(long position) {
        return (CXIndexOptions)super.position(position);
    }
    @Override public CXIndexOptions getPointer(long i) {
        return new CXIndexOptions((Pointer)this).offsetAddress(i);
    }

  /**
   * The size of struct CXIndexOptions used for option versioning.
   *
   * Always initialize this member to sizeof(CXIndexOptions), or assign
   * sizeof(CXIndexOptions) to it right after creating a CXIndexOptions object.
   */
  public native @Cast("unsigned") int Size(); public native CXIndexOptions Size(int setter);
  /**
   * A CXChoice enumerator that specifies the indexing priority policy.
   * @see CXGlobalOpt_ThreadBackgroundPriorityForIndexing
   */
  public native @Cast("unsigned char") byte ThreadBackgroundPriorityForIndexing(); public native CXIndexOptions ThreadBackgroundPriorityForIndexing(byte setter);
  /**
   * A CXChoice enumerator that specifies the editing priority policy.
   * @see CXGlobalOpt_ThreadBackgroundPriorityForEditing
   */
  public native @Cast("unsigned char") byte ThreadBackgroundPriorityForEditing(); public native CXIndexOptions ThreadBackgroundPriorityForEditing(byte setter);
  /**
   * @see clang_createIndex()
   */
  public native @Cast("unsigned") @NoOffset int ExcludeDeclarationsFromPCH(); public native CXIndexOptions ExcludeDeclarationsFromPCH(int setter);
  /**
   * @see clang_createIndex()
   */
  public native @Cast("unsigned") @NoOffset int DisplayDiagnostics(); public native CXIndexOptions DisplayDiagnostics(int setter);
  /**
   * Store PCH in memory. If zero, PCH are stored in temporary files.
   */
  public native @Cast("unsigned") @NoOffset int StorePreamblesInMemory(); public native CXIndexOptions StorePreamblesInMemory(int setter);
  

  /**
   * The path to a directory, in which to store temporary PCH files. If null or
   * empty, the default system temporary directory is used. These PCH files are
   * deleted on clean exit but stay on disk if the program crashes or is killed.
   *
   * This option is ignored if \a StorePreamblesInMemory is non-zero.
   *
   * Libclang does not create the directory at the specified path in the file
   * system. Therefore it must exist, or storing PCH files will fail.
   */
  public native @Cast("const char*") BytePointer PreambleStoragePath(); public native CXIndexOptions PreambleStoragePath(BytePointer setter);
  /**
   * Specifies a path which will contain log files for certain libclang
   * invocations. A null value implies that libclang invocations are not logged.
   */
  public native @Cast("const char*") BytePointer InvocationEmissionPath(); public native CXIndexOptions InvocationEmissionPath(BytePointer setter);
}
