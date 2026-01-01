class Solution {
    public int climbStairs(int n) {
        int one=1;
        int two=2;
        if(n==1) return 1;

        for(int i=3;i<=n;i++){
            int total=one+two;
            one=two;
            two=total;
        }
        return two;
    }
}
