class SpiralMatrix {
    fun spiralOrderSum(matrix: Array<IntArray>): Int {
        val m = matrix.size
        if (m == 0) return 0
        val n = matrix[0].size

        var left = 0
        var right = n - 1
        var top = 0
        var bottom = m - 1
        var sum = 0
        var count = 0

        while (left <= right && top <= bottom) {
            for (i in left..right) {
                count++
                if (count % 3 == 0) sum += matrix[top][i]
            }
            top++

            for (i in top..bottom) {
                count++
                if (count % 3 == 0) sum += matrix[i][right]
            }
            right--

            if (top <= bottom) {
                for (i in right downTo left) {
                    count++
                    if (count % 3 == 0) sum += matrix[bottom][i]
                }
                bottom--
            }

            if (left <= right) {
                for (i in bottom downTo top) {
                    count++
                    if (count % 3 == 0) sum += matrix[i][left]
                }
                left++
            }
        }

        return sum
    }
}

fun main() {
    val obj = SpiralMatrix()
    val matrix = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9)
    )
    println(obj.spiralOrderSum(matrix))  // Expected output: 15
}
