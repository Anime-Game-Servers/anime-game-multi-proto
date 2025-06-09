
pluginManagement {
    plugins {
        id("com.google.devtools.ksp") version "2.1.20-2.0.0"
        kotlin("multiplatform") version "2.1.20" apply false
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
include(":processor-proto")
include(":base")
include(":gi")
include(":proto")

project(":processor").projectDir = File("codeGenerator/processor")
project(":processor-proto").projectDir = File("codeGenerator/processor-proto")
project(":processor-common").projectDir = File("codeGenerator/common")
