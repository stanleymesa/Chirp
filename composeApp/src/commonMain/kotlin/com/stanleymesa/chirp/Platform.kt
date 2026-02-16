package com.stanleymesa.chirp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform