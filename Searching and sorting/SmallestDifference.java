public class SmallestDifference {
        public static int smallestDifferencePair(int []arr1, int n, int []arr2, int m) {
            // Write your code here.
            int minDiff=Integer.MAX_VALUE;
    
                    // Sort both arrays
            // int minDiff = Integer.MAX_VALUE; // Initialize with positive infinity
    
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int diff = Math.abs(arr1[i] - arr2[j]);
                    minDiff = Math.min(minDiff, diff);
                }
            }
    
            return minDiff;
    
    
            
        }
    }

