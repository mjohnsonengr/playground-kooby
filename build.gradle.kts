import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
    application
}

group = "dev.mej"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    val joobyVersion = "2.15.1"
    implementation("io.jooby:jooby:$joobyVersion")
    implementation("io.jooby:jooby-netty:$joobyVersion")

    val log4jVersion = "2.17.2"
    implementation("org.apache.logging.log4j:log4j-core:$log4jVersion")
    implementation("org.apache.logging.log4j:log4j-api:$log4jVersion")
    implementation("org.apache.logging.log4j:log4j-slf4j-impl:$log4jVersion")

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}