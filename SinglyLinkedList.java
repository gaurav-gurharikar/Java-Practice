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

    //Insert at position

    //Delete at first
    public void deleteAtFirst() {
        if(head == null) return;
        head = head.next;
    }

    //Delete at last
    public void deleteAtLast() {
        if(head == null || head.next == null) {
            head = null;
            return;
        }
        Node currNode = head;
        while(currNode.next.next!=null) {
            currNode = currNode.next;
        }
        currNode.next = null;

    }

    //Delete at position

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
        list.insertAtFirst(1);
        list.insertAtFirst(2);
        list.displayList();
        list.insertAtLast(3);
        list.insertAtLast(4);
        list.displayList();
        list.deleteAtFirst();
        list.deleteAtLast();
        list.displayList();
    }
}