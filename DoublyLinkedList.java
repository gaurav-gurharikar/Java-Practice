class Node {
    int data;
    Node next;
    Node prev;
    Node(int data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null; 
    }
}
public class DoublyLinkedList {
    Node head;

    //Insert at first
    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        if(head==null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
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
        newNode.prev = currNode;
    }

    //Insert at position
    public void insertAtPosition(int data, int position) {
        Node newNode =  new Node(data);
        if(position==1) {
            if(head==null) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            return;
        }
        Node currNode = head;
        int counter=0;
        while(currNode!=null) {
            counter++;
            if(counter==position) break;
            currNode = currNode.next;
        }
        Node prevNode = currNode.prev;
        newNode.next = currNode;
        currNode.prev = newNode;
        newNode.prev = prevNode;
        prevNode.next = newNode;
        
    }

    //Delete at first
    public void deleteAtFirst() {
        if(head == null || head.next == null) {
            head = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }

    //Delete at last
    public void deleteAtLast() {
        if(head == null || head.next == null) {
            head = null;
            return;
        }
        Node currNode = head;
        while(currNode.next !=null) {
            currNode = currNode.next;
        }
        Node newTail = currNode.prev;
        newTail.next = null;
        currNode.prev = null;
    }

    //Delete at position
    public void deleteAtPosition(int position) {
        if(head == null) return;
        int counter = 0;
        Node currNode = head;
        while(currNode!=null) {
            counter++;
            if(counter==position) break;
            currNode = currNode.next;
        }
        Node prevNode = currNode.prev;
        Node nextNode = currNode.next;
        if(prevNode==null && nextNode==null) {
            head = null;
        } else if(prevNode==null) {
            head = head.next;
            head.prev = null;
        } else if(nextNode==null) {
            prevNode.next = null;
            currNode.prev = null;
        } else {
            prevNode.next = currNode.next;
            nextNode.prev = currNode.prev;
            currNode.next = null;
            currNode.prev = null;
        }
    }

    //Display
    public void displayList() {
        Node currNode = head;
        System.out.print("NULL<=>");
        while(currNode!=null) {
            System.out.print(currNode.data+"<=>");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
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
