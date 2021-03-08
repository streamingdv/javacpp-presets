// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.tesseract;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.leptonica.*;
import static org.bytedeco.leptonica.global.lept.*;

import static org.bytedeco.tesseract.global.tesseract.*;


@Name("TessResultCallback2<bool,tesseract::TFile*,char*>") @Properties(inherit = org.bytedeco.tesseract.presets.tesseract.class)
public class CharReadCallback extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CharReadCallback() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CharReadCallback(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CharReadCallback(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CharReadCallback position(long position) {
        return (CharReadCallback)super.position(position);
    }
    @Override public CharReadCallback getPointer(long i) {
        return new CharReadCallback((Pointer)this).position(position + i);
    }

  @Virtual(true) public native @Cast("bool") boolean Run(TFile arg0, @Cast("char*") BytePointer arg1);
}
