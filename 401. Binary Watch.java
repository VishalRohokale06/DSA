class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> list = new ArrayList<>();

        for(int i=0;i<12;i++){
            for(int j=0;j<60;j++){

                int bit = countBit(i)+countBit(j);

                if(bit == turnedOn){
                    list.add(i+":"+(j<10?"0"+j:j));
                }
            }
        }
        return list;
    }

    private int countBit(int n){
        int count=0;
        while(n>0){
            count+=n&1;
            n>>=1;
        }
        return count;
    }
}
