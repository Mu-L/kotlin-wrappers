// Automatically generated - do not modify!

package web.audio

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.events.Event
import web.events.EventType

/**
 * The Web Audio API `OfflineAudioCompletionEvent` interface represents events that occur when the processing of an OfflineAudioContext is terminated.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioCompletionEvent)
 */
open external class OfflineAudioCompletionEvent(
    override val type: EventType<OfflineAudioCompletionEvent>,
    init: OfflineAudioCompletionEventInit,
) : Event {
    /**
     * The **`renderedBuffer`** read-only property of the containing the result of processing an OfflineAudioContext.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioCompletionEvent/renderedBuffer)
     */
    val renderedBuffer: AudioBuffer

    @JsAlias(THIS)
    override fun asInit(): OfflineAudioCompletionEventInit

    companion object {
        @JsValue("complete")
        val COMPLETE: EventType<OfflineAudioCompletionEvent>
    }
}
