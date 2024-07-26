public class CheckPalindrome {
    
        public static boolean isPalindrome(String str) {
            // Write your code here.
            if(str.length()<=1){
                return true;
            }
            else{
                char first=str.charAt(0);
                char last=str.charAt(str.length()-1);
                if(first!=last){
                    return false;
                }
                else{
                    return isPalindrome(str.substring(1,str.length()-1));
                }
            }
        }
    }
    

