class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        
        int rows=matrix.length;
        int cols=matrix[0].length;

        for(int i=0;i<rows;i++){
            int min=matrix[i][0];
            int colIndex=0;
            for(int j=1;j<cols;j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                    colIndex=j;
                }
            }

            boolean isLucky=true;
            for(int j=0;j<rows;j++){
                if(matrix[j][colIndex]>min){
                    isLucky=false;
                    break;
                }
            }
            if(isLucky) list.add(min);

        }
        return list;
    }
}
