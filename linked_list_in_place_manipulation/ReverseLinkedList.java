package linked_list_in_place_manipulation;

public class ReverseLinkedList {
    static void main() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        System.out.println("Original list");
        printList(head);
        System.out.println("Reversed list");
        head = reverseList(head);
        printList(head);
    }

    static ListNode reverseList(ListNode head) {
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

    static void printList(ListNode node) {
        while(node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
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
