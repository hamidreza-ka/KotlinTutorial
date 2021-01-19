import java.awt.Button

interface MyInterface {
    // abstract property
    val message: String

    val myVar : String
    get() = "MyVar"

    //abstract method
    fun goThing(): String

    fun sayHello() {
        println("Hello World!")
    }
}

open class MyInterfaceImp(a : Int) : MyInterface{

    override val message: String = "Happy Birthday !!"

    override fun goThing(): String {
       return "${message}, You can Go and Think"
    }

}

fun main(){

    val myInterfaceImp = MyInterfaceImp(5)
    println("\nmessage : ${myInterfaceImp.goThing()}")

    /** NEW  */

    // anonymous class - interface
    val simpleOnClickListener = object : MyInterface{
        override val message: String
            get() = TODO("Not yet implemented")

        override fun goThing(): String {
            TODO("Not yet implemented")
        }
    }

    // anonymous class - class
    // all anonymous classes are inner class and have access to property of their parent class
    val oneMethod = object : MyInterfaceImp(20){}
}
