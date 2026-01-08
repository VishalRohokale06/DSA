class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int arr[][] = new int[m][n];
        for(int i=0;i<indices.length;i++){
            int r=indices[i][0];
            int c=indices[i][1];

            for(int j=0;j<n;j++){
                arr[r][j]++;
            }

            for(int j=0;j<m;j++){
                arr[j][c]++;
            }
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]%2==1){
                    count++;
                }
            }
        }
        return count;
    }
}
