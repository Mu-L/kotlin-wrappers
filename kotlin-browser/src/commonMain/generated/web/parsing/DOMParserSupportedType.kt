// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.parsing

import seskar.js.JsValue

sealed external interface DOMParserSupportedType {
    companion object {
        @JsValue("application/xhtml+xml")
        val applicationXhtmlXml: DOMParserSupportedType

        @JsValue("application/xml")
        val applicationXml: DOMParserSupportedType

        @JsValue("image/svg+xml")
        val imageSvgXml: DOMParserSupportedType

        @JsValue("text/html")
        val textHtml: DOMParserSupportedType

        @JsValue("text/xml")
        val textXml: DOMParserSupportedType
    }
}
