class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int temp[] = new int[arr.length];
        int i=0;
        for(int num:arr){
            temp[i++]=num;
        }      
        Arrays.sort(temp);

        Map<Integer,Integer> map = new HashMap<>();
        int rank=1;

        for(int num:temp){
            if(!map.containsKey(num)){
                map.put(num,rank++);
            }
        } 

        for(int j=0;j<temp.length;j++){
            arr[j]=map.get(arr[j]);
        }

        return arr;
    }
}
