class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k<=1){
            return 0;
        }
        int n = nums.length;
    
       int j =0;
       int count = 0;
       int mul = 1;
       for(int i =0; i< n ;i++){
        mul*=nums[i];
        while(mul>=k){
            mul/=nums[j];
            j++;
        }
        count += i-j+1;
       }return count;

        
    }
}