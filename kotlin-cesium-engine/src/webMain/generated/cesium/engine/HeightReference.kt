// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Represents the position relative to the terrain.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#HeightReference">Online Documentation</a>
 */
sealed /* enum */
external interface HeightReference {
    companion object {

        /**
         * The position is absolute.
         */
        val NONE: HeightReference

        /**
         * The position is clamped to the terrain and 3D Tiles. When clamping to 3D Tilesets such as photorealistic 3D Tiles, ensure the tileset has [Cesium3DTileset.enableCollision] set to `true`. Otherwise, the entity may not be correctly clamped to the tileset surface.
         */
        val CLAMP_TO_GROUND: HeightReference

        /**
         * The position height is the height above the terrain and 3D Tiles.
         */
        val RELATIVE_TO_GROUND: HeightReference

        /**
         * The position is clamped to terain.
         */
        val CLAMP_TO_TERRAIN: HeightReference

        /**
         * The position height is the height above terrain.
         */
        val RELATIVE_TO_TERRAIN: HeightReference

        /**
         * The position is clamped to 3D Tiles.
         */
        val CLAMP_TO_3D_TILE: HeightReference

        /**
         * The position height is the height above 3D Tiles.
         */
        val RELATIVE_TO_3D_TILE: HeightReference
    }
}
