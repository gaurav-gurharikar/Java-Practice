public class MergeTwoSortedLists {
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

    public static void main(String[] args) {
        ListNode list1a = new ListNode(1);
        ListNode list1b = new ListNode(2);
        ListNode list1c = new ListNode(4);
        ListNode head1 = list1a;
        list1a.next = list1b;
        list1b.next = list1c;
        list1c.next = null;

        ListNode list2a = new ListNode(1);
        ListNode list2b = new ListNode(3);
        ListNode list2c = new ListNode(4);
        ListNode head2 = list2a;
        list2a.next = list2b;
        list2b.next = list2c;
        list2c.next = null;

        ListNode currNode = head1;
        while (currNode != null) {
            System.out.print(currNode.val + "->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
        currNode = head2;
        while (currNode != null) {
            System.out.print(currNode.val + "->");
            currNode = currNode.next;
        }
        System.out.println("NULL");

        ListNode newHead = mergeTwoLists(head1, head2);

        currNode = newHead;
        while (currNode != null) {
            System.out.print(currNode.val + "->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyNode = new ListNode(-1,null);
        ListNode temp = dummyNode;
        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                temp.next = list1;
                list1 = list1.next;
                temp = temp.next;

            } else {
                temp.next = list2;
                list2 = list2.next;
                temp = temp.next;
            }
        }
        if(list1 == null) {
            temp.next = list2;
        } else if(list2 == null) {
            temp.next = list1;
        }
        return dummyNode.next;
    }
}
