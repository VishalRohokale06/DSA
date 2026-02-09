class Solution {
    public double average(int[] salary) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int sum=0;

        for(int num:salary){
            if(num>max){
                max=num;
            }
            if(num<min){
                min=num;
            }
            sum+=num;
        }
        sum-=min+max;
        
        return (double)(sum/(salary.length-2));
    }
}
