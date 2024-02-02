// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/**Teh btTriangleIndexVertexMaterialArray is built on TriangleIndexVertexArray
 * The addition of a material array allows for the utilization of the partID and
 * triangleIndex that are returned in the ContactAddedCallback.  As with
 * TriangleIndexVertexArray, no duplicate is made of the material data, so it
 * is the users responsibility to maintain the array during the lifetime of the
 * TriangleIndexVertexMaterialArray. */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btTriangleIndexVertexMaterialArray extends btTriangleIndexVertexArray {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btTriangleIndexVertexMaterialArray(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btTriangleIndexVertexMaterialArray(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btTriangleIndexVertexMaterialArray position(long position) {
        return (btTriangleIndexVertexMaterialArray)super.position(position);
    }
    @Override public btTriangleIndexVertexMaterialArray getPointer(long i) {
        return new btTriangleIndexVertexMaterialArray((Pointer)this).offsetAddress(i);
    }


	public btTriangleIndexVertexMaterialArray() { super((Pointer)null); allocate(); }
	private native void allocate();

	public btTriangleIndexVertexMaterialArray(int numTriangles, IntPointer triangleIndexBase, int triangleIndexStride,
										   int numVertices, @Cast("btScalar*") DoublePointer vertexBase, int vertexStride,
										   int numMaterials, @Cast("unsigned char*") BytePointer materialBase, int materialStride,
										   IntPointer triangleMaterialsBase, int materialIndexStride) { super((Pointer)null); allocate(numTriangles, triangleIndexBase, triangleIndexStride, numVertices, vertexBase, vertexStride, numMaterials, materialBase, materialStride, triangleMaterialsBase, materialIndexStride); }
	private native void allocate(int numTriangles, IntPointer triangleIndexBase, int triangleIndexStride,
										   int numVertices, @Cast("btScalar*") DoublePointer vertexBase, int vertexStride,
										   int numMaterials, @Cast("unsigned char*") BytePointer materialBase, int materialStride,
										   IntPointer triangleMaterialsBase, int materialIndexStride);
	public btTriangleIndexVertexMaterialArray(int numTriangles, IntBuffer triangleIndexBase, int triangleIndexStride,
										   int numVertices, @Cast("btScalar*") DoubleBuffer vertexBase, int vertexStride,
										   int numMaterials, @Cast("unsigned char*") ByteBuffer materialBase, int materialStride,
										   IntBuffer triangleMaterialsBase, int materialIndexStride) { super((Pointer)null); allocate(numTriangles, triangleIndexBase, triangleIndexStride, numVertices, vertexBase, vertexStride, numMaterials, materialBase, materialStride, triangleMaterialsBase, materialIndexStride); }
	private native void allocate(int numTriangles, IntBuffer triangleIndexBase, int triangleIndexStride,
										   int numVertices, @Cast("btScalar*") DoubleBuffer vertexBase, int vertexStride,
										   int numMaterials, @Cast("unsigned char*") ByteBuffer materialBase, int materialStride,
										   IntBuffer triangleMaterialsBase, int materialIndexStride);
	public btTriangleIndexVertexMaterialArray(int numTriangles, int[] triangleIndexBase, int triangleIndexStride,
										   int numVertices, @Cast("btScalar*") double[] vertexBase, int vertexStride,
										   int numMaterials, @Cast("unsigned char*") byte[] materialBase, int materialStride,
										   int[] triangleMaterialsBase, int materialIndexStride) { super((Pointer)null); allocate(numTriangles, triangleIndexBase, triangleIndexStride, numVertices, vertexBase, vertexStride, numMaterials, materialBase, materialStride, triangleMaterialsBase, materialIndexStride); }
	private native void allocate(int numTriangles, int[] triangleIndexBase, int triangleIndexStride,
										   int numVertices, @Cast("btScalar*") double[] vertexBase, int vertexStride,
										   int numMaterials, @Cast("unsigned char*") byte[] materialBase, int materialStride,
										   int[] triangleMaterialsBase, int materialIndexStride);

	public native void addMaterialProperties(@Const @ByRef btMaterialProperties mat, @Cast("PHY_ScalarType") int triangleType/*=PHY_INTEGER*/);
	public native void addMaterialProperties(@Const @ByRef btMaterialProperties mat);

	public native void getLockedMaterialBase(@Cast("unsigned char**") PointerPointer materialBase, @ByRef IntPointer numMaterials, @Cast("PHY_ScalarType*") @ByRef IntPointer materialType, @ByRef IntPointer materialStride,
										   @Cast("unsigned char**") PointerPointer triangleMaterialBase, @ByRef IntPointer numTriangles, @ByRef IntPointer triangleMaterialStride, @Cast("PHY_ScalarType*") @ByRef IntPointer triangleType, int subpart/*=0*/);
	public native void getLockedMaterialBase(@Cast("unsigned char**") @ByPtrPtr BytePointer materialBase, @ByRef IntPointer numMaterials, @Cast("PHY_ScalarType*") @ByRef IntPointer materialType, @ByRef IntPointer materialStride,
										   @Cast("unsigned char**") @ByPtrPtr BytePointer triangleMaterialBase, @ByRef IntPointer numTriangles, @ByRef IntPointer triangleMaterialStride, @Cast("PHY_ScalarType*") @ByRef IntPointer triangleType);
	public native void getLockedMaterialBase(@Cast("unsigned char**") @ByPtrPtr BytePointer materialBase, @ByRef IntPointer numMaterials, @Cast("PHY_ScalarType*") @ByRef IntPointer materialType, @ByRef IntPointer materialStride,
										   @Cast("unsigned char**") @ByPtrPtr BytePointer triangleMaterialBase, @ByRef IntPointer numTriangles, @ByRef IntPointer triangleMaterialStride, @Cast("PHY_ScalarType*") @ByRef IntPointer triangleType, int subpart/*=0*/);
	public native void getLockedMaterialBase(@Cast("unsigned char**") @ByPtrPtr ByteBuffer materialBase, @ByRef IntBuffer numMaterials, @Cast("PHY_ScalarType*") @ByRef IntBuffer materialType, @ByRef IntBuffer materialStride,
										   @Cast("unsigned char**") @ByPtrPtr ByteBuffer triangleMaterialBase, @ByRef IntBuffer numTriangles, @ByRef IntBuffer triangleMaterialStride, @Cast("PHY_ScalarType*") @ByRef IntBuffer triangleType, int subpart/*=0*/);
	public native void getLockedMaterialBase(@Cast("unsigned char**") @ByPtrPtr ByteBuffer materialBase, @ByRef IntBuffer numMaterials, @Cast("PHY_ScalarType*") @ByRef IntBuffer materialType, @ByRef IntBuffer materialStride,
										   @Cast("unsigned char**") @ByPtrPtr ByteBuffer triangleMaterialBase, @ByRef IntBuffer numTriangles, @ByRef IntBuffer triangleMaterialStride, @Cast("PHY_ScalarType*") @ByRef IntBuffer triangleType);
	public native void getLockedMaterialBase(@Cast("unsigned char**") @ByPtrPtr byte[] materialBase, @ByRef int[] numMaterials, @Cast("PHY_ScalarType*") @ByRef int[] materialType, @ByRef int[] materialStride,
										   @Cast("unsigned char**") @ByPtrPtr byte[] triangleMaterialBase, @ByRef int[] numTriangles, @ByRef int[] triangleMaterialStride, @Cast("PHY_ScalarType*") @ByRef int[] triangleType, int subpart/*=0*/);
	public native void getLockedMaterialBase(@Cast("unsigned char**") @ByPtrPtr byte[] materialBase, @ByRef int[] numMaterials, @Cast("PHY_ScalarType*") @ByRef int[] materialType, @ByRef int[] materialStride,
										   @Cast("unsigned char**") @ByPtrPtr byte[] triangleMaterialBase, @ByRef int[] numTriangles, @ByRef int[] triangleMaterialStride, @Cast("PHY_ScalarType*") @ByRef int[] triangleType);

	public native void getLockedReadOnlyMaterialBase(@Cast("const unsigned char**") PointerPointer materialBase, @ByRef IntPointer numMaterials, @Cast("PHY_ScalarType*") @ByRef IntPointer materialType, @ByRef IntPointer materialStride,
												   @Cast("const unsigned char**") PointerPointer triangleMaterialBase, @ByRef IntPointer numTriangles, @ByRef IntPointer triangleMaterialStride, @Cast("PHY_ScalarType*") @ByRef IntPointer triangleType, int subpart/*=0*/);
	public native void getLockedReadOnlyMaterialBase(@Cast("const unsigned char**") @ByPtrPtr BytePointer materialBase, @ByRef IntPointer numMaterials, @Cast("PHY_ScalarType*") @ByRef IntPointer materialType, @ByRef IntPointer materialStride,
												   @Cast("const unsigned char**") @ByPtrPtr BytePointer triangleMaterialBase, @ByRef IntPointer numTriangles, @ByRef IntPointer triangleMaterialStride, @Cast("PHY_ScalarType*") @ByRef IntPointer triangleType);
	public native void getLockedReadOnlyMaterialBase(@Cast("const unsigned char**") @ByPtrPtr BytePointer materialBase, @ByRef IntPointer numMaterials, @Cast("PHY_ScalarType*") @ByRef IntPointer materialType, @ByRef IntPointer materialStride,
												   @Cast("const unsigned char**") @ByPtrPtr BytePointer triangleMaterialBase, @ByRef IntPointer numTriangles, @ByRef IntPointer triangleMaterialStride, @Cast("PHY_ScalarType*") @ByRef IntPointer triangleType, int subpart/*=0*/);
	public native void getLockedReadOnlyMaterialBase(@Cast("const unsigned char**") @ByPtrPtr ByteBuffer materialBase, @ByRef IntBuffer numMaterials, @Cast("PHY_ScalarType*") @ByRef IntBuffer materialType, @ByRef IntBuffer materialStride,
												   @Cast("const unsigned char**") @ByPtrPtr ByteBuffer triangleMaterialBase, @ByRef IntBuffer numTriangles, @ByRef IntBuffer triangleMaterialStride, @Cast("PHY_ScalarType*") @ByRef IntBuffer triangleType, int subpart/*=0*/);
	public native void getLockedReadOnlyMaterialBase(@Cast("const unsigned char**") @ByPtrPtr ByteBuffer materialBase, @ByRef IntBuffer numMaterials, @Cast("PHY_ScalarType*") @ByRef IntBuffer materialType, @ByRef IntBuffer materialStride,
												   @Cast("const unsigned char**") @ByPtrPtr ByteBuffer triangleMaterialBase, @ByRef IntBuffer numTriangles, @ByRef IntBuffer triangleMaterialStride, @Cast("PHY_ScalarType*") @ByRef IntBuffer triangleType);
	public native void getLockedReadOnlyMaterialBase(@Cast("const unsigned char**") @ByPtrPtr byte[] materialBase, @ByRef int[] numMaterials, @Cast("PHY_ScalarType*") @ByRef int[] materialType, @ByRef int[] materialStride,
												   @Cast("const unsigned char**") @ByPtrPtr byte[] triangleMaterialBase, @ByRef int[] numTriangles, @ByRef int[] triangleMaterialStride, @Cast("PHY_ScalarType*") @ByRef int[] triangleType, int subpart/*=0*/);
	public native void getLockedReadOnlyMaterialBase(@Cast("const unsigned char**") @ByPtrPtr byte[] materialBase, @ByRef int[] numMaterials, @Cast("PHY_ScalarType*") @ByRef int[] materialType, @ByRef int[] materialStride,
												   @Cast("const unsigned char**") @ByPtrPtr byte[] triangleMaterialBase, @ByRef int[] numTriangles, @ByRef int[] triangleMaterialStride, @Cast("PHY_ScalarType*") @ByRef int[] triangleType);
}
