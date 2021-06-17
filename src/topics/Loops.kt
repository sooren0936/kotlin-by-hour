package topics

/**
 * @author Suren Kalaychyan
 */
fun main() {
    // for each
    val items = listOf("apple", "banana", "orange")
    var otherItems = mutableListOf("apple", "banana", 40)

    for (item in items) {
        println(item)
    }

    // while
    var index = 0
    while (index < items.size) {
        println("Item at $index is ${items[index++]}")
    }

    // ranges
    println(5 in 3..10)

    for(i in 3..10) {
        println(i)
    }

    for(i in 1 until 10){
        println(i)
    }

    for(i in 10 downTo 1) {
        println(i)
    }

    for (i in 0..100 step 10)
        println(i)
}