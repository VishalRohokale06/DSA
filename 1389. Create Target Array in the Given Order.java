class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int size=0;
        int tar[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=size;j>index[i];j--){
                tar[j]=tar[j-1];
            }
            tar[index[i]]=nums[i];
            size++;
        }
        return tar;
    }
}
