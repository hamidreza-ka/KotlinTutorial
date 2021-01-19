class Objects {

    // Singelton
    object Properties{
        fun sayHello() = println("Hello")
    }

    // Singelton & Static
    companion object{
        fun sayHelloWorld() = println("Hello World !")
    }

}

object appDatabase{
    fun test(){
        println("HEH")
    }
}

fun main(){
    //Objects.sayHello()
    Objects.sayHelloWorld()

    val appDatabase = appDatabase
    appDatabase.test()
}