// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/** btBoxBoxDetector wraps the ODE box-box collision detector
 *  re-distributed under the Zlib license with permission from Russell L. Smith */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btBoxBoxDetector extends btDiscreteCollisionDetectorInterface {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btBoxBoxDetector(Pointer p) { super(p); }

	public native @Const btBoxShape m_box1(); public native btBoxBoxDetector m_box1(btBoxShape setter);
	public native @Const btBoxShape m_box2(); public native btBoxBoxDetector m_box2(btBoxShape setter);
	public btBoxBoxDetector(@Const btBoxShape box1, @Const btBoxShape box2) { super((Pointer)null); allocate(box1, box2); }
	private native void allocate(@Const btBoxShape box1, @Const btBoxShape box2);

	public native void getClosestPoints(@Const @ByRef ClosestPointInput input, @ByRef Result output, btIDebugDraw debugDraw, @Cast("bool") boolean swapResults/*=false*/);
	public native void getClosestPoints(@Const @ByRef ClosestPointInput input, @ByRef Result output, btIDebugDraw debugDraw);
}
