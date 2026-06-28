import org.jetbrains.kotlin.gradle.tasks.KotlinCompilationTask

plugins {
    kotlin("multiplatform")
    id("com.google.devtools.ksp")
}

group = "org.anime_game_servers.multi_proto"
version = libs.versions.anime.game.multi.proto.get()

ksp {
    arg("basePacket", "org.anime_game_servers.multi_proto.gi")
}

kotlin {
    jvmToolchain(libs.versions.jvmVersion.get().toInt())
    jvm {
        testRuns["test"].executionTask.configure {
            useJUnitPlatform()
        }
    }
    js {
        nodejs()
        browser {
            commonWebpackConfig {
                cssSupport {
                    enabled.set(true)
                }
            }
        }
    }
    mingwX64()
    linuxX64()
    linuxArm64()
    macosArm64()
    iosArm64()
    iosX64()


    val kspCommonMainGenerated = layout.buildDirectory
        .dir("generated/ksp/metadata/commonMain/kotlin")
    sourceSets {
        commonMain {
            dependencies {
                api(project(":base"))
                api(libs.bundles.common.ags.gi)
            }
            kotlin.srcDir(kspCommonMainGenerated)
            sourceSets.configureEach {
            }
        }
        commonTest {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}
dependencies {
    add("kspCommonMainMetadata", project(":processor_resources"))
}
tasks {
    sourcesJar{
        dependsOn("kspCommonMainKotlinMetadata")
    }
    getTasksByName("jvmSourcesJar", false).forEach {
        it.dependsOn("kspCommonMainKotlinMetadata")
    }
    getTasksByName("jsSourcesJar", false).forEach {
        it.dependsOn("kspCommonMainKotlinMetadata")
    }
    getTasksByName("nativeSourcesJar", false).forEach {
        it.dependsOn("kspCommonMainKotlinMetadata")
    }
    getTasksByName("mingwX64SourcesJar", false).forEach {
        it.dependsOn("kspCommonMainKotlinMetadata")
    }
    getTasksByName("linuxArm64SourcesJar", false).forEach {
        it.dependsOn("kspCommonMainKotlinMetadata")
    }
    getTasksByName("linuxX64SourcesJar", false).forEach {
        it.dependsOn("kspCommonMainKotlinMetadata")
    }
    getTasksByName("macosArm64SourcesJar", false).forEach {
        it.dependsOn("kspCommonMainKotlinMetadata")
    }
    getTasksByName("iosArm64SourcesJar", false).forEach {
        it.dependsOn("kspCommonMainKotlinMetadata")
    }
    getTasksByName("iosX64SourcesJar", false).forEach {
        it.dependsOn("kspCommonMainKotlinMetadata")
    }
    withType<KotlinCompilationTask<*>> {
        if (name != "kspCommonMainKotlinMetadata")
            dependsOn("kspCommonMainKotlinMetadata")
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["kotlin"])
            artifactId = "gi-packet-ids"
        }
    }
}
