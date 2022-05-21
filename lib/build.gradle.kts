plugins {
    id("org.jetbrains.kotlin.jvm") version "1.6.0"

    `java-library`
}

repositories {
    mavenCentral()
}

group = "io.github.orioncraftmc.client.api"
version = "1.0.0-SNAPSHOT"

dependencies {
    // Align versions of all Kotlin components
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

}