package top_k_elements;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class ThirdMax {
    public static int thirdMax(int[] nums) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        Set<Integer> set = new HashSet<>();

        for(int num: nums) {
            if(set.contains(num)) continue;

            minHeap.offer(num);
            set.add(num);

            if(minHeap.size() > 3) {
                set.remove(minHeap.poll());
            }

        }

        if(minHeap.size() < 3) {
            int max = Integer.MIN_VALUE;
            for(int num: nums) {
                max = Math.max(num, max);
            }
            return max;
        }

        return minHeap.peek();
    }

    static void main(String[] args) {
        int[] nums = {3, 2, 2, 1};
        int res = thirdMax(nums);
        System.out.println(res);
    }
}
