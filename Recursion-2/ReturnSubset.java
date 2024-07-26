public class ReturnSubset {

        // Return a 2D array that contains all the subsets
        public static int[][] subsets(int input[]) {
            // Write your code here
            int totalSubsets = 1 << input.length; // Total number of subsets = 2^n
            int[][] result = new int[totalSubsets][]; // Initialize the result array
    
            for (int i = 0; i < totalSubsets; i++) {
                int subsetSize = countBits(i); // Calculate the number of elements in the current subset
                result[i] = new int[subsetSize]; // Initialize the subset array with the calculated size
    
                int index = 0;
                for (int j = 0; j < input.length; j++) {
                    if ((i & (1 << j)) != 0) { // Check if jth bit is set in the current subset index
                        result[i][index++] = input[j]; // Add the corresponding element to the subset
                    }
                }
            }
    
            return result;
        
        }
        private static int countBits(int num) {
            int count = 0;
            while (num > 0) {
                count += num & 1;
                num >>= 1;
            }
            return count;
        }
    }


