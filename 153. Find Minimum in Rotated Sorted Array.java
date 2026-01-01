class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int ans = nums[0];

        if(nums.length==1) return nums[0];

        while(start<=end){
            if(nums[start]<nums[end]){
                return Math.min(ans,nums[start]);
            }

            int mid = start+(end-start)/2;
            ans = Math.min(ans,nums[mid]);

            if(nums[start]<=nums[mid]){
                start = mid+1;
            }else
            end = mid-1;
        }
        
        return ans;
    }
}
