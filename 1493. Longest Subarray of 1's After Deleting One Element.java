class Solution {
    public int longestSubarray(int[] nums) {
	    int left=0;
	    int maxSum=0;
	    int count=0;

	    for(int i=0;i<nums.length;i++){

		    if(nums[i]==0){
			    count++;
		    }

		    while(count>1){
			    if(nums[i]==0){
				    count--;
			    }
			    left++;
		    }
		    maxSum=Math.max(maxSum,i-left);
	    }
	    return maxSum;
    }
}
