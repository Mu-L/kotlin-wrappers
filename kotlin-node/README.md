[![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-node)](https://search.maven.org/artifact/org.jetbrains.kotlin-wrappers/kotlin-node)

# Module kotlin-node

[Node.js](https://nodejs.org/) declarations

### Internals

Declarations in [src/webMain/generated](./src/webMain/generated) are generated
by [Karakum](https://github.com/karakum-team/karakum).
Manual changes are prohibited.

### TODO:

1) Fix numeric types
2) Get rid of `WithImplicitCoercion`
3) Support `captureRejectionSymbol` in `EventEmitter`
4) Support `asyncIterator` and `asyncDispose` symbols in `Readable`
5) Improve `TestEvent` typings
