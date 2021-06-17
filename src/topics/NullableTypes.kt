package topics

/**
 * @author Suren Kalaychyan
 */
fun main() {
    var a: String = "Hello"
    // a = null // NPE exception
    a.length

    var b: String? = "Hello"
    b = null
    // b.length

    // ? safe call
    b?.length

    //  ?: Elvis statement
    val l = b?.length ?: -1

    // !! - throw NPE

    b = if ((0..10).random() > 5) "asdf" else null

    val t = b!!.length
}