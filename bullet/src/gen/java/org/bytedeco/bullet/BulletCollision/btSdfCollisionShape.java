// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btSdfCollisionShape extends btConcaveShape {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btSdfCollisionShape(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btSdfCollisionShape(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btSdfCollisionShape position(long position) {
        return (btSdfCollisionShape)super.position(position);
    }
    @Override public btSdfCollisionShape getPointer(long i) {
        return new btSdfCollisionShape((Pointer)this).offsetAddress(i);
    }

	public btSdfCollisionShape() { super((Pointer)null); allocate(); }
	private native void allocate();

	public native @Cast("bool") boolean initializeSDF(@Cast("const char*") BytePointer sdfData, int sizeInBytes);
	public native @Cast("bool") boolean initializeSDF(String sdfData, int sizeInBytes);

	public native void getAabb(@Const @ByRef btTransform t, @ByRef btVector3 aabbMin, @ByRef btVector3 aabbMax);
	public native void setLocalScaling(@Const @ByRef btVector3 scaling);
	public native @Const @ByRef btVector3 getLocalScaling();
	public native void calculateLocalInertia(@Cast("btScalar") double mass, @ByRef btVector3 inertia);
	public native @Cast("const char*") BytePointer getName();
	public native void setMargin(@Cast("btScalar") double margin);
	public native @Cast("btScalar") double getMargin();

	public native void processAllTriangles(btTriangleCallback callback, @Const @ByRef btVector3 aabbMin, @Const @ByRef btVector3 aabbMax);

	public native @Cast("bool") boolean queryPoint(@Const @ByRef btVector3 ptInSDF, @Cast("btScalar*") @ByRef DoublePointer distOut, @ByRef btVector3 normal);
	public native @Cast("bool") boolean queryPoint(@Const @ByRef btVector3 ptInSDF, @Cast("btScalar*") @ByRef DoubleBuffer distOut, @ByRef btVector3 normal);
	public native @Cast("bool") boolean queryPoint(@Const @ByRef btVector3 ptInSDF, @Cast("btScalar*") @ByRef double[] distOut, @ByRef btVector3 normal);
}
