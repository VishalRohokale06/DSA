class Solution {
    public int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length){
            int currentInd = nums[i]-1;
            if(nums[i]!=nums[currentInd]){
                int temp = nums[i];
                nums[i]=nums[currentInd];
                nums[currentInd]=temp;
            }else{
                i++;
            }
        }

        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                return new int[]{nums[j],j+1};
            }
        }
        return new int[]{-1,-1};
    }
}
