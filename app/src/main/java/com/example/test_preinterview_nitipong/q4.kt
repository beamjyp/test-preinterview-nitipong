package com.example.test_preinterview_nitipong

/**
 *
 */
fun main() {
    val sentence = "oh my gosh"
    val highScoreText = highScoreText(sentence)
    println(highScoreText)
}

fun highScoreText(sentence: String): String {
    val texts = sentence.split(" ")
    var highScore = 0
    var highText = ""

    for (text in texts) {
        val score = calculateScore(text)
        if (score > highScore) {
            highScore = score
            highText = text
        }
    }

    return highText
}

fun calculateScore(word: String): Int {
    var score = 0
    for (char in word) {
        score += char.code - 'a'.code + 1
    }
    return score
}

