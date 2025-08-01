// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray

/**
 * The document formatting provider interface defines the contract between extensions and
 * the formatting-feature.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentRangeFormattingEditProvider)
 */
external interface DocumentRangeFormattingEditProvider {
    /**
     * Provide formatting edits for a range in a document.
     *
     * The given range is a hint and providers can decide to format a smaller
     * or larger range. Often this is done by adjusting the start and end
     * of the range to full syntax nodes.
     *
     * @param document The document in which the command was invoked.
     * @param range The range which should be formatted.
     * @param options Options controlling formatting.
     * @param token A cancellation token.
     * @returns A set of text edits or a thenable that resolves to such. The lack of a result can be
     * signaled by returning `undefined`, `null`, or an empty array.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentRangeFormattingEditProvider.provideDocumentRangeFormattingEdits)
     */
    fun provideDocumentRangeFormattingEdits(
        document: TextDocument,
        range: Range,
        options: FormattingOptions,
        token: CancellationToken,
    ): ProviderResult<ReadonlyArray<TextEdit>>

    /**
     * Provide formatting edits for multiple ranges in a document.
     *
     * This function is optional but allows a formatter to perform faster when formatting only modified ranges or when
     * formatting a large number of selections.
     *
     * The given ranges are hints and providers can decide to format a smaller
     * or larger range. Often this is done by adjusting the start and end
     * of the range to full syntax nodes.
     *
     * @param document The document in which the command was invoked.
     * @param ranges The ranges which should be formatted.
     * @param options Options controlling formatting.
     * @param token A cancellation token.
     * @returns A set of text edits or a thenable that resolves to such. The lack of a result can be
     * signaled by returning `undefined`, `null`, or an empty array.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentRangeFormattingEditProvider.provideDocumentRangesFormattingEdits)
     */
    var provideDocumentRangesFormattingEdits: ((
        document: TextDocument,
        ranges: ReadonlyArray<Range>,
        options: FormattingOptions,
        token: CancellationToken,
    ) -> ProviderResult<ReadonlyArray<TextEdit>>)?
}
