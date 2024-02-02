// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3Collision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.Bullet3Common.*;
import static org.bytedeco.bullet.global.Bullet3Common.*;

import static org.bytedeco.bullet.global.Bullet3Collision.*;


@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.Bullet3Collision.class)
public class b3BroadphaseRayCallback extends b3BroadphaseAabbCallback {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3BroadphaseRayCallback(Pointer p) { super(p); }

	/**added some cached data to accelerate ray-AABB tests */
	public native @ByRef b3Vector3 m_rayDirectionInverse(); public native b3BroadphaseRayCallback m_rayDirectionInverse(b3Vector3 setter);
	public native @Cast("unsigned int") int m_signs(int i); public native b3BroadphaseRayCallback m_signs(int i, int setter);
	@MemberGetter public native @Cast("unsigned int*") IntPointer m_signs();
	public native @Cast("b3Scalar") float m_lambda_max(); public native b3BroadphaseRayCallback m_lambda_max(float setter);
}
