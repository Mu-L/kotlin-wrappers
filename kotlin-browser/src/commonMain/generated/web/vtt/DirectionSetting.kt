// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.vtt

import seskar.js.JsValue

sealed external interface DirectionSetting {
    companion object {
        @JsValue("")
        val none: DirectionSetting

        @JsValue("lr")
        val lr: DirectionSetting

        @JsValue("rl")
        val rl: DirectionSetting
    }
}
