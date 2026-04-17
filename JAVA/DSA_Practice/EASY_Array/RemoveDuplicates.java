public class RemoveDuplicates {
    public void manualSort(int[] nums, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(nums, low, high);
            manualSort(nums, low, pivotIndex - 1);
            manualSort(nums, pivotIndex + 1, high);
        }
    };

    private int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (nums[j] < pivot) {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[i + 1];
        nums[i + 1] = nums[high];
        nums[high] = temp;
        return i + 1;
    };

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;

        int uniqueIndex = 0; // Pointer for the last unique element
        for (int current = 1; current < nums.length; current++) {
            // Compare current element with the last known unique element
            if (nums[current] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[current];
            }
        }
        return uniqueIndex + 1; // Returns k (count of unique elements)
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 2 };
        RemoveDuplicates obj = new RemoveDuplicates();
        obj.manualSort(nums, 0, nums.length - 1);
        int k = obj.removeDuplicates(nums);
        for (int i = 0; i < k; i++) {
            System.out.println(nums[i] + "");
        }
    }
};