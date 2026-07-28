package linked_list_in_place_manipulation;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = ListNode.getList(new int[]{2, 4, 3});
        ListNode l2 = ListNode.getList(new int[]{5, 6, 4});
        ListNode res = addTwoNumbers(l1, l2);
        ListNode.printList(res);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;

        while(l1 != null || l2 != null || carry  != 0) {
            int x = (l1 != null) ? l1.val: 0;
            int y = (l2 != null) ? l2.val: 0;
            int sum = x + y + carry;
            carry = sum / 10;

            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }

        return dummy.next;
    }
}
