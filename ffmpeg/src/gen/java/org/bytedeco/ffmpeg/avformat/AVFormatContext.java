// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avformat;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.ffmpeg.avutil.*;
import static org.bytedeco.ffmpeg.global.avutil.*;
import org.bytedeco.ffmpeg.swresample.*;
import static org.bytedeco.ffmpeg.global.swresample.*;
import org.bytedeco.ffmpeg.avcodec.*;
import static org.bytedeco.ffmpeg.global.avcodec.*;

import static org.bytedeco.ffmpeg.global.avformat.*;


/**
 * Format I/O context.
 * New fields can be added to the end with minor version bumps.
 * Removal, reordering and changes to existing fields require a major
 * version bump.
 * sizeof(AVFormatContext) must not be used outside libav*, use
 * avformat_alloc_context() to create an AVFormatContext.
 *
 * Fields can be accessed through AVOptions (av_opt*),
 * the name string used matches the associated command line parameter name and
 * can be found in libavformat/options_table.h.
 * The AVOption/command line parameter names differ in some cases from the C
 * structure field names for historic reasons or brevity.
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avformat.class)
public class AVFormatContext extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVFormatContext() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVFormatContext(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVFormatContext(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVFormatContext position(long position) {
        return (AVFormatContext)super.position(position);
    }
    @Override public AVFormatContext getPointer(long i) {
        return new AVFormatContext((Pointer)this).offsetAddress(i);
    }

    /**
     * A class for logging and \ref avoptions. Set by avformat_alloc_context().
     * Exports (de)muxer private options if they exist.
     */
    public native @Const AVClass av_class(); public native AVFormatContext av_class(AVClass setter);

    /**
     * The input container format.
     *
     * Demuxing only, set by avformat_open_input().
     */
    public native AVInputFormat iformat(); public native AVFormatContext iformat(AVInputFormat setter);

    /**
     * The output container format.
     *
     * Muxing only, must be set by the caller before avformat_write_header().
     */
    public native AVOutputFormat oformat(); public native AVFormatContext oformat(AVOutputFormat setter);

    /**
     * Format private data. This is an AVOptions-enabled struct
     * if and only if iformat/oformat.priv_class is not NULL.
     *
     * - muxing: set by avformat_write_header()
     * - demuxing: set by avformat_open_input()
     */
    public native Pointer priv_data(); public native AVFormatContext priv_data(Pointer setter);

    /**
     * I/O context.
     *
     * - demuxing: either set by the user before avformat_open_input() (then
     *             the user must close it manually) or set by avformat_open_input().
     * - muxing: set by the user before avformat_write_header(). The caller must
     *           take care of closing / freeing the IO context.
     *
     * Do NOT set this field if AVFMT_NOFILE flag is set in
     * iformat/oformat.flags. In such a case, the (de)muxer will handle
     * I/O in some other way and this field will be NULL.
     */
    public native AVIOContext pb(); public native AVFormatContext pb(AVIOContext setter);

    /* stream info */
    /**
     * Flags signalling stream properties. A combination of AVFMTCTX_*.
     * Set by libavformat.
     */
    public native int ctx_flags(); public native AVFormatContext ctx_flags(int setter);

    /**
     * Number of elements in AVFormatContext.streams.
     *
     * Set by avformat_new_stream(), must not be modified by any other code.
     */
    public native @Cast("unsigned int") int nb_streams(); public native AVFormatContext nb_streams(int setter);
    /**
     * A list of all streams in the file. New streams are created with
     * avformat_new_stream().
     *
     * - demuxing: streams are created by libavformat in avformat_open_input().
     *             If AVFMTCTX_NOHEADER is set in ctx_flags, then new streams may also
     *             appear in av_read_frame().
     * - muxing: streams are created by the user before avformat_write_header().
     *
     * Freed by libavformat in avformat_free_context().
     */
    public native AVStream streams(int i); public native AVFormatContext streams(int i, AVStream setter);
    public native @Cast("AVStream**") PointerPointer streams(); public native AVFormatContext streams(PointerPointer setter);

