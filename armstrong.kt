fun main() {
    var num=153
    var num1=num
    var arm=0
    var digit : Int
    while (num!=0)
    {
        digit = num%10
        arm+=digit*digit*digit
        num/=10
    }
    if (num1==arm)
    {
        println("Armstrong.")
    }
}
