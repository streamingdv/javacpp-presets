// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Allocator;
import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;


    /** \brief A handle for one of a node's inputs. */
    @Name("ngraph::Input<ngraph::Node>") @NoOffset @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class NodeInput extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public NodeInput(Pointer p) { super(p); }
    
        /** \brief Constructs a Input.
         *  @param node Pointer to the node for the input handle.
         *  @param index The index of the input. */
        public NodeInput(Node node, @Cast("size_t") long index) { super((Pointer)null); allocate(node, index); }
        private native void allocate(Node node, @Cast("size_t") long index);

        /** @return A pointer to the node referenced by this input handle. */
        public native Node get_node();
        /** @return The index of the input referred to by this input handle. */
        public native @Cast("size_t") long get_index();
        /** @return The element type of the input referred to by this input handle. */
        public native @Const @ByRef Type get_element_type();
        /** @return The shape of the input referred to by this input handle. */
        public native @Const @ByRef Shape get_shape();
        /** @return The partial shape of the input referred to by this input handle. */
        public native @Const @ByRef PartialShape get_partial_shape();
        /** @return A handle to the output that is connected to this input. */
        public native @ByVal NodeOutput get_source_output();
        /** @return A reference to the tensor descriptor for this input. */
        public native @ByRef DescriptorTensor get_tensor();
        /** @return A shared pointer to the tensor descriptor for this input. */
        public native @SharedPtr @ByVal DescriptorTensor get_tensor_ptr();
        /** @return true if this input is relevant to its node's output shapes; else false. */
        public native @Cast("bool") boolean get_is_relevant_to_shapes();
        /** @return true if this input is relevant to its node's output values; else false. */
        public native @Cast("bool") boolean get_is_relevant_to_values();

        /** \brief Replaces the source output of this input.
         *  @param new_source_output A handle for the output that will replace this input's source. */
        public native void replace_source_output(@Const @ByRef NodeOutput new_source_output);

        public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef NodeInput other);
        public native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef NodeInput other);
        public native @Cast("bool") @Name("operator <") boolean lessThan(@Const @ByRef NodeInput other);
        public native @Cast("bool") @Name("operator >") boolean greaterThan(@Const @ByRef NodeInput other);
        public native @Cast("bool") @Name("operator <=") boolean lessThanEquals(@Const @ByRef NodeInput other);
        public native @Cast("bool") @Name("operator >=") boolean greaterThanEquals(@Const @ByRef NodeInput other);
    }
