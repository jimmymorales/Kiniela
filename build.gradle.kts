@Suppress("DSL_SCOPE_VIOLATION")
plugins {
	alias(libs.plugins.agp.app) apply false
	alias(libs.plugins.agp.library) apply false
	alias(libs.plugins.kgp) apply false
	alias(libs.plugins.detekt)
	alias(libs.plugins.gradle.doctor)
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
