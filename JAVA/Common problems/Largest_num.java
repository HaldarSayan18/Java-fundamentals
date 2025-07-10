//without using a function

public class Largest_num {
    // public static findMax(int [] arr){   
    //     int max = arr[0];
    //     for(int i = 0; i <= arr.length; i++){
    //         if (arr[i] > max) {
    //             max = arr[i];
    //         }
    //     }
    //     return max;
        
    // }
    
	public static void main(String args[]){
        int arr [] = {3, 5, 4, 1, -9};
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest number is = "+max);
	}
}