fun Adder(x: Int): (Int) -> Int {
    return { y -> x + y }
}

fun main() {
    val add = Adder(5)
    println(add(10))
}