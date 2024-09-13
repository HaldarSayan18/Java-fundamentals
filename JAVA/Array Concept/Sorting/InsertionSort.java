//array is divided into two parts where one part may sorted and another is unsorted.
package Sorting;
import java.util.*;

public class InsertionSort {
    public static void main (String[] args){
        int arr[] = {1, 89, 99, -20, 12, 61, -3};
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        System.out.println(" \t"+Arrays.toString(arr));
    }
}
