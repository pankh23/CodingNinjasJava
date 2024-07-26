public class AllIndexesOfX {
    

	public static int[] allIndexes(int input[], int x, int startIndex) {
	
        if(startIndex==input.length){
            int output[] = new int[0];
            return output;
        }
        int smallOutput[] = allIndexes(input,x, startIndex+1);
		if(input[startIndex]==x){
            int output[] = new int[smallOutput.length +1];
            output[0] = startIndex;
            for(int i=0;i<smallOutput.length;i++){
             
            output[i+1] = smallOutput[i];
            }
            return output;
        }
        else{
            return smallOutput;
        }
    }
    

	public static int[] allIndexes(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		
		// int arr[]=new int[input.length];
		// for(int i=0;i<input.length;i++){
		// 	if(input[i]==x){
		// 		arr[i]=i;
		// 	}
			return allIndexes(input,x,0);

		// }
		// return arr;
		
	}
	
}

