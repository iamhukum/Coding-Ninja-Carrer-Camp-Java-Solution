import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        // System.out.print("Enter a number to print its multiplication table: ");
        int n = input.nextInt();

        int i = 1;
        // System.out.println("Multiplication table of " + n + " for first 10 multiples
        // using while loop:");
        while (i <= 10) {
            System.out.println((n * i));
            i++;
        }
    }
}