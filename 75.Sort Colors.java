class Solution {
    public void sortColors(int[] nums) {
        quickSort(nums,0,nums.length-1);
    }

    static void quickSort(int arr[],int start,int end){
        if(start>=end){
            return;
        }
        int pivotIndex = partion(arr,start,end);
        quickSort(arr,start,pivotIndex-1);
        quickSort(arr,pivotIndex+1,end);
    }

    static int partion(int arr[],int start,int end){
        int pivot = arr[end];
        int pivotIndex = start-1;

        for(int i=start;i<end;i++){
            if(arr[i]<pivot){
                pivotIndex++;
                int temp=arr[i];
                arr[i]=arr[pivotIndex];
                arr[pivotIndex]=temp;
            }
        }

        pivotIndex++;
                int temp=arr[end];
                arr[end]=arr[pivotIndex];
                arr[pivotIndex]=temp;

                return pivotIndex;
    }
}
