class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int freq1[] = new int[26];
        int freq2[] = new int[26];

        for(char c:name.toCharArray()){
            freq1[c-'a']++;
        }

        for(char c:typed.toCharArray()){
            freq2[c-'a']++;
        }

        for(int i=0;i<26;i++){
            if(freq2[i]<freq1[i]) return false;
        }
        return true;
    }
}
