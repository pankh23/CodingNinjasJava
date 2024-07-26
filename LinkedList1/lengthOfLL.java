class Node {
    public int data;
    public Node next;
   
    Node()
    {
        this.data = 0;
        this.next = null;
    }
   
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
   
    Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }
}

public class lengthOfLL {
    public static int length(Node head){
        //Your code goes here
        // Node<Integer> temp
        int count=0;
        while(head!=null && head.data!=-1){
            count++;
            // head.data++;
            head=head.next;
        }
        return count;
    }
}