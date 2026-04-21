package top_k_elements;

import java.util.*;

public class MaxSubsequence {
    public static int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        for(int i = 0; i < nums.length; i++) {
            pq.offer(new int[]{nums[i], i});
            if(pq.size() > k) pq.poll();
        }

        List<int[]> list = new ArrayList<>();
        while(!pq.isEmpty()) {
            list.add(pq.poll());
        }

        Collections.sort(list, (a, b) -> a[1] - b[1]);

        int[] result = new int[k];
        for(int i = 0; i < k; i++) {
            result[i] = list.get(i) [0];
        }

        return result;
    }

    static void main() {
        int[] nums = {2, 3, 4, 3, 3};
        int[] res = maxSubsequence(nums, 2);
        System.out.println(Arrays.toString(res));
    }
}
