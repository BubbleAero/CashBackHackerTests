plugins {
    id ("java")
}

group = "ru.netology.service"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation ("org.junit.jupiter:junit-jupiter-api:5.6.1")
    testRuntimeOnly ("org.junit.jupiter:junit-jupiter-engine:5.6.1")

    testImplementation ("junit:junit:4.13.2")
    testRuntimeOnly ("org.junit.vintage:junit-vintage-engine:5.7.0")
}

tasks.test {
    useJUnitPlatform()
}
