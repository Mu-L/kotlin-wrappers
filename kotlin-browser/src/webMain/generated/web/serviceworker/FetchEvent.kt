// Automatically generated - do not modify!

package web.serviceworker

import js.core.Void
import js.promise.Promise
import js.promise.PromiseLike
import js.reflect.unsafeCast
import web.events.EventType
import web.http.Request
import web.http.Response

/**
 * This is the event type for `fetch` events dispatched on the ServiceWorkerGlobalScope.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchEvent)
 */
open external class FetchEvent(
    override val type: EventType<FetchEvent>,
    init: FetchEventInit,
) : ExtendableEvent {
    /**
     * The **`clientId`** read-only property of the FetchEvent interface returns the id of the Client that the current service worker is controlling.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchEvent/clientId)
     */
    val clientId: String

    /**
     * The **`handled`** property of the FetchEvent interface returns a promise indicating if the event has been handled by the fetch algorithm or not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchEvent/handled)
     */
    val handled: Promise<Void>

    /**
     * The **`preloadResponse`** read-only property of the FetchEvent interface returns a Promise that resolves to the navigation preload Response if navigation preload was triggered, or `undefined` otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchEvent/preloadResponse)
     */
    val preloadResponse: Promise<*>

    /**
     * The **`request`** read-only property of the FetchEvent interface returns the Request that triggered the event handler.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchEvent/request)
     */
    val request: Request

    /**
     * The **`resultingClientId`** read-only property of the FetchEvent interface is the Client.id of the Client that replaces the previous client during a page navigation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchEvent/resultingClientId)
     */
    val resultingClientId: String

    /**
     * The **`respondWith()`** method of FetchEvent prevents the browser's default fetch handling, and allows you to provide a promise for a Response yourself.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchEvent/respondWith)
     */
    fun respondWith(r: Response)
    fun respondWith(r: PromiseLike<Response>)

    companion object
}

inline fun FetchEvent.asInit(): FetchEventInit =
    unsafeCast(this)

inline val FetchEvent.Companion.FETCH: EventType<FetchEvent>
    get() = EventType("fetch")
