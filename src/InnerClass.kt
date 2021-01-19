class MyClass{
    private val myMessage = "Hello World"

    // Error - dont have access to myMessage
    // class Nested{
    // fun printMessage()= myMessage
    // }

    inner class Nested{
        fun printMessage() = myMessage
    }
}

fun main() {
    val canNullable: MutableList<Int> = arrayListOf(1, 2, 3)
    val cantNullable: List<Int> = arrayListOf(1, 2, 3)
    var i = 2

    canNullable.clear()

    //Error
    //cantNullable.clear()


    val myClass = MyClass().Nested().printMessage()
    println(myClass)

}