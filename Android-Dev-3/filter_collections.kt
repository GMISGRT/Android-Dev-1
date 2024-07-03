fun main() {
    var numberList = listOf(1,2,3,4)
    println(numberList)
    var newList = filter(numberList,2)
    println(newList)
}
fun filter(numberList : List<Int> , n : Int) : List<Int> = numberList.filter{ it >= n }
