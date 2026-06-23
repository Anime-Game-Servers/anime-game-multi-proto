plugins {
    kotlin("jvm")
}

group = "org.anime_game_servers.multi_proto"
version = libs.versions.anime.game.multi.proto.get()

kotlin {
    jvmToolchain(libs.versions.jvmVersion.get().toInt())
}

tasks.test {
    useJUnitPlatform()
}

dependencies {
    implementation(project(":base"))
    implementation(project(":processor_common"))
    implementation(libs.bundles.ksp.processor)
    implementation(libs.bundles.common.ags.base)
    testImplementation(kotlin("test"))
}