plugins {
    kotlin("jvm")
    kotlin("kapt")
}
repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":annotations"))
    implementation("com.google.devtools.ksp:symbol-processing-api:1.8.20-1.0.11")
}
