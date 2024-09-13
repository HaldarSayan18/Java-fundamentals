package Sorting;
//merge two sorted arrays
import java.util.*;

public class MergeSort {
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] mergedArray = new int[len1 + len2];

        int i = 0; // Pointer for arr1
        int j = 0; // Pointer for arr2
        int k = 0; // Pointer for mergedArray

        // Merge arrays while there are elements in both arrays
        while (i < len1 && j < len2) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        // Copy remaining elements of arr1, if any
        while (i < len1) {
            mergedArray[k++] = arr1[i++];
        }

        // Copy remaining elements of arr2, if any
        while (j < len2) {
            mergedArray[k++] = arr2[j++];
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5, 7};
        System.out.println("array 1 = "+Arrays.toString(arr1));
        int[] arr2 = { 2, 4, 6, 8 };
        System.out.println("array 2 = "+Arrays.toString(arr2));
        int[] mergedArray = mergeSortedArrays(arr1, arr2);

        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }
}
