// Automatically generated - do not modify!

@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
)

package web.audio

import js.array.ReadonlyArray
import js.core.JsString
import js.objects.ReadonlyRecord
import js.typedarrays.Float32Array

external interface AudioWorkletProcessorImpl :
    AudioWorkletProcessor {
    fun process(
        inputs: ReadonlyArray<ReadonlyArray<Float32Array<*>>>,
        outputs: ReadonlyArray<ReadonlyArray<Float32Array<*>>>,
        parameters: ReadonlyRecord<JsString, Float32Array<*>>,
    ): Boolean
}
