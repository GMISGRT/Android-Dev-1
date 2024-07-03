class InvalidAgeException(message : String) : Exception(message)
fun checkAge(age : Int) 
{
    if(age < 18)
    throw InvalidAgeException("Error:Underage.")
    else
    println("Age valid.")
}
fun main()
{
    try
    {
       checkAge(29)
       checkAge(15)
    }
    catch(e : InvalidAgeException)
    {
        println(e.message)
    }
}