fun main(args: Array<String>) {
    swim()   // uses default speed
    swim("slow")   // positional argument
    swim(speed="turtle-like")   // named parameter


}

fun swim(speed: String = "fast") {
    println("swimming $speed")
}