package com.github.aakira.kotlinnativesample.common

expect fun platformName(): String

public class common {
    public fun createApplicationScreenMessage(): String {
        return "Kotlin Rocks on ${platformName()}"
//        return "Android"
    }
}