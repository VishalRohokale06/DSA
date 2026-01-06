class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        boolean arr[] = new boolean[candies.length];
        List<Boolean> list = new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max) max=candies[i];
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max){
                arr[i]=true;
            }else{
                arr[i]=false;
            }
        }
        for(boolean b:arr){
            list.add(b);
        }
        return list;
    }
}
