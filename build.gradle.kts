plugins {
	`java-library`
	signing
	`maven-publish`
	`project-report`
	id("org.danilopianini.git-sensitive-semantic-versioning") version "0.1.0"
	id("org.danilopianini.javadoc.io-linker") version "0.1.4"
	id("org.danilopianini.publish-on-central") version "0.1.1"
}

repositories {
    mavenCentral()
}

dependencies {
    api("com.google.guava:guava:${extra["guavaVersion"]}")
    implementation("com.github.spotbugs:spotbugs:${extra["spotbugsVersion"]}")
    testImplementation("junit:junit:${extra["junitVersion"]}")
}

publishOnCentral {
    projectDescription.set(extra["projectDescription"].toString())
    projectLongName.set("Java boilerplate code")
}

gitSemVer {
    version = computeGitSemVer()
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
