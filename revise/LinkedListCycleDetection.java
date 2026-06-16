package revise;

// https://neetcode.io/problems/linked-list-cycle-detection/question
public class LinkedListCycleDetection {
    static void main() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2); first.next = second;
        ListNode third = new ListNode(3); second.next = third;
        ListNode forth = new ListNode(4); third.next = forth;
        ListNode fifth = new ListNode(4); forth.next = fifth;
        fifth.next = second;
        System.out.println(hasCycle(first));
    }

    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }
}
