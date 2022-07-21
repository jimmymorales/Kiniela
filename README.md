# Kiniela

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
