// Automatically generated - do not modify!

package web.codecs

import js.array.ReadonlyArray
import js.buffer.AllowSharedBufferSource
import js.core.Int53
import js.core.UInt53
import js.promise.Promise
import js.serialization.Serializable
import js.serialization.Transferable
import seskar.js.JsAsync
import web.canvas.CanvasImageSource
import web.geometry.DOMRectReadOnly
import web.gl.TexImageSource
import web.gpu.GPUCopyExternalImageSource
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`VideoFrame`** interface of the Web Codecs API represents a frame of a video.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame)
 */
open external class VideoFrame(
    image: CanvasImageSource,
    init: VideoFrameInit = definedExternally,
) : CanvasImageSource,
    TexImageSource,
    GPUCopyExternalImageSource,
    Transferable,
    Serializable {
    constructor(
        data: AllowSharedBufferSource,
        init: VideoFrameBufferInit,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/codedHeight)
     */
    val codedHeight: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/codedRect)
     */
    val codedRect: DOMRectReadOnly?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/codedWidth)
     */
    val codedWidth: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/colorSpace)
     */
    val colorSpace: VideoColorSpace

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/displayHeight)
     */
    val displayHeight: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/displayWidth)
     */
    val displayWidth: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/duration)
     */
    val duration: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/format)
     */
    val format: VideoPixelFormat?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/timestamp)
     */
    val timestamp: Int53

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/visibleRect)
     */
    val visibleRect: DOMRectReadOnly?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/allocationSize)
     */
    fun allocationSize(options: VideoFrameCopyToOptions = definedExternally): Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/clone)
     */
    fun clone(): VideoFrame

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/close)
     */
    fun close()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/copyTo)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun copyTo(
        destination: AllowSharedBufferSource,
        options: VideoFrameCopyToOptions = definedExternally,
    ): ReadonlyArray<PlaneLayout>

    @JsName("copyTo")
    fun copyToAsync(
        destination: AllowSharedBufferSource,
        options: VideoFrameCopyToOptions = definedExternally,
    ): Promise<ReadonlyArray<PlaneLayout>>
}
