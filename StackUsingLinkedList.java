class Node {
    int data;
    Node prev;

    Node(int data) {
        this.data = data;
        this.prev = null;
    }
}
public class StackUsingLinkedList {
    static Node top;
    static int size = 0;

    public static void push(int data) {
        Node newNode = new Node(data);
        newNode.prev = top;
        top = newNode;
        size++;
    }

    public static void pop() {
        if(size==0){
            System.out.println("Stack is empty");
            return;
        }
        top = top.prev;
        size--;
    }

    public static void display() {
        if(size==0){
            System.out.println("Stack is empty");
            return;
        }
        Node currNode = top;
        System.out.println("----------");
        while(currNode!=null) {
            System.out.println(currNode.data);
            currNode = currNode.prev;
        }
        System.out.println("----------");
    }

    public static void main(String[] args) {
        push(10);
        push(20);
        display();
        pop();
        display();
        pop();
        display();
    }
}
