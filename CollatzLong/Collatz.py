class Collatz:
    @staticmethod
    def solve(n):
        if n < 2:
            raise ValueError("Input must be greater than or equal to 2")

        max_length = 0
        number = 0

        for i in range(2, n + 1):
            length = 1
            sequence = i
            while sequence != 1:
                if sequence % 2 == 0:
                    sequence = sequence // 2
                else:
                    sequence = 3 * sequence + 1
                length += 1

            if length > max_length:
                max_length = length
                number = i

        return number


def test_collatz():
    # Base Test Cases
    assert Collatz.solve(2) == 2, "Failed test case 1a"
    assert Collatz.solve(5) == 3, "Failed test case 1b"
    assert Collatz.solve(10) == 9, "Failed test case 1c"

    # Additional Test Cases
    assert Collatz.solve(100) == 97, "Failed test case 2a"
    assert Collatz.solve(1000) == 871, "Failed test case 2b"
    assert Collatz.solve(10000) == 6171, "Failed test case 2c"

    # Edge Test Cases
    try:
        Collatz.solve(-10)
        print("Failed test case 3b")
    except ValueError:
        pass  # Expected exception

    try:
        Collatz.solve(1)
        print("Failed test case 3c")
    except ValueError:
        pass  # Expected exception

    # Functional Test Cases
    result = Collatz.solve(100)
    sequence = result
    while sequence != 1:
        if sequence % 2 == 0:
            sequence = sequence // 2
        else:
            sequence = 3 * sequence + 1

    assert sequence == 1, "Failed functional test case 4a"

    print("All tests passed!")


if __name__ == "__main__":
    test_collatz()
