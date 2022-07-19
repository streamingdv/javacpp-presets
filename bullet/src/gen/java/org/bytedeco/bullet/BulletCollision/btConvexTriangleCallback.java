// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/**For each triangle in the concave mesh that overlaps with the AABB of a convex (m_convexProxy), processTriangle is called. */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btConvexTriangleCallback extends btTriangleCallback {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btConvexTriangleCallback(Pointer p) { super(p); }


	public native int m_triangleCount(); public native btConvexTriangleCallback m_triangleCount(int setter);

	public native btPersistentManifold m_manifoldPtr(); public native btConvexTriangleCallback m_manifoldPtr(btPersistentManifold setter);

	public btConvexTriangleCallback(btDispatcher dispatcher, @Const btCollisionObjectWrapper body0Wrap, @Const btCollisionObjectWrapper body1Wrap, @Cast("bool") boolean isSwapped) { super((Pointer)null); allocate(dispatcher, body0Wrap, body1Wrap, isSwapped); }
	private native void allocate(btDispatcher dispatcher, @Const btCollisionObjectWrapper body0Wrap, @Const btCollisionObjectWrapper body1Wrap, @Cast("bool") boolean isSwapped);

	public native void setTimeStepAndCounters(@Cast("btScalar") double collisionMarginTriangle, @Const @ByRef btDispatcherInfo dispatchInfo, @Const btCollisionObjectWrapper convexBodyWrap, @Const btCollisionObjectWrapper triBodyWrap, btManifoldResult resultOut);

	public native void clearWrapperData();

	public native void processTriangle(btVector3 triangle, int partId, int triangleIndex);

	public native void clearCache();

	public native @Const @ByRef btVector3 getAabbMin();
	public native @Const @ByRef btVector3 getAabbMax();
}
