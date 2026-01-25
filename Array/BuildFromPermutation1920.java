public class BuildFromPermutation1920 {
    
    // Method to build the output array based on the given permutation nums
    public int[] buildArray(int[] nums) {
        // Get the length of the input array
        int n = nums.length;
        
        // Initialize the output array of the same length as the input array
        int[] ans = new int[n];
        
        // Loop through each index in the input array
        for (int i = 0; i < n; i++) {
            // Set the value of ans[i] to nums[nums[i]]
            ans[i] = nums[nums[i]];
        }
        
        // Return the built output array
        return ans;
    }

    // Main method to test the buildArray method
    public static void main(String[] args) {
        BuildFromPermutation1920 solution = new BuildFromPermutation1920();
        
        // Example input array
        int[] nums = {0, 2, 1, 5, 3, 4};
        
        // Call the buildArray method and store the result in ans
        int[] ans = solution.buildArray(nums);
        
        // Print the output array
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}
