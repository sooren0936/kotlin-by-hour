package topics

/**
 * @author Suren Kalaychyan
 */
fun main() {
    val p1 = Person("Tom", "Jones", 35)
    print(p1.firstName)

    val child = Person("Child", "Child", 35)
    print(child.firstName)

    val empty = Person()
    println(empty.firstName)


    val rectangleFirst = Rectangle(5.0, 2.0)
    println("The perimeter is ${rectangleFirst.perimeter}")

    var rectangleSecond = Rectangle(5.0, 2.0)
    println(rectangleFirst == rectangleSecond)
}

//Primary constructor
class Person(val firstName: String, val lastName: String, var age: Int) {
    var children: MutableList<Person> = mutableListOf()

    init {
        println("Person is created ${firstName}")
    }

    constructor(firstName: String, lastName: String, age: Int, child: Person) :
            this(firstName, lastName, age) {
        children.add(child)
    }

    // Empty constructor
    constructor() : this("empty", "", -1)
}

data class Rectangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2

    var test = 1
        get() = field + 1 // field == this
        set(value) {
            if (value < 0) println("Negative value")
            field = value
        }

    fun area() = height * length
}