package revise;

public class ReverseLinkedList {
    static void main() {
        ListNode head = ListNode.getList(new int[]{1, 2, 3, 4, 5});
        ListNode.printList(head);
        head = reverseList(head);
        ListNode.printList(head);
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
