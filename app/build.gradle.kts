plugins {
	id("com.android.application")
	kotlin("android")
}

android {
	namespace = "dev.jimmymorales.kiniela"
	compileSdk = 32

	defaultConfig {
		applicationId = "dev.jimmymorales.kiniela"
		minSdk = 24
		targetSdk = 32
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
		sourceCompatibility = JavaVersion.VERSION_1_8
		targetCompatibility = JavaVersion.VERSION_1_8
	}
	kotlinOptions {
		jvmTarget = "1.8"
	}
	buildFeatures {
		compose = true
	}
	composeOptions {
		kotlinCompilerExtensionVersion = libs.versions.compose.get()
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
