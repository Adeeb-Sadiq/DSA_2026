package linked_list_in_place_manipulation;

public class Reorder {
    static void main() {
        ListNode head = ListNode.getList(new int[]{0, 1, 2, 3, 4, 5, 6});
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

        while (second != null) {
            ListNode next = second.next;
            second.next = prev;
            prev = second;
            second = next;
        }

        second = prev;
        ListNode first = head;

        while(second != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;
            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }
}
