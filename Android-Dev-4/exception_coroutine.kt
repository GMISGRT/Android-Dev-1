import kotlinx.coroutines.*
fun main () {
    try
    {
        println("Initialised.")
        throw Exception ("Error.")
    }
    catch(e : Exception)
    {
        println(e.message)
    }
}