class Solution {    
    public int[] singleNumber(int[] nums) {        
        //your code goes here
        int n = nums.length;
        long xor = 0;

        for(int i=0;i<n;i++){
            xor = xor^nums[i];
        }

        int right = (int)(xor&xor-1) ^ (int)xor;

        int xor1 = 0;
        int xor2 = 0;

        for(int i=0;i<n;i++){
            if((nums[i]&right) != 0){
                xor1 = xor1^nums[i];
            }
            else{
                xor2 = xor2^nums[i];
            }
        }

        if(xor1 > xor2) return new int[]{xor1, xor2};
        return new int[]{xor2, xor1};
    }
}