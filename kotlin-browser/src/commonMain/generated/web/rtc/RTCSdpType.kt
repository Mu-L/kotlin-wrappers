// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.rtc

import seskar.js.JsValue

sealed external interface RTCSdpType {
    companion object {
        @JsValue("answer")
        val answer: RTCSdpType

        @JsValue("offer")
        val offer: RTCSdpType

        @JsValue("pranswer")
        val pranswer: RTCSdpType

        @JsValue("rollback")
        val rollback: RTCSdpType
    }
}
