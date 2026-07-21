class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int area = 0;
        int i =0;
       
            int j = n-1;
            
            while(i<j){
            int max = Math.min(height[i],height[j]);
            area = Math.max(area,(j-i)* max);
            if ( height[i]<height[j]){
                i++;
            }else 
            j--;
            
   
        }return area;
        
    }
}