// Generated by Karakum - do not modify it manually!

@file:JsModule("node:zlib")

package node.zlib

/**
 * @since v0.6.0
 */
external fun deflate(
    buf: InputType,
    callback: CompressCallback,
)

external fun deflate(
    buf: InputType,
    options: ZlibOptions,
    callback: CompressCallback,
)
