class RoundTable:

    @staticmethod
    def solution(A):
        # if length is zero or one, return 0.
        if len(A) == 0 or len(A) == 1:
            return 0

        # if array contains all same integer, all even, or all odd integers, return length/2
        if RoundTable.allSame(A) or RoundTable.allEven(A) or RoundTable.allOdd(A):
            return len(A) // 2

        # initialize a count to be returned later
        count = 0
        zero = False

        # main loop to go through the array and create pairs.
        i = 0
        while i < len(A) - 1:
            if (A[i] + A[i+1]) % 2 == 0:
                count += 1
                if i == 0:  # if index zero is paired, then we don't check the first and last.
                    zero = True
                i += 1
            i += 1

        if not zero and (A[0] + A[-1]) % 2 == 0:  # pair the first and last if the first has not been paired.
            count += 1

        return count

    @staticmethod
    def allSame(A):
        # helper function to check if all terms are the same
        return len(set(A)) == 1

    @staticmethod
    def allEven(A):
        # helper function to check if all terms are even
        return all(num % 2 == 0 for num in A)

    @staticmethod
    def allOdd(A):
        # helper function to check if all terms are odd
        return all(num % 2 != 0 for num in A)


if __name__ == "__main__":
    a1 = [1, 2, 3, 4, 5]
    print(RoundTable.solution(a1))
    a2 = [1, 1, 1, 1, 1]
    print(RoundTable.solution(a2))
    a3 = [2, 2, 2, 2, 2]
    print(RoundTable.solution(a3))
    a4 = [2, 2, 2, 2, 2, 2]
    print(RoundTable.solution(a4))
    a5 = [3, 3, 3, 3, 3, 3]
    print(RoundTable.solution(a5))
    a6 = [5, 1, 8, 4, 0, 8]
    print(RoundTable.solution(a6))
