// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.core.JsAny

/**
 * A [MaterialProperty] that maps to solid color [Material] uniforms.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ColorMaterialProperty.html">Online Documentation</a>
 */
external class ColorMaterialProperty() :
    MaterialProperty {
    constructor(
        color: Property,
    )

    constructor(
        color: Color,
    )

    /**
     * Gets a value indicating if this property is constant.  A property is considered
     * constant if getValue always returns the same result for the current definition.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ColorMaterialProperty.html#isConstant">Online Documentation</a>
     */
    override val isConstant: Boolean

    /**
     * Gets the event that is raised whenever the definition of this property changes.
     * The definition is considered to have changed if a call to getValue would return
     * a different result for the same time.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ColorMaterialProperty.html#definitionChanged">Online Documentation</a>
     */
    override val definitionChanged: DefaultEvent

    /**
     * Gets or sets the [Color] [Property].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ColorMaterialProperty.html#color">Online Documentation</a>
     */
    var color: Property?

    /**
     * Gets the [Material] type at the provided time.
     * @param [time] The time for which to retrieve the type.
     * @return The type of material.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ColorMaterialProperty.html#getType">Online Documentation</a>
     */
    override fun getType(time: JulianDate): String

    /**
     * Gets the value of the property at the provided time.
     * @param [time] The time for which to retrieve the value. If omitted, the current system time is used.
     *   Default value - `JulianDate.now()`
     * @param [result] The object to store the value into, if omitted, a new instance is created and returned.
     * @return The modified result parameter or a new instance if the result parameter was not supplied.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ColorMaterialProperty.html#getValue">Online Documentation</a>
     */
    override fun getValue(
        time: JulianDate?,
        result: JsAny?,
    ): JsAny
}
