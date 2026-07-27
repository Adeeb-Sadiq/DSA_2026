package linked_list_in_place_manipulation;

public class Reverse_in_between {
    static void main() {
        ListNode head = ListNode.getList(new int[] {1, 2, 3, 4, 5, 6});
        head = reverse(head, 2, 4);
        ListNode.printList(head);
    }

    public static ListNode reverse(ListNode head, int left, int right) {
        if(head == null || left == right) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        for(int i = 1; i < left; i++) prev = prev.next;

        ListNode curr = prev.next, next;
        for(int i = 0; i < right - left; i++) {
            next = curr.next;
            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }

        return dummy.next;
    }
}