// #if FF_API_FORMAT_FILENAME
    /**
     * input or output filename
     *
     * - demuxing: set by avformat_open_input()
     * - muxing: may be set by the caller before avformat_write_header()
     *
     * @deprecated Use url instead.
     */
    public native @Cast("char") @Deprecated byte filename(int i); public native AVFormatContext filename(int i, byte setter);
    @MemberGetter public native @Cast("char*") @Deprecated BytePointer filename();
// #endif

    /**
     * input or output URL. Unlike the old filename field, this field has no
     * length restriction.
     *
     * - demuxing: set by avformat_open_input(), initialized to an empty
     *             string if url parameter was NULL in avformat_open_input().
     * - muxing: may be set by the caller before calling avformat_write_header()
     *           (or avformat_init_output() if that is called first) to a string
     *           which is freeable by av_free(). Set to an empty string if it
     *           was NULL in avformat_init_output().
     *
     * Freed by libavformat in avformat_free_context().
     */
    public native @Cast("char*") BytePointer url(); public native AVFormatContext url(BytePointer setter);

    /**
     * Position of the first frame of the component, in
     * AV_TIME_BASE fractional seconds. NEVER set this value directly:
     * It is deduced from the AVStream values.
     *
     * Demuxing only, set by libavformat.
     */
    public native @Cast("int64_t") long start_time(); public native AVFormatContext start_time(long setter);

    /**
     * Duration of the stream, in AV_TIME_BASE fractional
     * seconds. Only set this value if you know none of the individual stream
     * durations and also do not set any of them. This is deduced from the
     * AVStream values if not set.
     *
     * Demuxing only, set by libavformat.
     */
    public native @Cast("int64_t") long duration(); public native AVFormatContext duration(long setter);

    /**
     * Total stream bitrate in bit/s, 0 if not
     * available. Never set it directly if the file_size and the
     * duration are known as FFmpeg can compute it automatically.
     */
    public native @Cast("int64_t") long bit_rate(); public native AVFormatContext bit_rate(long setter);

    public native @Cast("unsigned int") int packet_size(); public native AVFormatContext packet_size(int setter);
    public native int max_delay(); public native AVFormatContext max_delay(int setter);

    /**
     * Flags modifying the (de)muxer behaviour. A combination of AVFMT_FLAG_*.
     * Set by the user before avformat_open_input() / avformat_write_header().
     */
    public native int flags(); public native AVFormatContext flags(int setter);
/** Generate missing pts even if it requires parsing future frames. */
public static final int AVFMT_FLAG_GENPTS =       0x0001;
/** Ignore index. */
public static final int AVFMT_FLAG_IGNIDX =       0x0002;
/** Do not block when reading packets from input. */
public static final int AVFMT_FLAG_NONBLOCK =     0x0004;
/** Ignore DTS on frames that contain both DTS & PTS */
public static final int AVFMT_FLAG_IGNDTS =       0x0008;
/** Do not infer any values from other values, just return what is stored in the container */
public static final int AVFMT_FLAG_NOFILLIN =     0x0010;
/** Do not use AVParsers, you also must set AVFMT_FLAG_NOFILLIN as the fillin code works on frames and no parsing -> no frames. Also seeking to frames can not work if parsing to find frame boundaries has been disabled */
public static final int AVFMT_FLAG_NOPARSE =      0x0020;
/** Do not buffer frames when possible */
public static final int AVFMT_FLAG_NOBUFFER =     0x0040;
/** The caller has supplied a custom AVIOContext, don't avio_close() it. */
public static final int AVFMT_FLAG_CUSTOM_IO =    0x0080;
/** Discard frames marked corrupted */
public static final int AVFMT_FLAG_DISCARD_CORRUPT =  0x0100;
/** Flush the AVIOContext every packet. */
public static final int AVFMT_FLAG_FLUSH_PACKETS =    0x0200;
/**
 * When muxing, try to avoid writing any random/volatile data to the output.
 * This includes any random IDs, real-time timestamps/dates, muxer version, etc.
 *
 * This flag is mainly intended for testing.
 */
