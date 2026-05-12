class ReverseLinkedList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static ListNode head;

    public static ListNode reverseList(ListNode head) {
        ListNode prevNode = null, nextNode, currNode = head;
        while(currNode!=null) {
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head = prevNode;
        return head;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        head = node1;
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        ListNode node3 = new ListNode(3);
        node2.next = node3;
        ListNode node4 = new ListNode(4);
        node3.next = node4;
        node4.next = null;

        ListNode currNode = head;
        while (currNode != null) {
            System.out.print(currNode.val + "->");
            currNode = currNode.next;
        }
        System.out.println("NULL");

        head = reverseList(head);

        currNode = head;
        while (currNode != null) {
            System.out.print(currNode.val + "->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
}