fun main() {
    var stringList = listOf("hello","hii")
    println(stringList)
    var stringMap = mapping(stringList)
    println(stringMap)
}
fun mapping(stringList : List<String>) : Map<String , Int> = stringList.associateWith{ it.length }