public static final int AVFMT_FLAG_BITEXACT =         0x0400;
// #if FF_API_LAVF_MP4A_LATM
/** Deprecated, does nothing. */
public static final int AVFMT_FLAG_MP4A_LATM =    0x8000;
// #endif
/** try to interleave outputted packets by dts (using this flag can slow demuxing down) */
public static final int AVFMT_FLAG_SORT_DTS =    0x10000;
// #if FF_API_LAVF_PRIV_OPT
/** Enable use of private options by delaying codec open (deprecated, will do nothing once av_demuxer_open() is removed) */
public static final int AVFMT_FLAG_PRIV_OPT =    0x20000;
// #endif
// #if FF_API_LAVF_KEEPSIDE_FLAG
/** Deprecated, does nothing. */
public static final int AVFMT_FLAG_KEEP_SIDE_DATA = 0x40000;
// #endif
/** Enable fast, but inaccurate seeks for some formats */
public static final int AVFMT_FLAG_FAST_SEEK =   0x80000;
/** Stop muxing when the shortest stream stops. */
public static final int AVFMT_FLAG_SHORTEST =   0x100000;
/** Add bitstream filters as requested by the muxer */
public static final int AVFMT_FLAG_AUTO_BSF =   0x200000;

    /**
     * Maximum size of the data read from input for determining
     * the input container format.
     * Demuxing only, set by the caller before avformat_open_input().
     */
    public native @Cast("int64_t") long probesize(); public native AVFormatContext probesize(long setter);

    /**
     * Maximum duration (in AV_TIME_BASE units) of the data read
     * from input in avformat_find_stream_info().
     * Demuxing only, set by the caller before avformat_find_stream_info().
     * Can be set to 0 to let avformat choose using a heuristic.
     */
    public native @Cast("int64_t") long max_analyze_duration(); public native AVFormatContext max_analyze_duration(long setter);

    public native @Cast("const uint8_t*") BytePointer key(); public native AVFormatContext key(BytePointer setter);
    public native int keylen(); public native AVFormatContext keylen(int setter);

    public native @Cast("unsigned int") int nb_programs(); public native AVFormatContext nb_programs(int setter);
    public native AVProgram programs(int i); public native AVFormatContext programs(int i, AVProgram setter);
    public native @Cast("AVProgram**") PointerPointer programs(); public native AVFormatContext programs(PointerPointer setter);

    /**
     * Forced video codec_id.
     * Demuxing: Set by user.
     */
    public native @Cast("AVCodecID") int video_codec_id(); public native AVFormatContext video_codec_id(int setter);

    /**
     * Forced audio codec_id.
     * Demuxing: Set by user.
     */
    public native @Cast("AVCodecID") int audio_codec_id(); public native AVFormatContext audio_codec_id(int setter);

    /**
     * Forced subtitle codec_id.
     * Demuxing: Set by user.
     */
    public native @Cast("AVCodecID") int subtitle_codec_id(); public native AVFormatContext subtitle_codec_id(int setter);

    /**
     * Maximum amount of memory in bytes to use for the index of each stream.
     * If the index exceeds this size, entries will be discarded as
     * needed to maintain a smaller size. This can lead to slower or less
     * accurate seeking (depends on demuxer).
     * Demuxers for which a full in-memory index is mandatory will ignore
     * this.
     * - muxing: unused
     * - demuxing: set by user
     */
    public native @Cast("unsigned int") int max_index_size(); public native AVFormatContext max_index_size(int setter);

    /**
     * Maximum amount of memory in bytes to use for buffering frames
     * obtained from realtime capture devices.
     */
    public native @Cast("unsigned int") int max_picture_buffer(); public native AVFormatContext max_picture_buffer(int setter);

    /**
     * Number of chapters in AVChapter array.
     * When muxing, chapters are normally written in the file header,
     * so nb_chapters should normally be initialized before write_header
     * is called. Some muxers (e.g. mov and mkv) can also write chapters
     * in the trailer.  To write chapters in the trailer, nb_chapters
     * must be zero when write_header is called and non-zero when
     * write_trailer is called.
     * - muxing: set by user
     * - demuxing: set by libavformat
     */
    public native @Cast("unsigned int") int nb_chapters(); public native AVFormatContext nb_chapters(int setter);
    public native AVChapter chapters(int i); public native AVFormatContext chapters(int i, AVChapter setter);
    public native @Cast("AVChapter**") PointerPointer chapters(); public native AVFormatContext chapters(PointerPointer setter);

    /**
     * Metadata that applies to the whole file.
     *
     * - demuxing: set by libavformat in avformat_open_input()
     * - muxing: may be set by the caller before avformat_write_header()
     *
     * Freed by libavformat in avformat_free_context().
     */
    public native AVDictionary metadata(); public native AVFormatContext metadata(AVDictionary setter);

    /**
     * Start time of the stream in real world time, in microseconds
     * since the Unix epoch (00:00 1st January 1970). That is, pts=0 in the
     * stream was captured at this real world time.
     * - muxing: Set by the caller before avformat_write_header(). If set to
     *           either 0 or AV_NOPTS_VALUE, then the current wall-time will
     *           be used.
     * - demuxing: Set by libavformat. AV_NOPTS_VALUE if unknown. Note that
     *             the value may become known after some number of frames
     *             have been received.
     */
    public native @Cast("int64_t") long start_time_realtime(); public native AVFormatContext start_time_realtime(long setter);

    /**
     * The number of frames used for determining the framerate in
     * avformat_find_stream_info().
     * Demuxing only, set by the caller before avformat_find_stream_info().
     */
    public native int fps_probe_size(); public native AVFormatContext fps_probe_size(int setter);

    /**
     * Error recognition; higher values will detect more errors but may
     * misdetect some more or less valid parts as errors.
     * Demuxing only, set by the caller before avformat_open_input().
     */
    public native int error_recognition(); public native AVFormatContext error_recognition(int setter);

    /**
     * Custom interrupt callbacks for the I/O layer.
     *
     * demuxing: set by the user before avformat_open_input().
     * muxing: set by the user before avformat_write_header()
     * (mainly useful for AVFMT_NOFILE formats). The callback
     * should also be passed to avio_open2() if it's used to
     * open the file.
     */
    public native @ByRef AVIOInterruptCB interrupt_callback(); public native AVFormatContext interrupt_callback(AVIOInterruptCB setter);

    /**
     * Flags to enable debugging.
     */
    public native int debug(); public native AVFormatContext debug(int setter);
