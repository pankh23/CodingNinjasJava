public class RemoveX {

	// Return the changed string
	public static String removeX(String input){
		// Write your code here
		if(input.isEmpty()){
			return "";
		}
		if(input.charAt(0)=='x'){
			return removeX(input.substring(1));
		}
		else{
			return input.charAt(0)+removeX(input.substring(1));
		}

	}
}


