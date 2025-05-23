// Generated by Karakum - do not modify it manually!

package node.stream

import web.abort.Abortable

@js.objects.JsPlainObject
sealed external interface StreamOptions<T : Stream> : Abortable {
    var emitClose: Boolean?
    var highWaterMark: Double?
    var objectMode: Boolean?
    val construct: (
        (/* this: T, */ callback: (error: js.errors.JsError? /* use undefined for default */) -> Unit) -> Unit
    )?
    val destroy: (
        (
        // this: T,
        error: js.errors.JsError?,
        callback: (error: js.errors.JsError? /* use undefined for default */) -> Unit,
    ) -> Unit
    )?
    var autoDestroy: Boolean?
}
