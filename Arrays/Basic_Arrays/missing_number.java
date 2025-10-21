import java.util.*;

class Solution1 {
    // Function to find the missing number
    public int missingNumber(int[] nums) {
        // Calculate N from the length of nums
        int N = nums.length;

        // Summation of first N natural numbers
        int sum1 = (N * (N + 1)) / 2;

        // Summation of all elements in nums
        int sum2 = 0;
        for (int num : nums) {
            sum2 += num;
        }

        // Calculate the missing number
        int missingNum = sum1 - sum2;

        // Return the missing number
        return missingNum;
    }

    public static void main(String[] args) {
        // Example array with missing number
        int[] nums = {0,1, 2, 4};

        // Create an instance of the Solution class
        Solution1 solution = new Solution1();

        /* Call the missingNumber method
        to find the missing number*/
        int ans = solution.missingNumber(nums);

        System.out.println("The missing number is: " + ans);
    }
}
