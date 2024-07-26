public class Sort012 {
        public static void sort012(int[] arr, int n){
            //Your code goes here
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                   if(arr[i]<arr[j]){
                       int temp=arr[i];
                       arr[i]=arr[j];
                       arr[j]=temp;
                   }
                }      
            }
        }
    
    }

