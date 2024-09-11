import java.util.*;

public class ArraySort {
    public static void main(String[] args) {
        int arr[] = { 1, 200, -90, 67, -8, 1 };
        System.out.println("Given array = " + Arrays.toString(arr));

        // using Arrays.sort() method
        Arrays.sort(arr);
        System.out.println("Sorted array is = " + Arrays.toString(arr));

        // using boolean "isSorted" function
        boolean isSorted = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1]) {   isSorted = false;
                break;
            }
        }
        System.out.println("Array is sorted and that is \n "+isSorted);
    }
}

