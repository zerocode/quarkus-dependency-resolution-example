pluginManagement {
    val quarkusPluginVersion: String by settings
    val quarkusPluginId: String by settings
    repositories {
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
    }
    plugins {
        id(quarkusPluginId) version quarkusPluginVersion
    }
}

rootProject.name = "quarkus-dependency-resolution-example"

include(
    ":order-service",
    ":order-service-test"
)
