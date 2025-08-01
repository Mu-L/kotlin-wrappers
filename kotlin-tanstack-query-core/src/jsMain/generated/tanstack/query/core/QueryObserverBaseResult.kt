// Automatically generated - do not modify!

package tanstack.query.core

import js.objects.JsPlainObject
import js.promise.Promise
import web.time.EpochTimeStamp

@JsPlainObject
external interface QueryObserverBaseResult<TData, TError> {
    val data: TData?
    val dataUpdatedAt: EpochTimeStamp
    val error: TError?
    val errorUpdatedAt: EpochTimeStamp
    val failureCount: Int
    val failureReason: TError?
    val errorUpdateCount: Int
    val isError: Boolean
    val isFetched: Boolean
    val isFetchedAfterMount: Boolean
    val isFetching: Boolean
    val isLoading: Boolean
    val isPending: Boolean
    val isLoadingError: Boolean
    val isInitialLoading: Boolean
    val isPaused: Boolean
    val isPlaceholderData: Boolean
    val isRefetchError: Boolean
    val isRefetching: Boolean
    val isStale: Boolean
    val isSuccess: Boolean
    val isEnabled: Boolean
    val refetch: (options: RefetchOptions?) -> Promise<QueryObserverResult<TData, TError>>
    val status: QueryStatus
    val fetchStatus: FetchStatus
    val promise: Promise<TData>
}
