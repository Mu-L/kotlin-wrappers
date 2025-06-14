plugins {
    id("karakum.actions-declarations")
}

dependencies {
    commonMainImplementation(npm(jspkg.actions.artifact))
    commonMainImplementation(npm(jspkg.actions.cache))
    commonMainImplementation(npm(jspkg.actions.core))
    commonMainImplementation(npm(jspkg.actions.exec))
    commonMainImplementation(npm(jspkg.actions.glob))
    commonMainImplementation(npm(jspkg.actions.github))
    commonMainImplementation(npm(jspkg.actions.httpClient))
    commonMainImplementation(npm(jspkg.actions.io))
    commonMainImplementation(npm(jspkg.actions.toolCache))
}

val syncActionsArtifact by tasks.registering(SyncWrappers::class) {
    from(jsGeneratedDir) {
        include("actions/artifact/")
    }
    into(kotlinWrappersCommonDir("kotlin-actions-artifact"))
}

val syncActionsCache by tasks.registering(SyncWrappers::class) {
    from(jsGeneratedDir) {
        include("actions/cache/")
    }
    into(kotlinWrappersCommonDir("kotlin-actions-cache"))
}

val syncActionsCore by tasks.registering(SyncWrappers::class) {
    from(jsGeneratedDir) {
        include("actions/core/")
    }
    into(kotlinWrappersCommonDir("kotlin-actions-core"))
}

val syncActionsExec by tasks.registering(SyncWrappers::class) {
    from(jsGeneratedDir) {
        include("actions/exec/")
    }
    into(kotlinWrappersCommonDir("kotlin-actions-exec"))
}

val syncActionsGlob by tasks.registering(SyncWrappers::class) {
    from(jsGeneratedDir) {
        include("actions/glob/")
    }
    into(kotlinWrappersCommonDir("kotlin-actions-glob"))
}

val syncActionsGitHub by tasks.registering(SyncWrappers::class) {
    from(jsGeneratedDir) {
        include("actions/github/")
    }
    into(kotlinWrappersCommonDir("kotlin-actions-github"))
}

val syncActionsHttpClient by tasks.registering(SyncWrappers::class) {
    from(jsGeneratedDir) {
        include("actions/http/client/")
    }
    into(kotlinWrappersCommonDir("kotlin-actions-http-client"))
}

val syncActionsIO by tasks.registering(SyncWrappers::class) {
    from(jsGeneratedDir) {
        include("actions/io/")
    }
    into(kotlinWrappersCommonDir("kotlin-actions-io"))
}

val syncActionsToolCache by tasks.registering(SyncWrappers::class) {
    from(jsGeneratedDir) {
        include("actions/tool/cache/")
    }
    into(kotlinWrappersCommonDir("kotlin-actions-tool-cache"))
}
