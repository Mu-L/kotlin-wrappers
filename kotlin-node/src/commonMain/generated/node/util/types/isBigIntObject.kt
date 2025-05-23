// Generated by Karakum - do not modify it manually!

@file:JsModule("node:util/types")

package node.util.types

/**
 * Returns `true` if the value is a BigInt object, e.g. created
 * by `Object(BigInt(123))`.
 *
 * ```js
 * util.types.isBigIntObject(Object(BigInt(123)));   // Returns true
 * util.types.isBigIntObject(BigInt(123));   // Returns false
 * util.types.isBigIntObject(123);  // Returns false
 * ```
 * @since v10.4.0
 */

@JsName("isBigIntObject")
external fun isBigIntObjectRaw(value: Any?): Boolean // object is BigInt
