package variables

val aTopLevelConstantValue = "Top level read only value / variable"
var aTopLevelVariable = "Top level variable"

fun main() {
    val i = 5
    println(i)

    val thisIsConstantValue: String = "Hello"    // We can omit the type here
//    thisIsConstantValue = "World"     -> Cannot be reassigned
    println(thisIsConstantValue)

    var thisIsAVariable = "Hi"
    println(thisIsAVariable)
    thisIsAVariable = "Hey"
    println(thisIsAVariable)

    println(aTopLevelConstantValue)
    println(aTopLevelVariable)

    var aNullableVariable: Int? = 10
    println(aNullableVariable)
    aNullableVariable = null
    println(aNullableVariable)
}
