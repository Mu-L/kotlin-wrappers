// Automatically generated - do not modify!

package web.streams

import js.core.JsAny
import js.errors.JsError
import kotlin.js.definedExternally

/**
 * The **`TransformStreamDefaultController`** interface of the Streams API provides methods to manipulate the associated ReadableStream and WritableStream.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransformStreamDefaultController)
 */
external class TransformStreamDefaultController<O : JsAny?>
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransformStreamDefaultController/desiredSize)
     */
    val desiredSize: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransformStreamDefaultController/enqueue)
     */
    fun enqueue(chunk: O = definedExternally)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransformStreamDefaultController/error)
     */
    fun error(reason: JsError? = definedExternally)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransformStreamDefaultController/terminate)
     */
    fun terminate()
}
