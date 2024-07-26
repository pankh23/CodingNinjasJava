public class findInversion {
        public static int getInversions(int[] arr, int n){
            //Your code goes here
            int count=0;
            for(int i=0;i<n-1;i++){
                int min=i;
                for(int j=i+1;j<n;j++){
                    if(arr[j]<arr[min]){
                        min=j; 
                    }
                }
                count+=min-i;
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
            return count;
        }
    
    }

