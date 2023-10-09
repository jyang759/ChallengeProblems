import java.util.Scanner;
public class TowerOfHanoi {

    public static int solveTowerOfHanoi(int n, char source, char destination, char auxiliary) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return 1;
        } else {
            int moves = 0;
            moves += solveTowerOfHanoi(n - 1, source, auxiliary, destination);
            System.out.println("Move disk " + n + " from " + source + " to " + destination);
            moves++;
            moves += solveTowerOfHanoi(n - 1, auxiliary, destination, source);
            return moves;
        }
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Please enter the number of disks: ");
            int numberOfDisks = scan.nextInt(); // Replace with the number of disks you want to use
            int totalMoves = solveTowerOfHanoi(numberOfDisks, 'A', 'C', 'B');
            System.out.println("Total number of moves: " + totalMoves);
        }
    }
}