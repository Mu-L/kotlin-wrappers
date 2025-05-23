// Automatically generated - do not modify!

package web.rtc

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.events.Event
import web.events.EventType
import kotlin.js.definedExternally

/**
 * The **`RTCPeerConnectionIceEvent`** interface represents events that occur in relation to ICE candidates with the target, usually an RTCPeerConnection.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnectionIceEvent)
 */
open external class RTCPeerConnectionIceEvent(
    override val type: EventType<RTCPeerConnectionIceEvent>,
    init: RTCPeerConnectionIceEventInit = definedExternally,
) : Event {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnectionIceEvent/candidate)
     */
    val candidate: RTCIceCandidate?

    @JsAlias(THIS)
    override fun asInit(): RTCPeerConnectionIceEventInit

    companion object {
        @JsValue("icecandidate")
        val ICE_CANDIDATE: EventType<RTCPeerConnectionIceEvent>
    }
}
