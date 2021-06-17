package topics

import java.util.stream.Stream

/**
 * @author Suren Kalaychyan
 */
fun main() {
    println(testSimple())
    println(testSimple1())
    println(testSimple2(7, 7))
    println(testSimple3(8, 8))

    println(testString(9))

    println(testNamedArguments(1, 2, 3))
    println(testNamedArguments(y = 2, z = 3, x = 1))

    testDefaultArguments()
    testDefaultArguments(5)
    testDefaultArguments(x = 6)
    testDefaultArguments(y = 7, x = 8)

    printEven(1, 2, 3, 4)
    print("===============")
    printEven(*intArrayOf(1, 2, 3, 4), 5, 6, 7, 8, 9)
}

fun testSimple(): Int {
    return 5 + 5
}

fun testSimple1(): Int = 6 + 6

fun testSimple2(x: Int, y: Int): Int = x + y

fun testSimple3(x: Int, y: Int) = x + y

fun testString(x: Int): String {
    return "String is $x"
}

fun testNamedArguments(x: Int, y: Int, z: Int): List<Int> {
    return listOf(x, y, z)
}

//void
fun testDefaultArguments(x: Int = 1, y: Int = 2) {
    println(x + y)
}

fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false): String {
    return (if (toUpperCase) name.toUpperCase() else name) + number
}

// vararg
fun printEven(vararg numbers: Int) {
    numbers.forEach { e -> if (e % 2 == 0) println(e) }
}