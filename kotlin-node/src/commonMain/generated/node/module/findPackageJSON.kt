// Generated by Karakum - do not modify it manually!

@file:JsModule("node:module")

package node.module

import web.url.URL

/**
 * @since v23.2.0, v22.14.0
 */
external fun findPackageJSON(specifier: String): String?

/**
 * @since v23.2.0, v22.14.0
 */
external fun findPackageJSON(
    specifier: String,
    base: String = definedExternally,
): String?

/**
 * @since v23.2.0, v22.14.0
 */
external fun findPackageJSON(
    specifier: String,
    base: URL = definedExternally,
): String?

/**
 * @since v23.2.0, v22.14.0
 */
external fun findPackageJSON(specifier: URL): String?

/**
 * @since v23.2.0, v22.14.0
 */
external fun findPackageJSON(
    specifier: URL,
    base: String = definedExternally,
): String?

/**
 * @since v23.2.0, v22.14.0
 */
external fun findPackageJSON(
    specifier: URL,
    base: URL = definedExternally,
): String?
