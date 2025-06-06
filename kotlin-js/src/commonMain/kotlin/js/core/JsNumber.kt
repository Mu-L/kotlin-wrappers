package js.core

import js.array.ReadonlyArray
import js.intl.Localizable
import js.intl.NumberFormatOptions
import js.intl.UnicodeBCP47LocaleIdentifier
import kotlin.js.JsName
import kotlin.js.definedExternally

@JsName("Number")
external class JsNumber : Localizable<NumberFormatOptions> {
    internal constructor(value: Int)
    internal constructor(value: Double)
    internal constructor(value: String)

    fun toExponential(fractionDigits: Int = definedExternally): String
    fun toFixed(digits: Int = definedExternally): String
    fun toPrecision(precision: Int = definedExternally): String

    companion object {
        val MAX_SAFE_INTEGER: Double
        val MIN_SAFE_INTEGER: Double

        fun isFinite(number: JsAny?): Boolean
        fun isInteger(number: JsAny?): Boolean
        fun isNaN(number: JsAny?): Boolean
        fun isSafeInteger(number: JsAny?): Boolean
    }
}

fun Int.toExponential(): String =
    JsNumber(this).toExponential()

fun Int.toExponential(fractionDigits: Int): String =
    JsNumber(this).toExponential(fractionDigits)

fun Double.toExponential(): String =
    JsNumber(this).toExponential()

fun Double.toExponential(fractionDigits: Int): String =
    JsNumber(this).toExponential(fractionDigits)

fun Int.toFixed(): String =
    JsNumber(this).toFixed()

fun Int.toFixed(digits: Int): String =
    JsNumber(this).toFixed(digits)

fun Double.toFixed(): String =
    JsNumber(this).toFixed()

fun Double.toFixed(digits: Int): String =
    JsNumber(this).toFixed(digits)

fun Int.toLocaleString(): String =
    JsNumber(this).toLocaleString()

fun Int.toLocaleString(locales: UnicodeBCP47LocaleIdentifier): String =
    JsNumber(this).toLocaleString(locales)

fun Int.toLocaleString(
    locales: UnicodeBCP47LocaleIdentifier,
    options: NumberFormatOptions,
): String =
    JsNumber(this).toLocaleString(locales, options)

fun Int.toLocaleString(locales: ReadonlyArray<UnicodeBCP47LocaleIdentifier>): String =
    JsNumber(this).toLocaleString(locales)

fun Int.toLocaleString(
    locales: ReadonlyArray<UnicodeBCP47LocaleIdentifier>,
    options: NumberFormatOptions,
): String =
    JsNumber(this).toLocaleString(locales, options)

fun Double.toLocaleString(): String =
    JsNumber(this).toLocaleString()

fun Double.toLocaleString(locales: UnicodeBCP47LocaleIdentifier): String =
    JsNumber(this).toLocaleString(locales)

fun Double.toLocaleString(
    locales: UnicodeBCP47LocaleIdentifier,
    options: NumberFormatOptions,
): String =
    JsNumber(this).toLocaleString(locales, options)

fun Double.toLocaleString(locales: ReadonlyArray<UnicodeBCP47LocaleIdentifier>): String =
    JsNumber(this).toLocaleString(locales)

fun Double.toLocaleString(
    locales: ReadonlyArray<UnicodeBCP47LocaleIdentifier>,
    options: NumberFormatOptions,
): String =
    JsNumber(this).toLocaleString(locales, options)

fun Int.toPrecision(): String =
    JsNumber(this).toPrecision()

fun Int.toPrecision(precision: Int): String =
    JsNumber(this).toPrecision(precision)

fun Double.toPrecision(): String =
    JsNumber(this).toPrecision()

fun Double.toPrecision(precision: Int): String =
    JsNumber(this).toPrecision(precision)
