// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.core.JsAny
import js.core.JsString
import js.objects.JsPlainObject
import js.objects.ReadonlyRecord

/**
 * A user defined GLSL shader used with [Model] as well
 * as [Cesium3DTileset].
 *
 * If texture uniforms are used, additional resource management must be done:
 *
 * - The `update` function must be called each frame. When a
 *   custom shader is passed to a [Model] or a
 *   [Cesium3DTileset], this step is handled automaticaly
 * - [CustomShader.destroy] must be called when the custom shader is
 *   no longer needed to clean up GPU resources properly. The application
 *   is responsible for calling this method.
 *
 * See the [Custom Shader Guide](https://github.com/CesiumGS/cesium/tree/main/Documentation/CustomShaderGuide) for more detailed documentation.
 * ```
 * const customShader = new CustomShader({
 *   uniforms: {
 *     u_colorIndex: {
 *       type: UniformType.FLOAT,
 *       value: 1.0
 *     },
 *     u_normalMap: {
 *       type: UniformType.SAMPLER_2D,
 *       value: new TextureUniform({
 *         url: "http://example.com/normal.png"
 *       })
 *     }
 *   },
 *   varyings: {
 *     v_selectedColor: VaryingType.VEC3
 *   },
 *   vertexShaderText: `
 *   void vertexMain(VertexInput vsInput, inout czm_modelVertexOutput vsOutput) {
 *     v_selectedColor = mix(vsInput.attributes.color_0, vsInput.attributes.color_1, u_colorIndex);
 *     vsOutput.positionMC += 0.1 * vsInput.attributes.normal;
 *   }
 *   `,
 *   fragmentShaderText: `
 *   void fragmentMain(FragmentInput fsInput, inout czm_modelMaterial material) {
 *     material.normal = texture(u_normalMap, fsInput.attributes.texCoord_0);
 *     material.diffuse = v_selectedColor;
 *   }
 *   `
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CustomShader.html">Online Documentation</a>
 *
 * @constructor
 * @param [options] An object with the following options
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CustomShader.html">Online Documentation</a>
 */
external class CustomShader(
    options: ConstructorOptions,
) {
    /**
     * @property [mode] The custom shader mode, which determines how the custom shader code is inserted into the fragment shader.
     *   Default value - [CustomShaderMode.MODIFY_MATERIAL]
     * @property [lightingModel] The lighting model (e.g. PBR or unlit). If present, this overrides the default lighting for the model.
     * @property [translucencyMode] The translucency mode, which determines how the custom shader will be applied. If the value is CustomShaderTransulcencyMode.OPAQUE or CustomShaderTransulcencyMode.TRANSLUCENT, the custom shader will override settings from the model's material. If the value is CustomShaderTransulcencyMode.INHERIT, the custom shader will render as either opaque or translucent depending on the primitive's material settings.
     *   Default value - [CustomShaderTranslucencyMode.INHERIT]
     * @property [uniforms] A dictionary for user-defined uniforms. The key is the uniform name that will appear in the GLSL code. The value is an object that describes the uniform type and initial value
     * @property [varyings] A dictionary for declaring additional GLSL varyings used in the shader. The key is the varying name that will appear in the GLSL code. The value is the data type of the varying. For each varying, the declaration will be added to the top of the shader automatically. The caller is responsible for assigning a value in the vertex shader and using the value in the fragment shader.
     * @property [vertexShaderText] The custom vertex shader as a string of GLSL code. It must include a GLSL function called vertexMain. See the example for the expected signature. If not specified, the custom vertex shader step will be skipped in the computed vertex shader.
     * @property [fragmentShaderText] The custom fragment shader as a string of GLSL code. It must include a GLSL function called fragmentMain. See the example for the expected signature. If not specified, the custom fragment shader step will be skipped in the computed fragment shader.
     */
    @JsPlainObject
    interface ConstructorOptions {
        val mode: CustomShaderMode?
        val lightingModel: LightingModel?
        val translucencyMode: CustomShaderTranslucencyMode?
        val uniforms: ReadonlyRecord<JsString, UniformSpecifier>?
        val varyings: ReadonlyRecord<JsString, VaryingType>?
        val vertexShaderText: String?
        val fragmentShaderText: String?
    }

    /**
     * A value determining how the custom shader interacts with the overall
     * fragment shader. This is used by [CustomShaderPipelineStage]
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CustomShader.html#mode">Online Documentation</a>
     */
    val mode: CustomShaderMode

    /**
     * The lighting model to use when using the custom shader.
     * This is used by [CustomShaderPipelineStage]
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CustomShader.html#lightingModel">Online Documentation</a>
     */
    val lightingModel: LightingModel

    /**
     * Additional uniforms as declared by the user.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CustomShader.html#uniforms">Online Documentation</a>
     */
    val uniforms: ReadonlyRecord<JsString, UniformSpecifier>

    /**
     * Additional varyings as declared by the user.
     * This is used by [CustomShaderPipelineStage]
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CustomShader.html#varyings">Online Documentation</a>
     */
    val varyings: ReadonlyRecord<JsString, VaryingType>

    /**
     * The user-defined GLSL code for the vertex shader
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CustomShader.html#vertexShaderText">Online Documentation</a>
     */
    val vertexShaderText: String

    /**
     * The user-defined GLSL code for the fragment shader
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CustomShader.html#fragmentShaderText">Online Documentation</a>
     */
    val fragmentShaderText: String

    /**
     * The translucency mode, which determines how the custom shader will be applied. If the value is
     * CustomShaderTransulcencyMode.OPAQUE or CustomShaderTransulcencyMode.TRANSLUCENT, the custom shader
     * will override settings from the model's material. If the value isCustomShaderTransulcencyMode.INHERIT,
     * the custom shader will render as either opaque or translucent depending on the primitive's material settings.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CustomShader.html#translucencyMode">Online Documentation</a>
     */
    val translucencyMode: CustomShaderTranslucencyMode

    /**
     * Update the value of a uniform declared in the shader
     * @param [uniformName] The GLSL name of the uniform. This must match one of the uniforms declared in the constructor
     * @param [value] The new value of the uniform.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CustomShader.html#setUniform">Online Documentation</a>
     */
    fun setUniform(
        uniformName: String,
        value: JsAny, /* boolean | number | Cartesian2 | Cartesian3 | Cartesian4 | Matrix2 | Matrix3 | Matrix4 | string | Resource | TextureUniform */
    )

    /**
     * Returns true if this object was destroyed; otherwise, false.
     *
     * If this object was destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.
     * @return True if this object was destroyed; otherwise, false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CustomShader.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Destroys the WebGL resources held by this object.  Destroying an object allows for deterministic
     * release of WebGL resources, instead of relying on the garbage collector to destroy this object.
     *
     * Once an object is destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.  Therefore,
     * assign the return value (`undefined`) to the object as done in the example.
     * ```
     * customShader = customShader && customShader.destroy();
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CustomShader.html#destroy">Online Documentation</a>
     */
    fun destroy()
}
