import java.util.*;

class Solution3 {
    // Function to find the leaders in an array.
    public List<Integer> leaders(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        if (nums.length == 0) {
            return ans;
        }

        // Last element of the array is always a leader
        int max = nums[nums.length - 1];
        ans.add(nums[nums.length - 1]);

        // Check elements from right to left
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > max) {
                ans.add(nums[i]);
                max = nums[i];
            }
        }
        
        /* Reverse the list to match
        the required output order */
        Collections.reverse(ans);

        // Return the leaders
        return ans;
    }
}

class Main {
    public static void main(String[] args) {
        int[] nums = {10, 22, 12, 3, 0, 6};

        // Create an instance of the Solution class
        Solution3 finder = new Solution3();

        // Get leaders using class method
        List<Integer> ans = finder.leaders(nums);

        System.out.print("Leaders in the array are: ");
        for (int leader : ans) {
            System.out.print(leader + " ");
        }
        System.out.println();
    }
}