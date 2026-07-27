class Solution {
    public int[] asteroidCollision(int[] asteroids) {
       
        Stack < Integer> stack = new Stack<>();
        for (int a : asteroids){
            while(!stack.empty()&&  stack.peek()>0 && a<0 && stack.peek()<-a){
                stack.pop();
            }
            if(!stack.empty() && stack.peek()>0 && a<0){
                if(stack.peek()==-a){
                    stack.pop();
                }

            }else {
                stack.push(a);
            }
        } int n = stack.size();
         int[] ans = new int[n];
        for(int i=n-1;i>=0;i--){
            ans[i]= stack.pop();
        }
        return ans;
    }
}