class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int j = 0;
        int countone =0;
        int counttwo =0;
        for(int i =0;i<n;i++){
            if (nums[i]==0){
                nums[j]=0;
                j++;
            }else if( nums[i]==2){
                counttwo +=1;
            }else{
                countone +=1;
            }
        }while(j<n){
            while(countone!=0){
                nums[j]=1;
                j++;
                countone--;
            }
            while(counttwo != 0){
                nums[j]=2;
                j++;
                counttwo--;
            }
        }

    }
}
