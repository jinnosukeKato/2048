import com.soywiz.korge.gradle.*

buildscript {
    repositories {
        mavenLocal()
        maven { url = uri("https://dl.bintray.com/korlibs/korlibs") }
        maven { url = uri("https://plugins.gradle.org/m2/") }
        mavenCentral()
        google()
    }
    dependencies {
        classpath("com.soywiz.korlibs.korge.plugins:korge-gradle-plugin:1.15.0.0")
    }
}

apply<KorgeGradlePlugin>()

korge {
    id = "io.github.rezmike.2048"
    name = "2048"
    icon = file("src/commonMain/resources/korge.png")
}
