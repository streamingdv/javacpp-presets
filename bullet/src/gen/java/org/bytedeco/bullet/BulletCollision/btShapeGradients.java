// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


@Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btShapeGradients extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btShapeGradients() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btShapeGradients(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btShapeGradients(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btShapeGradients position(long position) {
        return (btShapeGradients)super.position(position);
    }
    @Override public btShapeGradients getPointer(long i) {
        return new btShapeGradients((Pointer)this).offsetAddress(i);
    }

	public native @ByRef btVector3 m_vec(int i); public native btShapeGradients m_vec(int i, btVector3 setter);
	@MemberGetter public native btVector3 m_vec();

	public native void topRowsDivide(int row, double denom);

	public native void bottomRowsMul(int row, double val);

	public native @Cast("btScalar*") @ByRef @Name("operator ()") DoublePointer apply(int i, int j);
}
