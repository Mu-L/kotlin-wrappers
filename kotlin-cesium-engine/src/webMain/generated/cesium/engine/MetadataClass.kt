// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.core.JsAny
import js.core.JsString
import js.objects.JsPlainObject
import js.objects.ReadonlyRecord

/**
 * A metadata class.
 *
 * See the [3D Metadata Specification](https://github.com/CesiumGS/3d-tiles/tree/main/specification/Metadata) for 3D Tiles
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClass.html">Online Documentation</a>
 */
external class MetadataClass(
    options: ConstructorOptions,
) {
    /**
     * @property [id] The ID of the class.
     * @property [name] The name of the class.
     * @property [description] The description of the class.
     * @property [properties] The class properties, where each key is the property ID.
     * @property [extras] Extra user-defined properties.
     * @property [extensions] An object containing extensions.
     */
    @JsPlainObject
    interface ConstructorOptions {
        val id: String
        val name: String?
        val description: String?
        val properties: ReadonlyRecord<JsString, MetadataClassProperty>?
        val extras: JsAny?
        val extensions: JsAny?
    }

    /**
     * The class properties.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClass.html#properties">Online Documentation</a>
     */
    val properties: ReadonlyRecord<JsString, MetadataClassProperty>

    /**
     * The ID of the class.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClass.html#id">Online Documentation</a>
     */
    val id: String

    /**
     * The name of the class.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClass.html#name">Online Documentation</a>
     */
    val name: String

    /**
     * The description of the class.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClass.html#description">Online Documentation</a>
     */
    val description: String

    /**
     * Extra user-defined properties.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClass.html#extras">Online Documentation</a>
     */
    val extras: JsAny

    /**
     * An object containing extensions.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClass.html#extensions">Online Documentation</a>
     */
    val extensions: JsAny
}
