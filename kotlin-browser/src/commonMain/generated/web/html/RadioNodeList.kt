// Automatically generated - do not modify!

package web.html

import web.dom.NodeList

/**
 * The **`RadioNodeList`** interface represents a collection of elements in a form returned by a call to HTMLFormControlsCollection.namedItem().
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RadioNodeList)
 */
sealed /* final */
external class RadioNodeList
protected /* private */ constructor() :
    NodeList<HTMLInputElement> {
    /**
     * If the underlying element collection contains radio buttons, the **`RadioNodeList.value`** property represents the checked radio button.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RadioNodeList/value)
     */
    var value: String
}
