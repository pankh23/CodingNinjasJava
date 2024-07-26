class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}

public class FindNodeInLL {

    public static int findNode(Node<Integer> head, int n) {
		// Write your code here.
		Node<Integer> node = head;
        int count=0;
        while (node!=null)
        {
            if (node.data==n)
            {
                return count;
            }
            else
            {
                node=node.next;
                count++;
            }
        }
        return -1;
	}
}
