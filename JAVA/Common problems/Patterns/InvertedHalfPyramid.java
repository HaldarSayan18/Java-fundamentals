/*
            *   *   *   *
            *   *   *
            *   *   
            *
 */

package Patterns;

import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of row = ");
        int row = sc.nextInt();
        //outer loop
        for (int i = row; i >= 1; i--) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print("  *\t");
            }
            System.out.println();
        }
        System.out.println("rotating 180 deg. \n");

        //INVERTED HALF PATTERN ROTATING 180 DEGREE

        for (int i = 1; i <= row; i++) {
            // inner loop -> space print
            for (int j = 1; j <= row - i; j++) {
                System.out.print("   ");
            }
            // inner loop -> star print
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        sc.close();
    }
}



/*
                        *
                    *   *
                *   *   *   
            *   *   *   *
 */