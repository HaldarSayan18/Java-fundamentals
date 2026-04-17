/*
    Example 1:
        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    
    Example 2:
        Input: nums = [3,2,4], target = 6
        Output: [1,2]
*/

package JAVA.DSA_Practice.EASY_Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    // public int[] Twosum(int[] arr, int target) {
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = i + 1; j < arr.length; j++) {
    //             if (arr[i] + arr[j] == target) {
    //                 return new int[] { i, j };
    //             }
    //         }
    //     }
    //     return null;
    // }
    public int[] Twosum(int[] nums, int target) {
        // Map to store: Key = value, Value = index
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // If the complement is already in the map, we found the pair
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            // Otherwise, add the current number to the map
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 22;
        TwoSum obj = new TwoSum();
        int[] result = obj.Twosum(arr, target);
        if (result != null) {
            System.out.printf("[%d, %d]\n", result[0], result[1]);
        } else {
            System.out.println("No two-sum solution found.");
        }
    }
};