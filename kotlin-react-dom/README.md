[![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-react-dom)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-react-dom)

# Module kotlin-react-dom

Kotlin wrapper for the React DOM library. The major version number of this wrapper matches that of React DOM itself.

## kotlin-react-dom vs kotlin-react-dom-legacy

`kotlin-react-dom` does not depend on `kotlinx.html`, the HTML typings it provides are generated from TypeScript types
directly. They are therefore more complete and up-to-date.

`kotlin-react-dom-legacy` depends on `kolinx.html` and its HTML typings are maintained manually.

See [CHANGELOG.md](../CHANGELOG.md#pre282) for more details.

### Gradle

```kotlin
repositories {
    mavenCentral()
}

implementation("org.jetbrains.kotlin-wrappers:kotlin-react-dom:VERSION")
```

### Internals

Declarations in [src/jsMain/generated](./src/jsMain/generated) are generated.
Manual changes are prohibited.
