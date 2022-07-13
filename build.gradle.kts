@Suppress("DSL_SCOPE_VIOLATION")
plugins {
	id("com.android.application") version "7.4.0-alpha08" apply false
	id("com.android.library") version "7.4.0-alpha08" apply false
	kotlin("android") version "1.6.21" apply false
	alias(libs.plugins.detekt)
}

val detektFormatting = libs.detekt.formatting

subprojects {
	apply {
		plugin("io.gitlab.arturbosch.detekt")
	}

	detekt {
		config = rootProject.files("config/detekt/detekt.yml")
	}

	dependencies {
		detektPlugins(detektFormatting)
	}
}
