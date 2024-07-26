public class CheckArraySorted {
    
        public static boolean arraySortedOrNot(int []A, int N) {
            // Write your code here.
            if(N<=1){
                // System.out.println("True");
                return true;
            }
            if(A[N-2]>A[N-1]){
                // return false;
                // System.out.println("False");
                return false;
            }
            return arraySortedOrNot(A, N-1);
            
        }
    }

