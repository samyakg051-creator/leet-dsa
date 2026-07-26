class Solution {
    public int mySqrt(int x) {
        if(x<2){
            return x;
        }
        long i =0;
        long j = x/2;
        while(i<=j){
            long mid = i + (j-i)/2;
            long square = mid*mid;
            if(square == x){
                return (int) mid;
            }
            else if(square<x){
                i = mid+1;
            }else{
                j=mid-1;
            }
        }return (int) j;
        
    }
}