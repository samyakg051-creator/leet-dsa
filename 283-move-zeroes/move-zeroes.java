class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int zerocount = 0;
        int j =0;
        for(int i =0;i<n;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
            else{
                zerocount++;
            }
        }while(zerocount>0){
            nums[j]=0;
            zerocount--;
            j++;
        }
        
    }
}