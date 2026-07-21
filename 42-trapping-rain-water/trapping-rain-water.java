class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int i = 0;
        int j = n-1;
        int water =0;
        int leftmax= height[i];
        int rightmax= height[j];

        while(i< j){
            if (leftmax < rightmax ){
                i++;
                leftmax= Math.max(leftmax,height[i]);
                water += leftmax-height[i];
            }
            else {
                j--;
                rightmax= Math.max(rightmax,height[j]);
                water += rightmax - height[j];
            }
            
        } return water;
        
    }
}