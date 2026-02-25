class Solution {
    public boolean checkOnesSegment(String s) {
        boolean zeroseen = false;
        for(char c:s.toCharArray()){
            if(c=='0') zeroseen=true;
            else if(zeroseen) return false;
        }
        return true;
    }
}
