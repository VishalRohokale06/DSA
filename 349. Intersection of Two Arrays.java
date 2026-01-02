class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

	    Set<Integer> set = new HashSet<>();
	    Set<Integer> reset = new HashSet<>();

	    for(int num:nums1){
		    set.add(num);
	    }

	    for(int num:nums2){
		    if(set.contains(num)){
			    reset.add(num);
		    }
	    }

	    int result[] = new int[reset.size()];
	    int i=0;
	    for(int num:reset){
		    result[i++]=num;
	    }
	    return result;
    }
}
