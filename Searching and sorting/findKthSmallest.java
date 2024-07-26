public class findKthSmallest {
        public static int kthSmallest(int[] arr, int n, int k){
            //Your code goes here
            if (arr == null || n <= 0 || k <= 0 || k > n)
                return Integer.MIN_VALUE;
            // int m=Integer.MIN_VALUE;
            for(int i=0;i<k;i++){
                for(int j=i+1;j<n;j++){
                    if(arr[j]<arr[i]){
                        sort(arr,i,j);
                    }
    
                }
            }
            return arr[k-1];
        }
        public static void sort(int arr[],int i,int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
    
        }
    
    }

