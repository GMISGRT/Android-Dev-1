fun main() {
    var a=3
    var b=9
    while (b != 0)
    {
        var temp=b
        b=a%b
        a=temp
    }
    var gcd=a
    println(gcd)
}
