// Search an element in an array using Linear or Sequencial Search

import java.util.Arrays;

class LinearSearch{
    public static void main (String args[]){
        int arr [] = {1, -552, 5, -789, 0, 6, 77};
        boolean flag = false;
        int search = 70;
        for( int i = 0; i < arr.length; i++){
            if(search == arr[i]){
                System.out.println("Element "+search+" found at "+i);
                flag = true;
                break;
            }
        }
        if(flag == false){
            System.out.println("Sorry not found!");
        }
    }
}


// OR
/*
public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Found, return index
            }
        }
        return -1; // Not found
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 4, 2};
        int target = 4;
        int index = linearSearch(numbers, target);
        if (index != -1) {
            System.out.println("Found at index: " + index);
        } else {
            System.out.println("Not found");
        }
    }
}
*/

// if don't want to use flag, simply with 1st IF condition add an ELSE
