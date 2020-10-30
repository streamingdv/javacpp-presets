// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_flight;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.arrow_flight.*;


/** \brief A host location (a URI) */
@Namespace("arrow::flight") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow_flight.class)
public class Location extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Location(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Location(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Location position(long position) {
        return (Location)super.position(position);
    }
    @Override public Location getPointer(long i) {
        return new Location(this).position(position + i);
    }

  /** \brief Initialize a blank location. */
  public Location() { super((Pointer)null); allocate(); }
  private native void allocate();

  /** \brief Initialize a location by parsing a URI string */
  public static native @ByVal Status Parse(@StdString String uri_string, Location location);
  public static native @ByVal Status Parse(@StdString BytePointer uri_string, Location location);

  /** \brief Initialize a location for a non-TLS, gRPC-based Flight
   *  service from a host and port
   *  @param host [in] The hostname to connect to
   *  @param port [in] The port
   *  @param location [out] The resulting location */
  public static native @ByVal Status ForGrpcTcp(@StdString String host, int port, Location location);
  public static native @ByVal Status ForGrpcTcp(@StdString BytePointer host, int port, Location location);

  /** \brief Initialize a location for a TLS-enabled, gRPC-based Flight
   *  service from a host and port
   *  @param host [in] The hostname to connect to
   *  @param port [in] The port
   *  @param location [out] The resulting location */
  public static native @ByVal Status ForGrpcTls(@StdString String host, int port, Location location);
  public static native @ByVal Status ForGrpcTls(@StdString BytePointer host, int port, Location location);

  /** \brief Initialize a location for a domain socket-based Flight
   *  service
   *  @param path [in] The path to the domain socket
   *  @param location [out] The resulting location */
  public static native @ByVal Status ForGrpcUnix(@StdString String path, Location location);
  public static native @ByVal Status ForGrpcUnix(@StdString BytePointer path, Location location);

  /** \brief Get a representation of this URI as a string. */
  public native @StdString String ToString();

  /** \brief Get the scheme of this URI. */
  public native @StdString String scheme();

  public native @Cast("bool") boolean Equals(@Const @ByRef Location other);

  
  
}
