class Solution {
    public int singleNumber(int[] nums) {
        //your code goes here
        int n = nums.length;
        Arrays.sort(nums);

        for(int i=1;i<nums.length;i+=3){
            if(nums[i-1]!=nums[i]) return nums[i-1];
        }
        return nums[n-1];
    }
}