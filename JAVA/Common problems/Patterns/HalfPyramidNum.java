/* 
        1
        1       2
        1       2       3
        1       2       3       4
        1       2       3       4       5
 */

package Patterns;
import java.util.Scanner;

public class HalfPyramidNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter how many rows to print = ");
        int row = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
        System.out.println("INVERTED HALF PYRAMID NUMBERS");
        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
        sc.close();
    }
}


/*
        1       2       3       4       5
        1       2       3       4
        1       2       3
        1       2
        1
 */