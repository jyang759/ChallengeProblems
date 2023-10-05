fun josephus(n: Int, k: Int): Int {
    val people = MutableList(n) { it + 1 }
    
    var index = 0
    while (people.size > 1) {
        index = (index + k - 1) % people.size
        people.removeAt(index)
    }

    return people[0]
}

fun main() {
    print("Enter the number of people in the circle: ")
    val N = readLine()!!.toInt()

    print("\nEnter the step size: ")
    val K = readLine()!!.toInt()

    val lastPerson = josephus(N, K)
    println("The last person remaining is at position: $lastPerson")
}
