// Automatically generated - do not modify!

package web.vtt

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.events.Event
import web.events.EventType
import kotlin.js.definedExternally

/**
 * The **`TrackEvent`** interface of the HTML DOM API is used for events which represent changes to a set of available tracks on an HTML media element; these events are `addtrack` and `removetrack`.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TrackEvent)
 */
open external class TrackEvent(
    override val type: EventType<TrackEvent>,
    init: TrackEventInit = definedExternally,
) : Event {
    /**
     * The read-only **`track`** property of the TrackEvent interface specifies the media track object to which the event applies.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TrackEvent/track)
     */
    val track: TextTrack?

    @JsAlias(THIS)
    override fun asInit(): TrackEventInit

    companion object {
        @JsValue("addtrack")
        val ADD_TRACK: EventType<TrackEvent>

        @JsValue("removetrack")
        val REMOVE_TRACK: EventType<TrackEvent>
    }
}
