import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        // System.out.print("Factors of " + n + " (excluding 1 and " + n + "): ");
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
