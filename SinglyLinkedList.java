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
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        Node currNode = head;
        Node prevNode = null;
        int counter = 1;
        if(position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        while(currNode!=null) {
            if(position!=counter) {
                counter++;
            }
            else {
                prevNode.next = newNode;
                newNode.next = currNode;
                return;
            }
            prevNode = currNode;
            currNode = currNode.next;
        }
    }

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
    public void deleteAtPosition(int position) {
        if(head==null) return;
        Node currNode = head;
        Node prevNode = null;
        int counter = 1;
        if(position==1) {
            head=head.next;
            return;
        }
        while(currNode!=null) {
            if(position!=counter) {
                counter++;
            }
            else {
                prevNode.next = currNode.next;
                return;
            }
            prevNode = currNode;
            currNode = currNode.next;
        }
    }

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
        list.insertAtFirst(2);
        list.insertAtFirst(1);
        list.displayList();
        list.insertAtLast(3);
        list.insertAtLast(4);
        list.displayList();
        list.deleteAtFirst();
        list.deleteAtLast();
        list.displayList();
        list.insertAtFirst(1);
        list.insertAtPosition(9, 2);
        list.displayList();
        list.deleteAtPosition(2);
        list.displayList();
    }
}