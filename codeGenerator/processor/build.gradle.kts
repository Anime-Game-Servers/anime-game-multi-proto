plugins {
    kotlin("jvm")
    kotlin("kapt")
}
repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":annotations"))
    implementation("com.google.devtools.ksp:symbol-processing-api:1.9.21-1.0.16")
}
