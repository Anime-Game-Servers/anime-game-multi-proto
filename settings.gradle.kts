
pluginManagement {
    plugins {
        id("com.google.devtools.ksp") version "1.8.20-1.0.11"
        kotlin("jvm") version "1.8.20"
    }
    repositories {
        gradlePluginPortal()
        google()
    }
}

rootProject.name = "multi-proto"

include(":annotations")
include(":processor")

project(":processor").projectDir = File("codeGenerator/processor")
project(":annotations").projectDir = File("codeGenerator/annotations")
