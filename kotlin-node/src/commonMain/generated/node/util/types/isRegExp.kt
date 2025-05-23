// Generated by Karakum - do not modify it manually!

@file:JsModule("node:util/types")

package node.util.types

/**
 * Returns `true` if the value is a regular expression object.
 *
 * ```js
 * util.types.isRegExp(/abc/);  // Returns true
 * util.types.isRegExp(new RegExp('abc'));  // Returns true
 * ```
 * @since v10.0.0
 */

@JsName("isRegExp")
external fun isRegExpRaw(value: Any?): Boolean // object is RegExp
