package com.sample.mizotake.kotlinnativeforunity

expect fun platformName(): String

public class common {
    public fun createApplicationScreenMessage(): String {
        return "Kotlin Rocks on ${platformName()}"
    }
}