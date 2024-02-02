// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.leptonica.global.leptonica.*;



/* ------------------------------------------------------------------------- *
 *                     Intermediate pdf generation data                      *
 * ------------------------------------------------------------------------- */
/*
 *  This accumulates data for generating a pdf of a single page consisting
 *  of an arbitrary number of images.
 *
 *  None of the strings have a trailing newline.
 */

/** Intermediate pdf generation data */
@Name("L_Pdf_Data") @Properties(inherit = org.bytedeco.leptonica.presets.leptonica.class)
public class L_PDF_DATA extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public L_PDF_DATA() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public L_PDF_DATA(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public L_PDF_DATA(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public L_PDF_DATA position(long position) {
        return (L_PDF_DATA)super.position(position);
    }
    @Override public L_PDF_DATA getPointer(long i) {
        return new L_PDF_DATA((Pointer)this).offsetAddress(i);
    }

    /** optional title for pdf              */
    public native @Cast("char*") BytePointer title(); public native L_PDF_DATA title(BytePointer setter);
    /** number of images                    */
    public native @Cast("l_int32") int n(); public native L_PDF_DATA n(int setter);
    /** number of colormaps                 */
    public native @Cast("l_int32") int ncmap(); public native L_PDF_DATA ncmap(int setter);
    /** array of compressed image data      */
    public native L_PTRA cida(); public native L_PDF_DATA cida(L_PTRA setter);
    /** %PDF-1.2 id string                  */
    public native @Cast("char*") BytePointer id(); public native L_PDF_DATA id(BytePointer setter);
    /** catalog string                      */
    public native @Cast("char*") BytePointer obj1(); public native L_PDF_DATA obj1(BytePointer setter);
    /** metadata string                     */
    public native @Cast("char*") BytePointer obj2(); public native L_PDF_DATA obj2(BytePointer setter);
    /** pages string                        */
    public native @Cast("char*") BytePointer obj3(); public native L_PDF_DATA obj3(BytePointer setter);
    /** page string (variable data)         */
    public native @Cast("char*") BytePointer obj4(); public native L_PDF_DATA obj4(BytePointer setter);
    /** content string (variable data)      */
    public native @Cast("char*") BytePointer obj5(); public native L_PDF_DATA obj5(BytePointer setter);
    /** post-binary-stream string           */
    public native @Cast("char*") BytePointer poststream(); public native L_PDF_DATA poststream(BytePointer setter);
    /** trailer string (variable data)      */
    public native @Cast("char*") BytePointer trailer(); public native L_PDF_DATA trailer(BytePointer setter);
    /** store (xpt, ypt) array              */
    public native PTA xy(); public native L_PDF_DATA xy(PTA setter);
    /** store (wpt, hpt) array              */
    public native PTA wh(); public native L_PDF_DATA wh(PTA setter);
    /** bounding region for all images      */
    public native BOX mediabox(); public native L_PDF_DATA mediabox(BOX setter);
    /** pre-binary-stream xobject strings   */
    public native SARRAY saprex(); public native L_PDF_DATA saprex(SARRAY setter);
    /** colormap pdf object strings         */
    public native SARRAY sacmap(); public native L_PDF_DATA sacmap(SARRAY setter);
    /** sizes of each pdf string object     */
    public native L_DNA objsize(); public native L_PDF_DATA objsize(L_DNA setter);
    /** location of each pdf string object  */
    public native L_DNA objloc(); public native L_PDF_DATA objloc(L_DNA setter);
    /** location of xref                    */
    public native @Cast("l_int32") int xrefloc(); public native L_PDF_DATA xrefloc(int setter);
}
