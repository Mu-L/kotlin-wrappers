// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.core.Void
import js.promise.Promise
import js.typedarrays.TypedArray
import seskar.js.JsAsync

/**
 * Provides terrain or other geometry for the surface of an ellipsoid.  The surface geometry is
 * organized into a pyramid of tiles according to a [TilingScheme].  This type describes an
 * interface and is not intended to be instantiated directly.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TerrainProvider.html">Online Documentation</a>
 */
abstract external class TerrainProvider() {
    /**
     * Gets an event that is raised when the terrain provider encounters an asynchronous error.  By subscribing
     * to the event, you will be notified of the error and can potentially recover from it.  Event listeners
     * are passed an instance of [TileProviderError].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TerrainProvider.html#errorEvent">Online Documentation</a>
     */
    abstract val errorEvent: Event<* /* ErrorEvent */>

    /**
     * Gets the credit to display when this terrain provider is active.  Typically this is used to credit
     * the source of the terrain.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TerrainProvider.html#credit">Online Documentation</a>
     */
    abstract val credit: Credit

    /**
     * Gets the tiling scheme used by the provider.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TerrainProvider.html#tilingScheme">Online Documentation</a>
     */
    abstract val tilingScheme: TilingScheme

    /**
     * Gets a value indicating whether or not the provider includes a water mask.  The water mask
     * indicates which areas of the globe are water rather than land, so they can be rendered
     * as a reflective surface with animated waves.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TerrainProvider.html#hasWaterMask">Online Documentation</a>
     */
    abstract val hasWaterMask: Boolean

    /**
     * Gets a value indicating whether or not the requested tiles include vertex normals.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TerrainProvider.html#hasVertexNormals">Online Documentation</a>
     */
    abstract val hasVertexNormals: Boolean

    /**
     * Gets an object that can be used to determine availability of terrain from this provider, such as
     * at points and in rectangles. This property may be undefined if availability
     * information is not available.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TerrainProvider.html#availability">Online Documentation</a>
     */
    abstract val availability: TileAvailability?

    /**
     * Requests the geometry for a given tile. The result must include terrain data and
     * may optionally include a water mask and an indication of which child tiles are available.
     * @param [x] The X coordinate of the tile for which to request geometry.
     * @param [y] The Y coordinate of the tile for which to request geometry.
     * @param [level] The level of the tile for which to request geometry.
     * @param [request] The request object. Intended for internal use only.
     * @return A promise for the requested geometry.  If this method
     *   returns undefined instead of a promise, it is an indication that too many requests are already
     *   pending and the request will be retried later.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TerrainProvider.html#requestTileGeometry">Online Documentation</a>
     */
    @JsAsync(optional = true)
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun requestTileGeometry(
        x: Double,
        y: Double,
        level: Int,
        request: Request? = definedExternally,
    ): TerrainData?

    @JsName("requestTileGeometry")
    abstract fun requestTileGeometryAsync(
        x: Double,
        y: Double,
        level: Int,
        request: Request? = definedExternally,
    ): Promise<TerrainData>?

    /**
     * Gets the maximum geometric error allowed in a tile at a given level.
     * @param [level] The tile level for which to get the maximum geometric error.
     * @return The maximum geometric error.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TerrainProvider.html#getLevelMaximumGeometricError">Online Documentation</a>
     */
    abstract fun getLevelMaximumGeometricError(level: Int): Double

    /**
     * Determines whether data for a tile is available to be loaded.
     * @param [x] The X coordinate of the tile for which to request geometry.
     * @param [y] The Y coordinate of the tile for which to request geometry.
     * @param [level] The level of the tile for which to request geometry.
     * @return Undefined if not supported by the terrain provider, otherwise true or false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TerrainProvider.html#getTileDataAvailable">Online Documentation</a>
     */
    abstract fun getTileDataAvailable(
        x: Double,
        y: Double,
        level: Int,
    ): Boolean?

    /**
     * Makes sure we load availability data for a tile
     * @param [x] The X coordinate of the tile for which to request geometry.
     * @param [y] The Y coordinate of the tile for which to request geometry.
     * @param [level] The level of the tile for which to request geometry.
     * @return Undefined if nothing need to be loaded or a Promise that resolves when all required tiles are loaded
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TerrainProvider.html#loadTileDataAvailability">Online Documentation</a>
     */
    @JsAsync(optional = true)
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun loadTileDataAvailability(
        x: Double,
        y: Double,
        level: Int,
    )

    @JsName("loadTileDataAvailability")
    abstract fun loadTileDataAvailabilityAsync(
        x: Double,
        y: Double,
        level: Int,
    ): Promise<Void>?

    companion object {
        /**
         * Gets a list of indices for a triangle mesh representing a regular grid.  Calling
         * this function multiple times with the same grid width and height returns the
         * same list of indices.  The total number of vertices must be less than or equal
         * to 65536.
         * @param [width] The number of vertices in the regular grid in the horizontal direction.
         * @param [height] The number of vertices in the regular grid in the vertical direction.
         * @return The list of indices. Uint16Array gets returned for 64KB or less and Uint32Array for 4GB or less.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TerrainProvider.html#.getRegularGridIndices">Online Documentation</a>
         */
        fun getRegularGridIndices(
            width: Double,
            height: Double,
        ): TypedArray<*, *, *, *> /* Uint16Array | Uint32Array */

        /**
         * Specifies the quality of terrain created from heightmaps.  A value of 1.0 will
         * ensure that adjacent heightmap vertices are separated by no more than
         * [Globe.maximumScreenSpaceError] screen pixels and will probably go very slowly.
         * A value of 0.5 will cut the estimated level zero geometric error in half, allowing twice the
         * screen pixels between adjacent heightmap vertices and thus rendering more quickly.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TerrainProvider.html#.heightmapTerrainQuality">Online Documentation</a>
         */
        var heightmapTerrainQuality: Double

        /**
         * Determines an appropriate geometric error estimate when the geometry comes from a heightmap.
         * @param [ellipsoid] The ellipsoid to which the terrain is attached.
         * @param [tileImageWidth] The width, in pixels, of the heightmap associated with a single tile.
         * @param [numberOfTilesAtLevelZero] The number of tiles in the horizontal direction at tile level zero.
         * @return An estimated geometric error.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TerrainProvider.html#.getEstimatedLevelZeroGeometricErrorForAHeightmap">Online Documentation</a>
         */
        fun getEstimatedLevelZeroGeometricErrorForAHeightmap(
            ellipsoid: Ellipsoid,
            tileImageWidth: Double,
            numberOfTilesAtLevelZero: Int,
        ): Double
    }
}
