//reverse a string and print it using recursion

package Recursion;
import java.util.Scanner;

public class ReverseString {
    public static void printRev(String str, int index) {
        if (index == 0) {
            System.out.println(str.charAt(index));
            return;
        }
        // System.out.print("Reversed string is : ");
        System.out.println(str.charAt(index));
        printRev(str, index - 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a string = ");
        String str = sc.next();
        printRev(str, str.length() - 1);
        sc.close();
    }
}
