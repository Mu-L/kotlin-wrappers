// Automatically generated - do not modify!

package web.navigation

/**
 * The **`NavigationActivation`** interface of the Navigation API represents a recent cross-document navigation.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationActivation)
 */
external class NavigationActivation
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationActivation/entry)
     */
    val entry: NavigationHistoryEntry

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationActivation/from)
     */
    val from: NavigationHistoryEntry?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationActivation/navigationType)
     */
    val navigationType: NavigationType
}
