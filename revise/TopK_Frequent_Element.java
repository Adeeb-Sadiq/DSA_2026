package revise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TopK_Frequent_Element {
    static void main() {
        System.out.println(Arrays.toString(topKFrequent(new int[] {1,2,2,3,3,3}, 2)));
        System.out.println(Arrays.toString(topKFrequent(new int[] {1,2,2,3,3,3,4,4,4}, 2)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n: nums) map.put(n, map.getOrDefault(n, 0) + 1);

        PriorityQueue<Integer> pq = new PriorityQueue<>(
                (a,b) -> map.get(a) - map.get(b)
        );
        for(int n: map.keySet()) {
            pq.add(n);
            if(pq.size() > k) pq.poll();
        }

        int[] result = new int[k];
        int i = 0;

        while(!pq.isEmpty()) {
            result[i++] = pq.poll();
        }

        return result;
    }
}
