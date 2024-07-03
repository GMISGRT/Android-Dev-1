import kotlinx.coroutines.*
fun main() = runBlocking()
{
    var job = launch()
    {
    try
    {
        withTimeout(1000L)
        {
            repeat(10)
            {
                i -> println(i)
            }
        }
    }
    catch(e : TimeoutCancellationException)
    {
        println(e.message)
    }
    }
}