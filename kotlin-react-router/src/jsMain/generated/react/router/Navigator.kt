// Generated by Karakum - do not modify it manually!

package react.router

import remix.run.router.Path
import remix.run.router.To

/**
 * A Navigator is a "location changer"; it's how you get to different locations.
 *
 * Every history instance conforms to the Navigator interface, but the
 * distinction is useful primarily when it comes to the low-level `<Router>` API
 * where both the location and a navigator must be provided separately in order
 * to avoid "tearing" that may occur in a suspense-enabled app if the action
 * and/or location were to be read directly from the history instance.
 */
sealed external interface Navigator {
    var createHref: (to: To) -> String
    var encodeLocation: ((to: To) -> Path)?
    var go: (delta: Double) -> Unit
    fun push(to: To, state: Any? = definedExternally, opts: NavigateOptions = definedExternally)
    fun replace(to: To, state: Any? = definedExternally, opts: NavigateOptions = definedExternally)
}
