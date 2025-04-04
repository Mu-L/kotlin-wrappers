// Automatically generated - do not modify!

package web.audio

import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.JsEvent
import kotlin.js.definedExternally

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioScheduledSourceNode)
 */
open external class AudioScheduledSourceNode
private constructor() :
    AudioNode {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioScheduledSourceNode/ended_event)
     */
    var onended: EventHandler<Event, AudioScheduledSourceNode, AudioScheduledSourceNode>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioScheduledSourceNode/start)
     */
    fun start(`when`: Double = definedExternally)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioScheduledSourceNode/stop)
     */
    fun stop(`when`: Double = definedExternally)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioScheduledSourceNode/ended_event)
     */
    @JsEvent("ended")
    val endedEvent: EventInstance<Event, AudioScheduledSourceNode /* this */, AudioScheduledSourceNode /* this */>
}
