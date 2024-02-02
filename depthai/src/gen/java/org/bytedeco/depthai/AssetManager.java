// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.depthai.global.depthai.*;


// Subclass which has its own storage
/**
 * \brief AssetManager can store assets and serialize
 */
@Namespace("dai") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class AssetManager extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AssetManager() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AssetManager(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AssetManager(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AssetManager position(long position) {
        return (AssetManager)super.position(position);
    }
    @Override public AssetManager getPointer(long i) {
        return new AssetManager((Pointer)this).offsetAddress(i);
    }

    /**
     * Adds all assets in an array to the AssetManager
     * @param assets Vector of assets to add
     */
    public native void addExisting(@ByVal AssetVector assets);

    /**
     * Adds or overwrites an asset object to AssetManager.
     * @param asset Asset to add
     * @return Shared pointer to asset
     */
    public native @SharedPtr @ByVal Asset set(@ByVal Asset asset);

    /**
     * Adds or overwrites an asset object to AssetManager with a specified key.
     * Key value will be assigned to an Asset as well
     *
     * @param key Key under which the asset should be stored
     * @param asset Asset to store
     * @return Shared pointer to asset
     */
    public native @SharedPtr @ByVal Asset set(@StdString BytePointer key, @ByVal Asset asset);
    public native @SharedPtr @ByVal Asset set(@StdString ByteBuffer key, @ByVal Asset asset);
    public native @SharedPtr @ByVal Asset set(@StdString String key, @ByVal Asset asset);

    /**
     * Loads file into asset manager under specified key.
     *
     * @param key Key under which the asset should be stored
     * @param path Path to file which to load as asset
     * @param alignment [Optional] alignment of asset data in asset storage. Default is 64B
     */
    public native @SharedPtr @ByVal Asset set(@StdString BytePointer key, @Const @ByRef Path path, int alignment/*=64*/);
    public native @SharedPtr @ByVal Asset set(@StdString BytePointer key, @Const @ByRef Path path);
    public native @SharedPtr @ByVal Asset set(@StdString ByteBuffer key, @Const @ByRef Path path, int alignment/*=64*/);
    public native @SharedPtr @ByVal Asset set(@StdString ByteBuffer key, @Const @ByRef Path path);
    public native @SharedPtr @ByVal Asset set(@StdString String key, @Const @ByRef Path path, int alignment/*=64*/);
    public native @SharedPtr @ByVal Asset set(@StdString String key, @Const @ByRef Path path);

    /**
     * Loads file into asset manager under specified key.
     *
     * @param key Key under which the asset should be stored
     * @param data Asset data
     * @param alignment [Optional] alignment of asset data in asset storage. Default is 64B
     * @return Shared pointer to asset
     */
    public native @SharedPtr @ByVal Asset set(@StdString BytePointer key, @Cast("std::uint8_t*") @StdVector BytePointer data, int alignment/*=64*/);
    public native @SharedPtr @ByVal Asset set(@StdString BytePointer key, @Cast("std::uint8_t*") @StdVector BytePointer data);
    public native @SharedPtr @ByVal Asset set(@StdString ByteBuffer key, @Cast("std::uint8_t*") @StdVector ByteBuffer data, int alignment/*=64*/);
    public native @SharedPtr @ByVal Asset set(@StdString ByteBuffer key, @Cast("std::uint8_t*") @StdVector ByteBuffer data);
    public native @SharedPtr @ByVal Asset set(@StdString String key, @Cast("std::uint8_t*") @StdVector byte[] data, int alignment/*=64*/);
    public native @SharedPtr @ByVal Asset set(@StdString String key, @Cast("std::uint8_t*") @StdVector byte[] data);

    /**
     * @return Asset assigned to the specified key or a nullptr otherwise
     */

    /**
     * @return Asset assigned to the specified key or a nullptr otherwise
     */
    public native @SharedPtr @ByVal Asset get(@StdString BytePointer key);
    public native @SharedPtr @ByVal Asset get(@StdString ByteBuffer key);
    public native @SharedPtr @ByVal Asset get(@StdString String key);

    /**
     * @return All asset stored in the AssetManager
     */

    /**
     * @return All asset stored in the AssetManager
     */
    public native @ByVal AssetVector getAll();

    /**
     * @return Number of asset stored in the AssetManager
     */
    public native @Cast("std::size_t") long size();

    /**
     * Removes asset with key
     * @param key Key of asset to remove
     */
    public native void remove(@StdString BytePointer key);
    public native void remove(@StdString ByteBuffer key);
    public native void remove(@StdString String key);

    /** Serializes */
    public native void serialize(@ByRef AssetsMutable assets, @Cast("std::uint8_t*") @StdVector BytePointer assetStorage, @StdString BytePointer prefix/*=""*/);
    public native void serialize(@ByRef AssetsMutable assets, @Cast("std::uint8_t*") @StdVector BytePointer assetStorage);
    public native void serialize(@ByRef AssetsMutable assets, @Cast("std::uint8_t*") @StdVector ByteBuffer assetStorage, @StdString ByteBuffer prefix/*=""*/);
    public native void serialize(@ByRef AssetsMutable assets, @Cast("std::uint8_t*") @StdVector ByteBuffer assetStorage);
    public native void serialize(@ByRef AssetsMutable assets, @Cast("std::uint8_t*") @StdVector byte[] assetStorage, @StdString String prefix/*=""*/);
    public native void serialize(@ByRef AssetsMutable assets, @Cast("std::uint8_t*") @StdVector byte[] assetStorage);
}
