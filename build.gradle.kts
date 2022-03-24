import com.soywiz.korge.gradle.*

buildscript {
    val korgePluginVersion: String by project

    repositories {
        mavenLocal()
        mavenCentral()
        google()
        maven { url = uri("https://plugins.gradle.org/m2/") }
    }
    dependencies {
        classpath("com.soywiz.korlibs.korge.plugins:korge-gradle-plugin:$korgePluginVersion")
    }
}

apply<KorgeGradlePlugin>()

korge {
    id = "io.github.rezmike.game2048"
    name = "2048"
    icon = file("src/commonMain/resources/korge.png")

    targetJvm()
    targetJs()
}
