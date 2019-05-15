import kotlin.String

/**
 * Find which updates are available by running
 *     `$ ./gradlew buildSrcVersions`
 * This will only update the comments.
 *
 * YOU are responsible for updating manually the dependency version. */
object Versions {
    const val spotbugs_annotations: String = "4.0.0-beta1" 

    const val guava: String = "27.1-jre" 

    const val de_fayard_buildsrcversions_gradle_plugin: String = "0.3.2" 

    const val junit: String = "4.12" 

    const val org_danilopianini_git_sensitive_semantic_versioning_gradle_plugin: String = "0.1.0" 

    const val org_danilopianini_javadoc_io_linker_gradle_plugin: String = "0.1.4" 
            // available: "0.1.4-700fdb6"

    const val org_danilopianini_publish_on_central_gradle_plugin: String = "0.1.1" 

    /**
     *
     *   To update Gradle, edit the wrapper file at path:
     *      ./gradle/wrapper/gradle-wrapper.properties
     */
    object Gradle {
        const val runningVersion: String = "5.4.1"

        const val currentVersion: String = "5.4.1"

        const val nightlyVersion: String = "5.5-20190515115345+0000"

        const val releaseCandidate: String = ""
    }
}
