// Generated by Karakum - do not modify it manually!

package node.crypto

@Suppress("INTERFACE_WITH_SUPERCLASS")
sealed external interface CipherGCM : Cipher {
    fun setAAD(buffer: js.buffer.ArrayBufferView<*>, options: CipherGCMSetAADOptions = definedExternally) // this

    fun getAuthTag(): node.buffer.Buffer<*>
}
