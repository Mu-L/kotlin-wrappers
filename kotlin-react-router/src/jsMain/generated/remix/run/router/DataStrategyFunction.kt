// Generated by Karakum - do not modify it manually!

package remix.run.router

import js.promise.Promise

sealed external interface DataStrategyFunction {
    operator fun invoke(args: DataStrategyFunctionArgs<*>): Promise<js.objects.ReadonlyRecord<String, DataStrategyResult>>
}
