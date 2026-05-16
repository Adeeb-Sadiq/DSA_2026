package fast_and_slow_pointers;

public class LinkedListCycle {
    static void main() {
        ListNode head = new ListNode(3);
        ListNode second = new ListNode(2); head.next = second;
        ListNode third = new ListNode(0); second.next = third;
        ListNode fourth = new ListNode(-4); third.next = fourth;
        fourth.next = second;

        System.out.println(hasCycle(head));
    }

    private static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }

        return false;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    public static ListNode getList(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode ptr = head;

        for(int i = 1; i < arr.length; i++) {
            ptr.next = new ListNode(arr[i]);
            ptr = ptr.next;
        }

        return head;
    }

    public static void printList(ListNode head) {
        while(head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}