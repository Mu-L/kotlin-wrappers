// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gpu

import seskar.js.JsValue

sealed external interface GPUPrimitiveTopology {
    companion object {
        @JsValue("line-list")
        val lineList: GPUPrimitiveTopology

        @JsValue("line-strip")
        val lineStrip: GPUPrimitiveTopology

        @JsValue("point-list")
        val pointList: GPUPrimitiveTopology

        @JsValue("triangle-list")
        val triangleList: GPUPrimitiveTopology

        @JsValue("triangle-strip")
        val triangleStrip: GPUPrimitiveTopology
    }
}
