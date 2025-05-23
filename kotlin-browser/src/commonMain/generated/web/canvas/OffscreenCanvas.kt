// Automatically generated - do not modify!

package web.canvas

import js.core.JsAny
import js.core.UInt53
import js.promise.Promise
import js.serialization.Transferable
import seskar.js.JsAsync
import web.blob.Blob
import web.events.*
import web.gl.TexImageSource
import web.gpu.GPUCopyExternalImageSource
import web.images.ImageBitmap
import web.rendering.OffscreenRenderingContext
import web.rendering.RenderingContextId
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * When using the canvas element or the Canvas API, rendering, animation, and user interaction usually happen on the main execution thread of a web application.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvas)
 */
open external class OffscreenCanvas(
    /**
     * These attributes return the dimensions of the OffscreenCanvas object's bitmap.
     *
     * They can be set, to replace the bitmap with a new, transparent black bitmap of the specified dimensions (effectively resizing it).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvas/width)
     */
    var width: UInt53,
    /**
     * These attributes return the dimensions of the OffscreenCanvas object's bitmap.
     *
     * They can be set, to replace the bitmap with a new, transparent black bitmap of the specified dimensions (effectively resizing it).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvas/height)
     */
    var height: UInt53,
) : EventTarget,
    CanvasImageSource,
    TexImageSource,
    GPUCopyExternalImageSource,
    Transferable {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvas/contextlost_event)
     */
    var oncontextlost: EventHandler<Event, OffscreenCanvas, OffscreenCanvas>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvas/contextrestored_event)
     */
    var oncontextrestored: EventHandler<Event, OffscreenCanvas, OffscreenCanvas>?

    /**
     * Returns a promise that will fulfill with a new Blob object representing a file containing the image in the OffscreenCanvas object.
     *
     * The argument, if provided, is a dictionary that controls the encoding options of the image file to be created. The type field specifies the file format and has a default value of "image/png"; that type is also used if the requested type isn't supported. If the image format supports variable quality (such as "image/jpeg"), then the quality field is a number in the range 0.0 to 1.0 inclusive indicating the desired quality level for the resulting image.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvas/convertToBlob)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun convertToBlob(options: ImageEncodeOptions = definedExternally): Blob

    @JsName("convertToBlob")
    fun convertToBlobAsync(options: ImageEncodeOptions = definedExternally): Promise<Blob>

    /**
     * Returns an object that exposes an API for drawing on the OffscreenCanvas object. contextId specifies the desired API: "2d", "bitmaprenderer", "webgl", or "webgl2". options is handled by that API.
     *
     * This specification defines the "2d" context below, which is similar but distinct from the "2d" context that is created from a canvas element. The WebGL specifications define the "webgl" and "webgl2" contexts. [WEBGL]
     *
     * Returns null if the canvas has already been initialized with another context type (e.g., trying to get a "2d" context after getting a "webgl" context).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvas/getContext)
     */
    fun <T : OffscreenRenderingContext, O : JsAny> getContext(
        contextId: RenderingContextId<T, O>,
        options: O? = definedExternally,
    ): T?

    /**
     * Returns a newly created ImageBitmap object with the image in the OffscreenCanvas object. The image in the OffscreenCanvas object is replaced with a new blank image.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvas/transferToImageBitmap)
     */
    fun transferToImageBitmap(): ImageBitmap

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvas/contextlost_event)
     */
    @JsEvent("contextlost")
    val contextLostEvent: EventInstance<Event, OffscreenCanvas /* this */, OffscreenCanvas /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvas/contextrestored_event)
     */
    @JsEvent("contextrestored")
    val contextRestoredEvent: EventInstance<Event, OffscreenCanvas /* this */, OffscreenCanvas /* this */>
}
