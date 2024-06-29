fun main() {
    isPalindrome("civic")
}
fun isPalindrome(str : String) 
{
    var reversed = ""
    for (char in str)
    {
        reversed = char + reversed
    }
    if (str == reversed)
    {
        println("palindrome")
    }
    else
    {
        println("not palindrome")
    }
}