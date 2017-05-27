package maxindex

fun indexOfMax(a: IntArray): Int? {
    return if (a.isNotEmpty()) a.lastIndexOf(a.sorted().last()) else null
}