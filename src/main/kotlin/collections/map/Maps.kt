package collections.map

fun main() {
    val map1 = mapOf(Pair(1, "a"), Pair(5, "c"), Pair(3, "d"))      // Immutable map
    println(map1.get(3))
    println(map1[5])

    // Pair(1, "a") can also be written as -> 1 to "a"
    val map2 = mapOf(1 to "a", 2 to "b", 3 to "c")
    println(map2[1])
    println(map2[5])

    // Map having keys and values of different types
    val map3 = mapOf(2 to "c", "a" to 3, true to "TRUE", 1 to "d")
    println(map3[1])
    println(map3["a"])
    println(map3[true])
    println(map3[false])

    val map = mutableMapOf(1 to "a", 2 to "b", 3 to "c")            // Mutable map
    map[5] = "e"
    map.put(4, "d")
    println(map.size)
}
