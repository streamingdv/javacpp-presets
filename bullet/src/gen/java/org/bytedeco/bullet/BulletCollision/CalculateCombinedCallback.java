// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


//#define DEBUG_PART_INDEX 1

/** These callbacks are used to customize the algorith that combine restitution, friction, damping, Stiffness */
@Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class CalculateCombinedCallback extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    CalculateCombinedCallback(Pointer p) { super(p); }
    protected CalculateCombinedCallback() { allocate(); }
    private native void allocate();
    public native @Cast("btScalar") double call(@Const btCollisionObject body0, @Const btCollisionObject body1);
}
