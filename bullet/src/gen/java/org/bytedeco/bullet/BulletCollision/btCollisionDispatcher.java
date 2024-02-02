// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/**btCollisionDispatcher supports algorithms that handle ConvexConvex and ConvexConcave collision pairs.
 * Time of Impact, Closest Points and Penetration Depth. */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btCollisionDispatcher extends btDispatcher {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btCollisionDispatcher(Pointer p) { super(p); }

	/** enum btCollisionDispatcher::DispatcherFlags */
	public static final int
		CD_STATIC_STATIC_REPORTED = 1,
		CD_USE_RELATIVE_CONTACT_BREAKING_THRESHOLD = 2,
		CD_DISABLE_CONTACTPOOL_DYNAMIC_ALLOCATION = 4;

	public native int getDispatcherFlags();

	public native void setDispatcherFlags(int flags);

	/**registerCollisionCreateFunc allows registration of custom/alternative collision create functions */
	public native void registerCollisionCreateFunc(int proxyType0, int proxyType1, btCollisionAlgorithmCreateFunc createFunc);

	public native void registerClosestPointsCreateFunc(int proxyType0, int proxyType1, btCollisionAlgorithmCreateFunc createFunc);

	public native int getNumManifolds();

	public native @Cast("btPersistentManifold**") PointerPointer getInternalManifoldPointer();

	public native btPersistentManifold getManifoldByIndexInternal(int index);

	public btCollisionDispatcher(btCollisionConfiguration collisionConfiguration) { super((Pointer)null); allocate(collisionConfiguration); }
	private native void allocate(btCollisionConfiguration collisionConfiguration);

	public native btPersistentManifold getNewManifold(@Const btCollisionObject b0, @Const btCollisionObject b1);

	public native void releaseManifold(btPersistentManifold manifold);

	public native void clearManifold(btPersistentManifold manifold);

	public native btCollisionAlgorithm findAlgorithm(@Const btCollisionObjectWrapper body0Wrap, @Const btCollisionObjectWrapper body1Wrap, btPersistentManifold sharedManifold, @Cast("ebtDispatcherQueryType") int queryType);

	public native @Cast("bool") boolean needsCollision(@Const btCollisionObject body0, @Const btCollisionObject body1);

	public native @Cast("bool") boolean needsResponse(@Const btCollisionObject body0, @Const btCollisionObject body1);

	public native void dispatchAllCollisionPairs(btOverlappingPairCache pairCache, @Const @ByRef btDispatcherInfo dispatchInfo, btDispatcher dispatcher);

	public native void setNearCallback(btNearCallback nearCallback);

	public native btNearCallback getNearCallback();

	//by default, Bullet will use this near callback
	public static native void defaultNearCallback(@ByRef btBroadphasePair collisionPair, @ByRef btCollisionDispatcher dispatcher, @Const @ByRef btDispatcherInfo dispatchInfo);

	public native Pointer allocateCollisionAlgorithm(int size);

	public native void freeCollisionAlgorithm(Pointer ptr);

	public native btCollisionConfiguration getCollisionConfiguration();

	public native void setCollisionConfiguration(btCollisionConfiguration config);

	public native btPoolAllocator getInternalManifoldPool();
}
