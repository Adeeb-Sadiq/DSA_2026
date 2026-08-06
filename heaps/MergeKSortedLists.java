package heaps;

import java.util.PriorityQueue;

public class MergeKSortedLists {
    public static void main(String[] args) {
        ListNode l1 = ListNode.getList(new int[]{1, 4, 5});
        ListNode l2 = ListNode.getList(new int[]{1, 3, 4});
        ListNode l3 = ListNode.getList(new int[]{2, 6});
        ListNode[] lists = {l1, l2, l3};
        ListNode head = mergeKLists(lists);
        ListNode.printList(head);
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;

        PriorityQueue<ListNode> minHeap = new PriorityQueue<>(
                (a, b) -> a.val - b.val
        );

        for(ListNode node: lists) {
            if(node != null) minHeap.add(node);
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while(!minHeap.isEmpty()) {
            ListNode smallest = minHeap.poll();
            curr.next = smallest;
            curr = curr.next;

            if(smallest.next != null) minHeap.add(smallest.next);
        }

        return dummy.next;
    }
}
