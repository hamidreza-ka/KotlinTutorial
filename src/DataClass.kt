data class Student(val firstName: String, val lastName: String, val course: String, val score: Int)

fun main() {
    val student = Student("Hamidrza", "Karimi", "Android", 265)
    println(student)

    val (firstName, lastName) = student
    println("$firstName $lastName")

    // named params
    test(param3 = 23, param2 = "Karimi", param1 = "Hamidreza")
}

fun test(param1:String, param2:String, param3:Int){}