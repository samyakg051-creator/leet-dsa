class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int j =0;
        int countzero =0;
        for (int i = 0; i<n; i++){
          
                if( nums[i]==0){
                    countzero++;
                }
                if (countzero>k){
                    if(nums[j]==0){
                        countzero--;
                    }
                    j++;

                }

            }
            
        
        return n - j;
        
    }
}