package conditions

var name: String? = null

fun main() {
    name = "xyz"

    if (name == "abc") {
        println("Matched ABC")
    } else if (name == "xyz") {
        println("Matched XYZ")
    } else {
        println("Not Matched")
    }

    when (name) {
        null -> println("NULL")
        "abc" -> {
            println("ABC")
        }
        "xyz" -> println("XYZ")
        else -> {
            println("NA")
        }
    }

    when {
        name == "abc" -> println("ABC")
        name == "xyz" -> println("XYZ")
        else -> println("ELSE")
    }

    when {
        name!!.startsWith("A") -> println("Starts with A")
        else -> println("Doesn't start with A")
    }

    // Three different ways of same condition
    val name1 = if (name != null) name else "NA"
    val name2 = name ?: "NA"
    val name3 = when (name) {
        null -> "NA"
        else -> name
    }

    println(name1)
    println(name2)
    println(name3)
}
