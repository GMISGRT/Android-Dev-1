fun main() {
    val str="Hii guys"
    var frequency=IntArray(26)
    for (i in str)
    {
        var lowchar = if (i in 'A' .. 'Z') i + ('a'-'A') else i
        if(lowchar in 'a' .. 'z') 
        {
            var index=lowchar-'a'
            frequency[index]++
        }
    }
    for (j in frequency.indices)
    {
        if(frequency[j]>0)
        {
            var i='a'+j
            println("$i:${frequency[j]}")
        }
    }
}
