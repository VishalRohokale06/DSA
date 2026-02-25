class Solution {
    public String reversePrefix(String word, char ch) {
        
        char arr[] = word.toCharArray();
        int k=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==ch){
                k=i;
                break;
            }
        }
        if(k==-1) return word;


        int left = 0;
        int right = k;

        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }
}
