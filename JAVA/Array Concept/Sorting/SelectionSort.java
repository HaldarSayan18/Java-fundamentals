//selection sort is done by assuming that the first element is smallest or pivot element
package Sorting;

import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 7, 0, -52, 1, 9, 121, -3 };
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        System.out.println(" \t" + Arrays.toString(arr));
    }
}
