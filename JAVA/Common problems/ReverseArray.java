/*array[len-i-1] means the right most value of the array*/

/*reverse happens from both sides that's why "i < len/2" else for "i <len" it will reverse twice so o/p no change */

import java.util.*;
public class ReverseArray {
    public static void Reverse(int [] array){
        int len =  array.length;
        for (int i = 0; i < len/2; i++) {
            int temp = array[i];
            array[i] = array[len - i - 1];
            array[len - i - 1] = temp;
        }
        System.out.println("Reversed array = "+Arrays.toString(array));
    }
    public static void main(String[] args) {
        int array [] = {12, 9, 58, -79, 101, 11};
        Reverse(array);
    }
}
