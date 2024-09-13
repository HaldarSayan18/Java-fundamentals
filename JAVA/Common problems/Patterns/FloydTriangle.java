/*
        1
        2       3
        4       5       6
        7       8       9       10
 */

package Patterns;
import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter how many rows to print = ");
        int row = sc.nextInt();
        // System.out.println("Enter till which number to print = ");
        int col = 1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(col+"\t");
                col++;
            }
            System.out.println();
        }
        sc.close();
    }
}
