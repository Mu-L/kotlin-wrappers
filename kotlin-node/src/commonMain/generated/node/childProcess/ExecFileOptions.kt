// Generated by Karakum - do not modify it manually!

package node.childProcess

import web.abort.AbortSignal
import web.abort.Abortable

@js.objects.JsPlainObject
sealed external interface ExecFileOptions :
    CommonOptions,
    Abortable {
    var maxBuffer: Double?
    var killSignal: Any? // NodeJS.Signals | number | undefined
    var windowsVerbatimArguments: Boolean?
    var shell: Any? // boolean | string | undefined
    override var signal: AbortSignal?
}
