package classes

fun main() {
    val empty = Empty()
    println(empty)

    val person = Person("John", "Doe")
    println(person.firstName)
    println(person.lastName)
    println(person.middleName)

    val person1 = Person("John", "Wick", "Doe")
    println(person1.firstName)
    println(person1.lastName)
    println(person1.middleName)

    println(Person.things)
    println(Person.Things)
}
