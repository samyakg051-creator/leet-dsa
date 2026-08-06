class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0;
        int j = n-1;
        int area = 0;
        while(i<j){
            int wide = Math.min(height[i],height[j]);
            area = Math.max(area,wide*(j-i));
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        } return area;
    }
}