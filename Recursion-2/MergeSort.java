public class MergeSort {

        public static void mergeSort(int[] arr, int l, int r){
            // Write your code here
            if (l < r) {
                int mid = (l + r) / 2;
                mergeSort(arr, l, mid); // Sort left half
                mergeSort(arr, mid + 1, r); // Sort right half
                merge(arr, l, mid, r); 
    
    
        }
        }
        private static void merge(int[] arr, int l, int mid, int r) {
            int n1 = mid - l + 1;
            int n2 = r - mid;
    
            int[] leftArr = new int[n1];
            int[] rightArr = new int[n2];
    
            // Copy data to temp arrays
            for (int i = 0; i < n1; ++i) {
                leftArr[i] = arr[l + i];
            }
            for (int j = 0; j < n2; ++j) {
                rightArr[j] = arr[mid + 1 + j];
            }
    
            // Merge the temp arrays
            int i = 0, j = 0;
            int k = l;
            while (i < n1 && j < n2) {
                if (leftArr[i] <= rightArr[j]) {
                    arr[k] = leftArr[i];
                    i++;
                } else {
                    arr[k] = rightArr[j];
                    j++;
                }
                k++;
            }
    
            // Copy remaining elements of leftArr[] if any
            while (i < n1) {
                arr[k] = leftArr[i];
                i++;
                k++;
            }
    
            // Copy remaining elements of rightArr[] if any
            while (j < n2) {
                arr[k] = rightArr[j];
                j++;
                k++;
            }
        }
    }
    

