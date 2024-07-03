fun transformList(strings: List<String>, transform: (String) -> String): List<String> {
    return strings.map(transform)
}

fun main() {
    val strings = listOf("one", "two", "three")
    val result = transformList(strings) { it.uppercase() }
    println(result)  // Output: [ONE, TWO, THREE]
}