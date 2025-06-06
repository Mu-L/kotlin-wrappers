// Generated by Karakum - do not modify it manually!

@file:JsModule("node:crypto")

package node.crypto

/**
 * Decrypts `buffer` with `privateKey`. `buffer` was previously encrypted using
 * the corresponding public key, for example using {@link publicEncrypt}.
 *
 * If `privateKey` is not a `KeyObject`, this function behaves as if `privateKey` had been passed to {@link createPrivateKey}. If it is an
 * object, the `padding` property can be passed. Otherwise, this function uses `RSA_PKCS1_OAEP_PADDING`.
 * @since v0.11.14
 */
external fun privateDecrypt(
    privateKey: RsaPrivateKey,
    buffer: js.buffer.ArrayBufferView<*>,
): node.buffer.Buffer<*>

/**
 * Decrypts `buffer` with `privateKey`. `buffer` was previously encrypted using
 * the corresponding public key, for example using {@link publicEncrypt}.
 *
 * If `privateKey` is not a `KeyObject`, this function behaves as if `privateKey` had been passed to {@link createPrivateKey}. If it is an
 * object, the `padding` property can be passed. Otherwise, this function uses `RSA_PKCS1_OAEP_PADDING`.
 * @since v0.11.14
 */
external fun privateDecrypt(
    privateKey: RsaPrivateKey,
    buffer: String,
): node.buffer.Buffer<*>

/**
 * Decrypts `buffer` with `privateKey`. `buffer` was previously encrypted using
 * the corresponding public key, for example using {@link publicEncrypt}.
 *
 * If `privateKey` is not a `KeyObject`, this function behaves as if `privateKey` had been passed to {@link createPrivateKey}. If it is an
 * object, the `padding` property can be passed. Otherwise, this function uses `RSA_PKCS1_OAEP_PADDING`.
 * @since v0.11.14
 */
external fun privateDecrypt(
    privateKey: KeyLike,
    buffer: js.buffer.ArrayBufferView<*>,
): node.buffer.Buffer<*>

/**
 * Decrypts `buffer` with `privateKey`. `buffer` was previously encrypted using
 * the corresponding public key, for example using {@link publicEncrypt}.
 *
 * If `privateKey` is not a `KeyObject`, this function behaves as if `privateKey` had been passed to {@link createPrivateKey}. If it is an
 * object, the `padding` property can be passed. Otherwise, this function uses `RSA_PKCS1_OAEP_PADDING`.
 * @since v0.11.14
 */
external fun privateDecrypt(
    privateKey: KeyLike,
    buffer: String,
): node.buffer.Buffer<*>
