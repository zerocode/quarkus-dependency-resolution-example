plugins {
    id("io.quarkus") version "1.9.1.Final"
}

apply {
    plugin("io.quarkus")
}

dependencies {
    implementation(enforcedPlatform("io.quarkus:quarkus-universe-bom:1.9.1.Final"))
    implementation("io.quarkus:quarkus-kotlin")
    implementation("io.quarkus:quarkus-resteasy")
}