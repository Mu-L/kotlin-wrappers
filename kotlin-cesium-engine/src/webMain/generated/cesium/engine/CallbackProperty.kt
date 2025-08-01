// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.core.JsAny

/**
 * A [Property] whose value is lazily evaluated by a callback function.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CallbackProperty.html">Online Documentation</a>
 *
 * @constructor
 * @param [callback] The function to be called when the property is evaluated.
 * @property [isConstant] `true` when the callback function returns the same value every time, `false` if the value will change.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CallbackProperty.html">Online Documentation</a>
 */
external class CallbackProperty(
    callback: CallbackPropertyCallback,
    val isConstant: Boolean,
) {
    /**
     * Gets the event that is raised whenever the definition of this property changes.
     * The definition is changed whenever setCallback is called.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CallbackProperty.html#definitionChanged">Online Documentation</a>
     */
    val definitionChanged: DefaultEvent

    /**
     * Gets the value of the property.
     * @param [time] The time for which to retrieve the value. If omitted, the current system time is used.
     *   Default value - `JulianDate.now()`
     * @param [result] The object to store the value into, if omitted, a new instance is created and returned.
     * @return The modified result parameter or a new instance if the result parameter was not supplied or is unsupported.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CallbackProperty.html#getValue">Online Documentation</a>
     */
    fun getValue(
        time: JulianDate? = definedExternally,
        result: JsAny? = definedExternally,
    ): JsAny

    /**
     * Sets the callback to be used.
     * @param [callback] The function to be called when the property is evaluated.
     * @param [isConstant] `true` when the callback function returns the same value every time, `false` if the value will change.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CallbackProperty.html#setCallback">Online Documentation</a>
     */
    fun setCallback(
        callback: CallbackPropertyCallback,
        isConstant: Boolean,
    )
}
