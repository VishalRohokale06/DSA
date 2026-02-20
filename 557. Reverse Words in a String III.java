class Solution {
    public String reverseWords(String s) {
        char arr[] = s.toCharArray();
        int start = 0;

        for(int i=0;i<=s.length();i++){
            if(i==s.length() || arr[i]==' '){
                reverse(arr,start,i-1);
                start=i+1;
            }
        }
        return new String(arr);
    }
    void reverse(char arr[],int l,int r){
        
        while(l<r){
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}
