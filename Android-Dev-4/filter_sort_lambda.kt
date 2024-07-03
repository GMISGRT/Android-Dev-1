fun filterAndTransformStrings(strings: List<String>, startChar: Char): List<String> {
    return strings.filter { it.startsWith(startChar, ignoreCase = true) }
        .map { it.uppercase() }
        .sorted()
}

fun main() {
    val strings = listOf("hello", "nihao", "hola")
    println(filterAndTransformStrings(strings, 'h'))
}