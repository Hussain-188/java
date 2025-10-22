import java.util.*;

class Solution2 {
    // Function to find intersection of two sorted arrays
    public int[] intersectionArray(int[] nums1, int[] nums2) {
        List<Integer> tempList = new ArrayList<>();
        int i = 0, j = 0;

        // Traverse both arrays using two pointers approach
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums2[j] < nums1[i]) {
                j++;
            }
            // nums1[i] == nums2[j]
            else {
                tempList.add(nums1[i]);
                i++;
                j++;
            }
        }

        // Convert the list to an integer array
        int[] ans = new int[tempList.size()];
        for (int k = 0; k < tempList.size(); k++) {
            ans[k] = tempList.get(k);
        }

        // Return the intersection of two arrays
        return ans;
    }
}

class Main1 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 3, 4, 5, 6, 7, 9, 10};
        int[] nums2 = {3, 3, 4, 4, 5, 8, 9};

        // Create an instance of the Solution class
        Solution2 finder = new Solution2();

        // Get intersection of nums1 and nums2 using class method
        int[] ans = finder.intersectionArray(nums1, nums2);

        System.out.println("Intersection of nums1 and nums2 is:");
        for (int val : ans) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}