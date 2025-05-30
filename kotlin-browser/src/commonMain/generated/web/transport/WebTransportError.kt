// Automatically generated - do not modify!

package web.transport

import js.serialization.Serializable
import web.errors.DOMException
import kotlin.js.definedExternally

/**
 * The **`WebTransportError`** interface of the WebTransport API represents an error related to the API, which can arise from server errors, network connection problems, or client-initiated abort operations (for example, arising from a WritableStream.abort() call).
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportError)
 */
open external class WebTransportError(
    message: String = definedExternally,
    options: WebTransportErrorOptions = definedExternally,
) : DOMException,
    Serializable {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportError/source)
     */
    val source: WebTransportErrorSource

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportError/streamErrorCode)
     */
    val streamErrorCode: Int?
}
