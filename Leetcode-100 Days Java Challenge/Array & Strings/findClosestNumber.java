
// Q1. 2239. Find Closest Number to Zero
// Link: https://leetcode.com/problems/find-closest-number-to-zero/
// import java.util.HashSet;
// import java.util.Set;

// public class findClosestNumber {
// public int findClosestNumber(int[] nums) {
// int closest = nums[0];

// for (int x : nums) {
// if (Math.abs(x) < Math.abs(closest)) {
// closest = x;
// }
// }

// if (closest < 0 && containst(nums, Math.abs(closest))) {
// return Math.abs(closest);
// }
// return closest;
// }

// private boolean containst(int[] nums, int target) {
// for (int num : nums) {
// if (num == target) {
// return true;
// }
// }
// return false;
// }
// }

// User Input Version
import java.util.Scanner;

public class findClosestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for number of elements
        System.out.println("Enter the size of the array:");

        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");

        // Read array elements
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Call method and print result
        int closestNumber = findClosestNumberFun(nums);
        System.out.println("Closest number to zero: " + closestNumber);

        sc.close();
    }

    public static int findClosestNumberFun(int[] nums) {
        int closest = nums[0];

        for (int x : nums) {
            if (Math.abs(x) < Math.abs(closest))
                closest = x;

            // If same absolute value, prefer positive
            else if (Math.abs(x) == Math.abs(closest) && x > closest)
                closest = x;
        }

        return closest;
    }

}