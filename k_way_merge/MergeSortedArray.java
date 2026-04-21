package k_way_merge;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i = 0; i < m; i++) minHeap.offer(nums1[i]);
        for(int i = 0; i < n; i++) minHeap.offer(nums2[i]);
        int i = 0;
        while(!minHeap.isEmpty()) nums1[i++] = minHeap.poll();
    }

    static void main() {
        int[] num1 = {1, 3, 5, 7, 0, 0, 0, 0};
        int[] num2 = {2, 4, 6, 8};
        merge(num1, 4, num2, 4);
        System.out.println(Arrays.toString(num1));
    }
}
