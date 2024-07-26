public class SumOfDigits {
    
	public static int sumOfDigits(int input){
		// Write your code here
		if(input<10){
			return input;
		}
		else{
			int num=input%10;
			int num2=input/10;
			return num+sumOfDigits(num2);
		}

	}
}

