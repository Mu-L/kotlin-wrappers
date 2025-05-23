// Automatically generated - do not modify!

package web.audio

import js.core.UInt53
import web.worklets.WorkletGlobalScope

/**
 * The **`AudioWorkletGlobalScope`** interface of the Web Audio API represents a global execution context for user-supplied code, which defines custom AudioWorkletProcessor-derived classes.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletGlobalScope)
 */
external class AudioWorkletGlobalScope
private constructor() :
    WorkletGlobalScope {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletGlobalScope/currentFrame)
     */
    val currentFrame: UInt53

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletGlobalScope/currentTime)
     */
    val currentTime: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletGlobalScope/sampleRate)
     */
    val sampleRate: Float

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletGlobalScope/registerProcessor)
     */
    fun registerProcessor(
        name: String,
        processorCtor: AudioWorkletProcessorConstructor,
    )
}
