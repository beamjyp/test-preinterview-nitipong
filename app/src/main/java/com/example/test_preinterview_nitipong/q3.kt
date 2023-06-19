package com.example.test_preinterview_nitipong

/**
 *
 */
fun main() {
    val text1 = "This is an example!"
    val text1re = reverseString(text1)
    println(text1re)

    val text2 = "double spaces"
    val text2re = reverseString(text2)
    println(text2re)
}

fun reverseString(input: String): String {
    return input.reversed()
}