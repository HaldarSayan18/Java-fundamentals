//using function

public class SecondLargestNum {
    public static int SecondLarge() {
        int arr[] = { 12, -10, 9, 2, 58, 41 };
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                System.out.println("arr = " + arr[i]);
                secMax = max;       // Update secMax before updating max
                max = arr[i];       // Update max with the largest element
            } else if (arr[i] > secMax && arr[i] != max) {
                // Update secMax if current element is smaller than max but larger than secMax
                secMax = arr[i];
            }
        }
        System.out.println("max1 = " + max);
        System.out.println("secmax = " + secMax);
        return secMax;
    }

    public static void main(String[] args) {
        int secMax = SecondLarge();
        System.out.println("Second largest element is = " + secMax);
    }
}
