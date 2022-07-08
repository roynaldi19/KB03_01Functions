fun fishFood (day : String) : String {
    val food : String = when (day) {
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "nothing"
    }
    return food
}


fun feedTheFish2() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")

}

fun main(args: Array<String>) {
    feedTheFish2()
}