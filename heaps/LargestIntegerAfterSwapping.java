package heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class LargestIntegerAfterSwapping {
    public static int largestInteger(int num) {
        char[] digits = String.valueOf(num).toCharArray();

        PriorityQueue<Integer> even = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> odd = new PriorityQueue<>(Collections.reverseOrder());

        for(char c: digits) {
            int digit = c - '0';
            if(digit % 2 == 0) {
                even.add(digit);
            } else {
                odd.add(digit);
            }
        }

        int result = 0;

        for(char c: digits) {
            int digit = c - '0';
            if(digit % 2 == 0) {
                result = result * 10 + even.poll();
            } else {
                result = result * 10 + odd.poll();
            }
        }

        return result;
    }

    static void main() {
        System.out.println(largestInteger(1234));
    }
}
