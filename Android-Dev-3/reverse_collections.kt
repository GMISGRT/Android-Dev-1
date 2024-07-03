fun main() {
    var numberList = listOf(1,2,3,4)
    println(numberList)
    var reverseList = reverse(numberList)
    println(reverseList)
}
fun reverse(numberList : List<Int>) : List<Int> = numberList.reversed()
