public class NumberOfDigits {
    
        public static int countDigits(int n){
            // Write your code here.
            if(n<10){
                return 1;
            }
            else{
                return 1+countDigits(n/10);
            }
            // int count=0;
            // for(int i=0;i<)
        }
    }
    

