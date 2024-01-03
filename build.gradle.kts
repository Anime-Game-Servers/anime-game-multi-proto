plugins {
    kotlin("multiplatform") version "1.9.21"
    id("com.google.devtools.ksp") version "1.9.21-1.0.16"
    id("maven-publish")
}

// until the rework for proto handlng is done, we use this to compile packages for specific game versions
val protoVersion = 32
group = "org.anime_game_servers"
version = "0.1.$protoVersion"

repositories {
    mavenLocal()
    mavenCentral()
}

kotlin {
    jvm {
        jvmToolchain(17)
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
            getTasksByName("jvmJar", true).forEach{
                it.setProperty("zip64", true)
            }
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
    /*withType<org.jetbrains.kotlin.gradle.dsl.KotlinCompile<*>> {
        if (name != "kspCommonMainKotlinMetadata")
            dependsOn("kspCommonMainKotlinMetadata")
    }*/
    sourcesJar{
        dependsOn("kspCommonMainKotlinMetadata")
    }
}

publishing {
    repositories {
        maven {
            name = "agsmvnrelease"
            url = uri("https://mvn.animegameservers.org/releases")
            credentials(PasswordCredentials::class)
            authentication {
                create<BasicAuthentication>("basic")
            }
        }
    }
    publications {
        create<MavenPublication>("maven") {
            from(components["kotlin"])
            artifactId = "multi-proto"
        }
    }
}
