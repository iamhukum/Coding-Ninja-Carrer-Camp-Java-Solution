import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        /*
         * Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */
        Scanner s = new Scanner(System.in);
        int S = s.nextInt();
        int E = s.nextInt();
        int W = s.nextInt();
        int fah;

        while (S <= E) {

            fah = ((5 * (S - 32)) / 9);
            System.out.println(S + " " + fah);
            S += W;
        }
    }

}