package classes

// Class having a primary constructor and two fields
class Person(val firstName: String, val lastName: String) {
    var middleName: String? = null

    // Secondary constructor
    constructor(_firstName: String, _middleName: String, _lastName: String) : this(_firstName, _lastName) {
        middleName = _middleName
    }
}
