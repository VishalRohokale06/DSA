class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        Integer[] temp = new Integer[nums.length];
        int i=0;
        for(int num:nums){
            temp[i++]=num;
        }

        Arrays.sort(temp,(a,b)->{
            int fa = map.get(a);
            int fb = map.get(b);

            if(fa==fb){
                return b-a;
            }
            return fa-fb;     
        });

        for (int j = 0; j < nums.length; j++) {
            nums[j] = temp[j];
        }

        return nums;
        
    }
}
