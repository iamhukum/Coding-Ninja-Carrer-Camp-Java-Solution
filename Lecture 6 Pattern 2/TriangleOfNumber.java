// Code : Triangle of Numbers
// Send Feedback
// Print the following pattern for the given number of rows.
// Pattern for N = 4

// The dots represent spaces.

// Input format :
// Integer N (Total no. of rows)
// Output format :
// Pattern in N lines
// Constraints :
// 0 <= N <= 50
// Sample Input 1:
// 5
// Sample Output 1:
//            1
//          232
//        34543
//      4567654
//    567898765
// Sample Input 2:
// 4
// Sample Output 2:
//            1
//          232
//        34543
//      4567654

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print left half of the row
            int k = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(k++);
            }
            // Print right half of the row
            k -= 2;
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(k--);
            }
            System.out.println();
        }
    }
}
