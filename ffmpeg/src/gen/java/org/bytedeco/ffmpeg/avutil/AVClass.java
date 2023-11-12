// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avutil;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.ffmpeg.global.avutil.*;


/**
 * Describe the class of an AVClass context structure. That is an
 * arbitrary struct of which the first field is a pointer to an
 * AVClass struct (e.g. AVCodecContext, AVFormatContext etc.).
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avutil.class)
public class AVClass extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVClass() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVClass(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVClass(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVClass position(long position) {
        return (AVClass)super.position(position);
    }
    @Override public AVClass getPointer(long i) {
        return new AVClass((Pointer)this).offsetAddress(i);
    }

    /**
     * The name of the class; usually it is the same name as the
     * context structure type to which the AVClass is associated.
     */
    public native @Cast("const char*") BytePointer class_name(); public native AVClass class_name(BytePointer setter);

    /**
     * A pointer to a function which returns the name of a context
     * instance ctx associated with the class.
     */
    public static class Item_name_Pointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Item_name_Pointer(Pointer p) { super(p); }
        protected Item_name_Pointer() { allocate(); }
        private native void allocate();
        public native @Cast("const char*") BytePointer call(Pointer ctx);
    }
    public native Item_name_Pointer item_name(); public native AVClass item_name(Item_name_Pointer setter);

    /**
     * a pointer to the first option specified in the class if any or NULL
     *
     * @see av_set_default_options()
     */
    public native @Const AVOption option(); public native AVClass option(AVOption setter);

    /**
     * LIBAVUTIL_VERSION with which this structure was created.
     * This is used to allow fields to be added without requiring major
     * version bumps everywhere.
     */

    public native int version(); public native AVClass version(int setter);

    /**
     * Offset in the structure where log_level_offset is stored.
     * 0 means there is no such variable
     */
    public native int log_level_offset_offset(); public native AVClass log_level_offset_offset(int setter);

    /**
     * Offset in the structure where a pointer to the parent context for
     * logging is stored. For example a decoder could pass its AVCodecContext
     * to eval as such a parent context, which an av_log() implementation
     * could then leverage to display the parent context.
     * The offset can be NULL.
     */
    public native int parent_log_context_offset(); public native AVClass parent_log_context_offset(int setter);

    /**
     * Category used for visualization (like color)
     * This is only set if the category is equal for all objects using this class.
     * available since version (51 << 16 | 56 << 8 | 100)
     */
    public native @Cast("AVClassCategory") int category(); public native AVClass category(int setter);

    /**
     * Callback to return the category.
     * available since version (51 << 16 | 59 << 8 | 100)
     */
    public static class Get_category_Pointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Get_category_Pointer(Pointer p) { super(p); }
        protected Get_category_Pointer() { allocate(); }
        private native void allocate();
        public native @Cast("AVClassCategory") int call(Pointer ctx);
    }
    public native Get_category_Pointer get_category(); public native AVClass get_category(Get_category_Pointer setter);

    /**
     * Callback to return the supported/allowed ranges.
     * available since version (52.12)
     */
    public static class Query_ranges_PointerPointer_Pointer_BytePointer_int extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Query_ranges_PointerPointer_Pointer_BytePointer_int(Pointer p) { super(p); }
        protected Query_ranges_PointerPointer_Pointer_BytePointer_int() { allocate(); }
        private native void allocate();
        public native int call(@Cast("AVOptionRanges**") PointerPointer arg0, Pointer obj, @Cast("const char*") BytePointer key, int flags);
    }
    public native Query_ranges_PointerPointer_Pointer_BytePointer_int query_ranges(); public native AVClass query_ranges(Query_ranges_PointerPointer_Pointer_BytePointer_int setter);

    /**
     * Return next AVOptions-enabled child or NULL
     */
    public static class Child_next_Pointer_Pointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Child_next_Pointer_Pointer(Pointer p) { super(p); }
        protected Child_next_Pointer_Pointer() { allocate(); }
        private native void allocate();
        public native Pointer call(Pointer obj, Pointer prev);
    }
    public native Child_next_Pointer_Pointer child_next(); public native AVClass child_next(Child_next_Pointer_Pointer setter);

    /**
     * Iterate over the AVClasses corresponding to potential AVOptions-enabled
     * children.
     *
     * @param iter pointer to opaque iteration state. The caller must initialize
     *             *iter to NULL before the first call.
     * @return AVClass for the next AVOptions-enabled child or NULL if there are
     *         no more such children.
     *
     * \note The difference between child_next and this is that child_next
     *       iterates over _already existing_ objects, while child_class_iterate
     *       iterates over _all possible_ children.
     */
    public static class Child_class_iterate_PointerPointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Child_class_iterate_PointerPointer(Pointer p) { super(p); }
        protected Child_class_iterate_PointerPointer() { allocate(); }
        private native void allocate();
        public native @Const AVClass call(@Cast("void**") PointerPointer iter);
    }
    public native Child_class_iterate_PointerPointer child_class_iterate(); public native AVClass child_class_iterate(Child_class_iterate_PointerPointer setter);
}
