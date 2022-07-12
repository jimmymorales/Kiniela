plugins {
	id("com.android.application") version "7.4.0-alpha08" apply false
	id("com.android.library") version "7.4.0-alpha08" apply false
	kotlin("android") version "1.6.21" apply false
	id("io.gitlab.arturbosch.detekt") version "1.21.0-RC2"
}

subprojects {
	apply {
		plugin("io.gitlab.arturbosch.detekt")
	}

	detekt {
		config = rootProject.files("config/detekt/detekt.yml")
	}

	dependencies {
		detektPlugins("io.gitlab.arturbosch.detekt:detekt-formatting:1.21.0-RC2")
	}
}
