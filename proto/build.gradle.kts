plugins {
    kotlin("multiplatform")
    id("com.google.devtools.ksp")
}

group = "org.anime_game_servers.multi_proto"
version = "0.5.0-SNAPSHOT"

ksp {
    arg("basePacket", "org.anime_game_servers.multi_proto.proto")
}

kotlin {
    jvmToolchain(17)
    jvm {
        withJava()
        testRuns["test"].executionTask.configure {
            useJUnitPlatform()
        }
    }
    js(IR) {}
    // mingwX64() not supported by pbandk-runtime 0.14.2
    linuxX64()
//    linuxArm64()

    repositories {
        mavenLocal()
        mavenCentral()
    }
    
    sourceSets {
        val commonMain by getting {
            dependencies {
                api(project(":gi"))
                implementation(project(":base"))
                compileOnly("org.anime_game_servers.core:gi:0.1")
                implementation("pro.streem.pbandk:pbandk-runtime:0.16.0")
            }

            kotlin.setSrcDirs(listOf(
                "../gi/src/commonMain/kotlin", // .data classes
                "build/generated/ksp/metadata/commonMain/kotlin/",
                "build/generated/v53/",
//                "build/generated/v32"
            ))
            kotlin.exclude("org/anime_game_servers/multi_proto/gi/data/**/*")
            kotlin.exclude("org/anime_game_servers/multi_proto/gi/utils/**/*")
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val jvmMain by getting {
            dependencies {
                compileOnly(project(":gi"))
            }
            getTasksByName("jvmJar", true).forEach{
                it.setProperty("zip64", true)
            }
        }
        val jvmTest by getting
    }
}
dependencies {
    add("kspCommonMainMetadata", project(":processor-proto"))
}
tasks {
    sourcesJar{
        dependsOn("kspCommonMainKotlinMetadata")
    }
    getTasksByName("jvmSourcesJar", false).forEach {
        it.dependsOn("kspCommonMainKotlinMetadata")
    }
//    getTasksByName("jsSourcesJar", false).forEach {
//        it.dependsOn("kspCommonMainKotlinMetadata")
//    }
    getTasksByName("nativeSourcesJar", false).forEach {
        it.dependsOn("kspCommonMainKotlinMetadata")
    }
    withType<org.jetbrains.kotlin.gradle.dsl.KotlinCompile<*>> {
        if (name != "kspCommonMainKotlinMetadata")
            dependsOn("kspCommonMainKotlinMetadata")
    }
    register<Jar>("fatJar") {
        archiveClassifier.set("all")  // Optional: create my-app-all.jar

        dependsOn("kspCommonMainKotlinMetadata")

        // Include your main project's classes
        from(sourceSets.getByName("main").output)

        // Include dependencies (while excluding external/unused)
        from(configurations.getByName("runtimeClasspath").map {
            if (it.isDirectory) it else zipTree(it)
        }) {
            exclude("META-INF/**/*") // Excludes all META-INF files
            exclude("org/anime_game_servers/multi_proto/core/**/*")
            exclude("org/anime_game_servers/multi_proto/gi/messages/**/*")
            exclude("org/anime_game_servers/multi_proto/gi/packet_id/**/*")
            exclude("org/anime_game_servers/multi_proto/gi/utils/**/*")
        }

        duplicatesStrategy = DuplicatesStrategy.EXCLUDE
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
