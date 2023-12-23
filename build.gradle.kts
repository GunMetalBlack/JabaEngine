plugins {
    id("java")
}

group = "gunmetalblack.jabaengine"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

tasks.jar {
    manifest {
        attributes(
                "Main-Class" to "gunmetalblack.jabaengine.Main"
        )
    }
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}