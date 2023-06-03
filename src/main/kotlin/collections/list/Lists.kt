package collections.list

fun main() {
    val nums = listOf(1, 2, 3)          // Immutable list
    for (num in nums) println(num)

    val list = mutableListOf(1, 2, 3)   // Mutable list
    for (num in list) println(num)

    list.add(5)
    list.add(4)

    println(list[3])
    println(list.removeLast())
    println(list.size)
}
