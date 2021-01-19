import netscape.javascript.JSObject

//Simple function
fun myFun(): String {
    return "Hello World!"
}

//Lambda function -- val name : (arguments) -> return type = { Statements }
val lambdafun: (String) -> Unit = { s -> println(myFun() + s) }

private val numbers = arrayOf(1, 6, 9, 26)


fun main() {

    lambdafun(" Hamidreza")

    /** NEW */


    // inline function
    numbers.first {
        it > 6
    }

    // lambda function
    val myLambdaFun: (Int, Int) -> String = { x, y -> "Your x:$x and Your y:$y and Area:${x * y}" }
    println("\n${myLambdaFun(5, 3)}")

    // this method has 2 Param : 1- generic param  2- lambda param
    // dont need to write lambda param in () and we can write it in {}
    val result = numbers.fold(5) { sum, i -> sum + i }
    println("Result -> $result")


    //anonymous function
    // in this method we can Specify return type but in lambda function no
    val ananymousFun = fun(sum: Int, i: Int): Int { return sum + i }


}





