plugins {
    application
    java
}

repositories {
    mavenCentral()
}

dependencies {
    // JUnit 4 (matches your current test code)
    testImplementation("junit:junit:4.13.2")

    // Optional: Guava if you're using it in your app code
    implementation("com.google.guava:guava:32.1.3-jre")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

application {
    mainClass.set("com.example.App") // <- adjust to match your App.java package
}

tasks.test {
    useJUnit() // <- use JUnit 4
}
