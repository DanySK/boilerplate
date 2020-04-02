import de.fayard.dependencies.bootstrapRefreshVersionsAndDependencies

rootProject.name = "boilerplate"

buildscript {
    repositories { gradlePluginPortal() }
    dependencies.classpath("de.fayard:dependencies:+")
}

bootstrapRefreshVersionsAndDependencies()
