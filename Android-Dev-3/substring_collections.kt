fun main() {
    var stringList1 = listOf("hello","hii")
    var stringList2 = listOf("hello","hii","hola")
    println(stringList1)
    println(stringList2)
    var substring = isSubset(stringList1,stringList2)
    println(substring)
}
fun isSubset(stringList1 : List<String> , stringList2 : List<String>) : Boolean = stringList1.all{ it in stringList2 }