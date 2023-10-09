class SpiralMatrix:
    def spiralOrderSum(self, matrix):
        if not matrix:
            return 0

        m, n = len(matrix), len(matrix[0])
        left, right, top, bottom = 0, n - 1, 0, m - 1
        sum_val, count = 0, 0

        while left <= right and top <= bottom:
            for i in range(left, right+1):
                count += 1
                if count % 3 == 0:
                    sum_val += matrix[top][i]
            top += 1

            for i in range(top, bottom+1):
                count += 1
                if count % 3 == 0:
                    sum_val += matrix[i][right]
            right -= 1

            if top <= bottom:
                for i in range(right, left-1, -1):
                    count += 1
                    if count % 3 == 0:
                        sum_val += matrix[bottom][i]
                bottom -= 1

            if left <= right:
                for i in range(bottom, top-1, -1):
                    count += 1
                    if count % 3 == 0:
                        sum_val += matrix[i][left]
                left += 1

        return sum_val

if __name__ == "__main__":
    obj = SpiralMatrix()
    matrix = [
        [1, 2, 3],
        [4, 5, 6],
        [7, 8, 9]
    ]
    print(obj.spiralOrderSum(matrix))  # Expected output: 15
