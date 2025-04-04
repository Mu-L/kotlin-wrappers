package js.core

expect object JsPrimitives {
    inline fun JsBoolean.toBoolean(): Boolean
    inline fun Boolean.toJsBoolean(): JsBoolean

    inline fun String.toJsString(): JsString

    inline fun JsFloat.toFloat(): Float
    inline fun Float.toJsFloat(): JsFloat

    inline fun JsDouble.toDouble(): Double
    inline fun Double.toJsDouble(): JsDouble

    inline fun JsByte.toByte(): Byte
    inline fun Byte.toJsByte(): JsByte

    inline fun JsShort.toShort(): Short
    inline fun Short.toJsShort(): JsShort

    inline fun JsInt.toInt(): Int
    inline fun Int.toJsInt(): JsInt
}
