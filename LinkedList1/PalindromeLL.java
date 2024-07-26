import java.util.ArrayList;

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}



public class PalindromeLL {
    public static boolean isPalindrome(Node<Integer> head) {
		//Your code goes here
		Node<Integer> node=head;
        ArrayList<Integer> arr = new ArrayList<>();
        while (node!=null)
        {
            arr.add(node.data);
            node=node.next;
        }
        int start=0, end=arr.size()-1;
        while(start<end)
        {
            if (arr.get(start)!=arr.get(end))
            {
                return false;
            }
            else
            {
                start=start+1;
                end=end-1;
            }
        }
        
        return true;
}
}
