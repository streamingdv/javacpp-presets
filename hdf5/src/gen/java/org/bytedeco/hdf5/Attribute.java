// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;


/** \class Attribute
    \brief Class Attribute operates on HDF5 attributes.
    <p>
    An attribute has many characteristics similar to a dataset, thus both
    Attribute and DataSet are derivatives of AbstractDs.  Attribute also
    inherits from H5Location because an attribute can be used to specify
    a location.
*/
//  Inheritance: multiple H5Location/AbstractDs -> IdComponent
@Namespace("H5") @NoOffset @Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class Attribute extends AbstractDs {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Attribute(Pointer p) { super(p); }
    public H5Location asH5Location() { return asH5Location(this); }
    @Namespace public static native @Name("static_cast<H5::H5Location*>") H5Location asH5Location(Attribute pointer);

    // Copy constructor: same as the original Attribute.
    public Attribute(@Const @ByRef Attribute original) { super((Pointer)null); allocate(original); }
    private native void allocate(@Const @ByRef Attribute original);

    // Default constructor
    public Attribute() { super((Pointer)null); allocate(); }
    private native void allocate();

    // Creates a copy of an existing attribute using the attribute id
    public Attribute(@Cast("const hid_t") long attr_id) { super((Pointer)null); allocate(attr_id); }
    private native void allocate(@Cast("const hid_t") long attr_id);

    // Closes this attribute.
    public native @Name("close") void _close();

    // Gets the name of this attribute.
    public native @Cast("ssize_t") long getName(@Cast("char*") BytePointer attr_name, @Cast("size_t") long buf_size/*=0*/);
    public native @Cast("ssize_t") long getName(@Cast("char*") BytePointer attr_name);
    public native @Cast("ssize_t") long getName(@Cast("char*") ByteBuffer attr_name, @Cast("size_t") long buf_size/*=0*/);
    public native @Cast("ssize_t") long getName(@Cast("char*") ByteBuffer attr_name);
    public native @Cast("ssize_t") long getName(@Cast("char*") byte[] attr_name, @Cast("size_t") long buf_size/*=0*/);
    public native @Cast("ssize_t") long getName(@Cast("char*") byte[] attr_name);
    public native @StdString BytePointer getName(@Cast("size_t") long len);
    public native @StdString BytePointer getName();
    // The overloaded function below is replaced by the one above and it
    // is kept for backward compatibility purpose.
    

    // Gets a copy of the dataspace for this attribute.
    public native @ByVal DataSpace getSpace();

    // Returns the amount of storage size required for this attribute.
    public native @Cast("hsize_t") long getStorageSize();

    // Returns the in memory size of this attribute's data.
    public native @Cast("size_t") long getInMemDataSize();

    // Reads data from this attribute.
    public native void read(@Const @ByRef DataType mem_type, Pointer buf);
    public native void read(@Const @ByRef DataType mem_type, @StdString @ByRef BytePointer strg);

    // Writes data to this attribute.
    public native void write(@Const @ByRef DataType mem_type, @Const Pointer buf);
    public native void write(@Const @ByRef DataType mem_type, @StdString BytePointer strg);
    public native void write(@Const @ByRef DataType mem_type, @StdString String strg);

    /**\brief Returns this class name. */
    public native @StdString BytePointer fromClass();

    // Gets the attribute id.
    public native @Cast("hid_t") long getId();

    // Destructor: properly terminates access to this attribute.

}
