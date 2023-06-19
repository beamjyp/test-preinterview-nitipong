package com.example.test_preinterview_nitipong

/**
 *
 */
fun main() {
    val list = OddEvenList<Int>()

    val index1 = list.add(1)
    val index2 = list.add(2)
    val index3 = list.add(3)
    val index4 = list.add(4)

    val removed = list.remove(0)

    println(removed)

    val oddNumbers = list.getOdd<Int>()
    val evenNumbers = list.getEven<Int>()
    val randomList = list.getRandom<Int>()

    println("Odd Numbers:")
    for ((index, number) in oddNumbers.withIndex()) {
        println("Index $index: $number")
    }

    println("Even Numbers:")
    for ((index, number) in evenNumbers.withIndex()) {
        println("Index $index: $number")
    }

    println("Random List:")
    for ((index, element) in randomList.withIndex()) {
        println("Index $index: $element")
    }
}

class OddEvenList<T> {
    val elements: MutableList<T> = mutableListOf()

    fun add(input: T): Int {
        elements.add(input)
        return elements.indexOf(input)
    }

    fun remove(index: Int): Boolean {
        if (index in 0 until elements.size) {
            elements.removeAt(index)
            return true
        }
        return false
    }

    inline fun <reified R> getOdd(): Array<R> {
        return getFilteredArray { index, _ -> index % 2 != 0 }
    }

    inline fun <reified R> getEven(): Array<R> {
        return getFilteredArray { index, _ -> index % 2 == 0 }
    }

    inline fun <reified R> getRandom(): Array<R> {
        val randomelements = elements.shuffled()
        return randomelements.filterIsInstance<R>().toTypedArray()
    }

    inline fun <reified R> getFilteredArray(predicate: (Int, T) -> Boolean): Array<R> {
        val filteredElements = elements.filterIndexed(predicate)
        return filteredElements.filterIsInstance<R>().toTypedArray()
    }
}
