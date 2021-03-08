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
public class RewriterConfig extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RewriterConfig(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RewriterConfig(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public RewriterConfig position(long position) {
        return (RewriterConfig)super.position(position);
    }
    @Override public RewriterConfig getPointer(long i) {
        return new RewriterConfig((Pointer)this).position(position + i);
    }

  public RewriterConfig() { super((Pointer)null); allocate(); }
  private native void allocate();

  public RewriterConfig(@Const @ByRef RewriterConfig from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef RewriterConfig from);

  public native @ByRef @Name("operator =") RewriterConfig put(@Const @ByRef RewriterConfig from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef RewriterConfig default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const RewriterConfig internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(RewriterConfig other);
  public native void Swap(RewriterConfig other);
  

  // implements Message ----------------------------------------------

  public native RewriterConfig New();

  public native RewriterConfig New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef RewriterConfig from);
  public native void MergeFrom(@Const @ByRef RewriterConfig from);
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
  @MemberGetter public static native @Cast("const tensorflow::RewriterConfig::Toggle") int DEFAULT();
  public static final int DEFAULT = DEFAULT();
  @MemberGetter public static native @Cast("const tensorflow::RewriterConfig::Toggle") int ON();
  public static final int ON = ON();
  @MemberGetter public static native @Cast("const tensorflow::RewriterConfig::Toggle") int OFF();
  public static final int OFF = OFF();
  @MemberGetter public static native @Cast("const tensorflow::RewriterConfig::Toggle") int AGGRESSIVE();
  public static final int AGGRESSIVE = AGGRESSIVE();
  public static native @Cast("bool") boolean Toggle_IsValid(int value);
  @MemberGetter public static native @Cast("const tensorflow::RewriterConfig::Toggle") int Toggle_MIN();
  public static final int Toggle_MIN = Toggle_MIN();
  @MemberGetter public static native @Cast("const tensorflow::RewriterConfig::Toggle") int Toggle_MAX();
  public static final int Toggle_MAX = Toggle_MAX();
  @MemberGetter public static native int Toggle_ARRAYSIZE();
  public static final int Toggle_ARRAYSIZE = Toggle_ARRAYSIZE();
  public static native @Cast("const google::protobuf::EnumDescriptor*") Pointer Toggle_descriptor();
  public static native @Cast("bool") boolean Toggle_Parse(@StdString BytePointer name,
        @Cast("tensorflow::RewriterConfig::Toggle*") IntPointer value);
  public static native @Cast("bool") boolean Toggle_Parse(@StdString String name,
        @Cast("tensorflow::RewriterConfig::Toggle*") IntBuffer value);
  public static native @Cast("bool") boolean Toggle_Parse(@StdString BytePointer name,
        @Cast("tensorflow::RewriterConfig::Toggle*") int... value);
  public static native @Cast("bool") boolean Toggle_Parse(@StdString String name,
        @Cast("tensorflow::RewriterConfig::Toggle*") IntPointer value);
  public static native @Cast("bool") boolean Toggle_Parse(@StdString BytePointer name,
        @Cast("tensorflow::RewriterConfig::Toggle*") IntBuffer value);
  public static native @Cast("bool") boolean Toggle_Parse(@StdString String name,
        @Cast("tensorflow::RewriterConfig::Toggle*") int... value);
  @MemberGetter public static native @Cast("const tensorflow::RewriterConfig::NumIterationsType") int DEFAULT_NUM_ITERS();
  public static final int DEFAULT_NUM_ITERS = DEFAULT_NUM_ITERS();
  @MemberGetter public static native @Cast("const tensorflow::RewriterConfig::NumIterationsType") int ONE();
  public static final int ONE = ONE();
  @MemberGetter public static native @Cast("const tensorflow::RewriterConfig::NumIterationsType") int TWO();
  public static final int TWO = TWO();
  public static native @Cast("bool") boolean NumIterationsType_IsValid(int value);
  @MemberGetter public static native @Cast("const tensorflow::RewriterConfig::NumIterationsType") int NumIterationsType_MIN();
  public static final int NumIterationsType_MIN = NumIterationsType_MIN();
  @MemberGetter public static native @Cast("const tensorflow::RewriterConfig::NumIterationsType") int NumIterationsType_MAX();
  public static final int NumIterationsType_MAX = NumIterationsType_MAX();
  @MemberGetter public static native int NumIterationsType_ARRAYSIZE();
  public static final int NumIterationsType_ARRAYSIZE = NumIterationsType_ARRAYSIZE();
  public static native @Cast("const google::protobuf::EnumDescriptor*") Pointer NumIterationsType_descriptor();
  public static native @Cast("bool") boolean NumIterationsType_Parse(@StdString BytePointer name,
        @Cast("tensorflow::RewriterConfig::NumIterationsType*") IntPointer value);
  public static native @Cast("bool") boolean NumIterationsType_Parse(@StdString String name,
        @Cast("tensorflow::RewriterConfig::NumIterationsType*") IntBuffer value);
  public static native @Cast("bool") boolean NumIterationsType_Parse(@StdString BytePointer name,
        @Cast("tensorflow::RewriterConfig::NumIterationsType*") int... value);
  public static native @Cast("bool") boolean NumIterationsType_Parse(@StdString String name,
        @Cast("tensorflow::RewriterConfig::NumIterationsType*") IntPointer value);
  public static native @Cast("bool") boolean NumIterationsType_Parse(@StdString BytePointer name,
        @Cast("tensorflow::RewriterConfig::NumIterationsType*") IntBuffer value);
  public static native @Cast("bool") boolean NumIterationsType_Parse(@StdString String name,
        @Cast("tensorflow::RewriterConfig::NumIterationsType*") int... value);
  @MemberGetter public static native @Cast("const tensorflow::RewriterConfig::MemOptType") int DEFAULT_MEM_OPT();
  public static final int DEFAULT_MEM_OPT = DEFAULT_MEM_OPT();
  @MemberGetter public static native @Cast("const tensorflow::RewriterConfig::MemOptType") int NO_MEM_OPT();
  public static final int NO_MEM_OPT = NO_MEM_OPT();
  @MemberGetter public static native @Cast("const tensorflow::RewriterConfig::MemOptType") int MANUAL();
  public static final int MANUAL = MANUAL();
  @MemberGetter public static native @Cast("const tensorflow::RewriterConfig::MemOptType") int SWAPPING_HEURISTICS();
  public static final int SWAPPING_HEURISTICS = SWAPPING_HEURISTICS();
  @MemberGetter public static native @Cast("const tensorflow::RewriterConfig::MemOptType") int RECOMPUTATION_HEURISTICS();
  public static final int RECOMPUTATION_HEURISTICS = RECOMPUTATION_HEURISTICS();
  @MemberGetter public static native @Cast("const tensorflow::RewriterConfig::MemOptType") int SCHEDULING_HEURISTICS();
  public static final int SCHEDULING_HEURISTICS = SCHEDULING_HEURISTICS();
  @MemberGetter public static native @Cast("const tensorflow::RewriterConfig::MemOptType") int HEURISTICS();
  public static final int HEURISTICS = HEURISTICS();
  public static native @Cast("bool") boolean MemOptType_IsValid(int value);
  @MemberGetter public static native @Cast("const tensorflow::RewriterConfig::MemOptType") int MemOptType_MIN();
  public static final int MemOptType_MIN = MemOptType_MIN();
  @MemberGetter public static native @Cast("const tensorflow::RewriterConfig::MemOptType") int MemOptType_MAX();
  public static final int MemOptType_MAX = MemOptType_MAX();
  @MemberGetter public static native int MemOptType_ARRAYSIZE();
  public static final int MemOptType_ARRAYSIZE = MemOptType_ARRAYSIZE();
  public static native @Cast("const google::protobuf::EnumDescriptor*") Pointer MemOptType_descriptor();
  public static native @Cast("bool") boolean MemOptType_Parse(@StdString BytePointer name,
        @Cast("tensorflow::RewriterConfig::MemOptType*") IntPointer value);
  public static native @Cast("bool") boolean MemOptType_Parse(@StdString String name,
        @Cast("tensorflow::RewriterConfig::MemOptType*") IntBuffer value);
  public static native @Cast("bool") boolean MemOptType_Parse(@StdString BytePointer name,
        @Cast("tensorflow::RewriterConfig::MemOptType*") int... value);
  public static native @Cast("bool") boolean MemOptType_Parse(@StdString String name,
        @Cast("tensorflow::RewriterConfig::MemOptType*") IntPointer value);
  public static native @Cast("bool") boolean MemOptType_Parse(@StdString BytePointer name,
        @Cast("tensorflow::RewriterConfig::MemOptType*") IntBuffer value);
  public static native @Cast("bool") boolean MemOptType_Parse(@StdString String name,
        @Cast("tensorflow::RewriterConfig::MemOptType*") int... value);

  // accessors -------------------------------------------------------

  // repeated string optimizers = 100;
  public native int optimizers_size();
  public native void clear_optimizers();
  @MemberGetter public static native int kOptimizersFieldNumber();
  public static final int kOptimizersFieldNumber = kOptimizersFieldNumber();
  public native @StdString BytePointer optimizers(int index);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_optimizers(int index);
  public native void set_optimizers(int index, @StdString BytePointer value);
  public native void set_optimizers(int index, @StdString String value);
  public native void set_optimizers(int index, @Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_optimizers(int index, String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer add_optimizers();
  public native void add_optimizers(@StdString BytePointer value);
  public native void add_optimizers(@StdString String value);
  public native void add_optimizers(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void add_optimizers(String value, @Cast("size_t") long size);

  // repeated .tensorflow.RewriterConfig.CustomGraphOptimizer custom_optimizers = 200;
  public native int custom_optimizers_size();
  public native void clear_custom_optimizers();
  @MemberGetter public static native int kCustomOptimizersFieldNumber();
  public static final int kCustomOptimizersFieldNumber = kCustomOptimizersFieldNumber();
  public native RewriterConfig_CustomGraphOptimizer mutable_custom_optimizers(int index);
  public native @Const @ByRef RewriterConfig_CustomGraphOptimizer custom_optimizers(int index);
  public native RewriterConfig_CustomGraphOptimizer add_custom_optimizers();

  // string memory_optimizer_target_node_name_scope = 6;
  public native void clear_memory_optimizer_target_node_name_scope();
  @MemberGetter public static native int kMemoryOptimizerTargetNodeNameScopeFieldNumber();
  public static final int kMemoryOptimizerTargetNodeNameScopeFieldNumber = kMemoryOptimizerTargetNodeNameScopeFieldNumber();
  public native @StdString BytePointer memory_optimizer_target_node_name_scope();
  public native void set_memory_optimizer_target_node_name_scope(@StdString BytePointer value);
  public native void set_memory_optimizer_target_node_name_scope(@StdString String value);
  public native void set_memory_optimizer_target_node_name_scope(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_memory_optimizer_target_node_name_scope(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_memory_optimizer_target_node_name_scope();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_memory_optimizer_target_node_name_scope();
  public native void set_allocated_memory_optimizer_target_node_name_scope(@StdString @Cast({"char*", "std::string*"}) BytePointer memory_optimizer_target_node_name_scope);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_memory_optimizer_target_node_name_scope();
  public native void unsafe_arena_set_allocated_memory_optimizer_target_node_name_scope(
        @StdString @Cast({"char*", "std::string*"}) BytePointer memory_optimizer_target_node_name_scope);

  // .tensorflow.AutoParallelOptions auto_parallel = 5;
  public native @Cast("bool") boolean has_auto_parallel();
  public native void clear_auto_parallel();
  @MemberGetter public static native int kAutoParallelFieldNumber();
  public static final int kAutoParallelFieldNumber = kAutoParallelFieldNumber();
  public native @Const @ByRef AutoParallelOptions auto_parallel();
  public native AutoParallelOptions release_auto_parallel();
  public native AutoParallelOptions mutable_auto_parallel();
  public native void set_allocated_auto_parallel(AutoParallelOptions auto_parallel);
  public native void unsafe_arena_set_allocated_auto_parallel(
        AutoParallelOptions auto_parallel);
  public native AutoParallelOptions unsafe_arena_release_auto_parallel();

  // .tensorflow.ScopedAllocatorOptions scoped_allocator_opts = 16;
  public native @Cast("bool") boolean has_scoped_allocator_opts();
  public native void clear_scoped_allocator_opts();
  @MemberGetter public static native int kScopedAllocatorOptsFieldNumber();
  public static final int kScopedAllocatorOptsFieldNumber = kScopedAllocatorOptsFieldNumber();
  public native @Const @ByRef ScopedAllocatorOptions scoped_allocator_opts();
  public native ScopedAllocatorOptions release_scoped_allocator_opts();
  public native ScopedAllocatorOptions mutable_scoped_allocator_opts();
  public native void set_allocated_scoped_allocator_opts(ScopedAllocatorOptions scoped_allocator_opts);
  public native void unsafe_arena_set_allocated_scoped_allocator_opts(
        ScopedAllocatorOptions scoped_allocator_opts);
  public native ScopedAllocatorOptions unsafe_arena_release_scoped_allocator_opts();

  // .tensorflow.VerifierConfig inter_optimizer_verifier_config = 300;
  public native @Cast("bool") boolean has_inter_optimizer_verifier_config();
  public native void clear_inter_optimizer_verifier_config();
  @MemberGetter public static native int kInterOptimizerVerifierConfigFieldNumber();
  public static final int kInterOptimizerVerifierConfigFieldNumber = kInterOptimizerVerifierConfigFieldNumber();
  public native @Const @ByRef VerifierConfig inter_optimizer_verifier_config();
  public native VerifierConfig release_inter_optimizer_verifier_config();
  public native VerifierConfig mutable_inter_optimizer_verifier_config();
  public native void set_allocated_inter_optimizer_verifier_config(VerifierConfig inter_optimizer_verifier_config);
  public native void unsafe_arena_set_allocated_inter_optimizer_verifier_config(
        VerifierConfig inter_optimizer_verifier_config);
  public native VerifierConfig unsafe_arena_release_inter_optimizer_verifier_config();

  // .tensorflow.VerifierConfig post_optimization_verifier_config = 301;
  public native @Cast("bool") boolean has_post_optimization_verifier_config();
  public native void clear_post_optimization_verifier_config();
  @MemberGetter public static native int kPostOptimizationVerifierConfigFieldNumber();
  public static final int kPostOptimizationVerifierConfigFieldNumber = kPostOptimizationVerifierConfigFieldNumber();
  public native @Const @ByRef VerifierConfig post_optimization_verifier_config();
  public native VerifierConfig release_post_optimization_verifier_config();
  public native VerifierConfig mutable_post_optimization_verifier_config();
  public native void set_allocated_post_optimization_verifier_config(VerifierConfig post_optimization_verifier_config);
  public native void unsafe_arena_set_allocated_post_optimization_verifier_config(
        VerifierConfig post_optimization_verifier_config);
  public native VerifierConfig unsafe_arena_release_post_optimization_verifier_config();

  // .tensorflow.RewriterConfig.Toggle layout_optimizer = 1;
  public native void clear_layout_optimizer();
  @MemberGetter public static native int kLayoutOptimizerFieldNumber();
  public static final int kLayoutOptimizerFieldNumber = kLayoutOptimizerFieldNumber();
  public native @Cast("tensorflow::RewriterConfig_Toggle") int layout_optimizer();
  public native void set_layout_optimizer(@Cast("tensorflow::RewriterConfig_Toggle") int value);

  // .tensorflow.RewriterConfig.Toggle constant_folding = 3;
  public native void clear_constant_folding();
  @MemberGetter public static native int kConstantFoldingFieldNumber();
  public static final int kConstantFoldingFieldNumber = kConstantFoldingFieldNumber();
  public native @Cast("tensorflow::RewriterConfig_Toggle") int constant_folding();
  public native void set_constant_folding(@Cast("tensorflow::RewriterConfig_Toggle") int value);

  // .tensorflow.RewriterConfig.MemOptType memory_optimization = 4;
  public native void clear_memory_optimization();
  @MemberGetter public static native int kMemoryOptimizationFieldNumber();
  public static final int kMemoryOptimizationFieldNumber = kMemoryOptimizationFieldNumber();
  public native @Cast("tensorflow::RewriterConfig_MemOptType") int memory_optimization();
  public native void set_memory_optimization(@Cast("tensorflow::RewriterConfig_MemOptType") int value);

  // .tensorflow.RewriterConfig.Toggle arithmetic_optimization = 7;
  public native void clear_arithmetic_optimization();
  @MemberGetter public static native int kArithmeticOptimizationFieldNumber();
  public static final int kArithmeticOptimizationFieldNumber = kArithmeticOptimizationFieldNumber();
  public native @Cast("tensorflow::RewriterConfig_Toggle") int arithmetic_optimization();
  public native void set_arithmetic_optimization(@Cast("tensorflow::RewriterConfig_Toggle") int value);

  // .tensorflow.RewriterConfig.Toggle dependency_optimization = 8;
  public native void clear_dependency_optimization();
  @MemberGetter public static native int kDependencyOptimizationFieldNumber();
  public static final int kDependencyOptimizationFieldNumber = kDependencyOptimizationFieldNumber();
  public native @Cast("tensorflow::RewriterConfig_Toggle") int dependency_optimization();
  public native void set_dependency_optimization(@Cast("tensorflow::RewriterConfig_Toggle") int value);

  // .tensorflow.RewriterConfig.Toggle loop_optimization = 9;
  public native void clear_loop_optimization();
  @MemberGetter public static native int kLoopOptimizationFieldNumber();
  public static final int kLoopOptimizationFieldNumber = kLoopOptimizationFieldNumber();
  public native @Cast("tensorflow::RewriterConfig_Toggle") int loop_optimization();
  public native void set_loop_optimization(@Cast("tensorflow::RewriterConfig_Toggle") int value);

  // .tensorflow.RewriterConfig.Toggle function_optimization = 10;
  public native void clear_function_optimization();
  @MemberGetter public static native int kFunctionOptimizationFieldNumber();
  public static final int kFunctionOptimizationFieldNumber = kFunctionOptimizationFieldNumber();
  public native @Cast("tensorflow::RewriterConfig_Toggle") int function_optimization();
  public native void set_function_optimization(@Cast("tensorflow::RewriterConfig_Toggle") int value);

  // .tensorflow.RewriterConfig.Toggle debug_stripper = 11;
  public native void clear_debug_stripper();
  @MemberGetter public static native int kDebugStripperFieldNumber();
  public static final int kDebugStripperFieldNumber = kDebugStripperFieldNumber();
  public native @Cast("tensorflow::RewriterConfig_Toggle") int debug_stripper();
  public native void set_debug_stripper(@Cast("tensorflow::RewriterConfig_Toggle") int value);

  // .tensorflow.RewriterConfig.NumIterationsType meta_optimizer_iterations = 12;
  public native void clear_meta_optimizer_iterations();
  @MemberGetter public static native int kMetaOptimizerIterationsFieldNumber();
  public static final int kMetaOptimizerIterationsFieldNumber = kMetaOptimizerIterationsFieldNumber();
  public native @Cast("tensorflow::RewriterConfig_NumIterationsType") int meta_optimizer_iterations();
  public native void set_meta_optimizer_iterations(@Cast("tensorflow::RewriterConfig_NumIterationsType") int value);

  // .tensorflow.RewriterConfig.Toggle shape_optimization = 13;
  public native void clear_shape_optimization();
  @MemberGetter public static native int kShapeOptimizationFieldNumber();
  public static final int kShapeOptimizationFieldNumber = kShapeOptimizationFieldNumber();
  public native @Cast("tensorflow::RewriterConfig_Toggle") int shape_optimization();
  public native void set_shape_optimization(@Cast("tensorflow::RewriterConfig_Toggle") int value);

  // .tensorflow.RewriterConfig.Toggle remapping = 14;
  public native void clear_remapping();
  @MemberGetter public static native int kRemappingFieldNumber();
  public static final int kRemappingFieldNumber = kRemappingFieldNumber();
  public native @Cast("tensorflow::RewriterConfig_Toggle") int remapping();
  public native void set_remapping(@Cast("tensorflow::RewriterConfig_Toggle") int value);

  // bool disable_model_pruning = 2;
  public native void clear_disable_model_pruning();
  @MemberGetter public static native int kDisableModelPruningFieldNumber();
  public static final int kDisableModelPruningFieldNumber = kDisableModelPruningFieldNumber();
  public native @Cast("bool") boolean disable_model_pruning();
  public native void set_disable_model_pruning(@Cast("bool") boolean value);

  // bool disable_meta_optimizer = 19;
  public native void clear_disable_meta_optimizer();
  @MemberGetter public static native int kDisableMetaOptimizerFieldNumber();
  public static final int kDisableMetaOptimizerFieldNumber = kDisableMetaOptimizerFieldNumber();
  public native @Cast("bool") boolean disable_meta_optimizer();
  public native void set_disable_meta_optimizer(@Cast("bool") boolean value);

  // bool fail_on_optimizer_errors = 21;
  public native void clear_fail_on_optimizer_errors();
  @MemberGetter public static native int kFailOnOptimizerErrorsFieldNumber();
  public static final int kFailOnOptimizerErrorsFieldNumber = kFailOnOptimizerErrorsFieldNumber();
  public native @Cast("bool") boolean fail_on_optimizer_errors();
  public native void set_fail_on_optimizer_errors(@Cast("bool") boolean value);

  // .tensorflow.RewriterConfig.Toggle scoped_allocator_optimization = 15;
  public native void clear_scoped_allocator_optimization();
  @MemberGetter public static native int kScopedAllocatorOptimizationFieldNumber();
  public static final int kScopedAllocatorOptimizationFieldNumber = kScopedAllocatorOptimizationFieldNumber();
  public native @Cast("tensorflow::RewriterConfig_Toggle") int scoped_allocator_optimization();
  public native void set_scoped_allocator_optimization(@Cast("tensorflow::RewriterConfig_Toggle") int value);

  // int32 min_graph_nodes = 17;
  public native void clear_min_graph_nodes();
  @MemberGetter public static native int kMinGraphNodesFieldNumber();
  public static final int kMinGraphNodesFieldNumber = kMinGraphNodesFieldNumber();
  public native @Cast("google::protobuf::int32") int min_graph_nodes();
  public native void set_min_graph_nodes(@Cast("google::protobuf::int32") int value);

  // int64 meta_optimizer_timeout_ms = 20;
  public native void clear_meta_optimizer_timeout_ms();
  @MemberGetter public static native int kMetaOptimizerTimeoutMsFieldNumber();
  public static final int kMetaOptimizerTimeoutMsFieldNumber = kMetaOptimizerTimeoutMsFieldNumber();
  public native @Cast("google::protobuf::int64") long meta_optimizer_timeout_ms();
  public native void set_meta_optimizer_timeout_ms(@Cast("google::protobuf::int64") long value);

  // .tensorflow.RewriterConfig.Toggle pin_to_host_optimization = 18;
  public native void clear_pin_to_host_optimization();
  @MemberGetter public static native int kPinToHostOptimizationFieldNumber();
  public static final int kPinToHostOptimizationFieldNumber = kPinToHostOptimizationFieldNumber();
  public native @Cast("tensorflow::RewriterConfig_Toggle") int pin_to_host_optimization();
  public native void set_pin_to_host_optimization(@Cast("tensorflow::RewriterConfig_Toggle") int value);

  // .tensorflow.RewriterConfig.Toggle implementation_selector = 22;
  public native void clear_implementation_selector();
  @MemberGetter public static native int kImplementationSelectorFieldNumber();
  public static final int kImplementationSelectorFieldNumber = kImplementationSelectorFieldNumber();
  public native @Cast("tensorflow::RewriterConfig_Toggle") int implementation_selector();
  public native void set_implementation_selector(@Cast("tensorflow::RewriterConfig_Toggle") int value);

  // .tensorflow.RewriterConfig.Toggle auto_mixed_precision = 23;
  public native void clear_auto_mixed_precision();
  @MemberGetter public static native int kAutoMixedPrecisionFieldNumber();
  public static final int kAutoMixedPrecisionFieldNumber = kAutoMixedPrecisionFieldNumber();
  public native @Cast("tensorflow::RewriterConfig_Toggle") int auto_mixed_precision();
  public native void set_auto_mixed_precision(@Cast("tensorflow::RewriterConfig_Toggle") int value);
}
