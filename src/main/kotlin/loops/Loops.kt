package loops

val names = arrayOf("John", "Dave", "Sky")

fun main() {
    println("For Loops...")
    forLoops()
    println("ForEach Loops...")
    forEachLoops()
}

fun forLoops() {
    for (i in 1..3) {
        println(i)
    }

    for (name in names) {
        println(name)
    }

    for (i in names.indices) {
        println("Element at index $i = ${names[i]}")
    }

    for ((index, value) in names.withIndex()) {
        println("Element at index $index = $value")
    }
}

fun forEachLoops() {
    (1..3).forEach { println(it) }
    IntRange(7, 9).forEach { i -> println(i) }

    names.forEach { name ->
        println(name)
    }

    names.forEachIndexed { index, name ->
        println("$name is at index $index")
    }
}
