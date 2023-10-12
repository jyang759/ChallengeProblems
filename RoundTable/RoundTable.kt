object RoundTable {

    fun solution(A: IntArray): Int {
        // if length is zero or one, return 0.
        if (A.size == 0 || A.size == 1) {
            return 0
        }

        // if array contains all same integer, all even, or all odd integers, return length/2
        if (allSame(A) || allEven(A) || allOdd(A)) {
            return A.size / 2
        }

        // initialize a count to be returned later
        var count = 0
        var zero = false

        // main loop to go through the array and create pairs.
        var i = 0
        while (i < A.size - 1) {
            if ((A[i] + A[i + 1]) % 2 == 0) {
                count++
                if (i == 0) {  // if index zero is paired, then we don't check the first and last.
                    zero = true
                }
                i++
            }
            i++
        }

        if (!zero && (A[0] + A[A.size - 1]) % 2 == 0) {  // pair the first and last if the first has not been paired.
            count++
        }

        return count
    }

    private fun allSame(A: IntArray): Boolean = A.toSet().size == 1

    private fun allEven(A: IntArray): Boolean = A.all { it % 2 == 0 }

    private fun allOdd(A: IntArray): Boolean = A.all { it % 2 != 0 }

}

fun main() {
    val a1 = intArrayOf(1, 2, 3, 4, 5)
    println(RoundTable.solution(a1))
    val a2 = intArrayOf(1, 1, 1, 1, 1)
    println(RoundTable.solution(a2))
    val a3 = intArrayOf(2, 2, 2, 2, 2)
    println(RoundTable.solution(a3))
    val a4 = intArrayOf(2, 2, 2, 2, 2, 2)
    println(RoundTable.solution(a4))
    val a5 = intArrayOf(3, 3, 3, 3, 3, 3)
    println(RoundTable.solution(a5))
    val a6 = intArrayOf(5, 1, 8, 4, 0, 8)
    println(RoundTable.solution(a6))
}
