// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

import kotlin.js.JsModule

/**
 * Describes how an {@link InlineCompletionItemProvider inline completion provider} was triggered.
 */
sealed /* enum */
external interface InlineCompletionTriggerKind {
    companion object {
        /**
         * Completion was triggered explicitly by a user gesture.
         * Return multiple completion items to enable cycling through them.
         */
        val Invoke: InlineCompletionTriggerKind // 0

        /**
         * Completion was triggered automatically while editing.
         * It is sufficient to return a single completion item in this case.
         */
        val Automatic: InlineCompletionTriggerKind // 1
    }
}
