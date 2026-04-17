package heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int stone: stones) {
            maxHeap.add(stone);
        }

        while(maxHeap.size() > 1) {
            int first = maxHeap.poll();
            int second = maxHeap.poll();

            if(first != second) {
                maxHeap.add(first - second);
            }
        }
        return maxHeap.isEmpty() ? 0 : maxHeap.poll();
    }

    public static void main(String[] args) {
        int[] stones = {2,7,4,1,8,1};
        System.out.println(lastStoneWeight(stones));
    }
}
