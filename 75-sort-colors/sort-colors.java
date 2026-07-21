class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int k = n-1;
        while ( j<=k){
            if(nums[j]==0){
                nums[j]=nums[i];
                nums[i]=0;
                i++;
                j++;
            }
            else if(nums[j]==1){
                j++;

            } 
            else{
                nums[j] = nums[k];
                nums[k] = 2;
                k--;
            }

        }

        }
        
    }
