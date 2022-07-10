## Static Analysis 🔍

This app is using [**detekt**](https://github.com/detekt/detekt) to analyze the source code, with 
the configuration that is stored in the [detekt.yml](config/detekt/detekt.yml) file (the file has 
been generated with the `detektGenerateConfig` task). It also uses the **detekt-formatting** plugin 
which includes the ktlint rules (see https://detekt.dev/docs/rules/formatting/).
