package com.example.test_preinterview_nitipong

/**
 *
 */
fun main() {
    val number1 = 9119
    val square1 = squareDigits(number1)
    println(square1)

    val number2 = 0
    val square2 = squareDigits(number2)
    println(square2)
}

fun squareDigits(n: Int): Int {
    var result = 0
    var multiplier = 1

    var num = n
    while (num > 0) {
        val digit = num % 10
        val squared = digit * digit
        result += squared * multiplier
        multiplier *= 10
        num /= 10
    }

    return result
}


