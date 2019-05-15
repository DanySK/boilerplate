plugins {
	`java-library`
	signing
	`maven-publish`
	`project-report`
	`builod-dashboard`
	jacoco
	id("org.danilopianini.git-sensitive-semantic-versioning") version "0.1.0"
	id("org.danilopianini.javadoc.io-linker") version "0.1.4"
	id("org.danilopianini.publish-on-central") version "0.1.1"
}

gitSemVer {
    version = computeGitSemVer()
}

repositories {
    mavenCentral()
}

dependencies {
    api("com.google.guava:guava:${extra["guavaVersion"]}")
    implementation("com.github.spotbugs:spotbugs:${extra["spotbugsVersion"]}")
    testImplementation("junit:junit:${extra["junitVersion"]}")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

publishOnCentral {
    projectDescription.set(extra["projectDescription"].toString())
    projectLongName.set("Java boilerplate code")
}

publishing {
    publications {
        withType<MavenPublication> {
            pom {
                developers {
                    developer {
                        name.set("Danilo Pianini")
                        email.set("danilo.pianini@gmail.com")
                        url.set("http://www.danilopianini.org/")
                    }
                }
            }
        }
    }
}
