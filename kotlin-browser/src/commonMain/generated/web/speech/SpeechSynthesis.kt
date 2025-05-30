// Automatically generated - do not modify!

package web.speech

import js.array.ReadonlyArray
import web.events.*

/**
 * The **`SpeechSynthesis`** interface of the Web Speech API is the controller interface for the speech service; this can be used to retrieve information about the synthesis voices available on the device, start and pause speech, and other commands besides.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesis)
 */
external class SpeechSynthesis
private constructor() :
    EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesis/voiceschanged_event)
     */
    var onvoiceschanged: EventHandler<Event, SpeechSynthesis, SpeechSynthesis>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesis/paused)
     */
    val paused: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesis/pending)
     */
    val pending: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesis/speaking)
     */
    val speaking: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesis/cancel)
     */
    fun cancel()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesis/getVoices)
     */
    fun getVoices(): ReadonlyArray<SpeechSynthesisVoice>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesis/pause)
     */
    fun pause()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesis/resume)
     */
    fun resume()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesis/speak)
     */
    fun speak(utterance: SpeechSynthesisUtterance)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesis/voiceschanged_event)
     */
    @JsEvent("voiceschanged")
    val voicesChangedEvent: EventInstance<Event, SpeechSynthesis /* this */, SpeechSynthesis /* this */>
}
