public class SinglyLinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    //Insert at first
    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    //Insert at last
    public void insertAtLast(int data) {
        Node newNode = new Node(data);
        if(head==null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next!=null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //Insert at a position
    //Delete first
    //Delete last
    //Delete position

    //Display
    public void displayList() {
        Node currNode = head;
        while(currNode!=null) {
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.displayList();
        list.insertAtFirst(5);
        list.insertAtFirst(4);
        list.displayList();
        list.insertAtLast(6);
        list.displayList();
    }
}