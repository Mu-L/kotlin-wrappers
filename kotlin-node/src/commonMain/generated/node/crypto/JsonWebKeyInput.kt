// Generated by Karakum - do not modify it manually!

package node.crypto

sealed external interface JsonWebKeyInput {
    var key: JsonWebKey
    var format: String // "jwk"
}
