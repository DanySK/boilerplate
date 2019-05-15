plugins {
	`java-library`
	signing
	`maven-publish`
	`project-report`
	`build-dashboard`
	pmd
	checkstyle
	jacoco
	id("de.fayard.buildSrcVersions") version "0.3.2"
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
    api(Libs.guava)
    compileOnly(Libs.spotbugs_annotations)
    testImplementation(Libs.junit)
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

pmd {
    ruleSets = listOf()
    ruleSetConfig = resources.text.fromFile("config/pmd/pmd.xml")
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
