#include <stdio.h>

int solveTowerOfHanoi(int n, char source, char destination, char auxiliary) {
    if (n == 1) {
        printf("Move disk 1 from %c to %c\n", source, destination);
        return 1;
    } else {
        int moves = 0;
        moves += solveTowerOfHanoi(n - 1, source, auxiliary, destination);
        printf("Move disk %d from %c to %c\n", n, source, destination);
        moves++;
        moves += solveTowerOfHanoi(n - 1, auxiliary, destination, source);
        return moves;
    }
}

int main() {
    int numberOfDisks;
    printf("Please enter the number of disks: ");
    scanf("%d", &numberOfDisks);
    
    int totalMoves = solveTowerOfHanoi(numberOfDisks, 'A', 'C', 'B');
    printf("Total number of moves: %d\n", totalMoves);
    
    return 0;
}
