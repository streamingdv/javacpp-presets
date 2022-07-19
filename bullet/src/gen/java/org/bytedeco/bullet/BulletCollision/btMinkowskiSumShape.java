// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;
  // for the types

/** The btMinkowskiSumShape is only for advanced users. This shape represents implicit based minkowski sum of two convex implicit shapes. */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btMinkowskiSumShape extends btConvexInternalShape {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btMinkowskiSumShape(Pointer p) { super(p); }


	public btMinkowskiSumShape(@Const btConvexShape shapeA, @Const btConvexShape shapeB) { super((Pointer)null); allocate(shapeA, shapeB); }
	private native void allocate(@Const btConvexShape shapeA, @Const btConvexShape shapeB);

	public native @ByVal btVector3 localGetSupportingVertexWithoutMargin(@Const @ByRef btVector3 vec);

	public native void batchedUnitVectorGetSupportingVertexWithoutMargin(@Const btVector3 vectors, btVector3 supportVerticesOut, int numVectors);

	public native void calculateLocalInertia(@Cast("btScalar") double mass, @ByRef btVector3 inertia);

	public native void setTransformA(@Const @ByRef btTransform transA);
	public native void setTransformB(@Const @ByRef btTransform transB);

	public native @Const @ByRef btTransform getTransformA();
	public native @Const @ByRef btTransform getTransformB();

	// keep this for backward compatibility
	public native @Const @ByRef btTransform GetTransformB();

	public native @Cast("btScalar") double getMargin();

	public native @Const btConvexShape getShapeA();
	public native @Const btConvexShape getShapeB();

	public native @Cast("const char*") BytePointer getName();
}
