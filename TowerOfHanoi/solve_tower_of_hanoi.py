def solve_tower_of_hanoi(n, source, destination, auxiliary):
    if n == 1:
        print(f"Move disk 1 from {source} to {destination}")
        return 1
    else:
        moves = 0
        moves += solve_tower_of_hanoi(n - 1, source, auxiliary, destination)
        print(f"Move disk {n} from {source} to {destination}")
        moves += 1
        moves += solve_tower_of_hanoi(n - 1, auxiliary, destination, source)
        return moves

if __name__ == "__main__":
    number_of_disks = int(input("Please enter the number of disks: "))
    total_moves = solve_tower_of_hanoi(number_of_disks, 'A', 'C', 'B')
    print(f"Total number of moves: {total_moves}")
