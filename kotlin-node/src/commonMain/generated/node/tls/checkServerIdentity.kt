// Generated by Karakum - do not modify it manually!

@file:JsModule("node:tls")

package node.tls

/**
 * Verifies the certificate `cert` is issued to `hostname`.
 *
 * Returns [Error](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Error) object, populating it with `reason`, `host`, and `cert` on
 * failure. On success, returns [undefined](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Data_structures#Undefined_type).
 *
 * This function is intended to be used in combination with the`checkServerIdentity` option that can be passed to {@link connect} and as
 * such operates on a `certificate object`. For other purposes, consider using `x509.checkHost()` instead.
 *
 * This function can be overwritten by providing an alternative function as the `options.checkServerIdentity` option that is passed to `tls.connect()`. The
 * overwriting function can call `tls.checkServerIdentity()` of course, to augment
 * the checks done with additional verification.
 *
 * This function is only called if the certificate passed all other checks, such as
 * being issued by trusted CA (`options.ca`).
 *
 * Earlier versions of Node.js incorrectly accepted certificates for a given`hostname` if a matching `uniformResourceIdentifier` subject alternative name
 * was present (see [CVE-2021-44531](https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2021-44531)). Applications that wish to accept`uniformResourceIdentifier` subject alternative names can use
 * a custom `options.checkServerIdentity` function that implements the desired behavior.
 * @since v0.8.4
 * @param hostname The host name or IP address to verify the certificate against.
 * @param cert A `certificate object` representing the peer's certificate.
 */
external fun checkServerIdentity(
    hostname: String,
    cert: PeerCertificate,
): js.errors.JsError?
