// Generated by Karakum - do not modify it manually!

package electron.core

import js.promise.Promise

@Suppress("INTERFACE_WITH_SUPERCLASS")
external interface InAppPurchase : node.events.EventEmitter {
// Docs: https://electronjs.org/docs/api/in-app-purchase

    /**
     * whether a user can make a payment.
     */
    fun canMakePayments(): Boolean

    /**
     * Completes all pending transactions.
     */
    fun finishAllTransactions()

    /**
     * Completes the pending transactions corresponding to the date.
     */
    fun finishTransactionByDate(date: String)

    /**
     * Resolves with an array of `Product` objects.
     *
     * Retrieves the product descriptions.
     */
    fun getProducts(productIDs: js.array.ReadonlyArray<String>): Promise<js.array.ReadonlyArray<Product>>

    /**
     * the path to the receipt.
     */
    fun getReceiptURL(): String

    /**
     * Returns `true` if the product is valid and added to the payment queue.
     *
     * You should listen for the `transactions-updated` event as soon as possible and
     * certainly before you call `purchaseProduct`.
     */
    fun purchaseProduct(productID: String): Promise<Boolean>

    /**
     * Returns `true` if the product is valid and added to the payment queue.
     *
     * You should listen for the `transactions-updated` event as soon as possible and
     * certainly before you call `purchaseProduct`.
     */
    fun purchaseProduct(
        productID: String,
        opts: Double = definedExternally,
    ): Promise<Boolean>

    /**
     * Returns `true` if the product is valid and added to the payment queue.
     *
     * You should listen for the `transactions-updated` event as soon as possible and
     * certainly before you call `purchaseProduct`.
     */
    fun purchaseProduct(
        productID: String,
        opts: PurchaseProductOpts = definedExternally,
    ): Promise<Boolean>

    /**
     * Restores finished transactions. This method can be called either to install
     * purchases on additional devices, or to restore purchases for an application that
     * the user deleted and reinstalled.
     *
     * The payment queue delivers a new transaction for each previously completed
     * transaction that can be restored. Each transaction includes a copy of the
     * original transaction.
     */
    fun restoreCompletedTransactions()

    @web.events.JsEvent("transactions-updated")
    val transactionsUpdatedEvent: node.events.EventInstance<js.array.Tuple>
}
