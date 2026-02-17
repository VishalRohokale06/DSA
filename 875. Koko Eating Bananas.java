class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        for(int p:piles) high=Math.max(high,p);

        while(low<high){
            int mid=low+(high-low)/2;

            if(count(piles,h,mid)){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }

    private boolean count(int piles[],int h,int k){
        int hour=0;
        for(int p:piles){
            hour+=(p+k-1)/k;
        }

        return hour<=h;
    }
}
