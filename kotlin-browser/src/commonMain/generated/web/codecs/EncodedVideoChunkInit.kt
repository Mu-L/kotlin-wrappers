// Automatically generated - do not modify!

package web.codecs

import js.buffer.AllowSharedBufferSource
import js.core.Int53
import js.core.UInt53
import js.objects.JsPlainObject

@JsPlainObject
external interface EncodedVideoChunkInit {
    val data: AllowSharedBufferSource
    val duration: UInt53?
    val timestamp: Int53
    val type: EncodedVideoChunkType
}
