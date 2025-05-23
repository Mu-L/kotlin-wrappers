// Generated by Karakum - do not modify it manually!

package node.crypto

sealed external interface KeyFormat {
    sealed interface pem : KeyFormat

    sealed interface der : KeyFormat

    sealed interface jwk : KeyFormat

    companion object {
        @seskar.js.JsValue("pem")
        val pem: pem

        @seskar.js.JsValue("der")
        val der: der

        @seskar.js.JsValue("jwk")
        val jwk: jwk
    }
}
