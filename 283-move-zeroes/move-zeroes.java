class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = 0;
        int count = 0;
        for(int i = 0; i<n;i++){
            if(nums[i]==0){
                count++;
            }
            else{
                nums[j]=nums[i];
                j++;
            }
        }
        while(count!=0){
            nums[j]=0;
            j++;
            count--;
        }
        
    }
}