// Generated by Karakum - do not modify it manually!

package node.stream

@js.objects.JsPlainObject
sealed external interface DuplexOptions<T : Duplex /* default is Duplex */> :
    ReadableOptions<T>,
    WritableOptions<T> {
    var allowHalfOpen: Boolean?
    var readableObjectMode: Boolean?
    var writableObjectMode: Boolean?
    var readableHighWaterMark: Double?
    var writableHighWaterMark: Double?
    var writableCorked: Double?
}
