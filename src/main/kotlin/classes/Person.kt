package classes

// Class having a primary constructor and two fields
class Person(val firstName: String, val lastName: String) {
    var middleName: String? = null

    // Secondary constructor
    constructor(_firstName: String, _middleName: String, _lastName: String) : this(_firstName, _lastName) {
        middleName = _middleName
    }

    // We can use the fields in companion object like static fields of class
    companion object Things {
        val things = listOf("Mobile", "Watch", "Laptop")

        override fun toString(): String {
            var string = "Things ="
            for (thing in things) {
                string = string.plus(" $thing")
            }
            return string
        }
    }
}
