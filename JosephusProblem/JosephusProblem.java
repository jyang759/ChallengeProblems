import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JosephusProblem {
    public static int josephus(int n, int k) {
        List<Integer> people = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            people.add(i);
        }

        int index = 0;
        while (people.size() > 1) {
            index = (index + k - 1) % people.size();
            people.remove(index);
        }

        return people.get(0);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of people in the circle: ");
        int N = scan.nextInt(); // Replace with the number of people (N) in the circle
        System.out.print("\nEnter the step size: ");
        int K = scan.nextInt(); // Replace with the step size (k)

        int lastPerson = josephus(N, K);
        System.out.println("The last person remaining is at position: " + lastPerson);
    }
}