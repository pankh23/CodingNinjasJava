public class GeometricSum {

	public static double findGeometricSum(int k){
		// Write your code here
		if(k<0){
			return 0;
		}else{
			double r=1.0/2.0;
		    double sum=(1-Math.pow(r, k+1))/(1-r);
		    // sum+=1;
		    return sum;
		}

	}
}
