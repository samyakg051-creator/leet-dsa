class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxx =0;
        int max =0;
        int n = nums.length;
        for (int i = 0;i< n;i++){
            
            if ( nums[i]==1){
                max+=1;
            
            }
            if( nums[i]==0){
                maxx=Math.max(maxx,max);
                max = 0;
            } maxx = Math.max(maxx,max);
        }return maxx;
        
    }
}