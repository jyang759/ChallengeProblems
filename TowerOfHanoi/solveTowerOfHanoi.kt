fun solveTowerOfHanoi(n: Int, source: Char, destination: Char, auxiliary: Char): Int {
    return if (n == 1) {
        println("Move disk 1 from $source to $destination")
        1
    } else {
        var moves = 0
        moves += solveTowerOfHanoi(n - 1, source, auxiliary, destination)
        println("Move disk $n from $source to $destination")
        moves++
        moves += solveTowerOfHanoi(n - 1, auxiliary, destination, source)
        moves
    }
}

fun main() {
    print("Please enter the number of disks: ")
    val numberOfDisks = readLine()!!.toInt()
    val totalMoves = solveTowerOfHanoi(numberOfDisks, 'A', 'C', 'B')
    println("Total number of moves: $totalMoves")
}
