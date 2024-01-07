plugins {
    kotlin("multiplatform")
    id("com.google.devtools.ksp")
}

// until the rework for proto handling is done, we use this to compile packages for specific game versions
val protoVersion = 32
group = "org.anime_game_servers.multi_proto"
version = "0.1.$protoVersion"

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
                implementation("org.anime_game_servers.core:gi:0.1")
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
    //add("kspJvm", project(":processor"))
    //add("kspJs", project(":processor"))
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
    withType<org.jetbrains.kotlin.gradle.dsl.KotlinCompile<*>> {
        if (name != "kspCommonMainKotlinMetadata")
            dependsOn("kspCommonMainKotlinMetadata")
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["kotlin"])
            artifactId = "gi-multi-proto"
        }
    }
}
