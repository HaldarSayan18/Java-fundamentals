//calculation of odd even without using % function

public class OddEven {
    // using bitwise operator
    // In bitwise operator the system break every digits into binary format
    public static void checkOddEven(int num) {
        if ((num & 1) == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }

    // isEven function using bitwise AND operator
    public static boolean isEven(int num) {
        return (num & 1) == 0;  // Returns true if the number is even
    }

    public static void main(String args[]) {
        System.out.println("calculation of odd even without using % function");
        checkOddEven(2); // Example for even
        checkOddEven(3); // Example for odd

        int num1 = 2;
        int num2 = 3;

        // Using the isEven function
        System.out.println(num1 + " is even? " + isEven(num1));  // true
        System.out.println(num2 + " is even? " + isEven(num2));  // false

        // You can also check for odd using the isEven function
        System.out.println(num1 + " is odd? " + !isEven(num1));  // false
        System.out.println(num2 + " is odd? " + !isEven(num2));  // true
    }
}
