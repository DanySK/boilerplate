plugins {
	`java-library`
	signing
	`maven-publish`
	`project-report`
	`build-dashboard`
	pmd
	checkstyle
	jacoco
	id("de.fayard.buildSrcVersions") version Versions.de_fayard_buildsrcversions_gradle_plugin
	id("org.danilopianini.git-sensitive-semantic-versioning") version Versions.org_danilopianini_git_sensitive_semantic_versioning_gradle_plugin
	id("org.danilopianini.javadoc.io-linker") version Versions.org_danilopianini_javadoc_io_linker_gradle_plugin
	id("org.danilopianini.publish-on-central") version Versions.org_danilopianini_publish_on_central_gradle_plugin
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
