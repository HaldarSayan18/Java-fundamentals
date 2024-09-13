/* 
        *   *    *    *   *
        *                 *
        *                 *
        *   *    *    *   *
 */

package Patterns;

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of row = ");
        int row = sc.nextInt();
        System.out.println("Enter the value of column = ");
        int col = sc.nextInt();
        // outer loop
        for (int i = 1; i <= row; i++) {
            // inner loop
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
