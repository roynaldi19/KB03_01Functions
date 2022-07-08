fun main() {
    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    val eager = decorations.filter { it[0] == 'p' }
    println("eager: $eager")
    println()

    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("filtred : $filtered")
    val newList = filtered.toList()
    println("newList : $newList")
    println()

    val lazyMap = decorations.asSequence().map {
        println("access: $it")
        it

    }
    println("lazy: $lazyMap")
    println("-----")
    println("first: ${lazyMap.first()}")
    println("-----")
    println("all: ${lazyMap.toList()}")



}
