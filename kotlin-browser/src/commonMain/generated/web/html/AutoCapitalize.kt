// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.html

import seskar.js.JsValue

sealed external interface AutoCapitalize {
    companion object {
        @JsValue("off")
        val off: AutoCapitalize

        @JsValue("none")
        val none: AutoCapitalize

        @JsValue("on")
        val on: AutoCapitalize

        @JsValue("sentences")
        val sentences: AutoCapitalize

        @JsValue("words")
        val words: AutoCapitalize

        @JsValue("characters")
        val characters: AutoCapitalize
    }
}
