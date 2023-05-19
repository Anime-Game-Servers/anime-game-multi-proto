import org.gradle.kotlin.dsl.sourceSets

plugins {
    kotlin("multiplatform") version "1.8.20"
    id("com.google.devtools.ksp") version "1.8.20-1.0.11"
}

group = "org.anime_game_servers"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvm {
        jvmToolchain(11)
        withJava()
        testRuns["test"].executionTask.configure {
            useJUnitPlatform()
        }
    }
    js(IR) {
        browser {
            commonWebpackConfig {
                cssSupport {
                    enabled.set(true)
                }
            }
        }
    }
    val hostOs = System.getProperty("os.name")
    val isMingwX64 = hostOs.startsWith("Windows")
    val nativeTarget = when {
        hostOs == "Mac OS X" -> macosX64("native")
        hostOs == "Linux" -> linuxX64("native")
        isMingwX64 -> mingwX64("native")
        else -> throw GradleException("Host OS is not supported in Kotlin/Native.")
    }

    
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("pro.streem.pbandk:pbandk-runtime:0.14.2")
                implementation(project(":annotations"))
            }
            kotlin.srcDir("build/generated/ksp/metadata/commonMain/kotlin/")
            sourceSets.configureEach {
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val jvmMain by getting {

        }
        val jvmTest by getting
        val jsMain by getting
        val jsTest by getting
        val nativeMain by getting
        val nativeTest by getting
    }
}
dependencies {
    add("kspCommonMainMetadata", project(":processor"))
}
tasks {
    withType<org.jetbrains.kotlin.gradle.dsl.KotlinCompile<*>> {
        if (name != "kspCommonMainKotlinMetadata")
            dependsOn("kspCommonMainKotlinMetadata")
    }
}
