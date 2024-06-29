fun main() {
    val tri = triangle(3.0,4.0,5.0,4.0,3.0)
    val sq = square(4.0)
    val draw : List<drawable> = listOf(tri , sq)
    for (i in draw)
    {
        i.drawInfo()
    }
}
interface drawable
{
    fun drawInfo()
}
class triangle(var base : Double , var height : Double , var side1 : Double, var side2 : Double ,var side3 : Double) : drawable
{
    fun area() : Double = 0.5 * base * height
    fun perimeter() : Double = side1 + side2 + side3
    override fun drawInfo()
    {
        println("Triangle:")
        println("Base:$base")
        println("Height:$height")
        println("Sides:$side1 , $side2 , $side3 ")
        println("Area:${area()}")
        println("Perimeter:${perimeter()}")
    }
}
class square(var side : Double) : drawable
{
    fun area() : Double = side * side
    fun perimeter() : Double =  4 * side
    override fun drawInfo()
    {
        println("Square:")
        println("Side:$side")
        println("Area:${area()}")
        println("Perimeter:${perimeter()}")
    }
}