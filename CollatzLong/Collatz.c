#include <stdio.h>
#include <assert.h>

int solve(int n) {
    if (n < 2) {
        printf("Input must be greater than or equal to 2\n");
        return -1;
    }

    int max_length = 0;
    int number = 0;

    for (int i = 2; i <= n; i++) {
        int length = 1;
        long sequence = i;
        while (sequence != 1) {
            if (sequence % 2 == 0) {
                sequence = sequence / 2;
            } else {
                sequence = 3 * sequence + 1;
            }
            length++;
        }

        if (length > max_length) {
            max_length = length;
            number = i;
        }
    }

    return number;
}

void test_collatz() {
    // Base Test Cases
    assert(solve(2) == 2);
    assert(solve(5) == 3);
    assert(solve(10) == 9);

    // Additional Test Cases
    assert(solve(100) == 97);
    assert(solve(1000) == 871);
    assert(solve(10000) == 6171);

    // Edge Test Cases
    // In C, we just check the result as there's no direct exception mechanism like Python
    assert(solve(-10) == -1); 
    assert(solve(1) == -1);

    // Functional Test Cases
    int result = solve(100);
    long sequence = result;
    while (sequence != 1) {
        if (sequence % 2 == 0) {
            sequence = sequence / 2;
        } else {
            sequence = 3 * sequence + 1;
        }
    }
    assert(sequence == 1);

    printf("All tests passed!\n");
}

int main() {
    test_collatz();
    return 0;
}
