import java.util.Arrays;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n; // Handle cases where k is larger than the array size

        // Reverse the array in three steps
        reverse(nums, 0, n - 1); // Step 1: Reverse the entire array
        reverse(nums, 0, k - 1); // Step 2: Reverse the first k elements
        reverse(nums, k, n - 1); // Step 3: Reverse the remaining elements
    }

    // Helper method to reverse a subarray
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            // Swap elements at 'start' and 'end'
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 }; // Input array
        int k = 3; // Steps to rotate
        RotateArray solution = new RotateArray();
        solution.rotate(nums, k); // Perform rotation
        System.out.println("Rotated array: " + Arrays.toString(nums)); // Print result
    }
}
