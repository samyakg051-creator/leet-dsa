class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0]; // Fix 1: Initialize max to the first element
        int sum = 0;       // Fix 2: Start sum at 0
        
        // Loop through all elements starting from 0
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(max, sum);
            
            if(sum < 0) {
                sum = 0; // Reset sum if it drops below zero
            }
        }
        return max;
    }
}