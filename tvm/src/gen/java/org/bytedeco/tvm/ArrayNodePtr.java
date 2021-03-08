// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.tvm;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;
import static org.bytedeco.mkl.global.mkl_rt.*;

import static org.bytedeco.tvm.global.tvm_runtime.*;

@Name("tvm::runtime::ObjectPtr<tvm::runtime::ArrayNode>") @NoOffset @Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class ArrayNodePtr extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ArrayNodePtr(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ArrayNodePtr(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ArrayNodePtr position(long position) {
        return (ArrayNodePtr)super.position(position);
    }
    @Override public ArrayNodePtr getPointer(long i) {
        return new ArrayNodePtr((Pointer)this).position(position + i);
    }

  /** \brief default constructor */
  public ArrayNodePtr() { super((Pointer)null); allocate(); }
  private native void allocate();
  /** \brief default constructor */  // NOLINT(*)
  /**
   * \brief copy constructor
   * @param other The value to be moved
   */
  public ArrayNodePtr(@Const @ByRef ArrayNodePtr other) { super((Pointer)null); allocate(other); }
  private native void allocate(@Const @ByRef ArrayNodePtr other);
  /**
   * \brief copy constructor
   * @param other The value to be moved
   */
  /**
   * \brief move constructor
   * @param other The value to be moved
   */
  /**
   * \brief move constructor
   * @param other The value to be moved
   */
  /** \brief destructor */
  /**
   * \brief Swap this array with another Object
   * @param other The other Object
   */
  public native void swap(@ByRef ArrayNodePtr other);
  /**
   * @return Get the content of the pointer
   */
  public native ArrayNode get();
  /**
   * @return The pointer
   */
  public native @Name("operator ->") ArrayNode access();
  /**
   * @return The reference
   */
  public native @ByRef @Name("operator *") ArrayNode multiply();
  /**
   * \brief copy assignmemt
   * @param other The value to be assigned.
   * @return reference to self.
   */
  public native @ByRef @Name("operator =") ArrayNodePtr put(@Const @ByRef ArrayNodePtr other);
  /**
   * \brief move assignmemt
   * @param other The value to be assigned.
   * @return reference to self.
   */
  /** \brief reset the content of ptr to be nullptr */
  public native void reset();
  /** @return The use count of the ptr, for debug purposes */
  public native int use_count();
  /** @return whether the reference is unique */
  public native @Cast("bool") boolean unique();
  /** @return Whether two ObjectPtr do not equal each other */
  public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef ArrayNodePtr other);
  /** @return Whether two ObjectPtr equals each other */
  public native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef ArrayNodePtr other);
  /** @return Whether the pointer is nullptr */
  /** @return Whether the pointer is not nullptr */
}
