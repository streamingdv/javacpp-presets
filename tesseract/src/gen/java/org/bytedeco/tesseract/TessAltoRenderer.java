// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.tesseract;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.leptonica.*;
import static org.bytedeco.leptonica.global.leptonica.*;

import static org.bytedeco.tesseract.global.tesseract.*;


/**
 * Renders tesseract output into an alto text string
 */
@Namespace("tesseract") @NoOffset @Properties(inherit = org.bytedeco.tesseract.presets.tesseract.class)
public class TessAltoRenderer extends TessResultRenderer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TessAltoRenderer(Pointer p) { super(p); }

  public TessAltoRenderer(@Cast("const char*") BytePointer outputbase) { super((Pointer)null); allocate(outputbase); }
  private native void allocate(@Cast("const char*") BytePointer outputbase);
  public TessAltoRenderer(String outputbase) { super((Pointer)null); allocate(outputbase); }
  private native void allocate(String outputbase);
}
