fun fishFood(day: String) : String {
    var food = ""
    when(day) {
        "Monday" -> food = "flakes"
        "Tuesday" -> food = "pellets"
        "Wednesday" -> food = "redworms"
        "Thursday" -> food = "granules"
        "Friday" -> food = "mosquitoes"
        "Saturday" -> food = "plankton"
        "Sunday" -> food = "shrimp"
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