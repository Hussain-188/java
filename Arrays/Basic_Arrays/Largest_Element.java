import java.util.*;

class Solution {
    public int largestElement(int[] nums) {
        // Initialize max as the first element
        int max = nums[0];

        // Traverse the entire array
        for (int i = 1; i < nums.length; i++) {

            /* If current element is greater
            than max, update max*/
            if (nums[i] > max) {
                max = nums[i];
            }

        }
        // Return the largest element found
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,5,2};

        // Create an instance of the Solution class
        Solution sol = new Solution();

        // Find and print the largest element in the array
        System.out.println("The largest element in the array is: " + sol.largestElement(nums));
    }
}
