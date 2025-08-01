// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.core.JsAny
import js.objects.JsPlainObject

/**
 * A metadata property, as part of a [MetadataClass].
 *
 * See the [3D Metadata Specification](https://github.com/CesiumGS/3d-tiles/tree/main/specification/Metadata) for 3D Tiles
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClassProperty.html">Online Documentation</a>
 */
external class MetadataClassProperty(
    options: ConstructorOptions,
) {
    /**
     * @property [id] The ID of the property.
     * @property [type] The type of the property such as SCALAR, VEC2, VEC3.
     * @property [componentType] The component type of the property. This includes integer (e.g. INT8 or UINT16), and floating point (FLOAT32 and FLOAT64) values.
     * @property [enumType] The enum type of the property. Only defined when type is ENUM.
     * @property [isArray] True if a property is an array (either fixed length or variable length), false otherwise.
     *   Default value - `false`
     * @property [isVariableLengthArray] True if a property is a variable length array, false otherwise.
     *   Default value - `false`
     * @property [arrayLength] The number of array elements. Only defined for fixed length arrays.
     * @property [normalized] Whether the property is normalized.
     *   Default value - `false`
     * @property [min] A number or an array of numbers storing the minimum allowable value of this property. Only defined when type is a numeric type.
     * @property [max] A number or an array of numbers storing the maximum allowable value of this property. Only defined when type is a numeric type.
     * @property [offset] The offset to be added to property values as part of the value transform.
     * @property [scale] The scale to be multiplied to property values as part of the value transform.
     * @property [noData] The no-data sentinel value that represents null values.
     * @property [default] A default value to use when an entity's property value is not defined.
     * @property [required] Whether the property is required.
     *   Default value - `false`
     * @property [name] The name of the property.
     * @property [description] The description of the property.
     * @property [semantic] An identifier that describes how this property should be interpreted.
     * @property [extras] Extra user-defined properties.
     * @property [extensions] An object containing extensions.
     */
    @JsPlainObject
    interface ConstructorOptions {
        val id: String
        val type: MetadataType
        val componentType: MetadataComponentType?
        val enumType: MetadataEnum?
        val isArray: Boolean?
        val isVariableLengthArray: Boolean?
        val arrayLength: Int?
        val normalized: Boolean?
        val min: JsAny /* number | number[] | number[][] */?
        val max: JsAny /* number | number[] | number[][] */?
        val offset: JsAny /* number | number[] | number[][] */?
        val scale: JsAny /* number | number[] | number[][] */?
        val noData: JsAny /* boolean | number | string | any[] */?
        val default: JsAny /* boolean | number | string | any[] */?
        val required: Boolean?
        val name: String?
        val description: String?
        val semantic: String?
        val extras: JsAny?
        val extensions: JsAny?
    }

    /**
     * The ID of the property.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClassProperty.html#id">Online Documentation</a>
     */
    val id: String

    /**
     * The name of the property.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClassProperty.html#name">Online Documentation</a>
     */
    val name: String

    /**
     * The description of the property.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClassProperty.html#description">Online Documentation</a>
     */
    val description: String

    /**
     * The type of the property such as SCALAR, VEC2, VEC3
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClassProperty.html#type">Online Documentation</a>
     */
    val type: MetadataType

    /**
     * The enum type of the property. Only defined when type is ENUM.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClassProperty.html#enumType">Online Documentation</a>
     */
    val enumType: MetadataEnum

    /**
     * The component type of the property. This includes integer
     * (e.g. INT8 or UINT16), and floating point (FLOAT32 and FLOAT64) values
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClassProperty.html#componentType">Online Documentation</a>
     */
    val componentType: MetadataComponentType

    /**
     * True if a property is an array (either fixed length or variable length),
     * false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClassProperty.html#isArray">Online Documentation</a>
     */
    val isArray: Boolean

    /**
     * True if a property is a variable length array, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClassProperty.html#isVariableLengthArray">Online Documentation</a>
     */
    val isVariableLengthArray: Boolean

    /**
     * The number of array elements. Only defined for fixed-size
     * arrays.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClassProperty.html#arrayLength">Online Documentation</a>
     */
    val arrayLength: Int

    /**
     * Whether the property is normalized.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClassProperty.html#normalized">Online Documentation</a>
     */
    val normalized: Boolean

    /**
     * A number or an array of numbers storing the maximum allowable value of this property. Only defined when type is a numeric type.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClassProperty.html#max">Online Documentation</a>
     */
    val max: JsAny /* number | number[] | number[][] */

    /**
     * A number or an array of numbers storing the minimum allowable value of this property. Only defined when type is a numeric type.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClassProperty.html#min">Online Documentation</a>
     */
    val min: JsAny /* number | number[] | number[][] */

    /**
     * The no-data sentinel value that represents null values
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClassProperty.html#noData">Online Documentation</a>
     */
    val noData: JsAny /* boolean | number | string | any[] */

    /**
     * A default value to use when an entity's property value is not defined.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClassProperty.html#default">Online Documentation</a>
     */
    val default: JsAny /* boolean | number | string | any[] */

    /**
     * Whether the property is required.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClassProperty.html#required">Online Documentation</a>
     */
    val required: Boolean

    /**
     * An identifier that describes how this property should be interpreted.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClassProperty.html#semantic">Online Documentation</a>
     */
    val semantic: String

    /**
     * The offset to be added to property values as part of the value transform.
     *
     * This is always defined, even when `hasValueTransform` is `false`. If
     * the class property JSON itself did not define it, then it will be
     * initialized to the default value.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClassProperty.html#offset">Online Documentation</a>
     */
    val offset: JsAny /* number | number[] | number[][] */

    /**
     * The scale to be multiplied to property values as part of the value transform.
     *
     * This is always defined, even when `hasValueTransform` is `false`. If
     * the class property JSON itself did not define it, then it will be
     * initialized to the default value.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClassProperty.html#scale">Online Documentation</a>
     */
    val scale: JsAny /* number | number[] | number[][] */

    /**
     * Extra user-defined properties.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClassProperty.html#extras">Online Documentation</a>
     */
    val extras: JsAny

    /**
     * An object containing extensions.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClassProperty.html#extensions">Online Documentation</a>
     */
    val extensions: JsAny
}
