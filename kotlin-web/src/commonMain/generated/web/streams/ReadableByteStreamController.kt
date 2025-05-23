// Automatically generated - do not modify!

package web.streams

import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferView
import js.core.Void
import js.errors.JsError
import kotlin.js.definedExternally

/**
 * The **`ReadableByteStreamController`** interface of the Streams API represents a controller for a readable byte stream.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableByteStreamController)
 */
external class ReadableByteStreamController
private constructor() :
    ReadableStreamController<Void> {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableByteStreamController/byobRequest)
     */
    val byobRequest: ReadableStreamBYOBRequest?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableByteStreamController/desiredSize)
     */
    val desiredSize: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableByteStreamController/close)
     */
    fun close()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableByteStreamController/enqueue)
     */
    fun enqueue(chunk: ArrayBufferView<ArrayBuffer>)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableByteStreamController/error)
     */
    fun error(error: JsError = definedExternally)
}
