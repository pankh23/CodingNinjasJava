public class PrintKeypad {

        public static void printKeypad(int input){
            // Write your code here
            String[] ans = printKeypadHelper(input);
            for (String combination : ans) {
                System.out.println(combination);
            }
            
        }
        private static String[] printKeypadHelper(int input) {
            if (input == 0 || input == 1) {
                String[] ans = {""};
                return ans;
            }
    
            int newN = input % 10;
            String[] ans = printKeypadHelper(input / 10);
            String helpans = helper(newN);
            String[] finalans = new String[helpans.length() * ans.length];
            int k = 0;
            for (int i = 0; i < ans.length; i++) {
                for (int j = 0; j < helpans.length(); j++) {
                    finalans[k] = ans[i] + helpans.charAt(j);
                    k++;
                }
            }
            return finalans;
        }
        private static String helper(int newN){
            if(newN==2)
                return "abc";
                // System.out.println("abc");
            if(newN==3)
                return "def";
                // System.out.println("def");
            if(newN==4)
                return "ghi";
                // System.out.println("ghi");
            if(newN==5)
                return "jkl";
                // System.out.println("jkl");
            if(newN==6)
                return "mno";
                // System.out.println("mno");
            if(newN==7)
                return "pqrs";
                // System.out.println("pqrs");
            if(newN==8)
                return "tuv";
                // System.out.println("tuv");
            if(newN==9)
                return "wxyz";
                // System.out.println("wxyz");
            else
                return "";
    
    
        }
    
    }

