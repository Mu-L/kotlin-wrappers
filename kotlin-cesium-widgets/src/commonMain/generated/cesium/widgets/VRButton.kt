// Automatically generated - do not modify!

@file:JsModule("@cesium/widgets")

package cesium.widgets

import cesium.engine.Scene
import web.dom.Element

/**
 * A single button widget for toggling vr mode.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VRButton.html">Online Documentation</a>
 *
 * @constructor
 * @property [container] The DOM element that will contain the widget.
 * @param [scene] The scene.
 * @param [vrElement] The element or id to be placed into vr mode.
 *   Default value - `document.body`
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VRButton.html">Online Documentation</a>
 */
external class VRButton(
    var container: Element,
    scene: Scene,
    vrElement: Element? = definedExternally,
) {
    /**
     * Gets the view model.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VRButton.html#viewModel">Online Documentation</a>
     */
    var viewModel: VRButtonViewModel

    /**
     * @return true if the object has been destroyed, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VRButton.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Destroys the widget.  Should be called if permanently
     * removing the widget from layout.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VRButton.html#destroy">Online Documentation</a>
     */
    fun destroy()
}
