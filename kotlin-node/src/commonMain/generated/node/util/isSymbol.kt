// Generated by Karakum - do not modify it manually!

@file:JsModule("node:util")

package node.util

/**
 * Returns `true` if the given `object` is a `Symbol`. Otherwise, returns `false`.
 *
 * ```js
 * import util from 'node:util';
 *
 * util.isSymbol(5);
 * // Returns: false
 * util.isSymbol('foo');
 * // Returns: false
 * util.isSymbol(Symbol('foo'));
 * // Returns: true
 * ```
 * @since v0.11.5
 * @deprecated Since v4.0.0 - Use `typeof value === 'symbol'` instead.
 */

@JsName("isSymbol")
external fun isSymbolRaw(value: Any?): Boolean // object is symbol
