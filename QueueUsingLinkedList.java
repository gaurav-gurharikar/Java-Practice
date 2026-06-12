class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class QueueUsingLinkedList {
    static Node front, rear;
    static int size = 0;

    public static void enqueue(int data) {
        Node newNode = new Node(data);
        if(size==0) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public static void dequeue() {
        if(size==0) {
            System.out.println("Queue is empty");
            return;
        } else if(size==1) {
            front = null;
            rear = null;
        } else {
            front = front.next;
        }
        size--;
    }

    public static void display() {
        if(size==0){
            System.out.println("Queue is empty");
            return;
        }
        Node currNode = front;
        System.out.println("----------");
        while(currNode!=rear.next) {
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
        System.out.println("----------");
    }

    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        display();
        dequeue();
        display();
        dequeue();
        display();
    }
}
