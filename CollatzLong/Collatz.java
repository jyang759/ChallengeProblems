package CollatzLong;
public class Collatz {
    public static int solve(int n) {
        if (n < 2) {
            throw new IllegalArgumentException("Input must be greater than or equal to 2");
        }

        int maxLength = 0;
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

            if (length > maxLength) {
                maxLength = length;
                number = i;
            }
        }
        return number;
    }

    public static void main(String[] args) {
        // Base Test Cases
        assert solve(2) == 2 : "Failed test case 1a";
        assert solve(5) == 3 : "Failed test case 1b";
        assert solve(10) == 9 : "Failed test case 1c";

        // Additional Test Cases
        assert solve(100) == 97 : "Failed test case 2a";
        assert solve(1000) == 871 : "Failed test case 2b";
        assert solve(10000) == 6171 : "Failed test case 2c";

        // Edge Test Cases
        try {
            solve(-10);
            System.out.println("Failed test case 3b");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }

        try {
            solve(1);
            System.out.println("Failed test case 3c");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }

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
        assert sequence == 1 : "Failed functional test case 4a";

        System.out.println("All tests passed!");
    }
}
