import java.util.Scanner;
class Helper {
	// Method 1
	// Multiplication of 2 numbers
	// Method 2
	// // Multiplication of 3 numbers
	static int mul(int n,int k){
	return n*k;
	// int mul2=mul1*j;
	}
	static int mul2(int n,int k,int j){
		int mul1=mul(n,k);
		return mul1*j;
	}
}

// Class 2
class Solution {

	// Main driver method
	public static void main(String[] args)
	{

		// Take input using Scanner and print the output .
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int j=sc.nextInt();
		// return mul1;
		// return mul2;
		int m1=Helper.mul(n, k);
		int m2=Helper.mul2(n, k, j);
		System.out.println(m1);
		System.out.println(m2);
        sc.close();
	}
}