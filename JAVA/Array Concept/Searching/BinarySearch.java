// Search an element in an array using Binary Search
// For this kind of searching the array must be sorted.

import java.util.Scanner;
import java.util.Arrays;

class BinarySearch {
    public static void main(String args []) {
        boolean flag = false;
        Scanner sc = new Scanner(System.in); // take user input
        System.out.println("Enter length of array= ");
        int arrLen = sc.nextInt();
        int [] newArr = new int [arrLen];
        System.out.println("Enter "+arrLen+" numbers");
        for(int i = 0; i < arrLen; i++){
            System.out.print("Enter element at index " + i + ": ");
            newArr[i] = sc.nextInt();
        }
        Arrays.sort(newArr);
        System.out.print("Sorted array is = ");
        for(int i = 0; i <= newArr.length-1; i++){
            System.out.print(newArr[i]+" ");
        }
        System.out.println();
        int low = 0;
        int high = newArr.length - 1;
        System.out.println("Enter a key to search = ");
        int key = sc.nextInt();

        while(low <= high){
            int mid = (low + high) / 2;
            if(newArr[mid] == key){
                System.out.println("Element found!");
                flag = true;
                break;
            } else if (newArr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if(flag == false){
            System.out.println("Your element not exists");
        }
        sc.close();
    }
}