class Solution {
    public boolean canJump(int[] nums) {
     int maxSearch=0;
     for(int i=0;i<nums.length;i++){
        if(i>maxSearch){
            return false;
        }
        maxSearch=Math.max(maxSearch,i+nums[i]);
     }   
     return true;
    }
}
