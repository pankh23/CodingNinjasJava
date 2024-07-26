public class ReturnSubsetsSumToK {

        // Return a 2D array that contains all the subsets which sum to k
        public static int[][] subsetsSumK(int input[], int k) {
            // Write your code here
            // int total=1<<input.length;
            // int result[][]=new int[total][];
            int[][] result = new int[1 << input.length][];
            int[] subset = new int[input.length];
            int[] count = {0};
            generateSubsets(input, k, 0, subset, 0, 0, result, count);
            int[][] actualResult = new int[count[0]][];
            System.arraycopy(result, 0, actualResult, 0, count[0]);
            return actualResult;
        }
    
        private static void generateSubsets(int[] input, int k, int index, int[] subset, int subsetSize, int currentSum, int[][] result, int[] count) {
            if (currentSum == k) {
                int[] temp = new int[subsetSize];
                System.arraycopy(subset, 0, temp, 0, subsetSize);
                result[count[0]++] = temp;
                return;
            }
    
            if (index == input.length || currentSum > k) {
                return;
            }
    
            // Include current element
            subset[subsetSize] = input[index];
            generateSubsets(input, k, index + 1, subset, subsetSize + 1, currentSum + input[index], result, count);
    
            // Exclude current element
            generateSubsets(input, k, index + 1, subset, subsetSize, currentSum,result,count);
    
        }
    }
    

