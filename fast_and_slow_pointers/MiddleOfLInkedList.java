package fast_and_slow_pointers;

public class MiddleOfLInkedList {
    static void main() {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2); head.next = second;
        ListNode third = new ListNode(3); second.next = third;
        ListNode fourth = new ListNode(4); third.next = fourth;
        ListNode fifth = new ListNode(5); fourth.next = fifth;
        System.out.println(middleNode(head).val);
    }

    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
