class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

}

public class StackUsingLL {

    //Define the data members
    private Node top;
    private int size;

    


    public StackUsingLL() {
        //Implement the Constructor
        this.top=null;
        this.size=0;
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        //Implement the getSize() function
        return size;
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
        return size==0;
    }

    public void push(int element) {
        //Implement the push(element) function
        Node newNode=new Node(element);
        newNode.next=top;
        top=newNode;
        size++;
    }

    public int pop() {
        //Implement the pop() function
        if (isEmpty()) {
            return -1; // Stack underflow
        }
        int poppedData = top.data;
        top = top.next;
        size--;
        return poppedData;
    }

    public int top() {
        //Implement the top() function
        if(isEmpty()){
            return -1;
        }
        return top.data;
    }
}