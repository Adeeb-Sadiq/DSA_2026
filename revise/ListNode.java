package revise;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    public static ListNode getList (int[] arr) {
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
