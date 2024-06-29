fun main() {
    val numbers = listOf(4,6,8,11,14)
    val add = sumOfList(numbers)
    println("Sum:$add")
}
fun sumOfList(numbers : List<Int>) : Int
{
    var sum : Int = 0
    for(i in numbers)
    {
        sum += i
    }
    return sum
}