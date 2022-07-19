@file:Suppress("UnstableApiUsage")

plugins {
	id("com.android.application")
	kotlin("android")
}

android {
	namespace = "dev.jimmymorales.kiniela"
	compileSdk = 33

	defaultConfig {
		applicationId = "dev.jimmymorales.kiniela"
		minSdk = 24
		targetSdk = 33
		versionCode = 1
		versionName = "1.0"

		testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
	}

	buildTypes {
		release {
			isMinifyEnabled = false
			proguardFiles(
				getDefaultProguardFile("proguard-android-optimize.txt"),
				"proguard-rules.pro"
			)
		}
	}
	compileOptions {
		sourceCompatibility = JavaVersion.VERSION_11
		targetCompatibility = JavaVersion.VERSION_11
	}
	kotlinOptions {
		jvmTarget = JavaVersion.VERSION_11.toString()
		allWarningsAsErrors = true
	}
	buildFeatures {
		compose = true
	}
	composeOptions {
		kotlinCompilerExtensionVersion = libs.versions.composeCompiler.get()
	}
	packagingOptions {
		resources {
			excludes += "/META-INF/{AL2.0,LGPL2.1}"
		}
	}
}

dependencies {
	// Compose
	implementation(libs.bundles.compose)
	debugImplementation(libs.bundles.compose.tooling)
	androidTestImplementation(libs.compose.ui.test.junit4)

	implementation(libs.androidx.core)
	implementation(libs.androidx.lifecycle)
	implementation(libs.androidx.activity.compose)

	testImplementation(libs.junit)
	androidTestImplementation(libs.androidx.test.junit)
	androidTestImplementation(libs.androidx.test.espresso)
}