public static final int FF_FDEBUG_TS =        0x0001;

    /**
     * Maximum buffering duration for interleaving.
     *
     * To ensure all the streams are interleaved correctly,
     * av_interleaved_write_frame() will wait until it has at least one packet
     * for each stream before actually writing any packets to the output file.
     * When some streams are "sparse" (i.e. there are large gaps between
     * successive packets), this can result in excessive buffering.
     *
     * This field specifies the maximum difference between the timestamps of the
     * first and the last packet in the muxing queue, above which libavformat
     * will output a packet regardless of whether it has queued a packet for all
     * the streams.
     *
     * Muxing only, set by the caller before avformat_write_header().
     */
    public native @Cast("int64_t") long max_interleave_delta(); public native AVFormatContext max_interleave_delta(long setter);

    /**
     * Allow non-standard and experimental extension
     * @see AVCodecContext.strict_std_compliance
     */
    public native int strict_std_compliance(); public native AVFormatContext strict_std_compliance(int setter);

    /**
     * Flags indicating events happening on the file, a combination of
     * AVFMT_EVENT_FLAG_*.
     *
     * - demuxing: may be set by the demuxer in avformat_open_input(),
     *   avformat_find_stream_info() and av_read_frame(). Flags must be cleared
     *   by the user once the event has been handled.
     * - muxing: may be set by the user after avformat_write_header() to
     *   indicate a user-triggered event.  The muxer will clear the flags for
     *   events it has handled in av_[interleaved]_write_frame().
     */
    public native int event_flags(); public native AVFormatContext event_flags(int setter);
/**
 * - demuxing: the demuxer read new metadata from the file and updated
 *   AVFormatContext.metadata accordingly
 * - muxing: the user updated AVFormatContext.metadata and wishes the muxer to
 *   write it into the file
 */
