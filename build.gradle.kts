plugins {
    id("java")
    id("java-library")
    id("maven-publish")
}

group = "com.noahhendrickson"
version = "0.1.0-alpha.9"

repositories {
    mavenCentral()
}

dependencies {
    api("com.fasterxml.jackson.core:jackson-databind:2.18.3")
    api("com.fasterxml.jackson.core:jackson-core:2.18.3")
    api("com.fasterxml.jackson.core:jackson-annotations:2.18.3")
    api("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.18.3")

    implementation("net.dv8tion:JDA:5.3.1") {
        exclude(module = "opus-java")
    }

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
            
            groupId = project.group.toString()
            artifactId = project.name
            version = project.version.toString()
        }
    }

    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/NoahH99/warcoat-common")
            credentials {
                username = System.getenv("GITHUB_USERNAME")
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
}