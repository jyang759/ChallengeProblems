class RoundTable {
    public static int solution(int[] A) {
        // if length is zero or one, return 0. 
        if (A.length == 0 || A.length == 1 ) {
            return 0;
        }

        // if array contains all same integer, all even, or all odd integers, return length/2
        if (allSame(A) || allEven(A) || allOdd(A)) {
            return A.length / 2;
        }

        // initialize a count to be returned later
        int count = 0;
        boolean zero = false;

        // main loop to go through the array and create pairs. 
        for (int i = 0; i < A.length - 2; ++i) {
            if ((A[i] + A[i+1]) % 2 == 0) {
                ++count;
                if (i == 0) {   // if index zero is paired, then we don't check the first and last.
                    zero = true;
                }
                ++i;
            }
        }

        if (!zero && (A[0] + A[A.length - 1]) % 2 == 0) {   // pair the first and last if the first has not been paired.
            ++count;
        }

        return count;
    }

    private static boolean allSame(int[] A) {   // helper function to check if all terms are the same
        for(int i = 0; i < A.length; ++i) {
            if (A[i] != A[0]) {
                return false;
            }
        }
        return true;
    }

    private static boolean allEven(int[] A) {   // helper function to check if all terms are even
        for (int i = 0; i < A.length; ++i) {
            if (A[i] % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean allOdd(int[] A) {    // helper function to check if all terms are odd
        for (int i = 0; i < A.length; ++i) {
            if (A[i] % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
    int[] a1 = {1, 2, 3, 4, 5};
    System.out.println(solution(a1));
    int[] a2 = {1, 1, 1, 1, 1};
    System.out.println(solution(a2));
    int[] a3 = {2, 2, 2, 2, 2};
    System.out.println(solution(a3));
    int[] a4 = {2, 2, 2, 2, 2, 2};
    System.out.println(solution(a4));
    int[] a5 = {3, 3, 3, 3, 3, 3};
    System.out.println(solution(a5));
    int[] a6 = {5, 1, 8, 4, 0, 8};
    System.out.println(solution(a6));
    }
}
