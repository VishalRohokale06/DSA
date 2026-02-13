class Solution {
    public int longestBalanced(String s) {
        
        int maxLen=0;

        for(int i=0;i<s.length();i++){
            int freq[]= new int[26];
            for(int j=i;j<s.length();j++){
                freq[s.charAt(j)-'a']++;

                if(isBalance(freq)){
                    maxLen=Math.max(maxLen,j-i+1);
                }
            }
        }
        return maxLen;
    }

    boolean isBalance(int[] freq){

            int count=0;

            for(int f:freq){
                if(f>0){
                    if(count==0){
                        count=f;
                    }else if(count!=f){
                        return false;
                    }
                }
            }
            return true;
        }
    }
