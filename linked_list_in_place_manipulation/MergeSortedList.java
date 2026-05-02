package linked_list_in_place_manipulation;

public class MergeSortedList  {
    static void main() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);
        System.out.println("List 1: ");
        printList(l1);
        System.out.println();
        System.out.println("List 2: ");
        printList(l2);
        mergeTwoLists(l1, l2);
        System.out.println();
        System.out.println("Merge: ");
        printList(l1);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = new ListNode(0);
        ListNode head = res;

        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                head.next = list1;
                list1 = list1.next;
                head = head.next;
            } else {
                head.next = list2;
                list2 = list2.next;
                head = head.next;
            }
        }
        while(list1 != null) {
            head.next = list1;
            list1 = list1.next;
            head = head.next;

        }
        while(list2 != null) {
            head.next = list2;
            list2 = list2.next;
            head = head.next;

        }

        return res.next;
    }

    private static void printList (ListNode l1) {
        while (l1 != null) {
            System.out.print(l1.val + " ");
            l1 = l1.next;
        }
    }
}

