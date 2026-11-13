
import org.jetbrains.gradle.ext.Gradle
import org.jetbrains.gradle.ext.runConfigurations
import org.jetbrains.gradle.ext.settings
plugins {
    id("org.jetbrains.gradle.plugin.idea-ext") version "1.4.1"
    id("java")
}

group = "net.altoncook.measurelib"
version = "0.1"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:6.0.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

idea {
    project {
        settings {
            runConfigurations {
                register<Gradle>("Test") {
                    projectPath = rootProject.projectDir.absolutePath
                    taskNames = listOf("test")
                }
                register<Gradle>("Build") {
                    projectPath = rootProject.projectDir.absolutePath
                    taskNames = listOf("build")
                }
            }
        }
    }
}

tasks.test {
    useJUnitPlatform()
}