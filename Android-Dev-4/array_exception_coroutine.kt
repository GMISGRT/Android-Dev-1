fun arrayElement(array : Array<Int> , index : Int) : Unit
{
    try
    {
        array[index]
    }
    catch(e : ArrayIndexOutOfBoundsException)
    {
        println(e.message)
    }
}
fun main()
{
    var array = arrayOf(1 , 2 , 3 , 4)
    println(arrayElement(array,4))
    println(arrayElement(array,5))   
}