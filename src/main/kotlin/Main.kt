fun main() {
    // Variables
    // Two ways to declare a variable - var(can change) and val(constant)
    val a = 5
    val x = 5.156f
    val y: Double = 5.1564 // Double are 64 bit and Float are 32 bit
    val z = true
    val b = "Hello"
    println("a : $a")
    println("b : $b")
    println("x : $x")
    println("y : $y")
    println("z : $z")

    var c = 10
    c = 15
    println("c : $c")

    arithmetic()
    comparison()
}

/** Data Types - Primitive */
/**
 * 1. Int
 * 2. Float
 * 3. Double
 * 4. Boolean
 * 5. Strings (Seq. of chars)
 * There's one more which will be discussed later.
 */

fun arithmetic() {
    val x = 10
    val y = 15
    println(x + y)
    println(x - y)
    println(x / y)
    println(x * y)
}

/** Comparison operators */
/**
 * 1. ==
 * 2. !=
 * 3. > and >=
 * 4. < and <=
 */
fun comparison() {
    print("Enter a number :")
    val x = readln().toIntOrNull()
    val y = 15
    if ((x ?: 0) > y) {
        println("$x is greater than $y")
    } else {
        println("$x is not greater than $y")
    }
}

/** Logical Operators */
/**
 * 1. && - Logical AND
 * 2. || - Logical OR
 */
fun logicalOperators() {
    val x = readlnOrNull()?.toIntOrNull() ?: 0
    val y = 15
    if ((x > y) && (x > 20)) {
        println("x is greater than y and also greater than 20")
    } else {
        println("x is not greater than y or greater than 20")
    }

    val z = 10
    val a = readlnOrNull()?.toIntOrNull() ?: 0
}
