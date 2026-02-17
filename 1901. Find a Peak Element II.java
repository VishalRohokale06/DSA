class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int max=mat[0][0];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                max=Math.max(max,mat[i][j]);
            }
        }

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(max==mat[i][j]) return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
}
