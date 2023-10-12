#include <stdio.h>
#include <stdbool.h>

bool allSame(int A[], int size) {
    for (int i = 1; i < size; ++i) {
        if (A[i] != A[0]) {
            return false;
        }
    }
    return true;
}

bool allEven(int A[], int size) {
    for (int i = 0; i < size; ++i) {
        if (A[i] % 2 != 0) {
            return false;
        }
    }
    return true;
}

bool allOdd(int A[], int size) {
    for (int i = 0; i < size; ++i) {
        if (A[i] % 2 == 0) {
            return false;
        }
    }
    return true;
}

int solution(int A[], int size) {
    if (size == 0 || size == 1) {
        return 0;
    }

    if (allSame(A, size) || allEven(A, size) || allOdd(A, size)) {
        return size / 2;
    }

    int count = 0;
    bool zero = false;

    for (int i = 0; i < size - 1; ++i) {
        if ((A[i] + A[i+1]) % 2 == 0) {
            ++count;
            if (i == 0) {
                zero = true;
            }
            ++i;
        }
    }

    if (!zero && (A[0] + A[size - 1]) % 2 == 0) {
        ++count;
    }

    return count;
}

int main() {
    int a1[] = {1, 2, 3, 4, 5};
    printf("%d\n", solution(a1, sizeof(a1)/sizeof(int)));

    int a2[] = {1, 1, 1, 1, 1};
    printf("%d\n", solution(a2, sizeof(a2)/sizeof(int)));

    int a3[] = {2, 2, 2, 2, 2};
    printf("%d\n", solution(a3, sizeof(a3)/sizeof(int)));

    int a4[] = {2, 2, 2, 2, 2, 2};
    printf("%d\n", solution(a4, sizeof(a4)/sizeof(int)));

    int a5[] = {3, 3, 3, 3, 3, 3};
    printf("%d\n", solution(a5, sizeof(a5)/sizeof(int)));

    int a6[] = {5, 1, 8, 4, 0, 8};
    printf("%d\n", solution(a6, sizeof(a6)/sizeof(int)));

    return 0;
}
