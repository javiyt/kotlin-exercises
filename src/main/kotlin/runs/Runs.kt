package runs

fun runs(a: IntArray): Int {
    return a.indices.filter { it == 0 || a[it] != a[it - 1] }.size
}