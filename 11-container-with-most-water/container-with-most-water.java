class Solution {
    public int maxArea(int[] height) {
        int n =height.length;
        int i =0;
        int j =n-1;
        int area =0;
        while(i<j){
            int ht = Math.min(height[i],height[j]);
            area = Math.max(ht*(j-i),area);
            if(height[i]>height[j]){
                j--;
            }else{
                i++;
            }

        }return area;
        
    }
}