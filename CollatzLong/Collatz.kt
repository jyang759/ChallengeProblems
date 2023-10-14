object Collatz {

    fun solve(n: Int): Int {
        require(n >= 2) { "Input must be greater than or equal to 2" }

        var max_length = 0
        var number = 0

        for (i in 2..n) {
            var length = 1
            var sequence = i
            while (sequence != 1) {
                sequence = if (sequence % 2 == 0) {
                    sequence / 2
                } else {
                    3 * sequence + 1
                }
                length++
            }

            if (length > max_length) {
                max_length = length
                number = i
            }
        }

        return number
    }
}

fun testCollatz() {
    // Base Test Cases
    assert(Collatz.solve(2) == 2) { "Failed test case 1a" }
    assert(Collatz.solve(5) == 3) { "Failed test case 1b" }
    assert(Collatz.solve(10) == 9) { "Failed test case 1c" }

    // Additional Test Cases
    assert(Collatz.solve(100) == 97) { "Failed test case 2a" }
    assert(Collatz.solve(1000) == 871) { "Failed test case 2b" }
    assert(Collatz.solve(10000) == 6171) { "Failed test case 2c" }

    // Edge Test Cases
    try {
        Collatz.solve(-10)
        println("Failed test case 3b")
    } catch (e: IllegalArgumentException) {
        // Expected exception
    }

    try {
        Collatz.solve(1)
        println("Failed test case 3c")
    } catch (e: IllegalArgumentException) {
        // Expected exception
    }

    // Functional Test Cases
    val result = Collatz.solve(100)
    var sequence = result
    while (sequence != 1) {
        sequence = if (sequence % 2 == 0) {
            sequence / 2
        } else {
            3 * sequence + 1
        }
    }
    assert(sequence == 1) { "Failed functional test case 4a" }

    println("All tests passed!")
}

fun main() {
    testCollatz()
}
