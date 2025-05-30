// Automatically generated - do not modify!

package web.workers

import js.array.ReadonlyArray
import js.core.JsAny
import js.serialization.Transferable
import web.events.EventHandler
import web.events.EventInstance
import web.events.JsEvent
import web.messaging.MessageEvent
import web.messaging.MessageEventTarget
import web.rtc.RTCTransformEvent
import web.serialization.StructuredSerializeOptions
import kotlin.js.definedExternally

/**
 * The **`DedicatedWorkerGlobalScope`** object (the Worker global scope) is accessible through the WorkerGlobalScope.self keyword.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DedicatedWorkerGlobalScope)
 */
external class DedicatedWorkerGlobalScope
private constructor() :
    WorkerGlobalScope,
    MessageEventTarget {
    /**
     * Returns dedicatedWorkerGlobal's name, i.e. the value given to the Worker constructor. Primarily useful for debugging.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DedicatedWorkerGlobalScope/name)
     */
    val name: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DedicatedWorkerGlobalScope/rtctransform_event)
     */
    var onrtctransform: EventHandler<RTCTransformEvent, DedicatedWorkerGlobalScope, DedicatedWorkerGlobalScope>?

    /**
     * Aborts dedicatedWorkerGlobal.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DedicatedWorkerGlobalScope/close)
     */
    fun close()

    /**
     * Clones message and transmits it to the Worker object associated with dedicatedWorkerGlobal. transfer can be passed as a list of objects that are to be transferred rather than cloned.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DedicatedWorkerGlobalScope/postMessage)
     */
    fun postMessage(
        message: JsAny?,
        transfer: ReadonlyArray<Transferable>,
    )

    fun postMessage(
        message: JsAny?,
        options: StructuredSerializeOptions = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DedicatedWorkerGlobalScope/message_event)
     */
    @JsEvent("message")
    val messageEvent: EventInstance<MessageEvent<JsAny?>, DedicatedWorkerGlobalScope /* this */, DedicatedWorkerGlobalScope /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DedicatedWorkerGlobalScope/messageerror_event)
     */
    @JsEvent("messageerror")
    val messageErrorEvent: EventInstance<MessageEvent<JsAny?>, DedicatedWorkerGlobalScope /* this */, DedicatedWorkerGlobalScope /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DedicatedWorkerGlobalScope/rtctransform_event)
     */
    @JsEvent("rtctransform")
    val rtcTransformEvent: EventInstance<RTCTransformEvent, DedicatedWorkerGlobalScope /* this */, DedicatedWorkerGlobalScope /* this */>
}
