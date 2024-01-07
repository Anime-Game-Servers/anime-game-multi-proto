
pluginManagement {
    plugins {
        id("com.google.devtools.ksp") version "1.9.22-1.0.16"
        //kotlin("jvm") version "1.9.22" apply false
        kotlin("multiplatform") version "1.9.22" apply false
    }
    repositories {
        gradlePluginPortal()
        google()
    }
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}

rootProject.name = "multi-proto"

include(":processor")
include(":gi")

project(":processor").projectDir = File("codeGenerator/processor")
