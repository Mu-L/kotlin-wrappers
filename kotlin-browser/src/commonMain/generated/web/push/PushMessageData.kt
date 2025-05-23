// Automatically generated - do not modify!

package web.push

import js.buffer.ArrayBuffer
import js.core.JsAny
import js.typedarrays.Uint8Array
import web.blob.Blob

/**
 * The **`PushMessageData`** interface of the Push API provides methods which let you retrieve the push data sent by a server in various formats.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushMessageData)
 */
external class PushMessageData
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushMessageData/arrayBuffer)
     */
    fun arrayBuffer(): ArrayBuffer

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushMessageData/blob)
     */
    fun blob(): Blob

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushMessageData/bytes)
     */
    fun bytes(): Uint8Array<ArrayBuffer>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushMessageData/json)
     */
    fun json(): JsAny

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushMessageData/text)
     */
    fun text(): String
}
