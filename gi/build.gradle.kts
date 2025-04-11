plugins {
    kotlin("multiplatform")
    id("com.google.devtools.ksp")
}

// until the rework for proto handling is done, we use this to compile packages for specific game versions
val protoVersion = 32
group = "org.anime_game_servers.multi_proto"
version = "0.2.$protoVersion"

ksp {
    arg("basePacket", "org.anime_game_servers.multi_proto.gi")
}

kotlin {
    jvmToolchain(17)
    jvm {
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
    // mingwX64() not supported by pbandk-runtime 0.14.2
    linuxX64()
    linuxArm64()

    
    sourceSets {
        val commonMain by getting {
            dependencies {
                api(project(":base"))
                implementation("org.anime_game_servers.core:gi:0.1")
            }
            kotlin.srcDir("build/generated/ksp/metadata/commonMain/kotlin/")
            kotlin.exclude("org/anime_game_servers/multi_proto/gi/data/**/*")
            kotlin.exclude("org/anime_game_servers/multi_proto/gi/converters/**/*")
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val jvmMain by getting {
            dependencies {
                compileOnly("org.slf4j:slf4j-api:1.7.36")
            }
            getTasksByName("jvmJar", true).forEach{
                it.setProperty("zip64", true)
            }
        }
        val jvmTest by getting
        val jsMain by getting
        val jsTest by getting
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
