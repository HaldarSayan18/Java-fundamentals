//check if an array is sorted (strictly Increasing)
//time complexity O(n)

package Recursion;
import java.util.Scanner;

public class SortedCheck {
    //only returning true or false
    public static boolean isSorted (int arr[], int index) {
        if (index == arr.length - 1) {
            //array is sorted till now
           return true; 
        }
        if (arr[index] < arr[index + 1]) {
            isSorted(arr, index+1);
        } else {
            return false;
        }
        return isSorted(arr, index+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered array elements are:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sc.close();
        //return boolean value
        System.out.println(isSorted(arr, 0));
    }
}
