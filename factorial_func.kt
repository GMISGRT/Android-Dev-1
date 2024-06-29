fun main() {
    val fact = factorial(5)
    println("Factorial:$fact")
}
fun factorial(n : Int) : Int
{
    if (n <= 1)
    {
        return 1
    }
    else
    {
        return n * factorial(n-1)
    }
}