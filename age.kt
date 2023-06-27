fun main(args: Array<String>) {
    var age = readLine()!!.toInt()

    var result = when{
        age in 0..11 -> "Child"
        age in 12..17 -> "Teen"
        age in 18..64 -> "Adult"
        age >= 65 -> "Senior"
        else -> "Invalid age"
    }

    println(result)
    
}