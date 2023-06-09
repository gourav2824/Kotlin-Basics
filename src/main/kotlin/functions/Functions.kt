package functions

// Function with no parameters and return type
fun sayHello() {
    println("Hello")
}

// Unit is equivalent to void and can be omitted
fun sayHi(): Unit {
    println("Hi")
}

// Function with parameters and return type
fun getGreeting(name: String): String {
    return "Hello $name"
}

// Function with default parameter value
fun getGreetMessage(name: String = "Default Name"): String {
    return "Hello $name"
}

// Syntax for writing function with single line body
fun getMessage(name: String) = "Hi $name"

fun sayHey() = println("Hey!")

fun greet(name: String, message: String): String {
    return "$message $name"
}

fun main() {
    sayHello()
    sayHi()
    println(getGreeting("John"))
    println(getGreetMessage())
    println(getMessage("Dave"))
    sayHey()
    println(greet("Sky", "Welcome"))

    // We can change the position of arguments using named arguments
    println(greet(message = "Good day", name = "Sky"))
}
