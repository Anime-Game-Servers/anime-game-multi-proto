plugins {
    kotlin("multiplatform")
    id("com.google.devtools.ksp")
}

// until the rework for proto handling is done, we use this to compile packages for specific game versions
val protoVersion = 32
group = "org.anime_game_servers.multi_proto"
version = "0.3.$protoVersion"

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
    js(IR) {
        nodejs()
    }
    mingwX64()
    linuxX64()
    linuxArm64()

    repositories {
        mavenLocal()
        mavenCentral()
    }
    
    sourceSets {
        val commonMain by getting {
            dependencies {
                compileOnly(project(":gi"))
                compileOnly("org.anime_game_servers.core:gi:0.2")
                compileOnly("pro.streem.pbandk:pbandk-runtime:0.16.0")
            }

            kotlin.setSrcDirs(listOf(
                "../gi/src/commonMain/kotlin", // .data classes
                "build/generated/ksp/metadata/commonMain/kotlin/",
                "compiled_proto/V$protoVersion/"
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
            artifactId = "gi-proto"
        }
    }
}
