fun main() {

    val array = listOf<Int>(11,21,36,54)
    array.forEachIndexed { index, item ->
        println("the element $index -> $item")
    }


    val num = 10

    val result = when (num) {

        10 -> "Hello"
        5, 6 -> "less"
        in 11..20 -> "big"
        !in 11..20 -> "not big"
        is Int -> "Int"
        someFunction() -> "a == someFunction"
        else -> "ah"

    }

    val result2 = when (apiRequestResult()) {
        ApiRequestStates.SUCCESS -> "Success"
        ApiRequestStates.ERROR -> "Error"
    }


}

fun someFunction() = 15
fun apiRequestResult() = ApiRequestStates.SUCCESS

enum class ApiRequestStates {
    SUCCESS, ERROR
}