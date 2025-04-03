package org.spozodev.templatecmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform