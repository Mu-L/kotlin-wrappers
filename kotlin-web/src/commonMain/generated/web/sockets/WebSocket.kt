// Automatically generated - do not modify!

package web.sockets

import js.array.ReadonlyArray
import js.buffer.ArrayBufferLike
import js.buffer.ArrayBufferView
import js.core.JsAny
import js.core.JsString
import js.core.UInt53
import web.blob.Blob
import web.events.*
import web.messaging.MessageEvent
import web.url.URL
import kotlin.js.definedExternally

/**
 * The `WebSocket` object provides the API for creating and managing a WebSocket connection to a server, as well as for sending and receiving data on the connection.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket)
 */
open external class WebSocket(
    /**
     * Returns the URL that was used to establish the WebSocket connection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/url)
     */
    val url: String,
    /**
     * Returns the subprotocol selected by the server, if any. It can be used in conjunction with the array form of the constructor's second argument to perform subprotocol negotiation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/protocol)
     */
    val protocol: String = definedExternally,
) : EventTarget {
    constructor(
        url: URL,
        protocol: String = definedExternally,
    )

    constructor(
        url: String,
        protocols: ReadonlyArray<JsString>,
    )

    constructor(
        url: URL,
        protocols: ReadonlyArray<JsString>,
    )

    /**
     * Returns a string that indicates how binary data from the WebSocket object is exposed to scripts:
     *
     * Can be set, to change how binary data is returned. The default is "blob".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/binaryType)
     */
    var binaryType: BinaryType

    /**
     * Returns the number of bytes of application data (UTF-8 text and binary data) that have been queued using send() but not yet been transmitted to the network.
     *
     * If the WebSocket connection is closed, this attribute's value will only increase with each call to the send() method. (The number does not reset to zero once the connection closes.)
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/bufferedAmount)
     */
    val bufferedAmount: UInt53

    /**
     * Returns the extensions selected by the server, if any.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/extensions)
     */
    val extensions: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/close_event)
     */
    var onclose: EventHandler<CloseEvent, WebSocket, WebSocket>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/error_event)
     */
    var onerror: EventHandler<Event, WebSocket, WebSocket>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/message_event)
     */
    var onmessage: EventHandler<MessageEvent<*>, WebSocket, WebSocket>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/open_event)
     */
    var onopen: EventHandler<Event, WebSocket, WebSocket>?

    /**
     * Returns the state of the WebSocket object's connection. It can have the values described below.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/readyState)
     */
    val readyState: ReadyState

    /**
     * Closes the WebSocket connection, optionally using code as the the WebSocket connection close code and reason as the the WebSocket connection close reason.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/close)
     */
    fun close(
        code: Short = definedExternally,
        reason: String = definedExternally,
    )

    /**
     * Transmits data using the WebSocket connection. data can be a string, a Blob, an ArrayBuffer, or an ArrayBufferView.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/send)
     */
    fun send(data: String)
    fun send(data: ArrayBufferLike)
    fun send(data: Blob)
    fun send(data: ArrayBufferView<*>)
    val CONNECTING: ReadyState
    val OPEN: ReadyState
    val CLOSING: ReadyState
    val CLOSED: ReadyState

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/close_event)
     */
    @JsEvent("close")
    val closeEvent: EventInstance<CloseEvent, WebSocket /* this */, WebSocket /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/error_event)
     */
    @JsEvent("error")
    val errorEvent: EventInstance<Event, WebSocket /* this */, WebSocket /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/message_event)
     */
    @JsEvent("message")
    val messageEvent: EventInstance<MessageEvent<JsAny?>, WebSocket /* this */, WebSocket /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/open_event)
     */
    @JsEvent("open")
    val openEvent: EventInstance<Event, WebSocket /* this */, WebSocket /* this */>

    companion object {
        val CONNECTING: ReadyState
        val OPEN: ReadyState
        val CLOSING: ReadyState
        val CLOSED: ReadyState
    }

    sealed interface ReadyState
}
