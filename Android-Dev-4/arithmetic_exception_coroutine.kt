import kotlinx.coroutines.*
fun main () 
{
    println(divide(4,2))
    println(divide(5,0))
}
fun divide(x : Int , y : Int) : Unit
{
    try
    {
        var res = x / y
        println(res)
    }
    catch(e : ArithmeticException)
    {
        println(e.message)
    }
}