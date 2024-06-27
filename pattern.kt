fun main() {
    var i : Int
    var j : Int
    var k : Int
    for (i in 0 until 5)
    {
        for (j in 0 until 5-i-1)
        print(" ")
        for (k in 0 until 2*i+1)
        {
            print("*")
        }
        println()
    }
    for (i in 5 downTo 0)
    {
        for (j in 0 until 5-i)
        print(" ")
        for (k in 0 until 2*i-1)
        {
            print("*")
        }
        println()
    }
}