public static final int AVFMT_EVENT_FLAG_METADATA_UPDATED = 0x0001;

    /**
     * Maximum number of packets to read while waiting for the first timestamp.
     * Decoding only.
     */
    public native int max_ts_probe(); public native AVFormatContext max_ts_probe(int setter);

    /**
     * Avoid negative timestamps during muxing.
     * Any value of the AVFMT_AVOID_NEG_TS_* constants.
     * Note, this only works when using av_interleaved_write_frame. (interleave_packet_per_dts is in use)
     * - muxing: Set by user
     * - demuxing: unused
     */
    public native int avoid_negative_ts(); public native AVFormatContext avoid_negative_ts(int setter);
/** Enabled when required by target format */
public static final int AVFMT_AVOID_NEG_TS_AUTO =             -1;
/** Shift timestamps so they are non negative */
public static final int AVFMT_AVOID_NEG_TS_MAKE_NON_NEGATIVE = 1;
/** Shift timestamps so that they start at 0 */
public static final int AVFMT_AVOID_NEG_TS_MAKE_ZERO =         2;

    /**
     * Transport stream id.
     * This will be moved into demuxer private options. Thus no API/ABI compatibility
     */
    public native int ts_id(); public native AVFormatContext ts_id(int setter);

    /**
     * Audio preload in microseconds.
     * Note, not all formats support this and unpredictable things may happen if it is used when not supported.
     * - encoding: Set by user
     * - decoding: unused
     */
    public native int audio_preload(); public native AVFormatContext audio_preload(int setter);

    /**
     * Max chunk time in microseconds.
     * Note, not all formats support this and unpredictable things may happen if it is used when not supported.
     * - encoding: Set by user
     * - decoding: unused
     */
    public native int max_chunk_duration(); public native AVFormatContext max_chunk_duration(int setter);

    /**
     * Max chunk size in bytes
     * Note, not all formats support this and unpredictable things may happen if it is used when not supported.
     * - encoding: Set by user
     * - decoding: unused
     */
    public native int max_chunk_size(); public native AVFormatContext max_chunk_size(int setter);

    /**
     * forces the use of wallclock timestamps as pts/dts of packets
     * This has undefined results in the presence of B frames.
     * - encoding: unused
     * - decoding: Set by user
     */
    public native int use_wallclock_as_timestamps(); public native AVFormatContext use_wallclock_as_timestamps(int setter);

    /**
     * avio flags, used to force AVIO_FLAG_DIRECT.
     * - encoding: unused
     * - decoding: Set by user
     */
    public native int avio_flags(); public native AVFormatContext avio_flags(int setter);

    /**
     * The duration field can be estimated through various ways, and this field can be used
     * to know how the duration was estimated.
     * - encoding: unused
     * - decoding: Read by user
     */
    public native @Cast("AVDurationEstimationMethod") int duration_estimation_method(); public native AVFormatContext duration_estimation_method(int setter);

    /**
     * Skip initial bytes when opening stream
     * - encoding: unused
     * - decoding: Set by user
     */
    public native @Cast("int64_t") long skip_initial_bytes(); public native AVFormatContext skip_initial_bytes(long setter);

    /**
     * Correct single timestamp overflows
     * - encoding: unused
     * - decoding: Set by user
     */
    public native @Cast("unsigned int") int correct_ts_overflow(); public native AVFormatContext correct_ts_overflow(int setter);

    /**
     * Force seeking to any (also non key) frames.
     * - encoding: unused
     * - decoding: Set by user
     */
    public native int seek2any(); public native AVFormatContext seek2any(int setter);

    /**
     * Flush the I/O context after each packet.
     * - encoding: Set by user
     * - decoding: unused
     */
    public native int flush_packets(); public native AVFormatContext flush_packets(int setter);

    /**
     * format probing score.
     * The maximal score is AVPROBE_SCORE_MAX, its set when the demuxer probes
     * the format.
     * - encoding: unused
     * - decoding: set by avformat, read by user
     */
    public native int probe_score(); public native AVFormatContext probe_score(int setter);

    /**
     * number of bytes to read maximally to identify format.
     * - encoding: unused
     * - decoding: set by user
     */
    public native int format_probesize(); public native AVFormatContext format_probesize(int setter);

    /**
     * ',' separated list of allowed decoders.
     * If NULL then all are allowed
     * - encoding: unused
     * - decoding: set by user
     */
    public native @Cast("char*") BytePointer codec_whitelist(); public native AVFormatContext codec_whitelist(BytePointer setter);

    /**
     * ',' separated list of allowed demuxers.
     * If NULL then all are allowed
     * - encoding: unused
     * - decoding: set by user
     */
    public native @Cast("char*") BytePointer format_whitelist(); public native AVFormatContext format_whitelist(BytePointer setter);

    /**
     * An opaque field for libavformat internal usage.
     * Must not be accessed in any way by callers.
     */
    public native AVFormatInternal internal(); public native AVFormatContext internal(AVFormatInternal setter);

    /**
     * IO repositioned flag.
     * This is set by avformat when the underlaying IO context read pointer
     * is repositioned, for example when doing byte based seeking.
     * Demuxers can use the flag to detect such changes.
     */
    public native int io_repositioned(); public native AVFormatContext io_repositioned(int setter);

    /**
     * Forced video codec.
     * This allows forcing a specific decoder, even when there are multiple with
     * the same codec_id.
     * Demuxing: Set by user
     */
    public native AVCodec video_codec(); public native AVFormatContext video_codec(AVCodec setter);

    /**
     * Forced audio codec.
     * This allows forcing a specific decoder, even when there are multiple with
     * the same codec_id.
     * Demuxing: Set by user
     */
    public native AVCodec audio_codec(); public native AVFormatContext audio_codec(AVCodec setter);

    /**
     * Forced subtitle codec.
     * This allows forcing a specific decoder, even when there are multiple with
     * the same codec_id.
     * Demuxing: Set by user
     */
    public native AVCodec subtitle_codec(); public native AVFormatContext subtitle_codec(AVCodec setter);

    /**
     * Forced data codec.
     * This allows forcing a specific decoder, even when there are multiple with
     * the same codec_id.
     * Demuxing: Set by user
     */
    public native AVCodec data_codec(); public native AVFormatContext data_codec(AVCodec setter);

    /**
     * Number of bytes to be written as padding in a metadata header.
     * Demuxing: Unused.
     * Muxing: Set by user via av_format_set_metadata_header_padding.
     */
    public native int metadata_header_padding(); public native AVFormatContext metadata_header_padding(int setter);

    /**
     * User data.
     * This is a place for some private data of the user.
     */
    public native Pointer opaque(); public native AVFormatContext opaque(Pointer setter);

    /**
     * Callback used by devices to communicate with application.
     */
    public native av_format_control_message control_message_cb(); public native AVFormatContext control_message_cb(av_format_control_message setter);

    /**
     * Output timestamp offset, in microseconds.
     * Muxing: set by user
     */
    public native @Cast("int64_t") long output_ts_offset(); public native AVFormatContext output_ts_offset(long setter);

    /**
     * dump format separator.
     * can be ", " or "\n      " or anything else
     * - muxing: Set by user.
     * - demuxing: Set by user.
     */
    public native @Cast("uint8_t*") BytePointer dump_separator(); public native AVFormatContext dump_separator(BytePointer setter);

    /**
     * Forced Data codec_id.
     * Demuxing: Set by user.
     */
    public native @Cast("AVCodecID") int data_codec_id(); public native AVFormatContext data_codec_id(int setter);

