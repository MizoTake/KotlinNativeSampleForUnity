package com.sample.mizotake.kotlinnativeforunity

expect fun platformName(): String

public class common {
    public fun createApplicationScreenMessage(): String {
        return "Call Kotlin Native on ${platformName()}"
    }
}