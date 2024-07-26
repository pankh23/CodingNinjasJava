class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}

public class inserNodeInLL {

	public static Node<Integer> insert(Node<Integer> head, int pos, int data){
		//Your code goes here
		Node<Integer> node=new Node<>(data);
		if (head == null) {
            return node;
        }
        if (pos == 0) {
            node.next = head;
            return node;
        }
		int count=0;
		Node<Integer> temp=head;
		while(count<pos-1 && temp.next != null){
			count++;
			temp=temp.next;
		}
		if(count==pos-1){
		node.next=temp.next;
		temp.next=node;
		}
		return head;

	}
}

