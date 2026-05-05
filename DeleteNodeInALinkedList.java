public class DeleteNodeInALinkedList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    static ListNode head;

    public static void main(String[] args) {
        ListNode node1 = new ListNode(4);
        head = node1;
        ListNode node2 = new ListNode(5);
        node1.next = node2;
        ListNode node3 = new ListNode(1);
        node2.next = node3;
        ListNode node4 = new ListNode(9);
        node3.next = node4;
        node4.next = null;

        ListNode currNode = head;
        while (currNode != null) {
            System.out.print(currNode.val + "->");
            currNode = currNode.next;
        }
        System.out.println("NULL");

        deleteNode(node3);

        currNode = head;
        while (currNode != null) {
            System.out.print(currNode.val + "->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next; 
    }
}