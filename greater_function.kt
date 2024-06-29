fun main() {
    val large=greater(4,6)
    println("Greater:$large")
}
fun greater(num1 : Int,num2 : Int) : Int
{
    return if(num1 > num2) num1 else num2
}