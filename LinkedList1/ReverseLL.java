class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}


public class ReverseLL {
    public static void printReverse(Node<Integer> root) {
		//Your code goes here
		 Node<Integer> smallOutput=printReverseRecursion(root);
	}
    
    public static Node<Integer> printReverseRecursion(Node<Integer> node)
    {
        if (node==null)
            return node;
        Node<Integer> smallOutput=printReverseRecursion(node.next);
        System.out.print(node.data+" ");
        return smallOutput;
	}
}
