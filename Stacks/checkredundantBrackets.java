import java.util.Stack;
public class checkredundantBrackets {
    
	public static boolean checkRedundantBrackets(String expression) {
		//Your code goes here
			
        Stack<Character> stack=new Stack<Character>();
        int count=0;
        for(int i=0;i<expression.length();i++)
        {
            char c=expression.charAt(i);
          
            if (c==')')
            {
                while(!stack.isEmpty() && stack.peek()!='(')
                {
                    count=count+1;
                    stack.pop();
                    //System.out.print(stack.pop());
                }
                
                if (count==0 || count==1)
                {
                    return true;
                }
                stack.pop();
                count=0;
                
            }
            else
            {
                stack.push(c);
				
            }
        }
        return false;
	}
}

