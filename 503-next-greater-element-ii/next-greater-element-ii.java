class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack <Integer> stack = new Stack<>();
        int[] ans = new int[n];
        Arrays.fill(ans,-1);
        for(int i =2*n-1; i>=0;i--){
            int num= nums[i%n];
            while(!stack.empty()&& stack.peek()<=num){
                stack.pop();
            }
            if(!stack.empty() && i<n){
                ans[i]= stack.peek();
            }
            stack.push(num);
        }return ans;
        
    }
}