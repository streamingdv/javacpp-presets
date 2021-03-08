// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.tesseract;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.leptonica.*;
import static org.bytedeco.leptonica.global.lept.*;

import static org.bytedeco.tesseract.global.tesseract.*;


@Name("TessResultCallback1<bool,int>") @Properties(inherit = org.bytedeco.tesseract.presets.tesseract.class)
public class DeleteCallback extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public DeleteCallback() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DeleteCallback(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DeleteCallback(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public DeleteCallback position(long position) {
        return (DeleteCallback)super.position(position);
    }
    @Override public DeleteCallback getPointer(long i) {
        return new DeleteCallback((Pointer)this).position(position + i);
    }

  @Virtual(true) public native @Cast("bool") boolean Run(int arg0);
}
