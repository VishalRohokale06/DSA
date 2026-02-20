class Solution {
    public boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        int mid = s.length() / 2;
        int ac=0,bc=0;

        for(int i=0;i<mid;i++){
            char c = s.charAt(i);
            if(c=='a'||
               c=='e'||
               c=='i'||
               c=='o'||
               c=='u'){
                ac++;
               }
        }
        for(int i=mid;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='a'||
               c=='e'||
               c=='i'||
               c=='o'||
               c=='u'){
               bc++;
               }
        }
        return ac==bc;
    }
}
