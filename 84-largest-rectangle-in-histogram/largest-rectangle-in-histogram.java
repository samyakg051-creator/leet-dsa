class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int max_area = 0; // Declare and initialize max_area here

        for (int i = 0; i <= heights.length; i++) {
            int curr_h = (i == heights.length) ? 0 : heights[i];
            
            while (!stack.isEmpty() && curr_h <= heights[stack.peek()]) {
                int h = heights[stack.pop()];
                int w = stack.isEmpty() ? i : i - stack.peek() - 1;

                max_area = Math.max(max_area, h * w);
            }
            stack.push(i);
        }
        
        return max_area;
    }
}