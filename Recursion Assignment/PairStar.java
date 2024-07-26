public class PairStar {

	// Return the updated string
	public static String addStars(String s) {
		// Write your code here
		if(s.length()<=1){
			return s;
		}
		String s2=addStars(s.substring(1));
		if(s.charAt(0)==s.charAt(1)){
			s2=s.charAt(0)+"*"+s.charAt(1)+s2.substring(1);
		}
		else{
			s2=s.charAt(0)+s2;
		}
		return s2;

	}
}

