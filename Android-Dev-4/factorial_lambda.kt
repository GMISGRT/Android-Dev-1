fun factorial(n: Int): Int {
    val fact: (Int) -> Int = { if (it == 0) 1 else it * factorial(it - 1) }
    return fact(n)
}

fun main() {
    println(factorial(5))
}