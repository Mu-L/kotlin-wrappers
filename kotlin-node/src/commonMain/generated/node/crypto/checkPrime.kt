// Generated by Karakum - do not modify it manually!

@file:JsModule("node:crypto")

package node.crypto

/**
 * Checks the primality of the `candidate`.
 * @since v15.8.0
 * @param candidate A possible prime encoded as a sequence of big endian octets of arbitrary length.
 */
external fun checkPrime(
    value: LargeNumberLike,
    callback: (err: js.errors.JsError?, result: Boolean) -> Unit,
)

external fun checkPrime(
    value: LargeNumberLike,
    options: CheckPrimeOptions,
    callback: (err: js.errors.JsError?, result: Boolean) -> Unit,
)