// #if FF_API_OLD_OPEN_CALLBACKS
    /**
     * Called to open further IO contexts when needed for demuxing.
     *
     * This can be set by the user application to perform security checks on
     * the URLs before opening them.
     * The function should behave like avio_open2(), AVFormatContext is provided
     * as contextual information and to reach AVFormatContext.opaque.
     *
     * If NULL then some simple checks are used together with avio_open2().
     *
     * Must not be accessed directly from outside avformat.
     * \See av_format_set_open_cb()
     *
     * Demuxing: Set by user.
     *
     * @deprecated Use io_open and io_close.
     */
    public static class Open_cb_AVFormatContext_PointerPointer_BytePointer_int_AVIOInterruptCB_PointerPointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Open_cb_AVFormatContext_PointerPointer_BytePointer_int_AVIOInterruptCB_PointerPointer(Pointer p) { super(p); }
        protected Open_cb_AVFormatContext_PointerPointer_BytePointer_int_AVIOInterruptCB_PointerPointer() { allocate(); }
        private native void allocate();
        public native @Deprecated int call(AVFormatContext s, @Cast("AVIOContext**") PointerPointer p, @Cast("const char*") BytePointer url, int flags, @Const AVIOInterruptCB int_cb, @Cast("AVDictionary**") PointerPointer options);
    }
    public native Open_cb_AVFormatContext_PointerPointer_BytePointer_int_AVIOInterruptCB_PointerPointer open_cb(); public native AVFormatContext open_cb(Open_cb_AVFormatContext_PointerPointer_BytePointer_int_AVIOInterruptCB_PointerPointer setter);
