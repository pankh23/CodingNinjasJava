public class Power {

        public static int power(int x, int n) {
            /* Your class should be named Solution
             * Don't write main().
             * Don't read input, it is passed as function argument.
             * Return output and don't print it.
             * Taking input and printing output is handled automatically.
             */
             if(n==0){
                 return 1;
             }
             if(x==0){
                 return 0;
             }
             if(n<0){
                 return -1;
             }
             int mul=1;
             for(int i=0;i<n;i++){
                 mul*=x;
    
             }
             return mul;
            
        }
}

