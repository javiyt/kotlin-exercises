package pairless

fun findPairless(a: IntArray): Int {
    return a.groupBy { it -> it }.filter { it.value.size == 1 }.map { it.key }.first()
}