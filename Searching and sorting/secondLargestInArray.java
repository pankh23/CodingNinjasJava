public class secondLargestInArray {
    public static int secondLargestElement(int[] arr, int n) {
            //Your code goes here
            int max=0;
            int max2=0;
            for(int i:arr){
                if(i>max){
                    max2=max;
                    max=i;
                }else if(i>max2 && i!=max){
                    max2=i;
                }
    
            }
            return max2;
        }
    
    }

