import kotlin.properties.Delegates

interface Base {
    fun printMe()
}

class BaseImp(private val name: String) : Base {
    override fun printMe() {
        println("Hello $name !")
    }
}

class Child(b: Base) : Base by b //when return type is a interface we should implement it by deligation

fun main() {

    // Lazy deligation      only in one thread i wanna use it
    val message: String by lazy(LazyThreadSafetyMode.NONE) {
        println("Hah Hah")
        "Happy Birthday!"
    }
    
    val b = BaseImp("Hamidreza $message")
    Child(b).printMe()

    println(message)


    /** NEW */
    var fName: String by Delegates.observable("<No Name>"){ _ , oldValue, newValue ->
        println("$oldValue -> $newValue")
    }

    fName = "Ali"
    fName = "Hasan"

    var lName: String by Delegates.vetoable("<No Name>"){ _ , oldValue, newValue ->
        println("$oldValue -> $newValue")
        newValue.length > 2
    }

    lName = "Ha"
    lName = "Karimi"
    lName = "Azadi"

    val user = UserName()
    println(user.newName)
   // user.oldName = "Hasan"
    println(user.newName)
}

class UserName{

    var newName : String = "Ali"
    // var oldName : String by this::newName
}