// Remove dulicate from sorted array
// Leetcode: https://leetcode.com/problems/remove-duplicates-from-sorted-array/

import java.util.Arrays;

class RemoveDupicate {
    public static void main (String args[]){
        int arr[] = {1, 1, 2, 2, 3, 4, 4, 5};
        int j = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[j] != arr[i]) {
                arr[++j] = arr[i];
                System.out.println("i===>"+arr[i]);
                System.out.println("j===>"+arr[j]);
            } else {
                System.out.println("Same");
            }
        }
        // System.out.println(arr[j]);
        for(int i = 0; i < j; i++) {
            System.out.println(arr[i]);
        }
    }
}

// import java.util.Arrays;
// public class RemoveDupicate {
//     public static void main(String args[]){
//         int arr[] = {0,0,1,3,5,5,7};
//         int j = 1;
//         for(int i = 0; i < arr.length-1; i++){
//                 if(arr[i] != arr[i+1]){
//                     arr[j] = arr[i+1];
//                     System.out.println("arr[i+1] = "+arr[i+1]);
//                     System.out.println("arr[j] = "+arr[j]);
//                     j++;
//                     System.out.println("Count= "+j);
//                 }
//         }
//         // System.out.println("Count= "+j);
//         for(int i = 0; i <j; i++){
//             System.out.println(arr[i]+" ");
//         }
//         // Main m = new Main();
//     }
// }