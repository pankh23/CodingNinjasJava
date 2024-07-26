public class PrintNumbers {
    
        public static void print(int n){
            //Write your code here
            if(n==0){
                return;
            }
            print(n-1);
            // return n;
            System.out.print(n+" ");
    
    }
}
    

