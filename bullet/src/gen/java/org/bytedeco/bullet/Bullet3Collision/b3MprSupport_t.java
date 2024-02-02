// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3Collision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.Bullet3Common.*;
import static org.bytedeco.bullet.global.Bullet3Common.*;

import static org.bytedeco.bullet.global.Bullet3Collision.*;


@Name("_b3MprSupport_t") @Properties(inherit = org.bytedeco.bullet.presets.Bullet3Collision.class)
public class b3MprSupport_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b3MprSupport_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3MprSupport_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3MprSupport_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b3MprSupport_t position(long position) {
        return (b3MprSupport_t)super.position(position);
    }
    @Override public b3MprSupport_t getPointer(long i) {
        return new b3MprSupport_t((Pointer)this).offsetAddress(i);
    }

	/** Support point in minkowski sum */
	public native @ByRef b3Vector3 v(); public native b3MprSupport_t v(b3Vector3 setter);
	/** Support point in obj1 */
	public native @ByRef b3Vector3 v1(); public native b3MprSupport_t v1(b3Vector3 setter);
	/** Support point in obj2 */
	public native @ByRef b3Vector3 v2(); public native b3MprSupport_t v2(b3Vector3 setter);
}
