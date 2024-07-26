public class CheckPalindrome {
    
        public static boolean isPalindrome(String str) {
            // Write your code here.
            if(str.length()==0 || str.length()==1){
                return true;
            }
            if(str.charAt(0)==str.charAt(str.length()-1)){
                // return true;
                return isPalindrome(str.substring(1, str.length() - 1));
    
            }
            return false;
        }
    }
    

