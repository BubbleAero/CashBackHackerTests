plugins {
    id("java")
}

group = "ru.netology.service"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation ("org.testng:testng:7.7.0")
}

tasks.test {
    useTestNG()
    }