// #endif

    /**
     * ',' separated list of allowed protocols.
     * - encoding: unused
     * - decoding: set by user
     */
    public native @Cast("char*") BytePointer protocol_whitelist(); public native AVFormatContext protocol_whitelist(BytePointer setter);

    /**
     * A callback for opening new IO streams.
     *
     * Whenever a muxer or a demuxer needs to open an IO stream (typically from
     * avformat_open_input() for demuxers, but for certain formats can happen at
     * other times as well), it will call this callback to obtain an IO context.
     *
     * @param s the format context
     * @param pb on success, the newly opened IO context should be returned here
     * @param url the url to open
     * @param flags a combination of AVIO_FLAG_*
     * @param options a dictionary of additional options, with the same
     *                semantics as in avio_open2()
     * @return 0 on success, a negative AVERROR code on failure
     *
     * \note Certain muxers and demuxers do nesting, i.e. they open one or more
     * additional internal format contexts. Thus the AVFormatContext pointer
     * passed to this callback may be different from the one facing the caller.
     * It will, however, have the same 'opaque' field.
     */
    public static class Io_open_AVFormatContext_PointerPointer_BytePointer_int_PointerPointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Io_open_AVFormatContext_PointerPointer_BytePointer_int_PointerPointer(Pointer p) { super(p); }
        protected Io_open_AVFormatContext_PointerPointer_BytePointer_int_PointerPointer() { allocate(); }
        private native void allocate();
        public native int call(AVFormatContext s, @Cast("AVIOContext**") PointerPointer pb, @Cast("const char*") BytePointer url,
                       int flags, @Cast("AVDictionary**") PointerPointer options);
    }
    public native Io_open_AVFormatContext_PointerPointer_BytePointer_int_PointerPointer io_open(); public native AVFormatContext io_open(Io_open_AVFormatContext_PointerPointer_BytePointer_int_PointerPointer setter);

    /**
     * A callback for closing the streams opened with AVFormatContext.io_open().
     */
    public static class Io_close_AVFormatContext_AVIOContext extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Io_close_AVFormatContext_AVIOContext(Pointer p) { super(p); }
        protected Io_close_AVFormatContext_AVIOContext() { allocate(); }
        private native void allocate();
        public native void call(AVFormatContext s, AVIOContext pb);
    }
    public native Io_close_AVFormatContext_AVIOContext io_close(); public native AVFormatContext io_close(Io_close_AVFormatContext_AVIOContext setter);

    /**
     * ',' separated list of disallowed protocols.
     * - encoding: unused
     * - decoding: set by user
     */
    public native @Cast("char*") BytePointer protocol_blacklist(); public native AVFormatContext protocol_blacklist(BytePointer setter);

    /**
     * The maximum number of streams.
     * - encoding: unused
     * - decoding: set by user
     */
    public native int max_streams(); public native AVFormatContext max_streams(int setter);

    /**
     * Skip duration calcuation in estimate_timings_from_pts.
     * - encoding: unused
     * - decoding: set by user
     */
    public native int skip_estimate_duration_from_pts(); public native AVFormatContext skip_estimate_duration_from_pts(int setter);

    /**
     * Maximum number of packets that can be probed
     * - encoding: unused
     * - decoding: set by user
     */
    public native int max_probe_packets(); public native AVFormatContext max_probe_packets(int setter);
}
