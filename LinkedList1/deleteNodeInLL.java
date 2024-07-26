class  Node<T> {
    T data;
     Node<T> next;

    public  Node(T data) {
        this.data = data;
    }
}

public class deleteNodeInLL {
    public static Node<Integer> deleteNode( Node<Integer> head, int pos) {
		// Write your code here.
		
		if (head ==null)
        {
            return head;
        }
            
        else if(pos==0)
        {
            head=head.next;
        }
        else
        {
            Node<Integer> n=head;
            for (int i=0;i<pos-1 && n!=null;i++)
            {
                n=n.next;
            }
            if (n!=null && n.next!=null)
            {
                if (n.next!=null)
                {
                    n.next=n.next.next;
                }
                else
                {
                    n.next=null;
                }
                
            }
        }
        return head;
	
	}
}
