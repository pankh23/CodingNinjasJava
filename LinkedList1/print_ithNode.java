class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}

public class print_ithNode {
    public static void printIthNode(Node<Integer> head, int i){

		Node<Integer> temp=head;
		int index=0;
		int count=0;
		while(temp!=null){
			count++;
			temp=temp.next;
		}
		temp=head;
		while(temp!=null){
			if(index==i){
				// return temp.data;
				System.out.println(temp.data);
				break;
			}
			index++;
			temp=temp.next;
		}
        
    }
}
