fun main(args: Array<String>) {
    var dirtyLevel = 19;
    dirtyLevel = updateDirty(dirtyLevel) { dirtyLevel -> dirtyLevel + 23}
    println(dirtyLevel)

}

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}
