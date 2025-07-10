// devicem input

import java.util.Arrays;

public class MissingNum {
    public static void main(String[] args) {
        int sum = 0;
        int[] arr = { 6, 8, 11, 10, 7 };
        Arrays.sort(arr);
        int start = arr[0];
        int end = arr[arr.length-1];
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            System.out.println("sum = "+sum);
            // Sum = totalSum - sum;
        }
        int totalSum = ((end * (end + 1)) / 2 - (start * (start - 1)) / 2);
        System.out.println("Total sum = "+totalSum);
        System.out.println("Missing number is: " + (totalSum - sum));
    }
}
