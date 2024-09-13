/*
        *             *
        * *         * *
        * * *     * * *
        * * * * * * * *
        * * * * * * * *
        * * *     * * *
        * *         * *
        *             *
 */

package Patterns;
import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows= ");
        int row = sc.nextInt();
        
        // Upper half
        for (int i = 1; i <= row; i++) {
            // Print stars on the left
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Print spaces in the middle
            for (int j = 1; j <= 2 * (row - i); j++) {
                System.out.print("  ");
            }

            // Print stars on the right
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }

        // Lower half (in reverse)
        for (int i = row; i >= 1; i--) {
            // Print stars on the left
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Print spaces in the middle
            for (int j = 1; j <= 2 * (row - i); j++) {
                System.out.print("  ");
            }

            // Print stars on the right
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
        
        sc.close();
    }
}
