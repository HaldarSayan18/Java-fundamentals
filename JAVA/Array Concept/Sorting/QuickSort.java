//pivot can be a random element or last element or mid element or first element
//an array is divided into two sub arrays
//here taking pivot as the last element of the array
//time complexity worst case = O(n^2) and avg. case = O(nlogn)

package Sorting;

public class QuickSort {
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swap with the pivot element
        i++;
        int temp1 = arr[i];
        arr[i] = pivot;
        arr[high] = temp1;
        return i;
    }
    public static void InnerQuickSort (int arr[], int low, int high) {
        if(low < high){
            int pivotX = partition(arr, low, high);
            InnerQuickSort(arr, low, pivotX - 1);
            InnerQuickSort(arr, pivotX + 1, high);
        }
    }
    public static void main(String[] args) {
        int arr [] = {6, 3, 9, 5, 2, -8};
        int len = arr.length;
        InnerQuickSort(arr, 0, len - 1);
        //print
        for (int i = 0; i < len; i++) {
            System.out.print(" \t"+arr[i]);
        }
        System.out.println();
    }
}
