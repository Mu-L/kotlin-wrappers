// Automatically generated - do not modify!

package web.speech

import js.array.ArrayLike
import js.iterable.JsIterable

/**
 * The **`SpeechRecognitionResult`** interface of the Web Speech API represents a single recognition match, which may contain multiple SpeechRecognitionAlternative objects.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionResult)
 */
external class SpeechRecognitionResult
private constructor() :
    ArrayLike<SpeechRecognitionAlternative>,
    JsIterable<SpeechRecognitionAlternative> {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionResult/isFinal)
     */
    val isFinal: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionResult/length)
     */
    override val length: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionResult/item)
     */
    fun item(index: Int): SpeechRecognitionAlternative
}
