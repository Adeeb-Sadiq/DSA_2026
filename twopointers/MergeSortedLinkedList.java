package twopointers;

public class MergeSortedLinkedList {
    static void main() {
        ListNode list1  = ListNode.getList(new int[] {1, 3, 4, 5, 6, 10, 11});
        ListNode list2 = ListNode.getList(new int[]{5, 7});
        ListNode res = mergetSortedList(list1, list2);
        ListNode.printList(res);
    }

    private static ListNode mergetSortedList(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        curr.next = (list1 != null) ? list1 : list2;

        return dummy.next;
    }
}
