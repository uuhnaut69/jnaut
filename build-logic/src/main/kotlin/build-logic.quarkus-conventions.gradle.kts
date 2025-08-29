plugins {
    id("build-logic.java-common-conventions")
    id("io.quarkus")
    id("org.kordamp.gradle.jandex")
}

dependencies {
    implementation(platform("io.quarkus.platform:quarkus-bom:3.25.4"))
    implementation("io.quarkus:quarkus-rest")
    implementation("io.quarkus:quarkus-config-yaml")
    implementation("io.quarkus:quarkus-arc")
    testImplementation("io.quarkus:quarkus-junit5")
    testImplementation("io.rest-assured:rest-assured")
}

tasks.withType<Test> {
    systemProperty("java.util.logging.manager", "org.jboss.logmanager.LogManager")
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    options.compilerArgs.add("-parameters")
}
