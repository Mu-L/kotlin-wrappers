// Generated by Karakum - do not modify it manually!

package node.stream

@js.objects.JsPlainObject
sealed external interface WritableOptions<T : Writable /* default is Writable */> : StreamOptions<T> {
    var decodeStrings: Boolean?
    var defaultEncoding: node.buffer.BufferEncoding?
    val write: (
        (
        // this: T,
        chunk: Any?,
        encoding: node.buffer.BufferEncoding,
        callback: (error: js.errors.JsError? /* use undefined for default */) -> Unit,
    ) -> Unit
    )?
    val writev: (
        (
        // this: T,
        chunks: Array<WritableOptionsWritevChunksItem>,
        callback: (error: js.errors.JsError? /* use undefined for default */) -> Unit,
    ) -> Unit
    )?
    val final: ((/* this: T, */ callback: (error: js.errors.JsError? /* use undefined for default */) -> Unit) -> Unit)?
}
