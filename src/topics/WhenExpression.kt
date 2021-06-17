package topics

/**
 * @author Suren Kalaychyan
 */
fun main() {
    testWhen(1)
    testWhen("Hello_World")
    testWhen(15.40)
    testWhen(50)
    testWhen(true)
}

fun testWhen(input: Any) {
    when (input) {
        1 -> println("One")
        2 -> println("Two")
        15.40 -> println("15.40")
        in 10..100 -> println("From 10 to 100")
        is String -> println("Was string = ${input}")
        else -> println("Something else")
    }
}