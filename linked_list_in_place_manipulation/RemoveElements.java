package linked_list_in_place_manipulation;

public class RemoveElements {
    static void main() {
        int[] arr = {6,6,6,6,6,6};
        int[] arr2 = {2,3,6,4,6,6,5,1};

        System.out.println("{6,6,6,6,6,6}: ");
        ListNode head = ListNode.getList(arr);
        head = removeElements(head, 6);
        ListNode.printList(head);

        System.out.println();

        System.out.println("{2,3,6,4,6,6,5,1}: ");
        ListNode head2 = ListNode.getList(arr2);
        head2 = removeElements(head2, 6);
        ListNode.printList(head2);
    }
    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        while(curr.next != null) {
            if(curr.next.val == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return dummy.next;
    }
}

