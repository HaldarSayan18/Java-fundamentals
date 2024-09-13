/*
        1
        0   1
        1   0   1
        0   1   0   1
        1   0   1   0   1
 */

package Patterns;
import java.util.Scanner;

public class ZeroOneTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many rows to print = ");
        int row = sc.nextInt();
        // System.out.println("Enter till which number to print = ");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i+j) % 2 != 0) {
                    System.out.print(" 0 ");
                } else {
                    System.out.print(" 1 ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
