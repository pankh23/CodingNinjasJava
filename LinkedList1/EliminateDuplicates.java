class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}

public class EliminateDuplicates {
    
    public static Node<Integer> removeDuplicates(Node<Integer> head) {
		//Your code goes here
		 if (head==null || head.next==null)
        {
            return head;
        }
        Node<Integer> uniqueNode=head.next,node=head;
            
            while (uniqueNode!=null)
            {
                
                if (!(uniqueNode.data).equals(node.data))
                {
                    
                    node.next=uniqueNode;
                    node=node.next;
                    
                }
                uniqueNode=uniqueNode.next;
                
            }
            node.next=uniqueNode;
            
        
        	return head; 
	}

}
