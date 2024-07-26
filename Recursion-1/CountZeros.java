public class CountZeros {
    

	public static int countZerosRec(int input){
		// Write your code here
		int count=0;
		if(input==0){
			return 1;
		}
		if(input<10){
			return 0;
		}
		int last=input%10;
		if(last==0){
			return 1+countZerosRec(input/10);
		}
		else{
			return countZerosRec(input/10);
		}
	}
}


