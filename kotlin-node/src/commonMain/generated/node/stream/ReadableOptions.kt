// Generated by Karakum - do not modify it manually!

package node.stream

@js.objects.JsPlainObject
sealed external interface ReadableOptions<T : Readable /* default is Readable */> : StreamOptions<T> {
    var encoding: node.buffer.BufferEncoding?
    val read: ((/* this: T, */ size: Number) -> Unit)?
}
