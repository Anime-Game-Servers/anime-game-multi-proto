
pluginManagement {
    plugins {
        id("com.google.devtools.ksp") version "2.1.0-1.0.29"
        //kotlin("jvm") version "1.9.22" apply false
        kotlin("multiplatform") version "2.1.0" apply false
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
include(":processor-common")
include(":base")
include(":gi")

project(":processor").projectDir = File("codeGenerator/processor")
project(":processor-common").projectDir = File("codeGenerator/common")
