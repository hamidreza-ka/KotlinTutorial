import netscape.javascript.JSException
import netscape.javascript.JSObject

private val numbers = arrayOf(1,5,9,33)

fun main(jsObject: JSObject) {

    numbers.print()

    //High Order function
    wrapInTryCatch {
        jsObject.getMember("asd")
        jsObject.getMember("bcd")
    }
}

// Extension function
fun Array<Int>.print() {
    this.forEach {
        println(it)
    }
}

//High Order function ->   fun  : arguments -> returnType (put our code into try catch block)
//inline keyword prevent method from get instance in every call method - better to use inline keyword at all except few cases
inline fun wrapInTryCatch(code : () -> Unit){
    try {
        code()
    }catch (jsExeption : JSException){
        println(jsExeption)
    }

}