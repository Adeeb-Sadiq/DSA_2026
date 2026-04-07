package linked_list_in_place_manipulation;

public class RemoveDuplicates {
    static void main() {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(1); head.next = second;
        ListNode third = new ListNode(2); second.next = third;
        ListNode fourth = new ListNode(3); third.next = fourth;
        ListNode fifth = new ListNode(4); fourth.next = fifth;
        ListNode sixth = new ListNode(4); fifth.next = sixth;
        ListNode seventh = new ListNode(5); sixth.next = seventh;
        System.out.println("original list");
        ReverseLinkedList.printList(head);
        System.out.println("no duplicate list");
        head = removeDuplicates(head);
        ReverseLinkedList.printList(head);

    }

    public static ListNode removeDuplicates(ListNode head) {
        ListNode curr = head;
        while(curr != null && curr.next != null) {
            if(curr.val == curr.next.val) curr.next = curr.next.next;
            else curr = curr.next;
        }
        return head;
    }
}
