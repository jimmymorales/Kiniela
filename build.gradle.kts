buildscript {
    extra.apply {
        set("compose_version", "1.2.0-beta01")
    }
}

plugins {
    id("com.android.application") version "7.4.0-alpha08" apply false
    id("com.android.library") version "7.4.0-alpha08" apply false
    kotlin("android") version "1.6.21" apply false
}
