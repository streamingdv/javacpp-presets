// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


// #if DBVT_BP_PROFILE
// #endif

//
// btDbvtProxy
//
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btDbvtProxy extends btBroadphaseProxy {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btDbvtProxy(Pointer p) { super(p); }

	/* Fields		*/
	//btDbvtAabbMm	aabb;
	public native btDbvtNode leaf(); public native btDbvtProxy leaf(btDbvtNode setter);
	public native btDbvtProxy links(int i); public native btDbvtProxy links(int i, btDbvtProxy setter);
	@MemberGetter public native @Cast("btDbvtProxy**") PointerPointer links();
	public native int stage(); public native btDbvtProxy stage(int setter);
	/* ctor			*/
	public btDbvtProxy(@Const @ByRef btVector3 aabbMin, @Const @ByRef btVector3 aabbMax, Pointer userPtr, int collisionFilterGroup, int collisionFilterMask) { super((Pointer)null); allocate(aabbMin, aabbMax, userPtr, collisionFilterGroup, collisionFilterMask); }
	private native void allocate(@Const @ByRef btVector3 aabbMin, @Const @ByRef btVector3 aabbMax, Pointer userPtr, int collisionFilterGroup, int collisionFilterMask);
}
