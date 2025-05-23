// Generated by Karakum - do not modify it manually!

@file:JsModule("node:dns")

package node.dns

/**
 * Uses the DNS protocol to resolve `CNAME` records for the `hostname`. The `addresses` argument passed to the `callback` function
 * will contain an array of canonical name records available for the `hostname` (e.g. `['bar.example.com']`).
 * @since v0.3.2
 */
external fun resolveCname(
    hostname: String,
    callback: (err: node.ErrnoException?, addresses: js.array.ReadonlyArray<String>) -> Unit,
)
