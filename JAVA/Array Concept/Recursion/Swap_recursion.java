// Problem statement - Swap the elements of an array using recursion

import java.util.*;


public class Swap_recursion {
    public void swapArray(int l, int r, int [] arr){
        if(l >= r){
            return;
        }
        // swapArray
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        swapArray(l+1, r-1, arr);
    }

    // checking palindrome
    public boolean isRevString(int i, String str){
        // char [] chArr = str.toCharArray();
        if( i >= str.length() / 2){
            return true;
        }
        int len = str.length()-i-1;
        if( str.charAt(i) != str.charAt(len)){
            return false;
        }
        return isRevString(i+1, str);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int arr[] = {1, 2, 3,6, 9, 5, 2};
        System.out.print("Original array =\t"+Arrays.toString(arr));
        System.out.println();
        Swap_recursion sr = new Swap_recursion();
        sr.swapArray(0, arr.length-1, arr);
        System.out.print("Swapped array =\t"+Arrays.toString(arr));
        System.out.println();
        
        System.out.println("Enter a string: ");
        String str = sc.next();
        boolean result = sr.isRevString(0, str);
        System.out.println("Is palindrome - "+result);

        sc.close();
    }
}