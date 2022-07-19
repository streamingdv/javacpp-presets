// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/** sphere-triangle to match the btDiscreteCollisionDetectorInterface */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class SphereTriangleDetector extends btDiscreteCollisionDetectorInterface {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SphereTriangleDetector(Pointer p) { super(p); }

	public native void getClosestPoints(@Const @ByRef ClosestPointInput input, @ByRef Result output, btIDebugDraw debugDraw, @Cast("bool") boolean swapResults/*=false*/);
	public native void getClosestPoints(@Const @ByRef ClosestPointInput input, @ByRef Result output, btIDebugDraw debugDraw);

	public SphereTriangleDetector(btSphereShape sphere, btTriangleShape triangle, @Cast("btScalar") double contactBreakingThreshold) { super((Pointer)null); allocate(sphere, triangle, contactBreakingThreshold); }
	private native void allocate(btSphereShape sphere, btTriangleShape triangle, @Cast("btScalar") double contactBreakingThreshold);

	public native @Cast("bool") boolean collide(@Const @ByRef btVector3 sphereCenter, @ByRef btVector3 point, @ByRef btVector3 resultNormal, @Cast("btScalar*") @ByRef DoublePointer depth, @Cast("btScalar*") @ByRef DoublePointer timeOfImpact, @Cast("btScalar") double contactBreakingThreshold);
	public native @Cast("bool") boolean collide(@Const @ByRef btVector3 sphereCenter, @ByRef btVector3 point, @ByRef btVector3 resultNormal, @Cast("btScalar*") @ByRef DoubleBuffer depth, @Cast("btScalar*") @ByRef DoubleBuffer timeOfImpact, @Cast("btScalar") double contactBreakingThreshold);
	public native @Cast("bool") boolean collide(@Const @ByRef btVector3 sphereCenter, @ByRef btVector3 point, @ByRef btVector3 resultNormal, @Cast("btScalar*") @ByRef double[] depth, @Cast("btScalar*") @ByRef double[] timeOfImpact, @Cast("btScalar") double contactBreakingThreshold);
}
