open class Inheritance {
    open fun sayHello() = println("Hello World!")
}

class ChildClass() : Inheritance()

fun main() {

    val childClass = ChildClass()
    childClass.sayHello()

    val childInheritance = ChildInheritance("Alireza","Karimi")
    childInheritance.eat()
}

/** New  */
open class Parent(firstname: String) {
    open val firstname = "Hamidreza"

    open fun eat() {
        println(firstname)
    }
}

class ChildInheritance(firstname: String, val lastname: String) : Parent(firstname) {
    val fullName
    get() = "$firstname $lastname"

    override fun eat() {
        super.eat()
        println(fullName)
    }
}