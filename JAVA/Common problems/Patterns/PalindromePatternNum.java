/*
                            1
                        2   1   2
                    3   2   1   2   3
                4   3   2   1   2   3   4
            5   4   3   2   1   2   3   4   5
 */

package Patterns;
import java.util.Scanner;

public class PalindromePatternNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number of rows= ");
        int row = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            //spaces
            for (int j = 1; j <= row - 1; j++) {
                System.out.print("  ");
            }
            //1st half numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            //2nd half numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
