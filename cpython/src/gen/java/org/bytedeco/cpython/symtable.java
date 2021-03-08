// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class symtable extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public symtable() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public symtable(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public symtable(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public symtable position(long position) {
        return (symtable)super.position(position);
    }
    @Override public symtable getPointer(long i) {
        return new symtable((Pointer)this).position(position + i);
    }

    public native PyObject st_filename(); public native symtable st_filename(PyObject setter);          /* name of file being compiled,
                                       decoded from the filesystem encoding */
    public native _symtable_entry st_cur(); public native symtable st_cur(_symtable_entry setter); /* current symbol table entry */
    public native _symtable_entry st_top(); public native symtable st_top(_symtable_entry setter); /* symbol table entry for module */
    public native PyObject st_blocks(); public native symtable st_blocks(PyObject setter);            /* dict: map AST node addresses
                                     *       to symbol table entries */
    public native PyObject st_stack(); public native symtable st_stack(PyObject setter);             /* list: stack of namespace info */
    public native PyObject st_global(); public native symtable st_global(PyObject setter);            /* borrowed ref to st_top->ste_symbols */
    public native int st_nblocks(); public native symtable st_nblocks(int setter);                 /* number of blocks used. kept for
                                       consistency with the corresponding
                                       compiler structure */
    public native PyObject st_private(); public native symtable st_private(PyObject setter);           /* name of current class or NULL */
    public native PyFutureFeatures st_future(); public native symtable st_future(PyFutureFeatures setter);    /* module's future features that affect
                                       the symbol table */
    public native int recursion_depth(); public native symtable recursion_depth(int setter);            /* current recursion depth */
    public native int recursion_limit(); public native symtable recursion_limit(int setter);            /* recursion limit */
}
