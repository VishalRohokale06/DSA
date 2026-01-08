class Solution {
    public static int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length/2;j++){
                int temp=image[i][j];
                image[i][j]=image[i][image[i].length-1-j];
                image[i][image[i].length-1-j]=temp;
            }
             for(int k=0;k<image[i].length;k++){
                 if(image[i][k]==1) image[i][k]=0;
                 else image[i][k]=1;
             }
        }
        return image;
    }

    public static void main(String[] args){
	    int arr[][] = {{1,1,0},{1,0,1},{0,0,0}};
	     int ans[][] = flipAndInvertImage(arr);
	     for(int i=0;i<ans.length;i++){
		     for(int j=0;j<ans[i].length;j++){
			     System.out.println(ans[i][j]);
		     }
	     }
    }
}
