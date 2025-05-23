// Automatically generated - do not modify!

@file:Suppress(
    "SEALED_INHERITOR_IN_DIFFERENT_PACKAGE",
)

package web.encoding

import js.buffer.ArrayBuffer
import js.core.JsString
import js.typedarrays.Uint8Array
import web.streams.GenericTransformStream
import web.streams.ReadableStream
import web.streams.WritableStream

/**
 * The **`TextEncoderStream`** interface of the Encoding API converts a stream of strings into bytes in the UTF-8 encoding.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextEncoderStream)
 */
open external class TextEncoderStream :
    GenericTransformStream,
    TextEncoderCommon {
    override val readable: ReadableStream<Uint8Array<ArrayBuffer>>
    override val writable: WritableStream<JsString>
}
