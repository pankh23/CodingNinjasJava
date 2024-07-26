public class GeometricSum {

	public static double findGeometricSum(int k){
		// Write your code here
		// int ans=0;
		if(k==0){
			return 1;
		}
		return findGeometricSum(k-1)+1.0/Math.pow(2, k);

	}
}

