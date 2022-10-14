fun main() {
    //Ex1
    fun printFullName(firstName: String, lastName: String): String {
        return "$firstName $lastName"
    }

    val firstName: String = "Daniil"
    val lastName: String = "S"

    //Ex2
    println(printFullName(firstName, lastName))

    //Ex3
    fun calculateFullName(firstName: String, lastName: String): String {
        return "$firstName $lastName"
    }

    val fullName: String = calculateFullName(firstName, lastName)
    println(fullName)

    //Ex4
    fun calculateFullNameNew(firstName: String, lastName: String): Pair<String, Int> {
        val fullName = "$firstName $lastName"
        return Pair(fullName, fullName.length)
    }

    val fullNameNew = calculateFullNameNew(firstName, lastName)
    println(fullNameNew)
}