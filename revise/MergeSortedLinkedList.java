package revise;

public class MergeSortedLinkedList {
    static void main() {
        ListNode list1 = ListNode.getList(new int[]{1, 2, 4});
        ListNode list2 = ListNode.getList(new int[]{1, 3, 5});
        ListNode res = mergeTwoLists(list1, list2);
        ListNode.printList(res);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = new ListNode(0);
        ListNode curr = res;
        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        while(list1 != null) {
            curr.next = list1;
            list1 = list1.next;
            curr = curr.next;
        }
        while(list2 != null) {
            curr.next = list2;
            list2 = list2.next;
            curr = curr.next;
        }
        return res.next;
    }
}
