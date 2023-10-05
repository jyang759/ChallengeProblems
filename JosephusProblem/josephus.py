def josephus(n, k):
    people = list(range(1, n + 1))
    
    index = 0
    while len(people) > 1:
        index = (index + k - 1) % len(people)
        del people[index]
    
    return people[0]

def main():
    N = int(input("Enter the number of people in the circle: "))
    K = int(input("\nEnter the step size: "))

    last_person = josephus(N, K)
    print(f"The last person remaining is at position: {last_person}")

if __name__ == "__main__":
    main()
