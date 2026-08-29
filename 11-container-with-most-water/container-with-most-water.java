class Solution {
    public int maxArea(int[] height) {
        int n =height.length;
        int i =0;
        int j =n-1;
        int area =0;
        while(i<j){
            int ht = Math.min(height[i],height[j]);
            area = Math.max(ht*(j-i),area);
           while(i<j && height[i]<=ht){i++;}
           while(i<j && height[j]<=ht){j--;}

        }return area;
        
    }
}