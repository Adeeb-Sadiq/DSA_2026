package revise;

import java.util.PriorityQueue;

// https://neetcode.io/problems/last-stone-weight/question
public class LastStoneWeight {
    static void main() {
        int[] stones = {2,3,6,2,4};
        System.out.println(lastStoneWeight(stones));
        System.out.println(lastStoneWeight(new int[] {1, 2}));
    }

    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b) -> b - a);
        for(int s: stones) heap.add(s);
        while(heap.size() > 1) {
            int weight = Math.abs(heap.poll() - heap.poll());
            if(weight > 0) heap.add(weight);
        }
        return heap.isEmpty() ? 0 : heap.poll();
    }
}
