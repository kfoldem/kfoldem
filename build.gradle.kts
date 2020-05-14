plugins {
    // Apply the Kotlin JVM plugin to add support for Kotlin.
    id("org.jetbrains.kotlin.jvm") version "1.3.71"
    id("org.jlleitschuh.gradle.ktlint") version "9.2.1"

    // Apply the application plugin to add support for building a CLI application.
    application

    // Used to build an all-in-one jar (vs. having to link to separate jars)
    id("com.github.johnrengelman.shadow") version "5.2.0"
}

repositories {
    // Use jcenter for resolving dependencies.
    // You can declare any Maven/Ivy/file repository here.
    jcenter()
}

dependencies {
    // Align versions of all Kotlin components
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // Use the Kotlin test library.
    testImplementation("org.jetbrains.kotlin:kotlin-test")

    // Use the Kotlin JUnit integration.
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

buildscript {
    repositories {
        maven("https://plugins.gradle.org/m2/")
    }
    dependencies {
        classpath("org.jlleitschuh.gradle:ktlint-gradle:9.2.1")
        classpath("com.github.jengelman.gradle.plugins:shadow:5.2.0")
    }
}

application {
    // Define the main class for the application.
    mainClassName = "kfoldem.AppKt"
}
