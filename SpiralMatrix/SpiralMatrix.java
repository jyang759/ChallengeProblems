package SpiralMatrix;

public class SpiralMatrix {
    public int spiralOrderSum(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return 0;

        int m = matrix.length, n = matrix[0].length;
        int left = 0, right = n - 1, top = 0, bottom = m - 1;
        int sum = 0, count = 0;

        while (left <= right && top <= bottom) {
            // traverse from left to right
            for (int i = left; i <= right; i++) {
                count++;
                if (count % 3 == 0) {
                    sum += matrix[top][i];
                }
            }
            top++;

            // traverse from top to bottom
            for (int i = top; i <= bottom; i++) {
                count++;
                if (count % 3 == 0) {
                    sum += matrix[i][right];
                }
            }
            right--;

            // traverse from right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    count++;
                    if (count % 3 == 0) {
                        sum += matrix[bottom][i];
                    }
                }
                bottom--;
            }

            // traverse from bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    count++;
                    if (count % 3 == 0) {
                        sum += matrix[i][left];
                    }
                }
                left++;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        SpiralMatrix obj = new SpiralMatrix();
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println(obj.spiralOrderSum(matrix));  // Expected output: 15
    }
}
