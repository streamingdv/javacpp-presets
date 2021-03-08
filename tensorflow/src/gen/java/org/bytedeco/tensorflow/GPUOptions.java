// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class GPUOptions extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GPUOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public GPUOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public GPUOptions position(long position) {
        return (GPUOptions)super.position(position);
    }
    @Override public GPUOptions getPointer(long i) {
        return new GPUOptions((Pointer)this).position(position + i);
    }

  public GPUOptions() { super((Pointer)null); allocate(); }
  private native void allocate();

  public GPUOptions(@Const @ByRef GPUOptions from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef GPUOptions from);

  public native @ByRef @Name("operator =") GPUOptions put(@Const @ByRef GPUOptions from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef GPUOptions default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const GPUOptions internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(GPUOptions other);
  public native void Swap(GPUOptions other);
  

  // implements Message ----------------------------------------------

  public native GPUOptions New();

  public native GPUOptions New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef GPUOptions from);
  public native void MergeFrom(@Const @ByRef GPUOptions from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
//   #if GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
//   #else
  public native @Cast("bool") boolean MergePartialFromCodedStream(
        CodedInputStream input);
//   #endif  // GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
  public native void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") byte[] target);
  public native int GetCachedSize();

  public native @ByVal @Cast("google::protobuf::Metadata*") Pointer GetMetadata();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // string allocator_type = 2;
  public native void clear_allocator_type();
  @MemberGetter public static native int kAllocatorTypeFieldNumber();
  public static final int kAllocatorTypeFieldNumber = kAllocatorTypeFieldNumber();
  public native @StdString BytePointer allocator_type();
  public native void set_allocator_type(@StdString BytePointer value);
  public native void set_allocator_type(@StdString String value);
  public native void set_allocator_type(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_allocator_type(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_allocator_type();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_allocator_type();
  public native void set_allocated_allocator_type(@StdString @Cast({"char*", "std::string*"}) BytePointer allocator_type);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_allocator_type();
  public native void unsafe_arena_set_allocated_allocator_type(
        @StdString @Cast({"char*", "std::string*"}) BytePointer allocator_type);

  // string visible_device_list = 5;
  public native void clear_visible_device_list();
  @MemberGetter public static native int kVisibleDeviceListFieldNumber();
  public static final int kVisibleDeviceListFieldNumber = kVisibleDeviceListFieldNumber();
  public native @StdString BytePointer visible_device_list();
  public native void set_visible_device_list(@StdString BytePointer value);
  public native void set_visible_device_list(@StdString String value);
  public native void set_visible_device_list(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_visible_device_list(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_visible_device_list();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_visible_device_list();
  public native void set_allocated_visible_device_list(@StdString @Cast({"char*", "std::string*"}) BytePointer visible_device_list);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_visible_device_list();
  public native void unsafe_arena_set_allocated_visible_device_list(
        @StdString @Cast({"char*", "std::string*"}) BytePointer visible_device_list);

  // .tensorflow.GPUOptions.Experimental experimental = 9;
  public native @Cast("bool") boolean has_experimental();
  public native void clear_experimental();
  @MemberGetter public static native int kExperimentalFieldNumber();
  public static final int kExperimentalFieldNumber = kExperimentalFieldNumber();
  public native @Const @ByRef GPUOptions_Experimental experimental();
  public native GPUOptions_Experimental release_experimental();
  public native GPUOptions_Experimental mutable_experimental();
  public native void set_allocated_experimental(GPUOptions_Experimental experimental);
  public native void unsafe_arena_set_allocated_experimental(
        GPUOptions_Experimental experimental);
  public native GPUOptions_Experimental unsafe_arena_release_experimental();

  // double per_process_gpu_memory_fraction = 1;
  public native void clear_per_process_gpu_memory_fraction();
  @MemberGetter public static native int kPerProcessGpuMemoryFractionFieldNumber();
  public static final int kPerProcessGpuMemoryFractionFieldNumber = kPerProcessGpuMemoryFractionFieldNumber();
  public native double per_process_gpu_memory_fraction();
  public native void set_per_process_gpu_memory_fraction(double value);

  // int64 deferred_deletion_bytes = 3;
  public native void clear_deferred_deletion_bytes();
  @MemberGetter public static native int kDeferredDeletionBytesFieldNumber();
  public static final int kDeferredDeletionBytesFieldNumber = kDeferredDeletionBytesFieldNumber();
  public native @Cast("google::protobuf::int64") long deferred_deletion_bytes();
  public native void set_deferred_deletion_bytes(@Cast("google::protobuf::int64") long value);

  // int32 polling_active_delay_usecs = 6;
  public native void clear_polling_active_delay_usecs();
  @MemberGetter public static native int kPollingActiveDelayUsecsFieldNumber();
  public static final int kPollingActiveDelayUsecsFieldNumber = kPollingActiveDelayUsecsFieldNumber();
  public native @Cast("google::protobuf::int32") int polling_active_delay_usecs();
  public native void set_polling_active_delay_usecs(@Cast("google::protobuf::int32") int value);

  // bool allow_growth = 4;
  public native void clear_allow_growth();
  @MemberGetter public static native int kAllowGrowthFieldNumber();
  public static final int kAllowGrowthFieldNumber = kAllowGrowthFieldNumber();
  public native @Cast("bool") boolean allow_growth();
  public native void set_allow_growth(@Cast("bool") boolean value);

  // bool force_gpu_compatible = 8;
  public native void clear_force_gpu_compatible();
  @MemberGetter public static native int kForceGpuCompatibleFieldNumber();
  public static final int kForceGpuCompatibleFieldNumber = kForceGpuCompatibleFieldNumber();
  public native @Cast("bool") boolean force_gpu_compatible();
  public native void set_force_gpu_compatible(@Cast("bool") boolean value);

  // int32 polling_inactive_delay_msecs = 7;
  public native void clear_polling_inactive_delay_msecs();
  @MemberGetter public static native int kPollingInactiveDelayMsecsFieldNumber();
  public static final int kPollingInactiveDelayMsecsFieldNumber = kPollingInactiveDelayMsecsFieldNumber();
  public native @Cast("google::protobuf::int32") int polling_inactive_delay_msecs();
  public native void set_polling_inactive_delay_msecs(@Cast("google::protobuf::int32") int value);
}
