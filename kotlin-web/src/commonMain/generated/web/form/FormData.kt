// Automatically generated - do not modify!

package web.form

import js.array.ReadonlyArray
import js.array.Tuple2
import js.collections.MapLike
import js.core.JsString
import js.iterable.JsIterator
import web.blob.Blob
import web.events.EventTarget
import kotlin.js.definedExternally

/**
 * The **`FormData`** interface provides a way to construct a set of key/value pairs representing form fields and their values, which can be sent using the Window/fetch, XMLHttpRequest.send() or navigator.sendBeacon() methods.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData)
 */
open external class FormData(
    form: EventTarget /* HTMLFormElement */ = definedExternally,
    submitter: EventTarget /* HTMLElement */? = definedExternally,
) : MapLike<JsString, FormDataEntryValue> {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/append)
     */
    fun append(
        name: String,
        value: String,
    )

    fun append(
        name: String,
        value: Blob,
    )

    fun append(
        name: String,
        blobValue: Blob,
        filename: String = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/delete)
     */
    fun delete(name: String)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/get)
     */
    fun get(name: String): FormDataEntryValue?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/getAll)
     */
    fun getAll(name: String): ReadonlyArray<FormDataEntryValue>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/has)
     */
    fun has(name: String): Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/set)
     */
    fun set(
        name: String,
        value: String,
    )

    fun set(
        name: String,
        value: Blob,
    )

    fun set(
        name: String,
        blobValue: Blob,
        filename: String = definedExternally,
    )

    override fun entries(): JsIterator<Tuple2<JsString, FormDataEntryValue>>
    override fun keys(): JsIterator<JsString>
    override fun values(): JsIterator<FormDataEntryValue>
    override fun forEach(action: (value: FormDataEntryValue, key: JsString) -> Unit)
}
