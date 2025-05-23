// Automatically generated - do not modify!

package web.broadcast

import js.core.JsAny
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import web.events.JsEvent
import web.messaging.MessageEvent

/**
 * The **`BroadcastChannel`** interface represents a named channel that any browsing context of a given origin can subscribe to.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BroadcastChannel)
 */
open external class BroadcastChannel(
    /**
     * Returns the channel name (as passed to the constructor).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BroadcastChannel/name)
     */
    val name: String,
) : EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BroadcastChannel/message_event)
     */
    var onmessage: EventHandler<MessageEvent<*>, BroadcastChannel, BroadcastChannel>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BroadcastChannel/messageerror_event)
     */
    var onmessageerror: EventHandler<MessageEvent<*>, BroadcastChannel, BroadcastChannel>?

    /**
     * Closes the BroadcastChannel object, opening it up to garbage collection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BroadcastChannel/close)
     */
    fun close()

    /**
     * Sends the given message to other BroadcastChannel objects set up for this channel. Messages can be structured objects, e.g. nested objects and arrays.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BroadcastChannel/postMessage)
     */
    fun postMessage(message: JsAny?)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BroadcastChannel/message_event)
     */
    @JsEvent("message")
    val messageEvent: EventInstance<MessageEvent<JsAny?>, BroadcastChannel /* this */, BroadcastChannel /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BroadcastChannel/messageerror_event)
     */
    @JsEvent("messageerror")
    val messageErrorEvent: EventInstance<MessageEvent<JsAny?>, BroadcastChannel /* this */, BroadcastChannel /* this */>
}
