public class BinarySearchRecursive {

        // element - number to be searched
        public static int binarySearch(int input[], int element) {
            // Write your code here
            if(input.length==0){
                return -1;
            }
            int l=0;
            int h=input.length-1;
            // int mid=(l+h)/2;
    
            return helper(input, l, h, element);
    
    
        }
        public static int helper(int input[],int l,int h,int element){
            // if(input[mid]==element){
            // 	return mid;
            // }
            if (l <= h) {
                int mid = l + (h - l) / 2;
                if (input[mid] == element) {
                    return mid;
                    }
            
    
            else if(input[mid]>element){
                return helper(input, l, mid-1, element);
            }
            else{
                return helper(input, mid+1, h,element);
            }
            }
            return -1;
    
        }
    }
    
