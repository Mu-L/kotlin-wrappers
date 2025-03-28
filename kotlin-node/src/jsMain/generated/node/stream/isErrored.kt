// Generated by Karakum - do not modify it manually!

@file:JsModule("node:stream")
@file:JsQualifier("Stream")

package node.stream

/**
 * Returns whether the stream has encountered an error.
 * @since v17.3.0, v16.14.0
 * @experimental
 */
external fun isErrored(stream: Readable): Boolean

/**
 * Returns whether the stream has encountered an error.
 * @since v17.3.0, v16.14.0
 * @experimental
 */
external fun isErrored(stream: Writable): Boolean

/**
 * Returns whether the stream has encountered an error.
 * @since v17.3.0, v16.14.0
 * @experimental
 */
external fun isErrored(stream: node.ReadableStream): Boolean

/**
 * Returns whether the stream has encountered an error.
 * @since v17.3.0, v16.14.0
 * @experimental
 */
external fun isErrored(stream: node.WritableStream): Boolean
