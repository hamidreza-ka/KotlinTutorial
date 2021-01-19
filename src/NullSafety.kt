

fun main() {

    // ? operator is safeCall
    // ?: (Elvis Operator) if variable was null, print that word we give Like 'Alireza'
    val msg : String? = "hasan"
    println(msg?.length?:"Alireza")

    msg?.let {
        msg.isEmpty()
        msg.length
        msg.plus(5)
    }

    // !! operator if variable was null, process finish with Exception
    val nullableStr : String? = null
    println(nullableStr!!.length)
}