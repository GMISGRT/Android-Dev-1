fun main() {
    var num=1053
    var num1=num
    var arm=0
    var digit : Int
    while (num!=0)
    {
        digit = num%10
        if(digit==0 && num==num1)
        {
            println("duck")
        }
        num/=10
    }
}
