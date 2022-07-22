# Kiniela

Kiniela is a work-in-progress Soccer Pool Android app. It is still in its early stages of development and it is under heavy development.

## Development Setup 👣

The app is written entirely in Kotlin and uses the Gradle build system.

To build the app, use the `gradlew build` command or use "Import Project" in
Android Studio. A canary or stable version of Android Studio Chipmunk 2021.2.1 or newer is
required and may be downloaded
[here](https://developer.android.com/studio/).

You'll need to have the JAVA_HOME variable set to run Gradle from the command line. See
[this for more info](https://runningcode.github.io/gradle-doctor/java-home/).

## Code Style & Practices 🔍

The [code style guidelines by Google](https://developer.android.com/kotlin/style-guide) are the
basis for our internal standards and should be consulted before reading this section. Furthermore,
the [JetBrains coding conventions](https://kotlinlang.org/docs/coding-conventions.html) also need to
be taken into consideration. We treat all Kotlin warnings as errors so they are either fixed or
explicitly suppressed.

### Naming conventions
* Try to suffix child classes with their parent's names (or at least parts of it), for example,
  `UserDetailViewModel : ViewModel`.
* All Kotlin classes and interfaces follow the UpperCamelCase naming convention while functions and
  properties use lowerCamelCase. Constants (true constants that belong to an object) are named in
  ALL_CAPS.
* Name any function that returns Unit and bears the `@Composable` annotation using `PascalCase`, and
  the name MUST be that of a noun, not a verb or verb phrase, nor a nouned preposition, adjective, or
  adverb. Nouns MAY be prefixed by descriptive adjectives.
* XML files should be named with snake_case. When naming layouts, use the fragment_ or
  activity_ prefix for screens, item_ for RecyclerView itemViews, view_ for custom views, and layout_
  for everything else (for example layouts that are intended to be included in other layouts).
* Android resource ID-s are usually snake_case except styles and themes which are UpperCamelCase.
* Packages should follow the lowerCamelCase naming convention (although single-word package names
  are preferred). Modules are named using kebab-case.

### General tips
* Try to use the strictest encapsulation possible: as we have a modular architecture, Kotlin's
  default public access modifier is not strict enough for most cases. Make sure to think in the
  internal access modifier (or *private*) by default and only expose something for public usage when
  it is justified.
* Try to use data classes with immutable properties as often as possible. The minor performance
  drawbacks of garbage collection don't outweigh the benefits of immutability.
* When possible, always use Kotlin properties (with overridden getters or setters) instead of
  accessor functions.
* In lambda functions, always give a name for "it" if more blocks are nested, or the meaning behind
  the variable is not obvious in that scope.
* Don't specify return types when they can be inferred.
* Try to spot single-expression functions and use the short syntax when justified.
* Try to avoid using the object keyword: we have dependency injection to create singletons and
  objects not having constructors arguments is a limitation that doesn't scale well.
* Check out the [static analyzer configurations](#static-analysis) for more information.

## Static Analysis 🔍

This app is using [**detekt**](https://github.com/detekt/detekt) to analyze the source code, with
the configuration that is stored in the [detekt.yml](config/detekt/detekt.yml) file (the file has
been generated with the `detektGenerateConfig` task). It also uses the **detekt-formatting** plugin
which includes the ktlint rules (see https://detekt.dev/docs/rules/formatting/).

## CI ⚙️

The app uses [**GitHub Actions**](https://github.com/cortinico/kotlin-android-template/actions) as
CI.

These are currently the following workflows available:
- [Validate Gradle Wrapper](.github/workflows/gradle-wrapper-validation.yaml) - Will check that the gradle wrapper has a valid checksum
- [Pre Merge Checks](.github/workflows/pre-merge.yaml) - Will run the `build` and `check` tasks.

## Contributing 🤝
Feel free to open a issue or submit a pull request for any bugs/improvements.
