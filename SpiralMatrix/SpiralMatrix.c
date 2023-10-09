#include <stdio.h>

int spiralOrderSum(int m, int n, int matrix[m][n]) {
    int left = 0, right = n - 1, top = 0, bottom = m - 1;
    int sum = 0, count = 0, i;

    while (left <= right && top <= bottom) {
        for (i = left; i <= right; i++) {
            count++;
            if (count % 3 == 0) sum += matrix[top][i];
        }
        top++;

        for (i = top; i <= bottom; i++) {
            count++;
            if (count % 3 == 0) sum += matrix[i][right];
        }
        right--;

        if (top <= bottom) {
            for (i = right; i >= left; i--) {
                count++;
                if (count % 3 == 0) sum += matrix[bottom][i];
            }
            bottom--;
        }

        if (left <= right) {
            for (i = bottom; i >= top; i--) {
                count++;
                if (count % 3 == 0) sum += matrix[i][left];
            }
            left++;
        }
    }

    return sum;
}

int main() {
    int matrix[3][3] = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    printf("%d\n", spiralOrderSum(3, 3, matrix));  // Expected output: 15
    return 0;
}
