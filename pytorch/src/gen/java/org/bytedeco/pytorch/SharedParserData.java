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


// stuff that is shared against all TC lexers/parsers and is initialized only
// once.
@Namespace("torch::jit") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SharedParserData extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SharedParserData(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SharedParserData(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SharedParserData position(long position) {
        return (SharedParserData)super.position(position);
    }
    @Override public SharedParserData getPointer(long i) {
        return new SharedParserData((Pointer)this).offsetAddress(i);
    }

  public SharedParserData() { super((Pointer)null); allocate(); }
  private native void allocate();

  public native @Cast("bool") boolean match(
        @ByVal StringCordView.Iterator pos,
        @Cast("bool") boolean continuation,
        @Cast("bool") boolean whitespace_token,
        IntPointer kind,
        StringCordView.Iterator start,
        StringCordView.Iterator end);
  public native @Cast("bool") boolean match(
        @ByVal StringCordView.Iterator pos,
        @Cast("bool") boolean continuation,
        @Cast("bool") boolean whitespace_token,
        IntBuffer kind,
        StringCordView.Iterator start,
        StringCordView.Iterator end);
  public native @Cast("bool") boolean match(
        @ByVal StringCordView.Iterator pos,
        @Cast("bool") boolean continuation,
        @Cast("bool") boolean whitespace_token,
        int[] kind,
        StringCordView.Iterator start,
        StringCordView.Iterator end);

  public native @Cast("bool") boolean isUnary(int kind, IntPointer prec);
  public native @Cast("bool") boolean isUnary(int kind, IntBuffer prec);
  public native @Cast("bool") boolean isUnary(int kind, int[] prec);
  public native @Cast("bool") boolean isBinary(int kind, IntPointer prec);
  public native @Cast("bool") boolean isBinary(int kind, IntBuffer prec);
  public native @Cast("bool") boolean isBinary(int kind, int[] prec);
  public native @Cast("bool") boolean isRightAssociative(int kind);
}
