class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n-1;
        int min = Integer.MAX_VALUE;
        if(n==1){
            return nums[i];
        }
        while(i<=j){
            int mid = i + (j-i)/2;
            if(nums[i]<=nums[mid]){
                min = Math.min(min,nums[i]);
                i = mid+1;
                
            }else{
                min = Math.min(min,nums[mid]);
                j=mid-1;


            }
        }return min==Integer.MAX_VALUE?-1:min;
        
    }
}