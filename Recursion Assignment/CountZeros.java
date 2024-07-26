public class CountZeros {

	public static int countZerosRec(int input){
		// Write your code here
		if(input==0){
			return 1;
		}
		if(input<10){
			return 0;
		}
		// int count=0;
		int rem=input%10;
		int count=countZerosRec(input/10);
		if(rem==0){
			count++;
		}
		return count;
	}
}


