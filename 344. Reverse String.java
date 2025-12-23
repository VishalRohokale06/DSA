class Reverse{
	public static void main(String[] args){
		
		char arr[] = {'h','e','l','l','o'};

		int i=0;
		int j=arr.length-1;

		while(i<arr.length/2){
			char temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}

		for(int k=0;k<arr.length;k++){
			System.out.println(arr[k]);
		}
	}
}
