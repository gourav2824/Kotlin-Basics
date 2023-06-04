package classes

fun main() {
    objectExpressions()
    objectDeclarations()
}

// Examples of object expression
fun objectExpressions() {
    val name = object {
        private var firstName: String? = null
        private var lastName: String? = null

        fun getName() = "$firstName $lastName"

        fun setName(_firstName: String, _lastName: String) {
            firstName = _firstName
            lastName = _lastName
        }
    }

    println(name.getName())
    name.setName("John", "Doe")
    println(name.getName())

    val helloWorld = object {
        val hello = "Hello"
        val world = "World"

        override fun toString() = "$hello $world"
    }

    println(helloWorld)
}

// Examples of object declaration (Singleton class)
object HelloWorld {
    const val hello = "Hello"
    const val world = "World"

    override fun toString() = "$hello $world"
}

fun objectDeclarations() {
    println(HelloWorld.hello)
    println(HelloWorld.world)
    println(HelloWorld)
}
