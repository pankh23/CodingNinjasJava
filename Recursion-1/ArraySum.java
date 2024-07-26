public class ArraySum {

	public static int sum(int input[]) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		// for(int i=0;i<input.length;i++){
		if(input.length==0){
			return 0;
		}
		int output=0;
		for(int i=0;i<input.length;i++){
			output+=input[i];
		}

		// }
		return output;
	}
}