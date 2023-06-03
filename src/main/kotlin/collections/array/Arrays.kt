package collections.array

fun main() {
    val nums: Array<Int> = arrayOf(1, 2, 3)
    println("0th Value = " + nums[0] + ", 1st Value = " + nums.get(1))

    nums[0] = 4
    println(nums[0])

    val names = arrayOf("John", "Dave", "Sky")
    println(names.size)
    println(names.indices)
    println(names.first())
    println(names.last())
}
