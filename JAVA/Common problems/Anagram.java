import java.util.*;

public class Anagram {
    public static void anagramCheck(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        // System.out.println(arr1);
        char[] arr2 = str2.toCharArray();
        // System.out.println(arr2);
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (str1.length() != str2.length()) {
            System.out.println("Give right lenghthed input");
        } 
        else {
            if (Arrays.equals(arr1, arr2)) {
                System.out.println(str1 + "\t and \t" + str2 + "\t both are anagram.");
            } else {
                System.out.println("Both strings are not anagram.");
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("Concept of Anagram");
        String str1 = "listen";
        String str2 = "salient";
        anagramCheck(str1, str2);

    }
}
