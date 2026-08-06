class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int currentWidth = right - left;
            int hLeft = height[left];
            int hRight = height[right];

            // Calculate area based on the shorter line
            if (hLeft < hRight) {
                int area = hLeft * currentWidth;
                if (area > maxArea) maxArea = area;
                
                // Fast-forward the left pointer past any lines that are shorter 
                // than the one we just evaluated, as they cannot possibly yield a larger area.
                while (left < right && height[left] <= hLeft) {
                    left++;
                }
            } else {
                int area = hRight * currentWidth;
                if (area > maxArea) maxArea = area;
                
                // Fast-forward the right pointer past any shorter lines.
                while (left < right && height[right] <= hRight) {
                    right--;
                }
            }
        }
        return maxArea;
    }
}