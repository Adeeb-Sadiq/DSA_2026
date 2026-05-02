package top_k_elements;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

// top k frequent elements
public class TopKFrequent {
    static void main() {
        int[] arr = {1,2,2,3,3,3,7};
        int k = 2;
        System.out.println(Arrays.toString(topELements(arr, k)));
    }

    private static int[] topELements(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> heap = new PriorityQueue<>(
                (a, b) -> map.get(a) - map.get(b)
        );
        int[] result = new int[k];

        for(int i: arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for(int i: map.keySet()) {
            heap.add(i);
            if(heap.size() > k) {
                heap.poll();
            }
        }

        int i = 0;
        while (!heap.isEmpty()) {
            result[i++] = heap.poll();
        }

        return result;
    }
}

