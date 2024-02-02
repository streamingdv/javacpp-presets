// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;

// #ifdef NO_VIRTUAL_INTERFACE
// #else

/** btSimplexSolverInterface can incrementally calculate distance between origin and up to 4 vertices
 *  Used by GJK or Linear Casting. Can be implemented by the Johnson-algorithm or alternative approaches based on
 *  voronoi regions or barycentric coordinates */
@Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btSimplexSolverInterface extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btSimplexSolverInterface(Pointer p) { super(p); }


	public native void reset();

	public native void addVertex(@Const @ByRef btVector3 w, @Const @ByRef btVector3 p, @Const @ByRef btVector3 q);

	public native @Cast("bool") boolean closest(@ByRef btVector3 v);

	public native @Cast("btScalar") double maxVertex();

	public native @Cast("bool") boolean fullSimplex();

	public native int getSimplex(btVector3 pBuf, btVector3 qBuf, btVector3 yBuf);

	public native @Cast("bool") boolean inSimplex(@Const @ByRef btVector3 w);

	public native void backup_closest(@ByRef btVector3 v);

	public native @Cast("bool") boolean emptySimplex();

	public native void compute_points(@ByRef btVector3 p1, @ByRef btVector3 p2);

	public native int numVertices();
}
