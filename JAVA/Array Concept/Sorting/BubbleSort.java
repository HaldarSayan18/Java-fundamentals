//bubble sort will be done (n-1) times
//time complexity = 0(n^2)
package Sorting;
// import java.util.*;

public class BubbleSort {
    public static void bubbleSorted(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" \t"+arr[i]);
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int arr [] = {7, 3, 1, 8, -2};
        for (int i = 0; i < arr.length; i++) { //n-1
            for (int j = 0; j < arr.length- i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        bubbleSorted(arr);
    }
}
