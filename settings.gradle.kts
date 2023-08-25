pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Learn App"
include(":app")
include(":core")
include(":feature")

include(":core:ui")
include(":core:presentation")
include(":core:domain")
include(":core:data")
include(":core:datasource")

include(":feature:newfeature")
include(":feature:newfeature:ui")
include(":feature:newfeature:presentation")
include(":feature:newfeature:domain")
include(":feature:newfeature:data")
include(":feature:newfeature:datasource")

include(":feature:card")
include(":feature:card:ui")
include(":feature:card:presentation")
include(":feature:card:domain")
include(":feature:card:data")
include(":feature:card:datasource")

include(":navigation")
include(":common")
include(":core:database")
