// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \class FieldRef
 *  \brief Descriptor of a (potentially nested) field within a schema.
 * 
 *  Unlike FieldPath (which exclusively uses indices of child fields), FieldRef may
 *  reference a field by name. It is intended to replace parameters like {@code int field_index}
 *  and {@code const std::string& field_name}; it can be implicitly constructed from either a
 *  field index or a name.
 * 
 *  Nested fields can be referenced as well. Given
 *      schema({field("a", struct_({field("n", null())})), field("b", int32())})
 * 
 *  the following all indicate the nested field named "n":
 *      FieldRef ref1(0, 0);
 *      FieldRef ref2("a", 0);
 *      FieldRef ref3("a", "n");
 *      FieldRef ref4(0, "n");
 *      ARROW_ASSIGN_OR_RAISE(FieldRef ref5,
 *                            FieldRef::FromDotPath(".a[0]"));
 * 
 *  FieldPaths matching a FieldRef are retrieved using the member function FindAll.
 *  Multiple matches are possible because field names may be duplicated within a schema.
 *  For example:
 *      Schema a_is_ambiguous({field("a", int32()), field("a", float32())});
 *      auto matches = FieldRef("a").FindAll(a_is_ambiguous);
 *      assert(matches.size() == 2);
 *      assert(matches[0].Get(a_is_ambiguous)->Equals(a_is_ambiguous.field(0)));
 *      assert(matches[1].Get(a_is_ambiguous)->Equals(a_is_ambiguous.field(1)));
 * 
 *  Convenience accessors are available which raise a helpful error if the field is not
 *  found or ambiguous, and for immediately calling FieldPath::Get to retrieve any
 *  matching children:
 *      auto maybe_match = FieldRef("struct", "field_i32").FindOneOrNone(schema);
 *      auto maybe_column = FieldRef("struct", "field_i32").GetOne(some_table); */
@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class FieldRef extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FieldRef(Pointer p) { super(p); }

  
  ///
  public FieldRef() { super((Pointer)null); allocate(); }
  private native void allocate();

  /** Construct a FieldRef using a string of indices. The reference will be retrieved as:
   *  schema.fields[self.indices[0]].type.fields[self.indices[1]] ...
   * 
   *  Empty indices are not valid. */
  public FieldRef(@ByVal FieldPath indices) { super((Pointer)null); allocate(indices); }
  private native void allocate(@ByVal FieldPath indices);  // NOLINT runtime/explicit

  /** Construct a by-name FieldRef. Multiple fields may match a by-name FieldRef:
   *  [f for f in schema.fields where f.name == self.name] */
  public FieldRef(@StdString String name) { super((Pointer)null); allocate(name); }
  private native void allocate(@StdString String name);
  public FieldRef(@StdString BytePointer name) { super((Pointer)null); allocate(name); }
  private native void allocate(@StdString BytePointer name);    // NOLINT runtime/explicit  // NOLINT runtime/explicit

  /** Equivalent to a single index string of indices. */
  public FieldRef(int index) { super((Pointer)null); allocate(index); }
  private native void allocate(int index);  // NOLINT runtime/explicit

  /** Convenience constructor for nested FieldRefs: each argument will be used to
   *  construct a FieldRef */

  /** Parse a dot path into a FieldRef.
   * 
   *  dot_path = '.' name
   *           | '[' digit+ ']'
   *           | dot_path+
   * 
   *  Examples:
   *    ".alpha" => FieldRef("alpha")
   *    "[2]" => FieldRef(2)
   *    ".beta[3]" => FieldRef("beta", 3)
   *    "[5].gamma.delta[7]" => FieldRef(5, "gamma", "delta", 7)
   *    ".hello world" => FieldRef("hello world")
   *    R"(.\[y\]\tho\.\)" => FieldRef(R"([y]\tho.\)")
   * 
   *  Note: When parsing a name, a '\' preceding any other character will be dropped from
   *  the resulting name. Therefore if a name must contain the characters '.', '\', or '['
   *  those must be escaped with a preceding '\'. */
  public static native @ByVal FieldRefResult FromDotPath(@StdString String dot_path);
  public static native @ByVal FieldRefResult FromDotPath(@StdString BytePointer dot_path);

  public native @Cast("bool") boolean Equals(@Const @ByRef FieldRef other);
  public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef FieldRef other);

  public native @StdString String ToString();

  public native @Cast("size_t") long hash();
  public static class Hash extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Hash() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Hash(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Hash(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Hash position(long position) {
          return (Hash)super.position(position);
      }
      @Override public Hash getPointer(long i) {
          return new Hash((Pointer)this).position(position + i);
      }
  
    public native @Cast("size_t") @Name("operator ()") long apply(@Const @ByRef FieldRef ref);
  }

  public native @Cast("bool") @Name("operator bool") boolean asBoolean();
  public native @Cast("bool") @Name("operator !") boolean not();

  public native @Cast("bool") boolean IsFieldPath();
  public native @Cast("bool") boolean IsName();
  public native @Cast("bool") boolean IsNested();

  public native @Const FieldPath field_path();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer name();

  /** \brief Retrieve FieldPath of every child field which matches this FieldRef. */
  public native @StdVector FieldPath FindAll(@Const @ByRef Schema schema);
  public native @StdVector FieldPath FindAll(@Const @ByRef Field field);
  public native @StdVector FieldPath FindAll(@Const @ByRef DataType type);
  public native @StdVector FieldPath FindAll(@Const @ByRef FieldVector fields);

  /** \brief Convenience function which applies FindAll to arg's type or schema. */
  public native @StdVector FieldPath FindAll(@Const @ByRef ArrayData array);
  public native @StdVector FieldPath FindAll(@Const @ByRef Array array);
  public native @StdVector FieldPath FindAll(@Const @ByRef RecordBatch batch);

  /** \brief Convenience function: raise an error if matches is empty. */

  /** \brief Convenience function: raise an error if matches contains multiple FieldPaths. */

  /** \brief Retrieve FieldPath of a single child field which matches this
   *  FieldRef. Emit an error if none or multiple match. */

  /** \brief Retrieve FieldPath of a single child field which matches this
   *  FieldRef. Emit an error if multiple match. An empty (invalid) FieldPath
   *  will be returned if none match. */

  /** \brief Get all children matching this FieldRef. */

  /** \brief Get the single child matching this FieldRef.
   *  Emit an error if none or multiple match. */

  /** \brief Get the single child matching this FieldRef.
   *  Return nullptr if none match, emit an error if multiple match. */
}
