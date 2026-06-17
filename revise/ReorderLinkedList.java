package revise;

// https://neetcode.io/problems/reorder-linked-list/history?list=neetcode150&submissionIndex=2
public class ReorderLinkedList {
    // 1, 2, 3, 4, 5.... n -> 1, n-1, 2, n-2, 3, n-3......

    static void main() {
        ListNode head = ListNode.getList(new int[] {0, 1, 2, 3, 4, 5, 6});
        ListNode.printList(head);
        reorderList(head);
        ListNode.printList(head);
    }

    public static void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = slow.next;
        slow.next = null;

        ListNode prev = null;
        while(second != null) {
            ListNode next = second.next;
            second.next = prev;
            prev = second;
            second = next;
        }

        ListNode first = head;
        second = prev;

        while(second != null) {
            ListNode t1 = first.next;
            ListNode t2 = second.next;

            first.next = second;
            second.next = t1;
            first = t1;
            second = t2;
        }
    }
}
